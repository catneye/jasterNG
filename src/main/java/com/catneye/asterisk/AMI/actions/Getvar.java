/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.actions;

/** AMI Getvar action. */
public class Getvar extends AbstractAction {

    public Getvar() {
        super("Getvar");
    }

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

    @Override
    public String toString() {
        StringBuilder message = startMessage();
        appendField(message, "Channel", channel);
        appendField(message, "Variable", variable);
        return message.toString();
    }
}
