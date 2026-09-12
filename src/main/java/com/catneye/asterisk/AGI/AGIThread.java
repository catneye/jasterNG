/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AGI;

import com.catneye.asterisk.AGI.functions.ClientFunction;
import com.catneye.asterisk.Exception.WrongClassException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author plintus
 */
public class AGIThread implements Runnable {

    private final Socket socket;
    private final List<Class> clazzes;

    public AGIThread(Socket socket, List<Class> clazzes) {
        this.socket = socket;
        this.clazzes = clazzes;
        Logger.getLogger(AGIThread.class.getName()).log(Level.INFO, "ClientThread clazzes: {0}", clazzes);
    }

    @Override
    public void run() {
        try {
            Map<String, String> params = new HashMap();
            String functionName = null;

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            PrintStream writer = new PrintStream(socket.getOutputStream());
            String line = reader.readLine();
            while ((line != null) && (!socket.isClosed())) {
                line = reader.readLine();
                Logger.getLogger(AGIThread.class.getName()).log(Level.INFO, "ClientThread read: {0}", line);

                if (line.equals("exit")) {
                    writer.println("BYE");
                    writer.flush();
                    socket.close();
                }
                String[] lline = StringUtils.split(line, ":", 2);
                if (lline.length > 1) {

                    /*if (lline[0].equals("agi_request")) {
                        Pattern p = Pattern.compile("(?<=function=).*?(?=&|$)");
                        Matcher m = p.matcher(lline[1]);
                        if (m.find()) {
                            functionName = m.group(1);
                        }
                        //List<NameValuePair> urlParams = URLEncodedUtils.parse(new URI(lline[1]), "utf-8");
                        //functionName=urlParams.getFirst().getName();
                    }*/
                    if (lline[0].equals("agi_network_script")) {
                        //Logger.getLogger(ClientThread.class.getName()).log(Level.INFO, "ClientThread agi_network_script: {0}", lline[1]);
                        //String[] ans = StringUtils.split(lline[1], "=");
                        //functionName = StringUtils.trim(ans[1]);
                        functionName = StringUtils.trim(lline[1]);
                    }

                    if (lline[0].startsWith("agi_arg")) {
                        params.put(lline[0], StringUtils.trim(lline[1]));
                    }
                }

                if (line.isBlank()) {
                    Logger.getLogger(AGIThread.class.getName()).log(Level.INFO, "ClientThread do function: {0}", functionName);
                    Logger.getLogger(AGIThread.class.getName()).log(Level.INFO, "ClientThread function params: {0}", params);
                    Boolean finded = false;

                    Logger.getLogger(AGIThread.class.getName()).log(Level.INFO, "ClientThread clazzes: {0}", clazzes);
                    for (Class clazz : clazzes) {
                        ClientFunction f = (ClientFunction) clazz.getDeclaredConstructor().newInstance();
                        if (f.getFunctionName().equals(functionName)) {
                            f.function(reader, writer, params);
                            finded = true;
                            break;
                        }
                    }
                    socket.close();
                    if (!finded) {
                        throw new WrongClassException("Unregistered clazz for function " + functionName);
                    }
                }
            }
        } catch (IOException e) {
            Logger.getLogger(AGIThread.class.getName()).log(Level.INFO, "ClientThread: {0}", e);
        } catch (NoSuchMethodException e) {
            Logger.getLogger(AGIThread.class.getName()).log(Level.INFO, "ClientThread: {0}", e);
        } catch (InstantiationException e) {
            Logger.getLogger(AGIThread.class.getName()).log(Level.INFO, "ClientThread: {0}", e);
        } catch (IllegalAccessException e) {
            Logger.getLogger(AGIThread.class.getName()).log(Level.INFO, "ClientThread: {0}", e);
        } catch (InvocationTargetException e) {
            Logger.getLogger(AGIThread.class.getName()).log(Level.INFO, "ClientThread: {0}", e);
        }
    }

}
