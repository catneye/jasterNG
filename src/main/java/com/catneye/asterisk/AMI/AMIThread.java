/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI;

import com.catneye.asterisk.AMI.actions.Action;
import com.catneye.asterisk.AMI.actions.Login;
import com.catneye.asterisk.AMI.actions.Logoff;
import com.catneye.asterisk.AMI.actions.Originate;
import com.catneye.asterisk.AMI.events.base.Event;
import com.catneye.asterisk.AMI.responses.Response;
import com.catneye.asterisk.AMI.syncactons.SyncAction;
import com.catneye.asterisk.Events.AsteriskListener;
import com.catneye.asterisk.Exception.AMIConnectException;
import com.catneye.asterisk.utils.DateUtils;
import com.catneye.util.NetUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.net.telnet.TelnetClient;

/**
 *
 * @author plintus
 */
public class AMIThread extends Thread {

    private BufferedWriter writer;
    private BufferedReader reader;
    private final UUID uuid;
    private final AMIServer server;
    private Boolean telnetConnected = false;
    private HashMap<UUID, SyncAction> syncActions = new HashMap();
    private List<AsteriskListener> listeners = new ArrayList();
    TelnetClient telnet;
    Boolean worked = true;

    public AMIThread(AMIServer server) {
        super();
        this.server = server;
        uuid = server.getUid();
        System.out.print("Init AMIThread");
        Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "Init AMIThread: {0}", server.getUid());
        //Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "Init AMIThread: {0}", 1);
    }

    @Override
    public void run() {
        try {
            Integer i = 0;
            telnet = new TelnetClient();
            do {
                try {
                    Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "AMIThread try connect to: {0}", server.getAddress());
                    Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "AMIThread try connect: {0}", i);
                    telnet.connect(server.getAddress(), server.getPort());
                    writer = new BufferedWriter(new OutputStreamWriter(telnet.getOutputStream()));
                    reader = new BufferedReader(new InputStreamReader(telnet.getInputStream()));
                    telnetConnected = true;
                    i = 0;
                    Thread.sleep(300);
                    //this.login(server.getLogin(), server.getSecret());
                    fireConnect(this, server);

                    String line = reader.readLine();
                    while (line != null) {
                        Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "AMIThread read: {0}", line);
                        String[] lline = StringUtils.split(line, ":", 2);
                        if (lline.length > 0) {
                            //Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "AMIThread lline: {0}", lline[0]);
                            if (lline[0].equals("Event") || lline[0].equals("Response") || lline[0].equals("Message")) {
                                Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "AMIThread lline: {0}", lline[0]);
                                List<String> l = new ArrayList();
                                while ((line != null) && (!line.isBlank())) {
                                    l.add(line);
                                    line = reader.readLine();
                                    Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "AMIThread read Event line: {0}", line);
                                }
                                Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "AMIThread read line: {0}", l.toString());
                                parseEvent(l);
                            }
                        }
                        line = reader.readLine();
                    }
                    Logger.getLogger(AMIThread.class.getName()).log(Level.WARNING, "AMIThread closed: {0}", server.getAddress());
                    telnet.disconnect();
                    telnetConnected = false;
                } catch (ConnectException e) {
                    Logger.getLogger(AMIThread.class.getName()).log(Level.WARNING, "AMIThread ConnectException: {0}", e);

                } catch (IOException e) {
                    Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, "AMIThread IOException: {0}", e);

                } catch (Exception e) {
                    Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, "AMIThread Exception: {0}", e);
                }
                Logger.getLogger(AMIThread.class.getName()).log(Level.WARNING, "reconnect: {0}", i);
                i++;
                Thread.sleep(5000);
                Logger.getLogger(AMIThread.class.getName()).log(Level.WARNING, "AMIThread is worked: {0}", worked);
            } while (worked);
        } catch (InterruptedException e) {
            Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, "AMIThread InterruptedException: {0}", e);
        }
    }

    public void disconnect() {
        try {
            worked = false;
            telnet.disconnect();
            //reader.close();
            //writer.close();
            Logger.getLogger(AMIThread.class.getName()).log(Level.WARNING, "AMIThread disconnect: {0}", 0);
        } catch (IOException ex) {
            Logger.getLogger(AMIThread.class.getName()).log(Level.WARNING, null, ex);
        }
    }

    public void sendAction(Action action) {
        Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "sendAction: {0}", action);
        Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "sendActionSync telnetConnected: {0}", telnetConnected);
        SyncAction s = new SyncAction();
        try {
            Integer i = 0;
            while ((!telnetConnected) && (i < 200)) {
                i += 10;
                Thread.sleep(10);
            }
            if (!telnetConnected) {
                //throw new AMIConnectException("Connection timeout: " + i * 10, uuid);
                throw new AMIConnectException("Connection timeout: " + i * 10, uuid);
            }
            writer.write(action.toString());
            writer.newLine();
            writer.flush();
            s.setAction(action);
            syncActions.put(action.getUuid(), s);

        } catch (IOException ex) {
            System.out.println(ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Response sendActionSync(Action action, Integer timeout) {
        Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "sendActionSync: {0}", action);
        Response ret = null;
        SyncAction s = new SyncAction();

        Integer i = 0;
        try {
            while ((!telnetConnected) && (i < 200)) {
                i += 10;
                Thread.sleep(10);
            }
            if (!telnetConnected) {
                throw new AMIConnectException("Connection timeout: " + i * 10, uuid);

            }
            writer.write(action.toString());
            writer.newLine();
            writer.flush();

            s.setAction(action);
            syncActions.put(action.getUuid(), s);

            return new Callable<Response>() {
                @Override
                public Response call() {
                    Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "call : {0}", 0);
                    Integer i = 0;
                    try {
                        while (!s.isResponsed() && i < timeout) {
                            i += 50;
                            Thread.sleep(50);
                            Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "sendActionSync isResponsed: {0}", s.isResponsed());
                        }

                    } catch (InterruptedException ex) {
                        Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    return s.getResponse();
                }
            }.call();

            /*while (!s.isResponsed()) {
                wait();
                Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "sendActionSync isResponsed: {0}", s.isResponsed());
            }*/
        } catch (IOException ex) {
            Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s.getResponse();

        /*return new Callable<Response>() {
            @Override
            public synchronized Response call() {
                Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "call : {0}", 0);
                try {

                    while (!s.isResponsed()) {
                        wait();
                        Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "sendActionSync isResponsed: {0}", s.isResponsed());
                    }

                } catch (InterruptedException ex) {
                    Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                return s.getResponse();
            }
        }.call();*/
        //FutureTask<Response> future = new FutureTask<>(task);
        //new Thread(future).start();
        //while (!future.isDone()) {
        //    Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "sendActionSync is still work: {0}", 0);
        //    Thread.sleep(300);
        //}
    }

    private void parseEvent(List<String> lines) {
        int i = 0;
        int fc = 0;
        Class c = null;
        Object obj = null;
        Boolean isResponse = false;
        Boolean isEvent = false;
        Boolean isMessage = false;
        List<Field> fields = new ArrayList();

        try {
            for (String line : lines) {
                if (!line.isBlank()) {
                    Logger.getLogger(AMIThread.class.getName()).log(Level.FINE, "parseEvent line: {0}", line);
                    String[] lline = StringUtils.split(line, ":", 2);
                    if ((i == 0) && (lline[0].equals("Event") || lline[0].equals("Response") || lline[0].equals("Message"))) {
                        String tlline = StringUtils.trim(lline[1]);
                        switch (lline[0]) {
                            case "Event":
                                c = Class.forName("com.catneye.asterisk.AMI.events." + tlline);
                                isEvent = true;
                                break;
                            case "Response":
                                c = Class.forName("com.catneye.asterisk.AMI.responses." + tlline);
                                isResponse = true;
                                break;
                            case "Message":
                                c = Class.forName("com.catneye.asterisk.AMI.actions." + tlline);
                                isMessage = true;
                                break;
                        }
                        obj = c.getDeclaredConstructor().newInstance();

                        if (obj != null) {
                            //subclasses
                            Class s = c.getSuperclass();
                            while (s != null) {
                                Collections.addAll(fields, s.getDeclaredFields());
                                s = s.getSuperclass();
                            }
                            Collections.addAll(fields, c.getDeclaredFields());
                        }
                        Logger.getLogger(AMIThread.class.getName()).log(Level.FINE, "parseEvent obj class : {0}", obj.getClass().toString());
                    } else {
                        if (obj != null) {
                            /*List<Field> fields = new ArrayList();
                            //subclasses
                            Class s = c.getSuperclass();
                            while (s != null) {
                                Collections.addAll(fields, s.getDeclaredFields());
                                s = s.getSuperclass();
                            }
                            Collections.addAll(fields, c.getDeclaredFields());
                            fc = fields.size();*/

                            for (Field field : fields) {
                                String clearName = field.getName().toLowerCase().replace("[^A-Za-z0-9]", "");
                                if (clearName.equals("clazz")) {
                                    clearName = "class";
                                }
                                if (clearName.equals("interfaze")) {
                                    clearName = "interface";
                                }
                                if (clearName.equals("causeTxt")) {
                                    clearName = "Cause-txt";
                                }
                                if (clearName.equals(lline[0].toLowerCase())) {
                                    Logger.getLogger(AMIThread.class.getName()).log(Level.FINE, "parseEvent clearName: {0}", clearName);
                                    Logger.getLogger(AMIThread.class.getName()).log(Level.FINE, "parseEvent FieldType: {0}", field.getType().getName());
                                    field.setAccessible(true);
                                    String tlline = StringUtils.trim(lline[1]);
                                    switch (field.getType().getName()) {
                                        case "java.lang.String":
                                            field.set(obj, tlline);
                                            break;
                                        case "java.time.LocalDateTime":
                                            field.set(obj, (LocalDateTime) DateUtils.asLocalDateTime(DateUtils.parseDate(tlline)));
                                            break;
                                        case "java.lang.Integer":
                                            field.set(obj, (Integer) NumberUtils.toInt(tlline));
                                            break;
                                        case "java.util.UUID":
                                            field.set(obj, (UUID) UUID.fromString(tlline));
                                            break;
                                        case "java.lang.Float":
                                            field.set(obj, (Float) NumberUtils.toFloat(tlline));
                                            break;
                                        case "java.net.InetSocketAddress":
                                            field.set(obj, NetUtils.parseAddress(tlline));
                                            break;
                                        case "java.lang.Boolean":
                                            field.set(obj, Boolean.valueOf(tlline));
                                            break;
                                        default:
                                            break;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    i++;
                }
            }
            if ((fields.size()) != i) {
                Logger.getLogger(AMIThread.class.getName()).log(Level.WARNING, "parseEvent missing fields count for: {0}, {1}, {2}",
                        new Object[]{c.getName(), fields.size(), i - 1});
            }
            if (obj != null && isResponse) {
                Response response = (Response) obj;
                SyncAction s = syncActions.get(response.getActionID());
                if (s != null) {
                    s.setResponse(response);
                    s.setResponsed(true);
                    Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "parseEvent setResponsed: {0}", s);
                }
            }

            //remove expired actions
            //TODO: move it to thread
            List<UUID> toremove = new ArrayList();
            Iterator<UUID> iter = syncActions.keySet().iterator();
            while (iter.hasNext()) {
                UUID key = iter.next();
                if (syncActions.get(key).isExperied(60000)) {
                    toremove.add(key);
                }
            }
            for (UUID key : toremove) {
                Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "parseEvent remove expired action: {0}", key);
                Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "parseEvent remove expired action: {0}", syncActions.get(key).toString());
                syncActions.remove(key);
            }

            //fire event
            if (isEvent) {
                fireEvent((Event) obj, "onEvent", this.server);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ConcurrentModificationException ex) {
            Logger.getLogger(AMIThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addAsteriskListener(AsteriskListener l) {
        listeners.add(l);
    }

    public void removeAsteriskListener(AsteriskListener l) {
        if (listeners.contains(l)) {
            listeners.remove(listeners.indexOf(l));
        }
    }

    public void fireEvent(Event event, String method, AMIServer server) {
        Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "fireEvent : {0}", event);
        Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "fireEvent method: {0}", method);
        for (AsteriskListener l : listeners) {
            l.onEvent(event, server);
            /*Method[] meth = l.getClass().getDeclaredMethods();
            for (Method m : meth) {
                if (m.getName().equals(method)) {
                    try {
                        m.invoke((Object)method, event);
                    } catch (IllegalAccessException e) {
                    } catch (InvocationTargetException e) {
                    }
                }
            }*/
        }
    }

    public void fireConnect(AMIThread thread, AMIServer server) {
        Logger.getLogger(AMIThread.class.getName()).log(Level.INFO, "fireConnect : {0}", server);
        for (AsteriskListener l : listeners) {
            l.onConnect(thread, server);
        }
    }

    /**
     * @return the uuid
     */
    public UUID getUuid() {
        return uuid;
    }

    /**
     * @return the writer
     */
    public BufferedWriter getWriter() {
        return writer;
    }

    /**
     * @return the reader
     */
    public BufferedReader getReader() {
        return reader;
    }

    /*Humanity functions*/
    public Response login(String login, String secret) {
        Action action = new Login(login, secret);
        Response r = this.sendActionSync(action, 500);
        return r;
    }

    public Response logoff() {
        Action action = new Logoff();
        Response r = this.sendActionSync(action, 500);
        return r;
    }

    /*
    public Response originate(String toTech, String toContext, String toExten,
            String pairContext, String pairExten) {
        String channel = toTech + "/" + toExten + ((toContext != null) ? "@" + toContext : "");
        Originate action = new Originate(channel, pairExten, pairContext, 1);
        action.setTimeout(30000);
        Response r = this.sendActionSync(action, 31000);
        return r;
    }*/
    public Response originateSync(String channel, String toContext, String toExten) {
        Originate action = new Originate(channel, toExten, toContext, 1);
        action.setTimeout(30000);
        this.sendAction(action);
        Response r = this.sendActionSync(action, 31000);
        return r;
    }

    public void originate(String channel, String toContext, String toExten) {
        Originate action = new Originate(channel, toExten, toContext, 1);
        action.setTimeout(30000);
        this.sendAction(action);
    }

    public void originate(String channel, String toContext, String toExten, String predialsub) {
        Originate action = new Originate(channel, toExten, toContext, 1);
        action.setPreDialGoSub(predialsub);
        action.setTimeout(30000);
        this.sendAction(action);
    }

    public void originate(String channel, String toContext, String toExten, String callerid, String calluid) {
        Originate action = new Originate(channel, toExten, toContext, 1, callerid);
        action.setChannelId(calluid);
        action.setTimeout(30000);
        this.sendAction(action);
    }
    
    public void originateVar(String channel, String toContext, String toExten, String callerid, String calluid, String variable) {
        Originate action = new Originate(channel, toExten, toContext, 1, callerid);
        action.setChannelId(calluid);
        action.setTimeout(30000);
        action.setVariable(variable);
        this.sendAction(action);
    }

    public void originate(String channel, String toContext, String toExten, String callerid, String calluid, String predialsub) {
        Originate action = new Originate(channel, toExten, toContext, 1, callerid);

        action.setChannelId(calluid);
        action.setPreDialGoSub(predialsub);
        action.setTimeout(30000);
        this.sendAction(action);
    }
    public void originateVar(String channel, String toContext, String toExten, String callerid, String calluid, String predialsub, String variable) {
        Originate action = new Originate(channel, toExten, toContext, 1, callerid);

        action.setChannelId(calluid);
        action.setPreDialGoSub(predialsub);
        action.setTimeout(30000);
        action.setVariable(variable);
        this.sendAction(action);
    }

    public void originateApp(String channel, String app, String appdata, String callerid, String calluid) {
        Originate action = new Originate(channel, app, appdata, callerid, calluid);

        action.setChannelId(calluid);
        action.setTimeout(30000);
        this.sendAction(action);
    }
}
