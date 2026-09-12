/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.actions;

import java.util.UUID;
import org.apache.commons.text.TextStringBuilder;

/**
 *
 * @author plintus
 */
public class DeviceStateList implements Action {

    private final UUID uuid;
    private final String action = "DeviceStateList";

    public DeviceStateList() {
        uuid = UUID.randomUUID();
    }

    @Override
    public String toString() {

        TextStringBuilder ret = new TextStringBuilder()
                .append("Action: " + getAction()).appendNewLine()
                .append("ActionID: ").append(getUuid().toString()).appendNewLine();
        /*String ret = "Action: " + action + "\r\n"
                + "ActionID: " + getUuid().toString() + "\r\n"
                + "Username: " + user + "\r\n"
                + "Secret: " + secret+ "\r\n";*/

        return ret.toString();
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
