/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author plintus
 */
public class BridgeLeave extends SystemEvent implements Serializable {

    public BridgeLeave() {
        super.setEvent("BridgeLeave");
        super.setUuid(UUID.randomUUID());
    }

    private String connectedLineNum;
    private String connectedLineName;
    private String language;
    private String accountCode;
    private String context;
    private String exten;
    private String priority;
    private String uniqueid;
    private String linkedid;
    private String bridgeUniqueid;
    private String bridgeType;
    private String bridgeTechnology;
    private String bridgeCreator;
    private String bridgeName;
    private Integer bridgeNumChannels;
    private String bridgeVideoSourceMode;
    /*
Event: BridgeLeave, 
    Privilege: call,all, 
    SequenceNumber: 545, 
    File: manager_bridges.c, 
    Line: 437, 
    Func: channel_leave_cb, 
    SystemName: asterisk, 
    
    BridgeUniqueid: c4dbba35-897e-4c51-a8b4-07a908eab0fc, 
    BridgeType: basic, 
    BridgeTechnology: simple_bridge, 
    BridgeCreator: <unknown>, 
    BridgeName: <unknown>, 
    BridgeNumChannels: 1, 
    BridgeVideoSourceMode: none, 
    
    Channel: Local/000@internal-00000007;2, 
    ChannelState: 6, 
    ChannelStateDesc: Up, 
    CallerIDNum: <unknown>, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: 000, 
    ConnectedLineName: <unknown>, 
    Language: en, 
    AccountCode: , 
    Context: internal, 
    Exten: 000, 
    Priority: 1, 
    Uniqueid: asterisk-1722863811.39, 
    Linkedid: asterisk-1722863811.38
    
     */

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

    /**
     * @return the connectedLineNum
     */
    public String getConnectedLineNum() {
        return connectedLineNum;
    }

    /**
     * @param connectedLineNum the connectedLineNum to set
     */
    public void setConnectedLineNum(String connectedLineNum) {
        this.connectedLineNum = connectedLineNum;
    }

    /**
     * @return the connectedLineName
     */
    public String getConnectedLineName() {
        return connectedLineName;
    }

    /**
     * @param connectedLineName the connectedLineName to set
     */
    public void setConnectedLineName(String connectedLineName) {
        this.connectedLineName = connectedLineName;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the accountCode
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * @param accountCode the accountCode to set
     */
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    /**
     * @return the context
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context the context to set
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * @return the exten
     */
    public String getExten() {
        return exten;
    }

    /**
     * @param exten the exten to set
     */
    public void setExten(String exten) {
        this.exten = exten;
    }

    /**
     * @return the priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * @return the uniqueid
     */
    public String getUniqueid() {
        return uniqueid;
    }

    /**
     * @param uniqueid the uniqueid to set
     */
    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    /**
     * @return the linkedid
     */
    public String getLinkedid() {
        return linkedid;
    }

    /**
     * @param linkedid the linkedid to set
     */
    public void setLinkedid(String linkedid) {
        this.linkedid = linkedid;
    }
}
