/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.events;

/**
 *
 * @author plintus
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
