/*
 * jasterNG - Java interface for Asterisk
 *
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG.
 *
 * jasterNG is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, version 2.
 *
 * jasterNG is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jasterNG. If not, see <https://www.gnu.org/licenses/>.
 *
 * Modified by Kurchenko O.E. 2026-09-12.
 */
package com.catneye.asterisk.AMI.events.base;


/**
 *
 * @author Kurchenko O.E.
 */
public class BridgeEvent extends SystemEvent{
    
    private String bridgeUniqueid;
    private String bridgeType;
    private String bridgeTechnology;
    private String bridgeCreator;
    private String bridgeName;
    private Integer bridgeNumChannels;
    private String bridgeVideoSourceMode;

    /**
     * @return the bridgeUniqueid
     */
    public String getBridgeUniqueid() {
        return bridgeUniqueid;
    }

    /**
     * @param bridgeUniqueid the bridgeUniqueid to set
     */
    public void setBridgeUniqueid(String bridgeUniqueid) {
        this.bridgeUniqueid = bridgeUniqueid;
    }

    /**
     * @return the bridgeType
     */
    public String getBridgeType() {
        return bridgeType;
    }

    /**
     * @param bridgeType the bridgeType to set
     */
    public void setBridgeType(String bridgeType) {
        this.bridgeType = bridgeType;
    }

    /**
     * @return the bridgeTechnology
     */
    public String getBridgeTechnology() {
        return bridgeTechnology;
    }

    /**
     * @param bridgeTechnology the bridgeTechnology to set
     */
    public void setBridgeTechnology(String bridgeTechnology) {
        this.bridgeTechnology = bridgeTechnology;
    }

    /**
     * @return the bridgeCreator
     */
    public String getBridgeCreator() {
        return bridgeCreator;
    }

    /**
     * @param bridgeCreator the bridgeCreator to set
     */
    public void setBridgeCreator(String bridgeCreator) {
        this.bridgeCreator = bridgeCreator;
    }

    /**
     * @return the bridgeName
     */
    public String getBridgeName() {
        return bridgeName;
    }

    /**
     * @param bridgeName the bridgeName to set
     */
    public void setBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
    }

    /**
     * @return the bridgeNumChannels
     */
    public Integer getBridgeNumChannels() {
        return bridgeNumChannels;
    }

    /**
     * @param bridgeNumChannels the bridgeNumChannels to set
     */
    public void setBridgeNumChannels(Integer bridgeNumChannels) {
        this.bridgeNumChannels = bridgeNumChannels;
    }

    /**
     * @return the bridgeVideoSourceMode
     */
    public String getBridgeVideoSourceMode() {
        return bridgeVideoSourceMode;
    }

    /**
     * @param bridgeVideoSourceMode the bridgeVideoSourceMode to set
     */
    public void setBridgeVideoSourceMode(String bridgeVideoSourceMode) {
        this.bridgeVideoSourceMode = bridgeVideoSourceMode;
    }
}
