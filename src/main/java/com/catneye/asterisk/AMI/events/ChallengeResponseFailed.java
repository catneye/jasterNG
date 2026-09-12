/*
 * jasterNG - Java interface for Asterisk
 *
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG.
 *
 * jasterNG is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, version 2.
 *
 * jasterNG is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jasterNG. If not, see <https://www.gnu.org/licenses/>.
 *
 * Modified by Kurchenko O.E. 2026-09-12.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SecurityEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Kurchenko O.E.
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
