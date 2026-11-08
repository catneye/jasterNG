/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.actions;

/** AMI PlayDTMF action. */
public class PlayDTMF extends AbstractAction {

    public PlayDTMF() {
        super("PlayDTMF");
    }

    private String channel;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    private String digit;

    public String getDigit() {
        return digit;
    }

    public void setDigit(String digit) {
        this.digit = digit;
    }

    private Integer duration;

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    private Boolean receive;

    public Boolean getReceive() {
        return receive;
    }

    public void setReceive(Boolean receive) {
        this.receive = receive;
    }

    @Override
    public String toString() {
        StringBuilder message = startMessage();
        appendField(message, "Channel", channel);
        appendField(message, "Digit", digit);
        appendField(message, "Duration", duration);
        appendField(message, "Receive", receive);
        return message.toString();
    }
}
