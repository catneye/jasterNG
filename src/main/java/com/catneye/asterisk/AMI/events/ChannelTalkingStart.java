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

/** AMI ChannelTalkingStart event. */
public class ChannelTalkingStart extends ChannelEvent implements Serializable {

    public ChannelTalkingStart() {
        super.setEvent("ChannelTalkingStart");
        super.setUuid(UUID.randomUUID());
    }

}
