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

import com.catneye.asterisk.AMI.events.base.DialEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Kurchenko O.E.
 */
public class DialState extends DialEvent implements Serializable {

    private String dialStatus;

    public DialState() {
        super.setEvent("DialState");
        super.setUuid(UUID.randomUUID());
    }


    /*Event: DialState, 
    Privilege: call,all, 
    SequenceNumber: 266, 
    File: manager_channels.c, 
    Line: 1276, 
    Func: channel_dial_cb, 
    SystemName: asterisk, 
    DestChannel: Local/000@internal-00000003;1, 
    DestChannelState: 0, 
    DestChannelStateDesc: Down, 
    DestCallerIDNum: <unknown>, 
    DestCallerIDName: <unknown>, 
    DestConnectedLineNum: <unknown>, 
    DestConnectedLineName: <unknown>, 
    DestLanguage: en, DestAccountCode: , 
    DestContext: internal, 
    DestExten: 000, 
    DestPriority: 1, 
    DestUniqueid: asterisk-1722860694.14, 
    DestLinkedid: asterisk-1722860694.14, 
    DialStatus: PROGRESS
    
     */
    /**
     * @return the dialStatus
     */
    public String getDialStatus() {
        return dialStatus;
    }

    /**
     * @param dialStatus the dialStatus to set
     */
    public void setDialStatus(String dialStatus) {
        this.dialStatus = dialStatus;
    }

}
