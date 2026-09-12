/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author plintus
 */
public class AGIExecEnd extends ChannelEvent implements Serializable {

    private String commandId;
    private String command;

    public AGIExecEnd() {
        super.setEvent("AGIExecEnd");
        super.setUuid(UUID.randomUUID());
    }

    /*
Event: AGIExecEnd, 
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
