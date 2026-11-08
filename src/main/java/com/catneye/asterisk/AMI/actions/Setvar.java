/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 * Modified by Kurchenko O.E. and OpenAI ChatGPT 2026-11-08.
 */
package com.catneye.asterisk.AMI.actions;

import java.util.UUID;

/** AMI Setvar action. */
public class Setvar implements Action {

    private final UUID uuid = UUID.randomUUID();
    private final String action = "Setvar";

    private String channel;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    private String variable;

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
        message.append("Channel: ").append(channel).append("\r\n");
        message.append("Variable: ").append(variable).append("\r\n");
        message.append("Value: ").append(value).append("\r\n");
        return message.toString();
    }
}
