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
import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author Kurchenko O.E.
 */
public class RequestBadFormat extends SecurityEvent implements Serializable {

    public RequestBadFormat() {
        super.setEvent("RequestBadFormat");
        super.setUuid(UUID.randomUUID());
    }

    private String usingPassword;
    private LocalDateTime sessionTV;

    /*
    Event: RequestBadFormat
    Privilege: security,all
    SequenceNumber: 41
    File: manager.c
    Line: 2023
    Func: manager_default_msg_cb
    SystemName: asterisk
    EventTV: 2024-07-17T15:09:14.657+0300
    Severity: Error
    Service: AMI
    EventVersion: 1
    SessionID: 0x7f9a70007610
    LocalAddress: IPV4/TCP/0.0.0.0/5038
    RemoteAddress: IPV4/TCP/10.0.3.1/51832
    RequestType: Action: NONE
    SessionTV: 2024-07-16T14:06:34.410+0300
    AccountID: callerbot
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
