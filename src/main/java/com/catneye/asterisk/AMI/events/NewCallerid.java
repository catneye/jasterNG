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
