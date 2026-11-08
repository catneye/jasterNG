/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 * Licensed under GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI QueueEntry event. */
public class QueueEntry extends ChannelEvent implements Serializable {
    public QueueEntry() {
        super.setEvent("QueueEntry");
        super.setUuid(UUID.randomUUID());
    }

    private String queue;
    public String getQueue() { return queue; }
    public void setQueue(String queue) { this.queue = queue; }

    private Integer position;
    public Integer getPosition() { return position; }
    public void setPosition(Integer position) { this.position = position; }

    private Integer wait;
    public Integer getWait() { return wait; }
    public void setWait(Integer wait) { this.wait = wait; }

    private String actionID;
    public String getActionID() { return actionID; }
    public void setActionID(String actionID) { this.actionID = actionID; }

}
