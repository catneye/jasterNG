/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.events.base;


/**
 *
 * @author plintus
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
