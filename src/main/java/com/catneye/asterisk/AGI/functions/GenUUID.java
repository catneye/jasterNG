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
package com.catneye.asterisk.AGI.functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kurchenko O.E.
 * Set variable AIRS_UUID with new UUID
 */
public class GenUUID implements ClientFunction {

    @Override
    public String function(BufferedReader reader, PrintStream writer, Map<String, String> params) {
        Logger.getLogger(GenUUID.class.getName()).log(Level.INFO, "GenUUID start: {0}", 0);
        try {
            String line;

            writer.println("SET VARIABLE AIRS_UUID \"" + UUID.randomUUID().toString() + "\"");
            line = reader.readLine();
            Logger.getLogger(GenUUID.class.getName()).log(Level.INFO, "GenUUID: {0}", line);
            writer.flush();
        } catch (IOException e) {
            Logger.getLogger(GenUUID.class.getName()).log(Level.SEVERE, "ClientThread: {0}", e);
        }
        Logger.getLogger(GenUUID.class.getName()).log(Level.INFO, "GenUUID end: {0}", 0);
        return null;
    }

    @Override
    public String getFunctionName() {
        return "GenUUID";
    }
}
