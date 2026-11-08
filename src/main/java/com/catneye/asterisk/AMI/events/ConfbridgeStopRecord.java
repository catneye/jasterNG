/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 * Modified by Kurchenko O.E. and OpenAI ChatGPT 2026-11-08.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.BridgeEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI ConfbridgeStopRecord event. */
public class ConfbridgeStopRecord extends BridgeEvent implements Serializable {

    public ConfbridgeStopRecord() {
        super.setEvent("ConfbridgeStopRecord");
        super.setUuid(UUID.randomUUID());
    }

    private String conference;

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

}
