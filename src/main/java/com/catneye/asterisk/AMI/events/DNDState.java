/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI DNDState event. */
public class DNDState extends SystemEvent implements Serializable {

    public DNDState() {
        super.setEvent("DNDState");
        super.setUuid(UUID.randomUUID());
    }

    private String DAHDIChannel;

    public String getDAHDIChannel() {
        return dahdiChannel;
    }

    public void setDAHDIChannel(String DAHDIChannel) {
        this.DAHDIChannel = DAHDIChannel;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
