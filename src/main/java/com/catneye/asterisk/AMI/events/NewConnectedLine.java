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
public class NewConnectedLine extends ChannelEvent implements Serializable {

    public NewConnectedLine() {
        super.setEvent("NewConnectedLine");
        super.setUuid(UUID.randomUUID());
    }

    /*EEvent: NewConnectedLine, 
    Privilege: call,all, 
    SequenceNumber: 267, 
    File: manager_channels.c, 
    Line: 739, 
    Func: channel_snapshot_update, 
    SystemName: asterisk, 
    Channel: Local/000@internal-00000003;2, 
    ChannelState: 4, 
    ChannelStateDesc: Ring, 
    CallerIDNum: <unknown>, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: 000, 
    ConnectedLineName: <unknown>, 
    Language: en, 
    AccountCode: , 
    Context: internal, 
    Exten: 000, 
    Priority: 1, 
    Uniqueid: asterisk-1722860694.15, 
    Linkedid: asterisk-1722860694.14
     */
}
