/*
 * jasterNG - Java interface for Asterisk
 *
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG.
 *
 * jasterNG is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, version 2.
 *
 * jasterNG is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jasterNG. If not, see <https://www.gnu.org/licenses/>.
 *
 * Modified by Kurchenko O.E. 2026-09-12.
 */

package com.catneye.asterisk.AGI;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kurchenko O.E.
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
