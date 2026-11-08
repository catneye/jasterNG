/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.actions;

import java.util.UUID;

/** Common implementation for AMI actions. */
public abstract class AbstractAction implements Action {

    private final UUID uuid;
    private final String action;

    protected AbstractAction(String action) {
        this.uuid = UUID.randomUUID();
        this.action = action;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }

    @Override
    public String getAction() {
        return action;
    }

    protected StringBuilder startMessage() {
        StringBuilder message = new StringBuilder();
        message.append("Action: ").append(action).append("\r\n");
        message.append("ActionID: ").append(uuid).append("\r\n");
        return message;
    }

    protected void appendField(StringBuilder message, String name, Object value) {
        if (value != null) {
            message.append(name).append(": ").append(value).append("\r\n");
        }
    }
}
