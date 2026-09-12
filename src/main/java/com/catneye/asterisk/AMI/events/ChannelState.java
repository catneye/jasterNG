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

/**
 *
 * @author Kurchenko O.E.
 */
public enum ChannelState {
    
    DOWNandAVAILABLE(0),
    DOWNbutRESERVED(1),
    OFFHOOK(2),//Channel is off hook.
    DIALED(3),//Digits (or equivalent) have been dialed.
    RINGING(4),//Line is ringing.
    ENDRINGING(5),//Remote end is ringing.
    UP(6),//Line is up.
    BUSY(7);//Line is busy.

    private Integer value;

    ChannelState(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public ChannelState getByValue(Integer value) {
        for (ChannelState v : ChannelState.values()) {
            if (v.getValue().equals(value)) {
                return v;
            }
        }
        return null;
    }
}
