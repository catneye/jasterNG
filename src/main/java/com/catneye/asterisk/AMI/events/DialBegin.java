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
public class DialBegin extends DialEvent implements Serializable {

    private String dialString;

    public DialBegin() {
        super.setEvent("DialBegin");
        super.setUuid(UUID.randomUUID());
    }


    /*
    Event: DialBegin, 
    Privilege: call,all, 
    SequenceNumber: 247, 
    File: manager_channels.c, 
    Line: 1266, 
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
    
    DestChannel: Local/000@internal-00000003;1, 
    DestChannelState: 0, 
    DestChannelStateDesc: Down, 
    DestCallerIDNum: <unknown>, 
    DestCallerIDName: <unknown>, 
    DestConnectedLineNum: <unknown>, 
    DestConnectedLineName: <unknown>, 
    DestLanguage: en, 
    DestAccountCode: , 
    DestContext: internal, 
    DestExten: 000, 
    DestPriority: 1, 
    DestUniqueid: asterisk-1722860694.14, 
    DestLinkedid: asterisk-1722860694.14, 
    DialString: 000@internal
    
     */
    /**
     * @return the dialString
     */
    public String getDialString() {
        return dialString;
    }

    /**
     * @param dialString the dialString to set
     */
    public void setDialString(String dialString) {
        this.dialString = dialString;
    }

}
