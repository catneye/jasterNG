/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.DialEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author plintus
 */
public class DialEnd extends DialEvent implements Serializable {

    private String dialStatus;

    public DialEnd() {
        super.setEvent("DialEnd");
        super.setUuid(UUID.randomUUID());
    }

    /*Event: DialEnd, 
    Privilege: call,all, 
    SequenceNumber: 274, 
    File: manager_channels.c, 
    Line: 1276, 
    Func: channel_dial_cb, 
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
    Linkedid: asterisk-1722860694.14, 
    
    DestChannel: PJSIP/000-00000001, 
    DestChannelState: 0, 
    DestChannelStateDesc: Down, 
    DestCallerIDNum: 000, 
    DestCallerIDName: <unknown>, 
    DestConnectedLineNum: <unknown>, 
    DestConnectedLineName: <unknown>, 
    DestLanguage: en, 
    DestAccountCode: , 
    DestContext: from-000, 
    DestExten: 000, 
    DestPriority: 1, 
    DestUniqueid: asterisk-1722860694.16, 
    DestLinkedid: asterisk-1722860694.14, 
    DialStatus: CANCEL
    
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
