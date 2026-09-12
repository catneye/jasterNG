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
 * @author Kurchenko O.E.
 */
public class BlindTransfer extends SystemEvent implements Serializable {

    public BlindTransfer() {
        super.setEvent("BlindTransferv");
        super.setUuid(UUID.randomUUID());
    }

    private String result;
    private String transfererChannel;
    private Integer transfererChannelState;
    private String transfererChannelStateDesc;
    private String transfererCallerIDNum;
    private String transfererCallerIDName;
    private String transfererConnectedLineNum;
    private String transfererConnectedLineName;
    private String transfererLanguage;
    private String transfererAccountCode;
    private String transfererContext;
    private String transfererExten;
    private String transfererUniqueid;
    private String transfererLinkedid;
    private String transfereeChannel;
    private Integer transfereeChannelState;
    private String transfereeChannelStateDesc;
    private String transfereeCallerIDNum;
    private String transfereeCallerIDName;
    private String transfereeConnectedLineNum;
    private String transfereeConnectedLineName;
    private String transfereeLanguage;
    private String transfereeAccountCode;
    private String transfereeContext;
    private String transfereeExten;
    private Integer transfereePriority;
    private String transfereeUniqueid;
    private String transfereeLinkedid;
    private String bridgeUniqueid;
    private String bridgeType;
    private String bridgeTechnology;
    private String bridgeCreator;
    private String bridgeName;
    private Integer bridgeNumChannels;
    private String bridgeVideoSourceMode;
    private Boolean isExternal;
    private String context;
    private String extension;
    //private String uniqueid;

    /*
    [Event: BlindTransfer,
    Privilege: call,all, 
    SystemName: asterisk, 
    
    Result: Success, 
    TransfererChannel: PJSIP/16-000006dc, 
    TransfererChannelState: 6, 
    TransfererChannelStateDesc: Up, 
    TransfererCallerIDNum: 16, 
    TransfererCallerIDName: 16, 
    TransfererConnectedLineNum: +79283506603, 
    TransfererConnectedLineName: +79283506603, 
    TransfererLanguage: en, 
    TransfererAccountCode: , 
    TransfererContext: from-internal-22, 
    TransfererExten: , TransfererPriority: 1, 
    TransfererUniqueid: asterisk-1751017624.2697, 
    TransfererLinkedid:asterisk-1751017620.2695, 
    
    TransfereeChannel: PJSIP/vats342271-7-000006da, 
    TransfereeChannelState: 6, 
    TransfereeChannelStateDesc: Up, 
    TransfereeCallerIDNum: +79283506603, 
    TransfereeCallerIDName: +79283506603, 
    TransfereeConnectedLineNum: 16, 
    TransfereeConnectedLineName: 16, 
    TransfereeLanguage: ru, 
    TransfereeAccountCode: , 
    TransfereeContext: incoming-vats342271, 
    TransfereeExten: sarkisjan_rozalija, 
    TransfereePriority: 8, 
    TransfereeUniqueid: asterisk-1751017620.2695, 
    TransfereeLinkedid: asterisk-1751017620.2695, 
    
    BridgeUniqueid: e9679609-db81-455e-8747-8a754ca8306d, 
    BridgeType: basic, 
    BridgeTechnology: simple_bridge, 
    BridgeCreator: <unknown>, 
    BridgeName: <unknown>, 
    BridgeNumChannels: 2, 
    BridgeVideoSourceMode: none, 
    IsExternal: Yes, 
    Context: from-internal-16, 
    Extension: 22
    ]
     */
    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return the transfererChannel
     */
    public String getTransfererChannel() {
        return transfererChannel;
    }

    /**
     * @param transfererChannel the transfererChannel to set
     */
    public void setTransfererChannel(String transfererChannel) {
        this.transfererChannel = transfererChannel;
    }

    /**
     * @return the transfererChannelState
     */
    public Integer getTransfererChannelState() {
        return transfererChannelState;
    }

    /**
     * @param transfererChannelState the transfererChannelState to set
     */
    public void setTransfererChannelState(Integer transfererChannelState) {
        this.transfererChannelState = transfererChannelState;
    }

    /**
     * @return the transfererChannelStateDesc
     */
    public String getTransfererChannelStateDesc() {
        return transfererChannelStateDesc;
    }

    /**
     * @param transfererChannelStateDesc the transfererChannelStateDesc to set
     */
    public void setTransfererChannelStateDesc(String transfererChannelStateDesc) {
        this.transfererChannelStateDesc = transfererChannelStateDesc;
    }

