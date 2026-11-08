/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 * Licensed under GNU General Public License, version 2.
 * Modified by Kurchenko O.E. and OpenAI ChatGPT 2026-11-08.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI QueueMemberAdded event. */
public class QueueMemberAdded extends SystemEvent implements Serializable {
    public QueueMemberAdded() {
        super.setEvent("QueueMemberAdded");
        super.setUuid(UUID.randomUUID());
    }

    private String queue;
    public String getQueue() { return queue; }
    public void setQueue(String queue) { this.queue = queue; }

    private String memberName;
    public String getMemberName() { return memberName; }
    public void setMemberName(String memberName) { this.memberName = memberName; }

    private String interface;
    public String getInterface() { return interface; }
    public void setInterface(String interface) { this.interface = interface; }

    private String stateInterface;
    public String getStateInterface() { return stateInterface; }
    public void setStateInterface(String stateInterface) { this.stateInterface = stateInterface; }

    private String membership;
    public String getMembership() { return membership; }
    public void setMembership(String membership) { this.membership = membership; }

    private Integer penalty;
    public Integer getPenalty() { return penalty; }
    public void setPenalty(Integer penalty) { this.penalty = penalty; }

    private Integer callsTaken;
    public Integer getCallsTaken() { return callsTaken; }
    public void setCallsTaken(Integer callsTaken) { this.callsTaken = callsTaken; }

    private Integer lastCall;
    public Integer getLastCall() { return lastCall; }
    public void setLastCall(Integer lastCall) { this.lastCall = lastCall; }

    private Integer lastPause;
    public Integer getLastPause() { return lastPause; }
    public void setLastPause(Integer lastPause) { this.lastPause = lastPause; }

    private Integer loginTime;
    public Integer getLoginTime() { return loginTime; }
    public void setLoginTime(Integer loginTime) { this.loginTime = loginTime; }

    private Boolean inCall;
    public Boolean getInCall() { return inCall; }
    public void setInCall(Boolean inCall) { this.inCall = inCall; }

    private Integer status;
    public Integer getStatus() { return status; }
    public void setStatus(Integer status) { this.status = status; }

    private Boolean paused;
    public Boolean getPaused() { return paused; }
    public void setPaused(Boolean paused) { this.paused = paused; }

    private String pausedReason;
    public String getPausedReason() { return pausedReason; }
    public void setPausedReason(String pausedReason) { this.pausedReason = pausedReason; }

    private Boolean ringinuse;
    public Boolean getRinginuse() { return ringinuse; }
    public void setRinginuse(Boolean ringinuse) { this.ringinuse = ringinuse; }

    private Integer wrapuptime;
    public Integer getWrapuptime() { return wrapuptime; }
    public void setWrapuptime(Integer wrapuptime) { this.wrapuptime = wrapuptime; }

}
