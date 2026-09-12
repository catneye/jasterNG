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
public class MixMonitorStart extends ChannelEvent implements Serializable {

    public MixMonitorStart() {
        super.setEvent("MixMonitorStart");
        super.setUuid(UUID.randomUUID());
    }

    /*
    Event: MixMonitorStart, 
    Privilege: call,all, 
    SequenceNumber: 137, 
    File: manager_channels.c, 
    Line: 754, 
    Func: publish_basic_channel_event, 
    SystemName: asterisk, 
    Channel: PJSIP/000-00000000, 
    ChannelState: 6, 
    ChannelStateDesc: Up, 
    CallerIDNum: 000, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: <unknown>, 
    ConnectedLineName: <unknown>, 
    Language: en, AccountCode: , 
    Context: from-000, 
    Exten: 888, Priority: 3, 
    Uniqueid: asterisk-1722255899.0, 
    Linkedid: asterisk-1722255899.0
    
     */
}
