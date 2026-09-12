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
public class FullyBooted extends SystemEvent implements Serializable {

    private String status;
    private Integer uptime;
    private Integer lastReload;

    public FullyBooted() {
        super.setEvent("FullyBooted");
        super.setUuid(UUID.randomUUID());
    }

    /*
    Event: FullyBooted, 
    Privilege: system,all, 
    Uptime: 1210535, 
    LastReload: 83611, 
    Status: Fully Booted
     */
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the uptime
     */
    public Integer getUptime() {
        return uptime;
    }

    /**
     * @param uptime the uptime to set
     */
    public void setUptime(Integer uptime) {
        this.uptime = uptime;
    }

    /**
     * @return the lastReload
     */
    public Integer getLastReload() {
        return lastReload;
    }

    /**
     * @param lastReload the lastReload to set
     */
    public void setLastReload(Integer lastReload) {
        this.lastReload = lastReload;
    }
}
