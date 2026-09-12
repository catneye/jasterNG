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
public class Hold extends ChannelEvent implements Serializable {

    private String musicClass;

    public Hold() {
        super.setEvent("Hold");
        super.setUuid(UUID.randomUUID());
    }

    /*[
    Event: Hold, 
    Privilege: call,all, 
    SystemName: asterisk, 
    Channel: PJSIP/22-00000fc0,
    ChannelState: 6, 
    ChannelStateDesc: Up, 
    CallerIDNum: sarkisjan_rozalija, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: +79094958780, 
    ConnectedLineName: +79094958780, 
    Language: en, 
    AccountCode: , 
    Context: from-internal-22,
    Exten: , 
    Priority: 1, 
    Uniqueid: asterisk-1750662501.6160, 
    Linkedid: asterisk-1750662501.6159, 
    MusicClass: default]
     */
    /**
     * @return the musicClass
     */
    public String getMusicClass() {
        return musicClass;
    }

    /**
     * @param musicClass the musicClass to set
     */
    public void setMusicClass(String musicClass) {
        this.musicClass = musicClass;
    }

}
