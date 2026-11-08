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

/** AMI InvalidPassword security event. */
public class InvalidPassword extends SecurityEvent implements Serializable {

    public InvalidPassword() {
        super.setEvent("InvalidPassword");
        super.setUuid(UUID.randomUUID());
    }

    private String challenge;

    public String getChallenge() {
        return challenge;
    }

    public void setChallenge(String challenge) {
        this.challenge = challenge;
    }

    private String receivedChallenge;

    public String getReceivedChallenge() {
        return receivedChallenge;
    }

    public void setReceivedChallenge(String receivedChallenge) {
        this.receivedChallenge = receivedChallenge;
    }

    private String receivedHash;

    public String getReceivedHash() {
        return receivedHash;
    }

    public void setReceivedHash(String receivedHash) {
        this.receivedHash = receivedHash;
    }

}
