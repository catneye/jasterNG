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
package com.catneye.asterisk.AMI.actions;

import java.util.UUID;

/**
 *
 * @author Kurchenko O.E.
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
