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
