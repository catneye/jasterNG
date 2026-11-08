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

/** AMI HangupHandlerPush event. */
public class HangupHandlerPush extends ChannelEvent implements Serializable {

    public HangupHandlerPush() {
        super.setEvent("HangupHandlerPush");
        super.setUuid(UUID.randomUUID());
    }

    private String handler;

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

}
