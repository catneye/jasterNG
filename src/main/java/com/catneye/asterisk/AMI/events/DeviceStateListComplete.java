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

import com.catneye.asterisk.AMI.events.base.ActionEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Kurchenko O.E.
 */
public class DeviceStateListComplete extends ActionEvent implements Serializable {

    private String eventList;
    private String listItems;

    public DeviceStateListComplete() {
        super.setEvent("DeviceStateListComplete");
        super.setUuid(UUID.randomUUID());
    }
    
    /*Event: DeviceStateListComplete, 
    ActionID: fb5b5c86-836d-47e9-897b-efa1f6a70a82, 
    EventList: Complete, 
    ListItems: 1
     */

    /**
     * @return the eventList
     */
    public String getEventList() {
        return eventList;
    }

    /**
     * @param eventList the eventList to set
     */
    public void setEventList(String eventList) {
        this.eventList = eventList;
    }

    /**
     * @return the listItems
     */
    public String getListItems() {
        return listItems;
    }

    /**
     * @param listItems the listItems to set
     */
    public void setListItems(String listItems) {
        this.listItems = listItems;
    }

}
