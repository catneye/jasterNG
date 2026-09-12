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
public class PeerStatus extends SystemEvent implements Serializable {

    private String channelType;
    private String peer;
    private String peerStatus;

    public PeerStatus() {
        super.setEvent("PeerStatus");
        super.setUuid(UUID.randomUUID());
    }

    /*[Event: PeerStatus, 
    Privilege: system,all, 
    SequenceNumber: 121, 
    File: manager.c, 
    Line: 2023, Func: manager_default_msg_cb, 
    SystemName: asterisk, 
    
    ChannelType: PJSIP, 
    Peer: PJSIP/000, 
    PeerStatus: Reachable]

     */
    /**
     * @return the channelType
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * @param channelType the channelType to set
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * @return the peer
     */
    public String getPeer() {
        return peer;
    }

    /**
     * @param peer the peer to set
     */
    public void setPeer(String peer) {
        this.peer = peer;
    }

    /**
     * @return the peerStatus
     */
    public String getPeerStatus() {
        return peerStatus;
    }

    /**
     * @param peerStatus the peerStatus to set
     */
    public void setPeerStatus(String peerStatus) {
        this.peerStatus = peerStatus;
    }

}
