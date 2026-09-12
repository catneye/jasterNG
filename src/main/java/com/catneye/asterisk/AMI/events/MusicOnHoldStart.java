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
public class MusicOnHoldStart extends ChannelEvent implements Serializable {

    private String clazz;

    public MusicOnHoldStart() {
        super.setEvent("MusicOnHoldStart");
        super.setUuid(UUID.randomUUID());
    }

    /*
    Event: MusicOnHoldStart, 
    Privilege: call,all, 
    SequenceNumber: 265, 
    File: manager_channels.c, 
    Line: 1147, 
    Func: channel_moh_start_cb, 
    SystemName: asterisk, 
    Channel: Local/000@internal-00000003;2, 
    ChannelState: 4, 
    ChannelStateDesc: Ring, 
    CallerIDNum: <unknown>, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: <unknown>, 
    ConnectedLineName: <unknown>, 
    Language: en, AccountCode: , 
    Context: internal, 
    Exten: 000, 
    Priority: 1, 
    Uniqueid: asterisk-1722860694.15, 
    Linkedid: asterisk-1722860694.14, 
    Class: default
    
     */
    /**
     * @return the Clazz
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * @param Clazz the Clazz to set
     */
    public void setClazz(String Clazz) {
        this.clazz = Clazz;
    }

}
