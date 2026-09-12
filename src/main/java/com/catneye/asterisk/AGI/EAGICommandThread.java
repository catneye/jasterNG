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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Kurchenko O.E.
 */
public class EAGICommandThread implements Runnable {

    private final Socket socket;

    public EAGICommandThread(Socket socket) {
        Logger.getLogger(EAGICommandThread.class.getName()).log(Level.INFO, "EAGICommandThread start: {0}", socket.getLocalPort());
        this.socket = socket;
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
                Logger.getLogger(EAGICommandThread.class.getName()).log(Level.INFO, "EAGICommandThread read: {0}", line);

                if (line.equals("exit")) {
                    writer.println("BYE");
                    writer.flush();
                    socket.close();
                }
                String[] lline = StringUtils.split(line, ":", 2);
                if (lline.length > 1) {
                    if (lline[0].equals("agi_network_script")) {
                        functionName = StringUtils.trim(lline[1]);
                    }

                    if (lline[0].startsWith("agi_arg")) {
                        params.put(lline[0], StringUtils.trim(lline[1]));
                    }
                }
                if (line.isBlank()) {
                    //writer.println("EXEC DIAL Local/884@autos");
                }
                line = reader.readLine();
            }
            Logger.getLogger(EAGICommandThread.class.getName()).log(Level.INFO, "EAGICommandThread end read: {0}", line);

            /*
            writer.println("EXEC DIAL Local/884@autos");
            line = reader.readLine();
            Logger.getLogger(EAGICommandThread.class.getName()).log(Level.INFO, "EAGICommandThread ANSWER: {0}", line);
            //writer.flush();
            writer.println("EXEC PLAYBACK demo-instruct");
            line = reader.readLine();
            //writer.flush();
            Logger.getLogger(EAGICommandThread.class.getName()).log(Level.INFO, "EAGICommandThread EXEC: {0}", line);
            //writer.flush();
            writer.println("SET VARIABLE EAGITEST \"SUCCESS\"");
            line = reader.readLine();
            //writer.flush();
            Logger.getLogger(EAGICommandThread.class.getName()).log(Level.INFO, "EAGICommandThread SET VARIABLE: {0}", line);
            //writer.flush();
            writer.println("GET VARIABLE EAGITEST");
            line = reader.readLine();
            //writer.flush();
            Logger.getLogger(EAGICommandThread.class.getName()).log(Level.INFO, "EAGICommandThread GET VARIABLE: {0}", line);
            //writer.flush();
*/
            socket.close();
        } catch (IOException e) {
            Logger.getLogger(EAGICommandThread.class.getName()).log(Level.INFO, "EAGICommandThread: {0}", e);
        }
    }

}
