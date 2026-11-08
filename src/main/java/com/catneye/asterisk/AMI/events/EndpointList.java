/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 * Modified by Kurchenko O.E. and OpenAI ChatGPT 2026-11-08.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI EndpointList event. */
public class EndpointList extends SystemEvent implements Serializable {

    public EndpointList() {
        super.setEvent("EndpointList");
        super.setUuid(UUID.randomUUID());
    }

    private String objectType;

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    private String objectName;

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    private String transport;

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    private String aor;

    public String getAor() {
        return aor;
    }

    public void setAor(String aor) {
        this.aor = aor;
    }

    private String auths;

    public String getAuths() {
        return auths;
    }

    public void setAuths(String auths) {
        this.auths = auths;
    }

    private String outboundAuths;

    public String getOutboundAuths() {
        return outboundAuths;
    }

    public void setOutboundAuths(String outboundAuths) {
        this.outboundAuths = outboundAuths;
    }

    private String deviceState;

    public String getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(String deviceState) {
        this.deviceState = deviceState;
    }

    private String activeChannels;

    public String getActiveChannels() {
        return activeChannels;
    }

    public void setActiveChannels(String activeChannels) {
        this.activeChannels = activeChannels;
    }

    private String contacts;

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

}
