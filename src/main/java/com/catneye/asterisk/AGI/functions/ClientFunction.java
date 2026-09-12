/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.catneye.asterisk.AGI.functions;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.Map;

/**
 *
 * @author plintus
 */
public interface ClientFunction {
    public String getFunctionName();
    public String function(BufferedReader reader, PrintStream writer, Map<String, String> params);
}
