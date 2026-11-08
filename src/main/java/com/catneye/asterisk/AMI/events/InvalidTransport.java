/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SecurityEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI InvalidTransport security event. */
public class InvalidTransport extends SecurityEvent implements Serializable {

    public InvalidTransport() {
        super.setEvent("InvalidTransport");
        super.setUuid(UUID.randomUUID());
    }

    private String attemptedTransport;

    public String getAttemptedTransport() {
        return attemptedTransport;
    }

    public void setAttemptedTransport(String attemptedTransport) {
        this.attemptedTransport = attemptedTransport;
    }

}
