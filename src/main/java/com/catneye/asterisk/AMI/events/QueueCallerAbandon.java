/*
 * jasterNG - Java interface for Asterisk
 *
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG.
 *
 * jasterNG is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, version 2.
 *
 * jasterNG is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jasterNG. If not, see <https://www.gnu.org/licenses/>.
 *
 * Modified by Kurchenko O.E. 2026-09-12.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Kurchenko O.E.
 */
public class QueueCallerAbandon extends ChannelEvent implements Serializable {

    public QueueCallerAbandon() {
        super.setEvent("QueueCallerAbandon");
        super.setUuid(UUID.randomUUID());
    }

    private String queue;
    private Integer position;
    private Integer originalPosition;
    private Integer holdTime;

    /*
    Event: QueueCallerLeave, 
    Privilege: agent,all, 
    SystemName: asterisk, 
    
    Channel: PJSIP/dev-000000bd, 
    ChannelState: 6, 
    ChannelStateDesc: Up, 
    CallerIDNum: 000193393, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: 000, 
    ConnectedLineName: <unknown>, 
    Language: ru, 
    AccountCode: , 
    Context: incoming-dev, 
    Exten: s, 
    Priority: 5, 
    Uniqueid: asterisk-1740666060.311, 
    Linkedid: asterisk-1740666060.311, 
    Queue: test, 
    Position: 1, 
    OriginalPosition: 1, HoldTime: 3
    
     */
    /**
     * @return the queue
     */
    public String getQueue() {
        return queue;
    }

    /**
     * @param queue the queue to set
     */
    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * @return the position
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * @return the originalPosition
     */
    public Integer getOriginalPosition() {
        return originalPosition;
    }

    /**
     * @param originalPosition the originalPosition to set
     */
    public void setOriginalPosition(Integer originalPosition) {
        this.originalPosition = originalPosition;
    }

    /**
     * @return the holdTime
     */
    public Integer getHoldTime() {
        return holdTime;
    }

    /**
     * @param holdTime the holdTime to set
     */
    public void setHoldTime(Integer holdTime) {
        this.holdTime = holdTime;
    }

}
