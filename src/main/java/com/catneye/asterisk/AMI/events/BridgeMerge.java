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

/** AMI BridgeMerge event. */
public class BridgeMerge extends SystemEvent implements Serializable {

    public BridgeMerge() {
        super.setEvent("BridgeMerge");
        super.setUuid(UUID.randomUUID());
    }

    private String toBridgeUniqueid;

    public String getToBridgeUniqueid() {
        return toBridgeUniqueid;
    }

    public void setToBridgeUniqueid(String toBridgeUniqueid) {
        this.toBridgeUniqueid = toBridgeUniqueid;
    }

    private String toBridgeType;

    public String getToBridgeType() {
        return toBridgeType;
    }

    public void setToBridgeType(String toBridgeType) {
        this.toBridgeType = toBridgeType;
    }

    private String toBridgeTechnology;

    public String getToBridgeTechnology() {
        return toBridgeTechnology;
    }

    public void setToBridgeTechnology(String toBridgeTechnology) {
        this.toBridgeTechnology = toBridgeTechnology;
    }

    private String toBridgeCreator;

    public String getToBridgeCreator() {
        return toBridgeCreator;
    }

    public void setToBridgeCreator(String toBridgeCreator) {
        this.toBridgeCreator = toBridgeCreator;
    }

    private String toBridgeName;

    public String getToBridgeName() {
        return toBridgeName;
    }

    public void setToBridgeName(String toBridgeName) {
        this.toBridgeName = toBridgeName;
    }

    private Integer toBridgeNumChannels;

    public Integer getToBridgeNumChannels() {
        return toBridgeNumChannels;
    }

    public void setToBridgeNumChannels(Integer toBridgeNumChannels) {
        this.toBridgeNumChannels = toBridgeNumChannels;
    }

    private String toBridgeVideoSourceMode;

    public String getToBridgeVideoSourceMode() {
        return toBridgeVideoSourceMode;
    }

    public void setToBridgeVideoSourceMode(String toBridgeVideoSourceMode) {
        this.toBridgeVideoSourceMode = toBridgeVideoSourceMode;
    }

    private String toBridgeVideoSource;

    public String getToBridgeVideoSource() {
        return toBridgeVideoSource;
    }

    public void setToBridgeVideoSource(String toBridgeVideoSource) {
        this.toBridgeVideoSource = toBridgeVideoSource;
    }

    private String fromBridgeUniqueid;

    public String getFromBridgeUniqueid() {
        return fromBridgeUniqueid;
    }

    public void setFromBridgeUniqueid(String fromBridgeUniqueid) {
        this.fromBridgeUniqueid = fromBridgeUniqueid;
    }

    private String fromBridgeType;

    public String getFromBridgeType() {
        return fromBridgeType;
    }

    public void setFromBridgeType(String fromBridgeType) {
        this.fromBridgeType = fromBridgeType;
    }

    private String fromBridgeTechnology;

    public String getFromBridgeTechnology() {
        return fromBridgeTechnology;
    }

    public void setFromBridgeTechnology(String fromBridgeTechnology) {
        this.fromBridgeTechnology = fromBridgeTechnology;
    }

    private String fromBridgeCreator;

    public String getFromBridgeCreator() {
        return fromBridgeCreator;
    }

    public void setFromBridgeCreator(String fromBridgeCreator) {
        this.fromBridgeCreator = fromBridgeCreator;
    }

    private String fromBridgeName;

    public String getFromBridgeName() {
        return fromBridgeName;
    }

    public void setFromBridgeName(String fromBridgeName) {
        this.fromBridgeName = fromBridgeName;
    }

    private Integer fromBridgeNumChannels;

    public Integer getFromBridgeNumChannels() {
        return fromBridgeNumChannels;
    }

    public void setFromBridgeNumChannels(Integer fromBridgeNumChannels) {
        this.fromBridgeNumChannels = fromBridgeNumChannels;
    }

    private String fromBridgeVideoSourceMode;

    public String getFromBridgeVideoSourceMode() {
        return fromBridgeVideoSourceMode;
    }

    public void setFromBridgeVideoSourceMode(String fromBridgeVideoSourceMode) {
        this.fromBridgeVideoSourceMode = fromBridgeVideoSourceMode;
    }

    private String fromBridgeVideoSource;

    public String getFromBridgeVideoSource() {
        return fromBridgeVideoSource;
    }

    public void setFromBridgeVideoSource(String fromBridgeVideoSource) {
        this.fromBridgeVideoSource = fromBridgeVideoSource;
    }

}
