/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AGI.functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author plintus
 */
public class Test implements ClientFunction {

    @Override
    public String function(BufferedReader reader, PrintStream writer, Map<String, String> params) {
        try {
            String line;
            writer.println("ANSWER");
            line=reader.readLine();
            Logger.getLogger(Test.class.getName()).log(Level.INFO, "Test: {0}", line);
            writer.println("SET VARIABLE TEST \"SUCCESS\"");
            line=reader.readLine();
            Logger.getLogger(Test.class.getName()).log(Level.INFO, "Test: {0}", line);
            writer.println("GET VARIABLE TEST");
            line=reader.readLine();
            Logger.getLogger(Test.class.getName()).log(Level.INFO, "Test: {0}", line);
            writer.flush();
        } catch (IOException e) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, "ClientThread: {0}", e);
        }
        return null;
    }

    @Override
    public String getFunctionName() {
        return "Test";
    }

}
