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
public class EAGICommandServer extends Thread {

    ServerSocket serverSocket;

    public void close() {
        Logger.getLogger(EAGICommandServer.class.getName()).log(Level.INFO, "stop EAGICommandServer: {0}", 0);
        try {
            serverSocket.close();
        } catch (IOException e) {
            Logger.getLogger(EAGICommandServer.class.getName()).log(Level.INFO, "IOException: {0}", e);
        }
    }

    @Override
    public void run() {
        Logger.getLogger(EAGICommandServer.class.getName()).log(Level.INFO, "start EAGICommandServer: {0}", 0);
        try {
            serverSocket = new ServerSocket(8417);
            while (true) {
                Socket socket = serverSocket.accept();
                Thread cth = new Thread(new EAGICommandThread(socket));
                cth.start();
            }
        } catch (IOException e) {
            Logger.getLogger(EAGICommandServer.class.getName()).log(Level.INFO, "IOException: {0}", e);
        }
    }
}
