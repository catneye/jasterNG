/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.actions;

import java.util.UUID;

/** AMI SendText action. */
public class SendText implements Action {

    private final UUID uuid = UUID.randomUUID();
    private final String action = "SendText";

    private String channel;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String contentType;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }

    @Override
    public String getAction() {
        return action;
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();
        message.append("Action: ").append(getAction()).append("\r\n");
        message.append("ActionID: ").append(getUuid()).append("\r\n");
        if (channel != null) {
            message.append("Channel: ").append(channel).append("\r\n");
        }
        if (message != null) {
            message.append("Message: ").append(message).append("\r\n");
        }
        if (contentType != null) {
            message.append("Content-Type: ").append(contentType).append("\r\n");
        }
        return message.toString();
    }
}
