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
