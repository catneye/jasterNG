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
public class NewCallerid extends ChannelEvent implements Serializable {

    private String CIDCallingPres;

    public NewCallerid() {
        super.setEvent("NewCallerId");
        super.setUuid(UUID.randomUUID());
    }

    /*
Event: NewCallerid, 
    Privilege: call,all, 
    SequenceNumber: 263, 
    File: manager_channels.c, 
    Line: 739, 
    Func: channel_snapshot_update, 
    SystemName: asterisk, 
    
    Channel: PJSIP/000-00000001, 
    ChannelState: 0, 
    ChannelStateDesc: Down, 
    CallerIDNum: 000, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: <unknown>, 
    ConnectedLineName: <unknown>, 
    Language: en, 
    AccountCode: ,
    Context: from-000, 
    Exten: 000, 
    Priority: 1, 
    Uniqueid: asterisk-1722860694.16, 
    Linkedid: asterisk-1722860694.14, 
    CID-CallingPres: 0 (Presentation Allowed, Not Screened)
    
     */
    /**
     * @return the CIDCallingPres
     */
    public String getCIDCallingPres() {
        return CIDCallingPres;
    }

    /**
     * @param CIDCallingPres the CIDCallingPres to set
     */
    public void setCIDCallingPres(String CIDCallingPres) {
        this.CIDCallingPres = CIDCallingPres;
    }

}
