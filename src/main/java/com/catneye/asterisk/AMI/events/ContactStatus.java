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

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Kurchenko O.E.
 */
public class ContactStatus extends SystemEvent implements Serializable {

    
    private String URI;
    private String contactStatus;
    private String AOR;
    private String endpointName;
    private String roundtripUsec;
    
    public ContactStatus() {
        super.setEvent("ContactStatus");
        super.setUuid(UUID.randomUUID());
    }
    /*
    [Event: ContactStatus, 
    Privilege: system,all, 
    SequenceNumber: 122, 
    File: manager.c, 
    Line: 2023, 
    Func: manager_default_msg_cb, 
    SystemName: asterisk, 
    URI: sip:000@10.0.3.1:5060, 
    ContactStatus: Reachable, 
    AOR: 000, 
    EndpointName: 000,
    RoundtripUsec: 56737]
     */

    /**
     * @return the URI
     */
    public String getURI() {
        return URI;
    }

    /**
     * @param URI the URI to set
     */
    public void setURI(String URI) {
        this.URI = URI;
    }

    /**
     * @return the contactStatus
     */
    public String getContactStatus() {
        return contactStatus;
    }

    /**
     * @param contactStatus the contactStatus to set
     */
    public void setContactStatus(String contactStatus) {
        this.contactStatus = contactStatus;
    }

    /**
     * @return the AOR
     */
    public String getAOR() {
        return AOR;
    }

    /**
     * @param AOR the AOR to set
     */
    public void setAOR(String AOR) {
        this.AOR = AOR;
    }

    /**
     * @return the endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * @param endpointName the endpointName to set
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * @return the roundtripUsec
     */
    public String getRoundtripUsec() {
        return roundtripUsec;
    }

    /**
     * @param roundtripUsec the roundtripUsec to set
     */
    public void setRoundtripUsec(String roundtripUsec) {
        this.roundtripUsec = roundtripUsec;
    }
}
