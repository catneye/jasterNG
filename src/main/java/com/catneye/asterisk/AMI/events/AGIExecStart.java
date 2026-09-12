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
public class AGIExecStart extends ChannelEvent implements Serializable {

    private String commandId;
    private String command;
    public AGIExecStart() {
        super.setEvent("AGIExecEnd");
        super.setUuid(UUID.randomUUID());
    }

    /*
Event: AGIExecStart, 
    Privilege: agi,all,
    SystemName: asterisk, 
    
    Channel: PJSIP/000-00000022, 
    ChannelState: 6,
    ChannelStateDesc: Up, 
    CallerIDNum: 000, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: <unknown>, 
    ConnectedLineName: <unknown>, 
    Language: en, 
    AccountCode: , 
    Context: from-000, 
    Exten: 886, 
    Priority: 2,
    Uniqueid: asterisk-1722949178.107, 
    Linkedid: asterisk-1722949178.107, 
    CommandId: 1003185570,
    Command: ANSWER
    
     */

    /**
     * @return the commandId
     */
    public String getCommandId() {
        return commandId;
    }

    /**
     * @param commandId the commandId to set
     */
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * @return the command
     */
    public String getCommand() {
        return command;
    }

    /**
     * @param command the command to set
     */
    public void setCommand(String command) {
        this.command = command;
    }
}
