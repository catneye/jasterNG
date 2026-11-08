/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 * Modified by Kurchenko O.E. and OpenAI ChatGPT 2026-11-08.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SecurityEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI AuthMethodNotAllowed security event. */
public class AuthMethodNotAllowed extends SecurityEvent implements Serializable {

    public AuthMethodNotAllowed() {
        super.setEvent("AuthMethodNotAllowed");
        super.setUuid(UUID.randomUUID());
    }

    private String authMethod;

    public String getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(String authMethod) {
        this.authMethod = authMethod;
    }

}
