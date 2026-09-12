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
public class Unhold extends ChannelEvent implements Serializable {

    public Unhold() {
        super.setEvent("Unhold");
        super.setUuid(UUID.randomUUID());
    }

    /*
    [Event: Unhold, 
    Privilege: call,all, 
    SystemName: asterisk, 
    Channel: PJSIP/16-00000fd8, 
    ChannelState: 6,
    ChannelStateDesc: Up, 
    CallerIDNum: dzjuba_darja, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: +79281235845, 
    ConnectedLineName: Черкесск,
    Language: en, AccountCode: , 
    Context: from-internal-16, 
    Exten: , 
    Priority: 1, 
    Uniqueid: asterisk-1750662739.6195,
    Linkedid: asterisk-1750662739.6193]
     */
}
