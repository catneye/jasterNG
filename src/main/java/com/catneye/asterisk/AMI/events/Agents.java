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

/** AMI Agents event. */
public class Agents extends ChannelEvent implements Serializable {

    public Agents() {
        super.setEvent("Agents");
        super.setUuid(UUID.randomUUID());
    }

    private String agent;

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String talkingToChan;

    public String getTalkingToChan() {
        return talkingToChan;
    }

    public void setTalkingToChan(String talkingToChan) {
        this.talkingToChan = talkingToChan;
    }

    private Integer callStarted;

    public Integer getCallStarted() {
        return callStarted;
    }

    public void setCallStarted(Integer callStarted) {
        this.callStarted = callStarted;
    }

    private Integer loggedInTime;

    public Integer getLoggedInTime() {
        return loggedInTime;
    }

    public void setLoggedInTime(Integer loggedInTime) {
        this.loggedInTime = loggedInTime;
    }

    private String actionID;

    public String getActionID() {
        return actionID;
    }

    public void setActionID(String actionID) {
        this.actionID = actionID;
    }

}
