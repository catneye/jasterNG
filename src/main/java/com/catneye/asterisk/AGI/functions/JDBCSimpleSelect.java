/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AGI.functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author plintus
 */
public class JDBCSimpleSelect implements ClientFunction {

    @Override
    public String function(BufferedReader reader, PrintStream writer, Map<String, String> params) {
        String ret = null;
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://" + params.get("agi_arg_1") + "/" + params.get("agi_arg_2");
            Properties props = new Properties();
            props.setProperty("user", params.get("agi_arg_3"));
            props.setProperty("password", params.get("agi_arg_4"));
            Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement st = conn.prepareStatement(params.get("agi_arg_5"));
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                ret = rs.getString(1);
            }
            rs.close();
            st.close();
            conn.close();

            Logger.getLogger(JDBCSimpleSelect.class.getName()).log(Level.INFO, "JDBCSimpleSelect ret: {0}", ret);

            String line;
            writer.println("SET VARIABLE JDBCSimpleSelect \"SUCCESS\"");
            line = reader.readLine();
            Logger.getLogger(JDBCSimpleSelect.class.getName()).log(Level.INFO, ": {0}", line);
            writer.flush();

        } catch (IOException e) {
            Logger.getLogger(JDBCSimpleSelect.class.getName()).log(Level.SEVERE, "Exception: {0}", e);
        } catch (SQLException e) {
            Logger.getLogger(JDBCSimpleSelect.class.getName()).log(Level.SEVERE, "Exception: {0}", e);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(JDBCSimpleSelect.class.getName()).log(Level.SEVERE, "Exception: {0}", e);
        }
        return ret;
    }

    @Override
    public String getFunctionName() {
        return "JDBCSimpleSelect";
    }
}