    /**
     * @return the transfererCallerIDNum
     */
    public String getTransfererCallerIDNum() {
        return transfererCallerIDNum;
    }

    /**
     * @param transfererCallerIDNum the transfererCallerIDNum to set
     */
    public void setTransfererCallerIDNum(String transfererCallerIDNum) {
        this.transfererCallerIDNum = transfererCallerIDNum;
    }

    /**
     * @return the transfererCallerIDName
     */
    public String getTransfererCallerIDName() {
        return transfererCallerIDName;
    }

    /**
     * @param transfererCallerIDName the transfererCallerIDName to set
     */
    public void setTransfererCallerIDName(String transfererCallerIDName) {
        this.transfererCallerIDName = transfererCallerIDName;
    }

    /**
     * @return the transfererConnectedLineNum
     */
    public String getTransfererConnectedLineNum() {
        return transfererConnectedLineNum;
    }

    /**
     * @param transfererConnectedLineNum the transfererConnectedLineNum to set
     */
    public void setTransfererConnectedLineNum(String transfererConnectedLineNum) {
        this.transfererConnectedLineNum = transfererConnectedLineNum;
    }

    /**
     * @return the transfererConnectedLineName
     */
    public String getTransfererConnectedLineName() {
        return transfererConnectedLineName;
    }

    /**
     * @param transfererConnectedLineName the transfererConnectedLineName to set
     */
    public void setTransfererConnectedLineName(String transfererConnectedLineName) {
        this.transfererConnectedLineName = transfererConnectedLineName;
    }

    /**
     * @return the transfererLanguage
     */
    public String getTransfererLanguage() {
        return transfererLanguage;
    }

    /**
     * @param transfererLanguage the transfererLanguage to set
     */
    public void setTransfererLanguage(String transfererLanguage) {
        this.transfererLanguage = transfererLanguage;
    }

    /**
     * @return the transfererAccountCode
     */
    public String getTransfererAccountCode() {
        return transfererAccountCode;
    }

    /**
     * @param transfererAccountCode the transfererAccountCode to set
     */
    public void setTransfererAccountCode(String transfererAccountCode) {
        this.transfererAccountCode = transfererAccountCode;
    }

    /**
     * @return the transfererContext
     */
    public String getTransfererContext() {
        return transfererContext;
    }

    /**
     * @param transfererContext the transfererContext to set
     */
    public void setTransfererContext(String transfererContext) {
        this.transfererContext = transfererContext;
    }

    /**
     * @return the transfererExten
     */
    public String getTransfererExten() {
        return transfererExten;
    }

    /**
     * @param transfererExten the transfererExten to set
     */
    public void setTransfererExten(String transfererExten) {
        this.transfererExten = transfererExten;
    }

    /**
     * @return the transfererUniqueid
     */
    public String getTransfererUniqueid() {
        return transfererUniqueid;
    }

    /**
     * @param transfererUniqueid the transfererUniqueid to set
     */
    public void setTransfererUniqueid(String transfererUniqueid) {
        this.transfererUniqueid = transfererUniqueid;
    }

    /**
     * @return the transfererLinkedid
     */
    public String getTransfererLinkedid() {
        return transfererLinkedid;
    }

    /**
     * @param transfererLinkedid the transfererLinkedid to set
     */
    public void setTransfererLinkedid(String transfererLinkedid) {
        this.transfererLinkedid = transfererLinkedid;
    }

    /**
     * @return the transfereeChannel
     */
    public String getTransfereeChannel() {
        return transfereeChannel;
    }

    /**
     * @param transfereeChannel the transfereeChannel to set
     */
    public void setTransfereeChannel(String transfereeChannel) {
        this.transfereeChannel = transfereeChannel;
    }

    /**
     * @return the transfereeChannelState
     */
    public Integer getTransfereeChannelState() {
        return transfereeChannelState;
    }

    /**
     * @param transfereeChannelState the transfereeChannelState to set
     */
    public void setTransfereeChannelState(Integer transfereeChannelState) {
        this.transfereeChannelState = transfereeChannelState;
    }

    /**
     * @return the transfereeChannelStateDesc
     */
    public String getTransfereeChannelStateDesc() {
        return transfereeChannelStateDesc;
    }

    /**
     * @param transfereeChannelStateDesc the transfereeChannelStateDesc to set
     */
    public void setTransfereeChannelStateDesc(String transfereeChannelStateDesc) {
        this.transfereeChannelStateDesc = transfereeChannelStateDesc;
    }

