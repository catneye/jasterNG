/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.ActionEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author plintus
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
