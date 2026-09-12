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
public class MusicOnHoldStop extends ChannelEvent implements Serializable {

    public MusicOnHoldStop() {
        super.setEvent("MusicOnHoldStop");
        super.setUuid(UUID.randomUUID());
    }

    /*Event: MusicOnHoldStop, 
    Privilege: call,all, 
    SequenceNumber: 273, 
    File: manager_channels.c, 
    Line: 754, 
    Func: publish_basic_channel_event, 
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
    Linkedid: asterisk-1722860694.14
    
     */
}
