/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 * Modified by Kurchenko O.E. and OpenAI ChatGPT 2026-11-08.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI ConfbridgeList event. */
public class ConfbridgeList extends ChannelEvent implements Serializable {

    public ConfbridgeList() {
        super.setEvent("ConfbridgeList");
        super.setUuid(UUID.randomUUID());
    }

    private String conference;

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    private String admin;

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    private String markedUser;

    public String getMarkedUser() {
        return markedUser;
    }

    public void setMarkedUser(String markedUser) {
        this.markedUser = markedUser;
    }

    private String waitMarked;

    public String getWaitMarked() {
        return waitMarked;
    }

    public void setWaitMarked(String waitMarked) {
        this.waitMarked = waitMarked;
    }

    private String endMarked;

    public String getEndMarked() {
        return endMarked;
    }

    public void setEndMarked(String endMarked) {
        this.endMarked = endMarked;
    }

    private String waiting;

    public String getWaiting() {
        return waiting;
    }

    public void setWaiting(String waiting) {
        this.waiting = waiting;
    }

    private String muted;

    public String getMuted() {
        return muted;
    }

    public void setMuted(String muted) {
        this.muted = muted;
    }

    private String talking;

    public String getTalking() {
        return talking;
    }

    public void setTalking(String talking) {
        this.talking = talking;
    }

    private Integer answeredTime;

    public Integer getAnsweredTime() {
        return answeredTime;
    }

    public void setAnsweredTime(Integer answeredTime) {
        this.answeredTime = answeredTime;
    }

}
