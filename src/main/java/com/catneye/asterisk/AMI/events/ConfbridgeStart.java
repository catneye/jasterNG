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

/** AMI ConfbridgeStart event. */
public class ConfbridgeStart extends SystemEvent implements Serializable {

    public ConfbridgeStart() {
        super.setEvent("ConfbridgeStart");
        super.setUuid(UUID.randomUUID());
    }

    private String conference;

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    private String bridgeUniqueid;

    public String getBridgeUniqueid() {
        return bridgeUniqueid;
    }

    public void setBridgeUniqueid(String bridgeUniqueid) {
        this.bridgeUniqueid = bridgeUniqueid;
    }

    private String bridgeType;

    public String getBridgeType() {
        return bridgeType;
    }

    public void setBridgeType(String bridgeType) {
        this.bridgeType = bridgeType;
    }

    private String bridgeTechnology;

    public String getBridgeTechnology() {
        return bridgeTechnology;
    }

    public void setBridgeTechnology(String bridgeTechnology) {
        this.bridgeTechnology = bridgeTechnology;
    }

    private String bridgeCreator;

    public String getBridgeCreator() {
        return bridgeCreator;
    }

    public void setBridgeCreator(String bridgeCreator) {
        this.bridgeCreator = bridgeCreator;
    }

    private String bridgeName;

    public String getBridgeName() {
        return bridgeName;
    }

    public void setBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
    }

    private Integer bridgeNumChannels;

    public Integer getBridgeNumChannels() {
        return bridgeNumChannels;
    }

    public void setBridgeNumChannels(Integer bridgeNumChannels) {
        this.bridgeNumChannels = bridgeNumChannels;
    }

    private String bridgeVideoSourceMode;

    public String getBridgeVideoSourceMode() {
        return bridgeVideoSourceMode;
    }

    public void setBridgeVideoSourceMode(String bridgeVideoSourceMode) {
        this.bridgeVideoSourceMode = bridgeVideoSourceMode;
    }

    private String bridgeVideoSource;

    public String getBridgeVideoSource() {
        return bridgeVideoSource;
    }

    public void setBridgeVideoSource(String bridgeVideoSource) {
        this.bridgeVideoSource = bridgeVideoSource;
    }

}
