/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.actions;

/** AMI Reload action. */
public class Reload extends AbstractAction {

    public Reload() {
        super("Reload");
    }

    private String module;

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Override
    public String toString() {
        StringBuilder message = startMessage();
        appendField(message, "Module", module);
        return message.toString();
    }
}