    /**
     * @return the transfereeCallerIDNum
     */
    public String getTransfereeCallerIDNum() {
        return transfereeCallerIDNum;
    }

    /**
     * @param transfereeCallerIDNum the transfereeCallerIDNum to set
     */
    public void setTransfereeCallerIDNum(String transfereeCallerIDNum) {
        this.transfereeCallerIDNum = transfereeCallerIDNum;
    }

    /**
     * @return the transfereeCallerIDName
     */
    public String getTransfereeCallerIDName() {
        return transfereeCallerIDName;
    }

    /**
     * @param transfereeCallerIDName the transfereeCallerIDName to set
     */
    public void setTransfereeCallerIDName(String transfereeCallerIDName) {
        this.transfereeCallerIDName = transfereeCallerIDName;
    }

    /**
     * @return the transfereeConnectedLineNum
     */
    public String getTransfereeConnectedLineNum() {
        return transfereeConnectedLineNum;
    }

    /**
     * @param transfereeConnectedLineNum the transfereeConnectedLineNum to set
     */
    public void setTransfereeConnectedLineNum(String transfereeConnectedLineNum) {
        this.transfereeConnectedLineNum = transfereeConnectedLineNum;
    }

    /**
     * @return the transfereeConnectedLineName
     */
    public String getTransfereeConnectedLineName() {
        return transfereeConnectedLineName;
    }

    /**
     * @param transfereeConnectedLineName the transfereeConnectedLineName to set
     */
    public void setTransfereeConnectedLineName(String transfereeConnectedLineName) {
        this.transfereeConnectedLineName = transfereeConnectedLineName;
    }

    /**
     * @return the transfereeLanguage
     */
    public String getTransfereeLanguage() {
        return transfereeLanguage;
    }

    /**
     * @param transfereeLanguage the transfereeLanguage to set
     */
    public void setTransfereeLanguage(String transfereeLanguage) {
        this.transfereeLanguage = transfereeLanguage;
    }

    /**
     * @return the transfereeAccountCode
     */
    public String getTransfereeAccountCode() {
        return transfereeAccountCode;
    }

    /**
     * @param transfereeAccountCode the transfereeAccountCode to set
     */
    public void setTransfereeAccountCode(String transfereeAccountCode) {
        this.transfereeAccountCode = transfereeAccountCode;
    }

    /**
     * @return the transfereeContext
     */
    public String getTransfereeContext() {
        return transfereeContext;
    }

    /**
     * @param transfereeContext the transfereeContext to set
     */
    public void setTransfereeContext(String transfereeContext) {
        this.transfereeContext = transfereeContext;
    }

    /**
     * @return the transfereeExten
     */
    public String getTransfereeExten() {
        return transfereeExten;
    }

    /**
     * @param transfereeExten the transfereeExten to set
     */
    public void setTransfereeExten(String transfereeExten) {
        this.transfereeExten = transfereeExten;
    }

    /**
     * @return the transfereePriority
     */
    public Integer getTransfereePriority() {
        return transfereePriority;
    }

    /**
     * @param transfereePriority the transfereePriority to set
     */
    public void setTransfereePriority(Integer transfereePriority) {
        this.transfereePriority = transfereePriority;
    }

    /**
     * @return the transfereeUniqueid
     */
    public String getTransfereeUniqueid() {
        return transfereeUniqueid;
    }

    /**
     * @param transfereeUniqueid the transfereeUniqueid to set
     */
    public void setTransfereeUniqueid(String transfereeUniqueid) {
        this.transfereeUniqueid = transfereeUniqueid;
    }

    /**
     * @return the transfereeLinkedid
     */
    public String getTransfereeLinkedid() {
        return transfereeLinkedid;
    }

    /**
     * @param transfereeLinkedid the transfereeLinkedid to set
     */
    public void setTransfereeLinkedid(String transfereeLinkedid) {
        this.transfereeLinkedid = transfereeLinkedid;
    }

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
     * @return the bBridgeType
     */
    public String getBridgeType() {
        return bridgeType;
    }

    /**
     * @param bridgeType the bBridgeType to set
     */
    public void setbBridgeType(String bridgeType) {
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
     * @return the isExternal
     */
    public Boolean getIsExternal() {
        return isExternal;
    }

    /**
     * @param isExternal the isExternal to set
     */
    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
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
     * @return the extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * @param extension the extension to set
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
}
