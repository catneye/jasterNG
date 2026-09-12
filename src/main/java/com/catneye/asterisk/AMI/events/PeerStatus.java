/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author plintus
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
