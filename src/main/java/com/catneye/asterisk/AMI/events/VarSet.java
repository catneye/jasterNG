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
public class VarSet extends ChannelEvent implements Serializable {

    public VarSet() {
        super.setEvent("VarSet");
        super.setUuid(UUID.randomUUID());
    }

    private String variable;
    private String value;

    /*
    Event: VarSet, 
    Privilege: dialplan,all, 
    SequenceNumber: 129, 
    File: manager.c, 
    Line: 2023, 
    Func: manager_default_msg_cb, 
    SystemName: asterisk, 
    Channel: PJSIP/000-00000000, 
    ChannelState: 4, 
    ChannelStateDesc: Ring, 
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
    Linkedid: asterisk-1722255899.0, 
    Variable: SIPDOMAIN, 
    Value: 10.0.3.15
    
     */
    /**
     * @return the variable
     */
    public String getVariable() {
        return variable;
    }

    /**
     * @param variable the variable to set
     */
    public void setVariable(String variable) {
        this.variable = variable;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

}
