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
public class Unhold extends ChannelEvent implements Serializable {

    public Unhold() {
        super.setEvent("Unhold");
        super.setUuid(UUID.randomUUID());
    }

    /*
    [Event: Unhold, 
    Privilege: call,all, 
    SystemName: asterisk, 
    Channel: PJSIP/16-00000fd8, 
    ChannelState: 6,
    ChannelStateDesc: Up, 
    CallerIDNum: dzjuba_darja, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: +79281235845, 
    ConnectedLineName: Черкесск,
    Language: en, AccountCode: , 
    Context: from-internal-16, 
    Exten: , 
    Priority: 1, 
    Uniqueid: asterisk-1750662739.6195,
    Linkedid: asterisk-1750662739.6193]
     */
}
