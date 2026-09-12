/*
 * jasterNG - Java interface for Asterisk
 *
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG.
 *
 * jasterNG is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 2.
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

import com.catneye.asterisk.AGI.functions.GenUUID;
import com.catneye.asterisk.AGI.functions.JDBCSimpleSelect;
import com.catneye.asterisk.AGI.functions.PlayFile;
import com.catneye.asterisk.AGI.functions.Test;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kurchenko O.E.
 */
public class AGIServer extends Thread {

    ServerSocket serverSocket;
    private final List<Class> clazzes=new ArrayList();
    Boolean worked=false;

    public void close() {
        Logger.getLogger(AGIServer.class.getName()).log(Level.INFO, "stop AGIServer: {0}", 0);
        try {
            worked=false;
            serverSocket.close();
        } catch (IOException e) {
            Logger.getLogger(AGIServer.class.getName()).log(Level.INFO, "IOException: {0}", e);
        }
    }

    @Override
    public void run() {
        Logger.getLogger(AGIServer.class.getName()).log(Level.INFO, "start AGIServer: {0}", 0);
        this.registerClass(Test.class);
        this.registerClass(JDBCSimpleSelect.class);
        this.registerClass(PlayFile.class);
        this.registerClass(GenUUID.class);
        try {
            serverSocket = new ServerSocket(4573);
            worked=true;
            while (worked) {
                Socket socket = serverSocket.accept();
                Thread cth = new Thread(new AGIThread(socket, clazzes));
                cth.start();
            }
        } catch (IOException e) {
            Logger.getLogger(AGIServer.class.getName()).log(Level.INFO, "IOException: {0}", e);
        }
    }

    public void registerClass(Class clazz){
        clazzes.add(clazz);
        Logger.getLogger(AGIServer.class.getName()).log(Level.INFO, "registerClass clazzes: {0}", clazzes);
    }
}
