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
public class DTMFEnd extends ChannelEvent implements Serializable {

    private Integer digit;
    private Integer durationMs;
    private String direction;

    public DTMFEnd() {
        super.setEvent("DTMFEnd");
        super.setUuid(UUID.randomUUID());
    }

    /*[Event: DTMFEnd, 
    Privilege: dtmf,all, 
    SystemName: asterisk, 
    Channel: PJSIP/vats342271-8-0000000d, 
    ChannelState: 6, 
    ChannelStateDesc: Up, 
    CallerIDNum: 89064409762, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: 33, 
    ConnectedLineName: 33,
    Language: ru, 
    AccountCode: , 
    Context: incoming-vats342271, 
    Exten: , 
    Priority: 1, 
    Uniqueid: asterisk-1750666816.20, 
    Linkedid: asterisk-1750666816.19,
    Digit: 2, 
    DurationMs: 100, 
    Direction: 
    Received]
     */

    /**
     * @return the digit
     */
    public Integer getDigit() {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(Integer digit) {
        this.digit = digit;
    }

    /**
     * @return the durationMs
     */
    public Integer getDurationMs() {
        return durationMs;
    }

    /**
     * @param durationMs the durationMs to set
     */
    public void setDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

}
