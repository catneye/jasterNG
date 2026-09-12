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
public class Shutdown extends SystemEvent implements Serializable {

    public Shutdown() {
        super.setEvent("Shutdown");
        super.setUuid(UUID.randomUUID());
    }

    private String shutdown;
    private Boolean restart;

    /*[Event: Reload, 
    Privilege: system,all, 
    SequenceNumber: 99, 
    File: manager.c, 
    Line: 2057, 
    Func: manager_generic_msg_cb, 
    SystemName: asterisk, 
    Module: All, 
    Status: 0]


     */
    /**
     * @return the shutdown
     */
    public String getShutdown() {
        return shutdown;
    }

    /**
     * @param shutdown the shutdown to set
     */
    public void setShutdown(String shutdown) {
        this.shutdown = shutdown;
    }

    /**
     * @return the restart
     */
    public Boolean getRestart() {
        return restart;
    }

    /**
     * @param restart the restart to set
     */
    public void setRestart(Boolean restart) {
        this.restart = restart;
    }

}
