/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author plintus
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
