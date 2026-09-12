package com.catneye.asterisk.AGI;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author plintus
 */
public class EAGIServer extends Thread {

    ServerSocket commandSocket;
    ServerSocket signalSocket;
    Boolean worked=false;

    public void close() {
        Logger.getLogger(EAGIServer.class.getName()).log(Level.INFO, "stop EAGIServer: {0}", 0);
        try {
            worked=false;
            commandSocket.close();
            signalSocket.close();
        } catch (IOException e) {
            Logger.getLogger(EAGIServer.class.getName()).log(Level.INFO, "IOException: {0}", e);
        }
    }

    @Override
    public void run() {
        Logger.getLogger(EAGIServer.class.getName()).log(Level.INFO, "start EAGIServer: {0}", 0);
        try {
            commandSocket = new ServerSocket(8417);
            signalSocket = new ServerSocket(8418);
            worked=true;
            while (worked) {
                Socket csocket = commandSocket.accept();
                Socket ssocket = signalSocket.accept();
                Thread cth = new Thread(new EAGICommandThread(csocket));
                cth.start();
                Thread sth = new Thread(new EAGISignalThread(ssocket));
                sth.start();
            }
        } catch (IOException e) {
            Logger.getLogger(EAGIServer.class.getName()).log(Level.INFO, "IOException: {0}", e);
        }
    }
}
