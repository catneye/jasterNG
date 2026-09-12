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
public class Reload  extends SystemEvent implements Serializable {

    public Reload() {
        super.setEvent("Reload");
        super.setUuid(UUID.randomUUID());
    }

    private String module;
    private Integer status;

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
     * @return the module
     */
    public String getModule() {
        return module;
    }

    /**
     * @param module the module to set
     */
    public void setModule(String module) {
        this.module = module;
    }

    /**
     * @return the status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}
