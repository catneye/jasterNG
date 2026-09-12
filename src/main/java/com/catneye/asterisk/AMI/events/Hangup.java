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
public class Hangup extends ChannelEvent implements Serializable {

    private Integer cause;
    private String causeTxt;

    public Hangup() {
        super.setEvent("Hangup");
        super.setUuid(UUID.randomUUID());
    }

    /*Event: Hangup, 
    Privilege: call,all, 
    SequenceNumber: 154, 
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
    Priority: 10, 
    Uniqueid: asterisk-1722255899.0, 
    Linkedid: asterisk-1722255899.0, 
    Cause: 16, 
    Cause-txt: Normal Clearing
    
     */

    /**
     * @return the cause
     */
    public Integer getCause() {
        return cause;
    }

    /**
     * @param cause the cause to set
     */
    public void setCause(Integer cause) {
        this.cause = cause;
    }

    /**
     * @return the causeTxt
     */
    public String getCauseTxt() {
        return causeTxt;
    }

    /**
     * @param causeTxt the causeTxt to set
     */
    public void setCauseTxt(String causeTxt) {
        this.causeTxt = causeTxt;
    }

}
