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
public class PlayFile implements ClientFunction {

    @Override
    public String function(BufferedReader reader, PrintStream writer, Map<String, String> params) {
        try {
            String line;
            writer.println("ANSWER");
            line=reader.readLine();
            Logger.getLogger(PlayFile.class.getName()).log(Level.INFO, "Test: {0}", line);
            writer.println("EXEC CONTROLPLAYBACK "+params.get("agi_arg_1")+" 1000 * # 1 0");
            line=reader.readLine();
            Logger.getLogger(PlayFile.class.getName()).log(Level.INFO, "Test: {0}", line);
            writer.println("SET VARIABLE RESULT \"SUCCESS\"");
            line=reader.readLine();
            Logger.getLogger(PlayFile.class.getName()).log(Level.INFO, "Test: {0}", line);
            writer.flush();
        } catch (IOException e) {
            Logger.getLogger(PlayFile.class.getName()).log(Level.SEVERE, "ClientThread: {0}", e);
        }
        return null;
    }

    @Override
    public String getFunctionName() {
        return "PlayFile";
    }

}
