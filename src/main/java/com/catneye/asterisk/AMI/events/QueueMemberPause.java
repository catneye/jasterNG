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

/** AMI QueueMemberPause event. */
public class QueueMemberPause extends SystemEvent implements Serializable {
    public QueueMemberPause() {
        super.setEvent("QueueMemberPause");
        super.setUuid(UUID.randomUUID());
    }

    private String queue;
    public String getQueue() { return queue; }
    public void setQueue(String queue) { this.queue = queue; }

    private String location;
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    private String memberName;
    public String getMemberName() { return memberName; }
    public void setMemberName(String memberName) { this.memberName = memberName; }

    private Boolean paused;
    public Boolean getPaused() { return paused; }
    public void setPaused(Boolean paused) { this.paused = paused; }

    private String pausedReason;
    public String getPausedReason() { return pausedReason; }
    public void setPausedReason(String pausedReason) { this.pausedReason = pausedReason; }

}
