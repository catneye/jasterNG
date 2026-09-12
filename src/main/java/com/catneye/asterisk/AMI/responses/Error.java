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
package com.catneye.asterisk.AMI.responses;

import java.util.UUID;
import org.apache.commons.text.TextStringBuilder;

/**
 *
 * @author Kurchenko O.E.
 */
public class Error implements Response {

    private UUID uuid;
    private String response = "Succes";
    private UUID ActionID;
    private String Message;

    /*[Response: Error, 
    ActionID: e9c0ff58-d39f-4120-b120-1adcf908d57b, 
    Message: Originate with 'Exten' requires 'Context' and 'Priority'
    ]
     */
    public Error() {
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
