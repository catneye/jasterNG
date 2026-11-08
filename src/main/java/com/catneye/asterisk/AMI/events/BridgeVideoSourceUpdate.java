/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 * Modified by Kurchenko O.E. and OpenAI ChatGPT 2026-11-08.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.BridgeEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI BridgeVideoSourceUpdate event. */
public class BridgeVideoSourceUpdate extends BridgeEvent implements Serializable {

    public BridgeVideoSourceUpdate() {
        super.setEvent("BridgeVideoSourceUpdate");
        super.setUuid(UUID.randomUUID());
    }

    private String bridgeVideoSource;

    public String getBridgeVideoSource() {
        return bridgeVideoSource;
    }

    public void setBridgeVideoSource(String bridgeVideoSource) {
        this.bridgeVideoSource = bridgeVideoSource;
    }

    private String bridgePreviousVideoSource;

    public String getBridgePreviousVideoSource() {
        return bridgePreviousVideoSource;
    }

    public void setBridgePreviousVideoSource(String bridgePreviousVideoSource) {
        this.bridgePreviousVideoSource = bridgePreviousVideoSource;
    }

}
