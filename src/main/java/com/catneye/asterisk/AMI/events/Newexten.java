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

public class Newexten extends ChannelEvent implements Serializable {

    private String extension;
    private String application;
    private String appData;

    public Newexten() {
        super.setEvent("Newexten");
        super.setUuid(UUID.randomUUID());
    }

    /*
    Event: Newexten, 
    Privilege: dialplan,all, 
    SequenceNumber: 130, 
    File: manager_channels.c, 
    Line: 739, 
    Func: channel_snapshot_update, 
    SystemName: asterisk, 
    
    Channel: PJSIP/000-00000000, 
    ChannelState: 4, 
    ChannelStateDesc: Ring, 
    CallerIDNum: 000, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: <unknown>, 
    ConnectedLineName: <unknown>, 
    Language: en, 
    AccountCode: , 
    Context: from-000, 
    Exten: 888, 
    Priority: 1, 
    Uniqueid: asterisk-1722255899.0, 
    Linkedid: asterisk-1722255899.0, 
    Extension: 888, 
    Application: Answer, 
    AppData: 
    
     */

    /**
     * @return the extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * @param extension the extension to set
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * @return the application
     */
    public String getApplication() {
        return application;
    }

    /**
     * @param application the application to set
     */
    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * @return the appData
     */
    public String getAppData() {
        return appData;
    }

    /**
     * @param appData the appData to set
     */
    public void setAppData(String appData) {
        this.appData = appData;
    }

}
