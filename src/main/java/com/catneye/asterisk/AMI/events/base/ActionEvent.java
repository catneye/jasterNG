/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.events.base;

/**
 *
 * @author plintus
 */
public class ActionEvent extends Event{
    private String actionID;

    /**
     * @return the actionID
     */
    public String getActionID() {
        return actionID;
    }

    /**
     * @param actionID the actionID to set
     */
    public void setActionID(String actionID) {
        this.actionID = actionID;
    }
}
