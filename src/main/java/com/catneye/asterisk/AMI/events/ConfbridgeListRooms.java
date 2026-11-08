/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 * Modified by Kurchenko O.E. and OpenAI ChatGPT 2026-11-08.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI ConfbridgeListRooms event. */
public class ConfbridgeListRooms extends SystemEvent implements Serializable {

    public ConfbridgeListRooms() {
        super.setEvent("ConfbridgeListRooms");
        super.setUuid(UUID.randomUUID());
    }

    private String conference;

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    private Integer parties;

    public Integer getParties() {
        return parties;
    }

    public void setParties(Integer parties) {
        this.parties = parties;
    }

    private Integer marked;

    public Integer getMarked() {
        return marked;
    }

    public void setMarked(Integer marked) {
        this.marked = marked;
    }

    private String locked;

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    private String muted;

    public String getMuted() {
        return muted;
    }

    public void setMuted(String muted) {
        this.muted = muted;
    }

}
