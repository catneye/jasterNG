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
public class EAGISignalServer extends Thread {

    ServerSocket serverSocket;

    public void close() {
        Logger.getLogger(EAGISignalServer.class.getName()).log(Level.INFO, "stop EAGISignalServer: {0}", 0);
        try {
            serverSocket.close();
        } catch (IOException e) {
            Logger.getLogger(EAGISignalServer.class.getName()).log(Level.INFO, "IOException: {0}", e);
        }
    }

    @Override
    public void run() {
        Logger.getLogger(EAGISignalServer.class.getName()).log(Level.INFO, "start EAGISignalServer: {0}", 0);
        try {
            serverSocket = new ServerSocket(8418);
            while (true) {
                Socket socket = serverSocket.accept();
                Thread cth = new Thread(new EAGISignalThread(socket));
                cth.start();
            }
        } catch (IOException e) {
            Logger.getLogger(EAGISignalServer.class.getName()).log(Level.INFO, "IOException: {0}", e);
        }
    }

}
