/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.actions;

/** AMI Hangup action. */
public class Hangup extends AbstractAction {

    public Hangup() {
        super("Hangup");
    }

    private String channel;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    private Integer cause;

    public Integer getCause() {
        return cause;
    }

    public void setCause(Integer cause) {
        this.cause = cause;
    }

    @Override
    public String toString() {
        StringBuilder message = startMessage();
        appendField(message, "Channel", channel);
        appendField(message, "Cause", cause);
        return message.toString();
    }
}
