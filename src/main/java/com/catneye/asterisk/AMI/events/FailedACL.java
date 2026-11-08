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

/** AMI FailedACL security event. */
public class FailedACL extends SecurityEvent implements Serializable {

    public FailedACL() {
        super.setEvent("FailedACL");
        super.setUuid(UUID.randomUUID());
    }

    private String aclName;

    public String getAclName() {
        return aclName;
    }

    public void setAclName(String aclName) {
        this.aclName = aclName;
    }

}
