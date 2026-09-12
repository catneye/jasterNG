/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.utils;

import com.catneye.exception.WrongAddressException;
import java.net.InetSocketAddress;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author plintus, PSpeed, Roy Sharon
 */
public class NetUtils {

    public static InetSocketAddress parseAddress(String address) {
        InetSocketAddress ret = null;
        String ipPattern = "(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}):(\\d+)";
        String ipV6Pattern = "\\[([a-zA-Z0-9:]+)\\]:(\\d+)";
        String hostPattern = "([\\w\\.\\-]+):(\\d+)";
        Pattern p = Pattern.compile(ipPattern + "|" + ipV6Pattern + "|" + hostPattern);
        Matcher m = p.matcher(address);
        if (m.matches()) {
            if (m.group(1) != null) {
                // group(1) IP address, group(2) is port
                ret = InetSocketAddress.createUnresolved(m.group(1), ((m.group(2) != null) ? (Integer) NumberUtils.toInt(m.group(2)) : 0));
            } else if (m.group(3) != null) {
                // group(3) is IPv6 address, group(4) is port    
                ret = InetSocketAddress.createUnresolved(m.group(3), ((m.group(4) != null) ? (Integer) NumberUtils.toInt(m.group(4)) : 0));
            } else if (m.group(5) != null) {
                // group(5) is hostname, group(6) is port
                ret = new InetSocketAddress(m.group(5), ((m.group(6) != null) ? (Integer) NumberUtils.toInt(m.group(6)) : 0));
            } else {
                // Not a valid address  
                throw new WrongAddressException("Unknown address Regexp");
            }
        }
        return ret;
    }
}
