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
public class SoftHangupRequest extends ChannelEvent implements Serializable {

    public SoftHangupRequest() {
        super.setEvent("SoftHangupRequest");
        super.setUuid(UUID.randomUUID());
    }

    private Integer cause;

    /*Event: SoftHangupRequest, 
    Privilege: call,all, 
    SequenceNumber: 148, 
    File: manager_channels.c, 
    Line: 798, 
    Func: channel_hangup_request_cb, 
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
    Cause: 16
    
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

}
