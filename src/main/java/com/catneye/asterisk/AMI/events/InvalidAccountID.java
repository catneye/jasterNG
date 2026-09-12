/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SecurityEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author plintus
 */
public class InvalidAccountID extends SecurityEvent implements Serializable {

    public InvalidAccountID() {
        super.setEvent("ChallengeSent");
        super.setUuid(UUID.randomUUID());
    }

    /*
    Event: InvalidAccountID, Privilege: security,all, SystemName: asterisk, 
    
    EventTV: 2024-09-10T15:27:35.023+0300
    Severity: Error, 
    Service: PJSIP, E
    ventVersion: 1, 
    AccountID: 100, 
    SessionID: 739158563-27005095-187028060, 
    LocalAddress: IPV4/UDP/185.87.50.175/5060, 
    RemoteAddress: IPV4/UDP/198.27.69.207/56253
     */
}
