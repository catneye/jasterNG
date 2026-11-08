/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI ChannelTalkingStop event. */
public class ChannelTalkingStop extends ChannelEvent implements Serializable {

    public ChannelTalkingStop() {
        super.setEvent("ChannelTalkingStop");
        super.setUuid(UUID.randomUUID());
    }

    private Integer duration;

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

}
