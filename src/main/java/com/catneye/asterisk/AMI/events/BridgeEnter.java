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
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * Событие Asterisk AMI: BridgeEnter. Генерируется, когда канал входит в мост.
 *
 * <p>
 * Пример сырых данных события:
 * <pre>
 * Event: BridgeEnter
 * Privilege: call,all
 * SystemName: asterisk
 * BridgeUniqueid: 6fac128c-5325-4252-aade-fddfd8a94561
 * BridgeType: basic
 * BridgeTechnology: simple_bridge
 * Channel: Local/000@internal-00000004;2
 * ChannelState: 6
 * ChannelStateDesc: Up
 * CallerIDNum: &lt;unknown&gt;
 * ConnectedLineNum: 000
 * Context: internal
 * Exten: 000
 * Priority: 1
 * Uniqueid: asterisk-1725887897.131
 * Linkedid: asterisk-1725887897.130
 * </pre>
 *
 * @author Kurchenko O.E.
 */
public class BridgeEnter extends SystemEvent implements Serializable {

    public BridgeEnter() {
        super.setEvent("BridgeEnter");
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

    /*Privilege: call,all, 
    SystemName: asterisk, 
    
    
    BridgeUniqueid: 6fac128c-5325-4252-aade-fddfd8a94561, 
    BridgeType: basic, 
    BridgeTechnology: simple_bridge, 
    BridgeCreator: <unknown>, 
    BridgeName: <unknown>, 
    BridgeNumChannels: 2, 
    BridgeVideoSourceMode: none, 
    
    Channel: Local/000@internal-00000004;2, 
    ChannelState: 6, 
    ChannelStateDesc: Up, 
    CallerIDNum: <unknown>, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: 000, 
    ConnectedLineName: <unknown>, 
    Language: en, AccountCode: , 
    Context: internal, 
    Exten: 000, 
    Priority: 1, 
    Uniqueid: asterisk-1725887897.131, 
    Linkedid: asterisk-1725887897.130*/
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
