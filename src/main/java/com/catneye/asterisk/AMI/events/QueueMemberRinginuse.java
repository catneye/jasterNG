/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 * Licensed under GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI QueueMemberRinginuse event. */
public class QueueMemberRinginuse extends SystemEvent implements Serializable {
    public QueueMemberRinginuse() {
        super.setEvent("QueueMemberRinginuse");
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

    private Boolean ringinuse;
    public Boolean getRinginuse() { return ringinuse; }
    public void setRinginuse(Boolean ringinuse) { this.ringinuse = ringinuse; }

}
