/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 * Modified by Kurchenko O.E. and OpenAI ChatGPT 2026-11-08.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI EndpointListComplete event. */
public class EndpointListComplete extends SystemEvent implements Serializable {

    public EndpointListComplete() {
        super.setEvent("EndpointListComplete");
        super.setUuid(UUID.randomUUID());
    }

    private String eventList;

    public String getEventList() {
        return eventList;
    }

    public void setEventList(String eventList) {
        this.eventList = eventList;
    }

    private Integer listItems;

    public Integer getListItems() {
        return listItems;
    }

    public void setListItems(Integer listItems) {
        this.listItems = listItems;
    }

}
