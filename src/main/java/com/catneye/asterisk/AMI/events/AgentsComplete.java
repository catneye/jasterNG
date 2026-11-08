/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI AgentsComplete event. */
public class AgentsComplete extends SystemEvent implements Serializable {

    public AgentsComplete() {
        super.setEvent("AgentsComplete");
        super.setUuid(UUID.randomUUID());
    }

    private String actionID;

    public String getActionID() {
        return actionID;
    }

    public void setActionID(String actionID) {
        this.actionID = actionID;
    }

}
