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
public class Newchannel extends ChannelEvent implements Serializable {


    public Newchannel() {
        super.setEvent("Newchannel");
        super.setUuid(UUID.randomUUID());
    }
    
    /*Event: Newchannel, 
    Privilege: call,all, 
    SequenceNumber: 128, 
    File: manager_channels.c, 
    Line: 739, 
    Func: channel_snapshot_update, 
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
    Linkedid: asterisk-1722255899.0
     */

}
