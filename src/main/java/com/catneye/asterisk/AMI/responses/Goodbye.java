/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.responses;

import java.util.UUID;
import org.apache.commons.text.TextStringBuilder;

/**
 *
 * @author plintus
 */
public class Goodbye implements Response {

    private UUID uuid;
    private String response = "Goodbye";
    private UUID ActionID;
    private String Message;

    public Goodbye() {
        uuid = UUID.randomUUID();
    }

    /**
     * @return the response
     */
    @Override
    public String getResponse() {
        return response;
    }

    /**
     * @param response the response to set
     */
    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * @return the ActionID
     */
    @Override
    public UUID getActionID() {
        return ActionID;
    }

    /**
     * @param ActionID the ActionID to set
     */
    public void setActionID(UUID ActionID) {
        this.ActionID = ActionID;
    }

    /**
     * @return the Message
     */
    @Override
    public String getMessage() {
        return Message;
    }

    /**
     * @param Message the Message to set
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    @Override
    public String toString() {
        TextStringBuilder ret = new TextStringBuilder()
                .append("Response: " + getResponse()).appendNewLine()
                .append("ActionID: ").append(getActionID()).appendNewLine()
                .append("Message: ").append(getMessage()).appendNewLine();
        return ret.toString();
    }

    /**
     * @return the uuid
     */
    public UUID getUuid() {
        return uuid;
    }

    /**
     * @param uuid the uuid to set
     */
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
