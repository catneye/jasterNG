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

import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Kurchenko O.E.
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
