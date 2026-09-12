/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SecurityEvent;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author plintus
 */
public class SuccessfulAuth extends SecurityEvent implements Serializable {

    public SuccessfulAuth() {
        super.setEvent("SuccessfulAuth");
        super.setUuid(UUID.randomUUID());
    }

    private String usingPassword;
    private LocalDateTime sessionTV;

    /*
    <-- Examining AMI event: -->
    Event: SuccessfulAuth
    Privilege: security,all
    SequenceNumber: 40
    File: manager.c
    Line: 2023
    Func: manager_default_msg_cb
    SystemName: asterisk
    
    EventTV: 2024-07-17T15:01:39.608+0300
    Severity: Informational
    Service: AMI
    EventVersion: 1
    AccountID: callerbot
    SessionID: 0x7f9ad0000d20
    LocalAddress: IPV4/TCP/0.0.0.0/5038
    RemoteAddress: IPV4/TCP/10.0.3.1/36332
    UsingPassword: 0
    SessionTV: 2024-07-17T15:01:39.608+0300

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

    /**
     * @return the sessionTV
     */
    public LocalDateTime getSessionTV() {
        return sessionTV;
    }

    /**
     * @param sessionTV the sessionTV to set
     */
    public void setSessionTV(LocalDateTime sessionTV) {
        this.sessionTV = sessionTV;
    }

}
