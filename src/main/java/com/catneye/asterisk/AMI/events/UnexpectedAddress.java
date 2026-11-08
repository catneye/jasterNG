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

/** AMI UnexpectedAddress security event. */
public class UnexpectedAddress extends SecurityEvent implements Serializable {

    public UnexpectedAddress() {
        super.setEvent("UnexpectedAddress");
        super.setUuid(UUID.randomUUID());
    }

    private String expectedAddress;

    public String getExpectedAddress() {
        return expectedAddress;
    }

    public void setExpectedAddress(String expectedAddress) {
        this.expectedAddress = expectedAddress;
    }

}
