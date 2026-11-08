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

/** AMI BridgeInfoChannel event. */
public class BridgeInfoChannel extends ChannelEvent implements Serializable {

    public BridgeInfoChannel() {
        super.setEvent("BridgeInfoChannel");
        super.setUuid(UUID.randomUUID());
    }

}
