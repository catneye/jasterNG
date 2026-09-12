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
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Kurchenko O.E.
 */
public class Shutdown extends SystemEvent implements Serializable {

    public Shutdown() {
        super.setEvent("Shutdown");
        super.setUuid(UUID.randomUUID());
    }

    private String shutdown;
    private Boolean restart;

    /*[Event: Reload, 
    Privilege: system,all, 
    SequenceNumber: 99, 
    File: manager.c, 
    Line: 2057, 
    Func: manager_generic_msg_cb, 
    SystemName: asterisk, 
    Module: All, 
    Status: 0]


     */
    /**
     * @return the shutdown
     */
    public String getShutdown() {
        return shutdown;
    }

    /**
     * @param shutdown the shutdown to set
     */
    public void setShutdown(String shutdown) {
        this.shutdown = shutdown;
    }

    /**
     * @return the restart
     */
    public Boolean getRestart() {
        return restart;
    }

    /**
     * @param restart the restart to set
     */
    public void setRestart(Boolean restart) {
        this.restart = restart;
    }

}
