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
public class Newstate extends ChannelEvent implements Serializable {

    public Newstate() {
        super.setEvent("NewState");
        super.setUuid(UUID.randomUUID());
    }

    /*
    Event: Newstate, 
    Privilege: call,all, 
    SequenceNumber: 131, 
    File: manager_channels.c, 
    Line: 739, 
    Func: channel_snapshot_update, 
    SystemName: asterisk, 
    
    Channel: PJSIP/000-00000000, 
    ChannelState: 6, 
    ChannelStateDesc: Up, 
    CallerIDNum: 000, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: <unknown>, 
    ConnectedLineName: <unknown>, 
    Language: en, 
    AccountCode: , 
    Context: from-000, 
    Exten: 888, 
    Priority: 1, 
    Uniqueid: asterisk-1722255899.0, 
    Linkedid: asterisk-1722255899.0
    
     */
}
