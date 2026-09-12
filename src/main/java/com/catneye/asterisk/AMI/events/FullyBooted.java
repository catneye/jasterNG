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
public class FullyBooted extends SystemEvent implements Serializable {

    private String status;
    private Integer uptime;
    private Integer lastReload;

    public FullyBooted() {
        super.setEvent("FullyBooted");
        super.setUuid(UUID.randomUUID());
    }

    /*
    Event: FullyBooted, 
    Privilege: system,all, 
    Uptime: 1210535, 
    LastReload: 83611, 
    Status: Fully Booted
     */
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the uptime
     */
    public Integer getUptime() {
        return uptime;
    }

    /**
     * @param uptime the uptime to set
     */
    public void setUptime(Integer uptime) {
        this.uptime = uptime;
    }

    /**
     * @return the lastReload
     */
    public Integer getLastReload() {
        return lastReload;
    }

    /**
     * @param lastReload the lastReload to set
     */
    public void setLastReload(Integer lastReload) {
        this.lastReload = lastReload;
    }
}
