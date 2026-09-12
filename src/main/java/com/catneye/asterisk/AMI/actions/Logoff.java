/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.actions;

import java.util.UUID;

/**
 *
 * @author plintus
 */
public class Logoff implements Action {

    private final UUID uuid;
    private final String action = "Logoff";

    public Logoff() {
        uuid = UUID.randomUUID();
    }

    @Override
    public String toString() {
        String ret = "Action: " + getAction() + "\r\n"
                + "ActionID: " + getUuid().toString() + "\r\n";
        return ret;
    }

    /**
     * @return the uuid
     */
    @Override
    public UUID getUuid() {
        return uuid;
    }

    /**
     * @return the action
     */
    @Override
    public String getAction() {
        return action;
    }
    
}
