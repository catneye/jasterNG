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

import com.catneye.asterisk.AMI.events.base.AgentEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Kurchenko O.E.
 */
public class AgentCalled extends AgentEvent implements Serializable {

    private String queue;
    private String interfaze;
    private String memberName;

    public AgentCalled() {
        super.setEvent("AgentCalled");
        super.setUuid(UUID.randomUUID());
    }

    /*
    
    Event: AgentCalled, 
    Privilege: agent,all, 
    SystemName: asterisk, 
    Channel: PJSIP/dev-000000bd, 
    ChannelState: 6, 
    ChannelStateDesc: Up, 
    CallerIDNum: 000193393, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: <unknown>, 
    ConnectedLineName: <unknown>, 
    Language: ru, AccountCode: , 
    Context: incoming-dev, 
    Exten: s, 
    Priority: 5, 
    Uniqueid: asterisk-1740666060.311, 
    Linkedid: asterisk-1740666060.311, 
    
    DestChannel: PJSIP/000-000000be, 
    DestChannelState: 0, 
    DestChannelStateDesc: Down, 
    DestCallerIDNum: 000, 
    DestCallerIDName: <unknown>, 
    DestConnectedLineNum: 000193393, 
    DestConnectedLineName: <unknown>, 
    DestLanguage: ru, DestAccountCode: , 
    DestContext: from-000, 
    DestExten: s, 
    DestPriority: 1, 
    DestUniqueid: asterisk-1740666060.312, 
    DestLinkedid: asterisk-1740666060.311, 
    
    Queue: test, 
    Interface: PJSIP/000, 
    MemberName: PJSIP/000
    
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
     * @return the interfaze
     */
    public String getInterfaze() {
        return interfaze;
    }

    /**
     * @param interfaze the interfaze to set
     */
    public void setInterfaze(String interfaze) {
        this.interfaze = interfaze;
    }

    /**
     * @return the memberName
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * @param memberName the memberName to set
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

}
