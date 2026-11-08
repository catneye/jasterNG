/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 * Licensed under GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI QueueMemberRemoved event. */
public class QueueMemberRemoved extends SystemEvent implements Serializable {
    public QueueMemberRemoved() {
        super.setEvent("QueueMemberRemoved");
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

}
