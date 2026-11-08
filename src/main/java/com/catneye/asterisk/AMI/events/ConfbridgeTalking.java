/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI ConfbridgeTalking event. */
public class ConfbridgeTalking extends ChannelEvent implements Serializable {

    public ConfbridgeTalking() {
        super.setEvent("ConfbridgeTalking");
        super.setUuid(UUID.randomUUID());
    }

    private String conference;

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    private String talkingStatus;

    public String getTalkingStatus() {
        return talkingStatus;
    }

    public void setTalkingStatus(String talkingStatus) {
        this.talkingStatus = talkingStatus;
    }

    private String admin;

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

}
