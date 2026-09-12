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
public class ChallengeResponseFailed extends SecurityEvent implements  Serializable {
            
    private String usingPassword;
    
    public ChallengeResponseFailed() {
        super.setEvent("ChallengeResponseFailed");
        super.setUuid(UUID.randomUUID());
    }
    
    /*[Event: SuccessfulAuth, 
    Privilege: security,all, 
    SequenceNumber: 124, 
    File: manager.c, 
    Line: 2023, 
    Func: manager_default_msg_cb, 
    SystemName: asterisk, 
    EventTV: 2024-07-29T15:07:18.246+0300, 
    Severity: Informational, 
    Service: PJSIP, 
    EventVersion: 1, 
    AccountID: 000, 
    SessionID: OnLmN6PCRZ, 
    LocalAddress: IPV4/UDP/10.0.3.15/5060, 
    RemoteAddress: IPV4/UDP/10.0.3.1/5060, 
    UsingPassword: 1]

     */
    /**
     * @return the usingPassword
     */
    public String getUsingPassword() {
        return usingPassword;
    }

    /**
     * @param usingPassword the usingPassword to set
     */
    public void setUsingPassword(String usingPassword) {
        this.usingPassword = usingPassword;
    }

}
