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

public class AttendedTransfer extends SystemEvent implements Serializable {

    public AttendedTransfer() {
        super.setEvent("AttendedTransfer");
        super.setUuid(UUID.randomUUID());
    }

    private String result;

    private String origTransfererChannel;
    private Integer origTransfererChannelState;
    private String origTransfererChannelStateDesc;
    private String origTransfererCallerIDNum;
    private String origTransfererCallerIDName;
    private String origTransfererConnectedLineNum;
    private String origTransfererConnectedLineName;
    private String origTransfererLanguage;
    private String origTransfererAccountCode;
    private String origTransfererContext;
    private String origTransfererExten;
    private Integer origTransfererPriority;
    private String origTransfererUniqueid;
    private String origTransfererLinkedid;

    private String origBridgeUniqueid;
    private String origBridgeType;
    private String origBridgeTechnology;
    private String origBridgeCreator;
    private String origBridgeName;
    private Integer origBridgeNumChannels;
    private String origBridgeVideoSourceMode;

    private String secondTransfererChannel;
    private Integer secondTransfererChannelState;
    private String secondTransfererChannelStateDesc;
    private String secondTransfererCallerIDNum;
    private String secondTransfererCallerIDName;
    private String secondTransfererConnectedLineNum;
    private String secondTransfererConnectedLineName;
    private String secondTransfererLanguage;
    private String secondTransfererAccountCode;
    private String secondTransfererContext;
    private String secondTransfererExten;
    private Integer secondTransfererPriority;
    private String secondTransfererUniqueid;
    private String secondTransfererLinkedid;

    private String secondBridgeUniqueid;
    private String secondBridgeType;
    private String secondBridgeTechnology;
    private String secondBridgeCreator;
    private String secondBridgeName;
    private Integer secondBridgeNumChannels;
    private String secondBridgeVideoSourceMode;

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

    private String transferTargetChannel;
    private Integer transferTargetChannelState;
    private String transferTargetChannelStateDesc;
    private String transferTargetCallerIDNum;
    private String transferTargetCallerIDName;
    private String transferTargetConnectedLineNum;
    private String transferTargetConnectedLineName;
    private String transferTargetLanguage;
    private String transferTargetAccountCode;
    private String transferTargetContext;
    private String transferTargetExten;
    private Integer transferTargetPriority;
    private String transferTargetUniqueid;
    private String transferTargetLinkedid;

    private Boolean isExternal;
    private String destType;
    private String destBridgeUniqueid;
    //private String uniqueid;

    /*
    [Event: AttendedTransfer, 
    Privilege: call,all, 
    SystemName: asterisk, 
    
    Result: Success, 
    
    OrigTransfererChannel: PJSIP/16-00000fd8, 
    OrigTransfererChannelState: 6, 
    OrigTransfererChannelStateDesc: Up, 
    OrigTransfererCallerIDNum: dzjuba_darja, 
    OrigTransfererCallerIDName: <unknown>, 
    OrigTransfererConnectedLineNum: +79281235845, 
    OrigTransfererConnectedLineName: Черкесск, 
    OrigTransfererLanguage: en, 
    OrigTransfererAccountCode: , 
    OrigTransfererContext: from-internal-16, 
    OrigTransfererExten: , 
    OrigTransfererPriority: 1, 
    OrigTransfererUniqueid: asterisk-1750662739.6195, 
    OrigTransfererLinkedid: asterisk-1750662739.6193, 
    
    OrigBridgeUniqueid: 936b1ecf-0823-423e-9f17-35c61128bd5b, 
    OrigBridgeType: basic, 
    OrigBridgeTechnology: simple_bridge, 
    OrigBridgeCreator: <unknown>, 
    OrigBridgeName: <unknown>, 
    OrigBridgeNumChannels: 2, 
    OrigBridgeVideoSourceMode: none, 
    
    SecondTransfererChannel: PJSIP/16-00000fda, 
    SecondTransfererChannelState: 6, 
    SecondTransfererChannelStateDesc: Up, 
    SecondTransfererCallerIDNum: 16, 
    SecondTransfererCallerIDName: 16, 
    SecondTransfererConnectedLineNum: 69, 
    SecondTransfererConnectedLineName: <unknown>, 
    SecondTransfererLanguage: en, 
    SecondTransfererAccountCode: , 
    SecondTransfererContext: from-internal-16, 
    SecondTransfererExten: 69, 
    SecondTransfererPriority: 6, 
    SecondTransfererUniqueid: asterisk-1750662777.6198, 
    SecondTransfererLinkedid: asterisk-1750662777.6198, 
    
    SecondBridgeUniqueid: 32d5ec9c-4527-432e-beeb-939a076ebbf3, 
    SecondBridgeType: basic, 
    SecondBridgeTechnology: simple_bridge, 
    SecondBridgeCreator: <unknown>, 
    SecondBridgeName: <unknown>, 
    SecondBridgeNumChannels: 2, 
    SecondBridgeVideoSourceMode: none, 
    
    TransfereeChannel: PJSIP/vats342271-2-00000fd6, 
    TransfereeChannelState: 6, 
    TransfereeChannelStateDesc: Up, 
    TransfereeCallerIDNum: +79281235845, 
    TransfereeCallerIDName: Черкесск, 
    TransfereeConnectedLineNum: dzjuba_darja, 
    TransfereeConnectedLineName: <unknown>, 
    TransfereeLanguage: ru, 
    TransfereeAccountCode: , 
    TransfereeContext: incoming-vats342271, 
    TransfereeExten: dzjuba_darja, 
    TransfereePriority: 22, 
    TransfereeUniqueid: asterisk-1750662739.6193, 
    TransfereeLinkedid: asterisk-1750662739.6193, 
    
    TransferTargetChannel: PJSIP/69-00000fdb, 
    TransferTargetChannelState: 6, 
    TransferTargetChannelStateDesc: Up, 
    TransferTargetCallerIDNum: 69, 
    TransferTargetCallerIDName: <unknown>, 
    TransferTargetConnectedLineNum: 16, 
    TransferTargetConnectedLineName: 16, 
    TransferTargetLanguage: en, 
    TransferTargetAccountCode: , 
    TransferTargetContext: from-internal-69, 
    TransferTargetExten: , 
    TransferTargetPriority: 1, 
    TransferTargetUniqueid: asterisk-1750662777.6199, 
    TransferTargetLinkedid: asterisk-1750662777.6198, 
    
    IsExternal: No, 
    DestType: Bridge, 
    DestBridgeUniqueid: 32d5ec9c-4527-432e-beeb-939a076ebbf3
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
     * @return the origTransfererChannel
     */
    public String getOrigTransfererChannel() {
        return origTransfererChannel;
    }

    /**
     * @param origTransfererChannel the origTransfererChannel to set
     */
    public void setOrigTransfererChannel(String origTransfererChannel) {
        this.origTransfererChannel = origTransfererChannel;
    }

    /**
     * @return the origTransfererChannelState
     */
    public Integer getOrigTransfererChannelState() {
        return origTransfererChannelState;
    }

    /**
     * @param origTransfererChannelState the origTransfererChannelState to set
     */
    public void setOrigTransfererChannelState(Integer origTransfererChannelState) {
        this.origTransfererChannelState = origTransfererChannelState;
    }

    /**
     * @return the origTransfererChannelStateDesc
     */
    public String getOrigTransfererChannelStateDesc() {
        return origTransfererChannelStateDesc;
    }

    /**
     * @param origTransfererChannelStateDesc the origTransfererChannelStateDesc
     * to set
     */
    public void setOrigTransfererChannelStateDesc(String origTransfererChannelStateDesc) {
        this.origTransfererChannelStateDesc = origTransfererChannelStateDesc;
    }

    /**
     * @return the origTransfererCallerIDNum
     */
    public String getOrigTransfererCallerIDNum() {
        return origTransfererCallerIDNum;
    }

    /**
     * @param origTransfererCallerIDNum the origTransfererCallerIDNum to set
     */
    public void setOrigTransfererCallerIDNum(String origTransfererCallerIDNum) {
        this.origTransfererCallerIDNum = origTransfererCallerIDNum;
    }

    /**
     * @return the origTransfererCallerIDName
     */
    public String getOrigTransfererCallerIDName() {
        return origTransfererCallerIDName;
    }

    /**
     * @param origTransfererCallerIDName the origTransfererCallerIDName to set
     */
    public void setOrigTransfererCallerIDName(String origTransfererCallerIDName) {
        this.origTransfererCallerIDName = origTransfererCallerIDName;
    }

    /**
     * @return the origTransfererConnectedLineNum
     */
    public String getOrigTransfererConnectedLineNum() {
        return origTransfererConnectedLineNum;
    }

    /**
     * @param origTransfererConnectedLineNum the origTransfererConnectedLineNum
     * to set
     */
    public void setOrigTransfererConnectedLineNum(String origTransfererConnectedLineNum) {
        this.origTransfererConnectedLineNum = origTransfererConnectedLineNum;
    }

    /**
     * @return the origTransfererConnectedLineName
     */
    public String getOrigTransfererConnectedLineName() {
        return origTransfererConnectedLineName;
    }

    /**
     * @param origTransfererConnectedLineName the
     * origTransfererConnectedLineName to set
     */
    public void setOrigTransfererConnectedLineName(String origTransfererConnectedLineName) {
        this.origTransfererConnectedLineName = origTransfererConnectedLineName;
    }

    /**
     * @return the origTransfererLanguage
     */
    public String getOrigTransfererLanguage() {
        return origTransfererLanguage;
    }

    /**
     * @param origTransfererLanguage the origTransfererLanguage to set
     */
    public void setOrigTransfererLanguage(String origTransfererLanguage) {
        this.origTransfererLanguage = origTransfererLanguage;
    }

    /**
     * @return the origTransfererAccountCode
     */
    public String getOrigTransfererAccountCode() {
        return origTransfererAccountCode;
    }

    /**
     * @param origTransfererAccountCode the origTransfererAccountCode to set
     */
    public void setOrigTransfererAccountCode(String origTransfererAccountCode) {
        this.origTransfererAccountCode = origTransfererAccountCode;
    }

    /**
     * @return the origTransfererContext
     */
    public String getOrigTransfererContext() {
        return origTransfererContext;
    }

    /**
     * @param origTransfererContext the origTransfererContext to set
     */
    public void setOrigTransfererContext(String origTransfererContext) {
        this.origTransfererContext = origTransfererContext;
    }

    /**
     * @return the origTransfererExten
     */
    public String getOrigTransfererExten() {
        return origTransfererExten;
    }

    /**
     * @param origTransfererExten the origTransfererExten to set
     */
    public void setOrigTransfererExten(String origTransfererExten) {
        this.origTransfererExten = origTransfererExten;
    }

    /**
     * @return the origTransfererPriority
     */
    public Integer getOrigTransfererPriority() {
        return origTransfererPriority;
    }

    /**
     * @param origTransfererPriority the origTransfererPriority to set
     */
    public void setOrigTransfererPriority(Integer origTransfererPriority) {
        this.origTransfererPriority = origTransfererPriority;
    }

    /**
     * @return the origTransfererUniqueid
     */
    public String getOrigTransfererUniqueid() {
        return origTransfererUniqueid;
    }

    /**
     * @param origTransfererUniqueid the origTransfererUniqueid to set
     */
    public void setOrigTransfererUniqueid(String origTransfererUniqueid) {
        this.origTransfererUniqueid = origTransfererUniqueid;
    }

    /**
     * @return the origTransfererLinkedid
     */
    public String getOrigTransfererLinkedid() {
        return origTransfererLinkedid;
    }

    /**
     * @param origTransfererLinkedid the origTransfererLinkedid to set
     */
    public void setOrigTransfererLinkedid(String origTransfererLinkedid) {
        this.origTransfererLinkedid = origTransfererLinkedid;
    }

    /**
     * @return the origBridgeUniqueid
     */
    public String getOrigBridgeUniqueid() {
        return origBridgeUniqueid;
    }

    /**
     * @param origBridgeUniqueid the origBridgeUniqueid to set
     */
    public void setOrigBridgeUniqueid(String origBridgeUniqueid) {
        this.origBridgeUniqueid = origBridgeUniqueid;
    }

    /**
     * @return the origBridgeType
     */
    public String getOrigBridgeType() {
        return origBridgeType;
    }

    /**
     * @param origBridgeType the origBridgeType to set
     */
    public void setOrigBridgeType(String origBridgeType) {
        this.origBridgeType = origBridgeType;
    }

    /**
     * @return the origBridgeTechnology
     */
    public String getOrigBridgeTechnology() {
        return origBridgeTechnology;
    }

    /**
     * @param origBridgeTechnology the origBridgeTechnology to set
     */
    public void setOrigBridgeTechnology(String origBridgeTechnology) {
        this.origBridgeTechnology = origBridgeTechnology;
    }

    /**
     * @return the origBridgeCreator
     */
    public String getOrigBridgeCreator() {
        return origBridgeCreator;
    }

    /**
     * @param origBridgeCreator the origBridgeCreator to set
     */
    public void setOrigBridgeCreator(String origBridgeCreator) {
        this.origBridgeCreator = origBridgeCreator;
    }

    /**
     * @return the origBridgeName
     */
    public String getOrigBridgeName() {
        return origBridgeName;
    }

    /**
     * @param origBridgeName the origBridgeName to set
     */
    public void setOrigBridgeName(String origBridgeName) {
        this.origBridgeName = origBridgeName;
    }

    /**
     * @return the origBridgeNumChannels
     */
    public Integer getOrigBridgeNumChannels() {
        return origBridgeNumChannels;
    }

    /**
     * @param origBridgeNumChannels the origBridgeNumChannels to set
     */
    public void setOrigBridgeNumChannels(Integer origBridgeNumChannels) {
        this.origBridgeNumChannels = origBridgeNumChannels;
    }

    /**
     * @return the origBridgeVideoSourceMode
     */
    public String getOrigBridgeVideoSourceMode() {
        return origBridgeVideoSourceMode;
    }

    /**
     * @param origBridgeVideoSourceMode the origBridgeVideoSourceMode to set
     */
    public void setOrigBridgeVideoSourceMode(String origBridgeVideoSourceMode) {
        this.origBridgeVideoSourceMode = origBridgeVideoSourceMode;
    }

    /**
     * @return the secondTransfererChannel
     */
    public String getSecondTransfererChannel() {
        return secondTransfererChannel;
    }

    /**
     * @param secondTransfererChannel the secondTransfererChannel to set
     */
    public void setSecondTransfererChannel(String secondTransfererChannel) {
        this.secondTransfererChannel = secondTransfererChannel;
    }

    /**
     * @return the secondTransfererChannelState
     */
    public Integer getSecondTransfererChannelState() {
        return secondTransfererChannelState;
    }

    /**
     * @param secondTransfererChannelState the secondTransfererChannelState to
     * set
     */
    public void setSecondTransfererChannelState(Integer secondTransfererChannelState) {
        this.secondTransfererChannelState = secondTransfererChannelState;
    }

    /**
     * @return the secondTransfererChannelStateDesc
     */
    public String getSecondTransfererChannelStateDesc() {
        return secondTransfererChannelStateDesc;
    }

    /**
     * @param secondTransfererChannelStateDesc the
     * secondTransfererChannelStateDesc to set
     */
    public void setSecondTransfererChannelStateDesc(String secondTransfererChannelStateDesc) {
        this.secondTransfererChannelStateDesc = secondTransfererChannelStateDesc;
    }

    /**
     * @return the secondTransfererCallerIDNum
     */
    public String getSecondTransfererCallerIDNum() {
        return secondTransfererCallerIDNum;
    }

    /**
     * @param secondTransfererCallerIDNum the secondTransfererCallerIDNum to set
     */
    public void setSecondTransfererCallerIDNum(String secondTransfererCallerIDNum) {
        this.secondTransfererCallerIDNum = secondTransfererCallerIDNum;
    }

    /**
     * @return the secondTransfererCallerIDName
     */
    public String getSecondTransfererCallerIDName() {
        return secondTransfererCallerIDName;
    }

    /**
     * @param secondTransfererCallerIDName the secondTransfererCallerIDName to
     * set
     */
    public void setSecondTransfererCallerIDName(String secondTransfererCallerIDName) {
        this.secondTransfererCallerIDName = secondTransfererCallerIDName;
    }

    /**
     * @return the secondTransfererConnectedLineNum
     */
    public String getSecondTransfererConnectedLineNum() {
        return secondTransfererConnectedLineNum;
    }

    /**
     * @param secondTransfererConnectedLineNum the
     * secondTransfererConnectedLineNum to set
     */
    public void setSecondTransfererConnectedLineNum(String secondTransfererConnectedLineNum) {
        this.secondTransfererConnectedLineNum = secondTransfererConnectedLineNum;
    }

    /**
     * @return the secondTransfererConnectedLineName
     */
    public String getSecondTransfererConnectedLineName() {
        return secondTransfererConnectedLineName;
    }

    /**
     * @param secondTransfererConnectedLineName the
     * secondTransfererConnectedLineName to set
     */
    public void setSecondTransfererConnectedLineName(String secondTransfererConnectedLineName) {
        this.secondTransfererConnectedLineName = secondTransfererConnectedLineName;
    }

    /**
     * @return the secondTransfererLanguage
     */
    public String getSecondTransfererLanguage() {
        return secondTransfererLanguage;
    }

    /**
     * @param secondTransfererLanguage the secondTransfererLanguage to set
     */
    public void setSecondTransfererLanguage(String secondTransfererLanguage) {
        this.secondTransfererLanguage = secondTransfererLanguage;
    }

    /**
     * @return the secondTransfererAccountCode
     */
    public String getSecondTransfererAccountCode() {
        return secondTransfererAccountCode;
    }

    /**
     * @param secondTransfererAccountCode the secondTransfererAccountCode to set
     */
    public void setSecondTransfererAccountCode(String secondTransfererAccountCode) {
        this.secondTransfererAccountCode = secondTransfererAccountCode;
    }

    /**
     * @return the secondTransfererContext
     */
    public String getSecondTransfererContext() {
        return secondTransfererContext;
    }

    /**
     * @param secondTransfererContext the secondTransfererContext to set
     */
    public void setSecondTransfererContext(String secondTransfererContext) {
        this.secondTransfererContext = secondTransfererContext;
    }

    /**
     * @return the secondTransfererExten
     */
    public String getSecondTransfererExten() {
        return secondTransfererExten;
    }

    /**
     * @param secondTransfererExten the secondTransfererExten to set
     */
    public void setSecondTransfererExten(String secondTransfererExten) {
        this.secondTransfererExten = secondTransfererExten;
    }

    /**
     * @return the secondTransfererPriority
     */
    public Integer getSecondTransfererPriority() {
        return secondTransfererPriority;
    }

    /**
     * @param secondTransfererPriority the secondTransfererPriority to set
     */
    public void setSecondTransfererPriority(Integer secondTransfererPriority) {
        this.secondTransfererPriority = secondTransfererPriority;
    }

    /**
     * @return the secondTransfererUniqueid
     */
    public String getSecondTransfererUniqueid() {
        return secondTransfererUniqueid;
    }

    /**
     * @param secondTransfererUniqueid the secondTransfererUniqueid to set
     */
    public void setSecondTransfererUniqueid(String secondTransfererUniqueid) {
        this.secondTransfererUniqueid = secondTransfererUniqueid;
    }

    /**
     * @return the secondTransfererLinkedid
     */
    public String getSecondTransfererLinkedid() {
        return secondTransfererLinkedid;
    }

    /**
     * @param secondTransfererLinkedid the secondTransfererLinkedid to set
     */
    public void setSecondTransfererLinkedid(String secondTransfererLinkedid) {
        this.secondTransfererLinkedid = secondTransfererLinkedid;
    }

    /**
     * @return the secondBridgeUniqueid
     */
    public String getSecondBridgeUniqueid() {
        return secondBridgeUniqueid;
    }

    /**
     * @param secondBridgeUniqueid the secondBridgeUniqueid to set
     */
    public void setSecondBridgeUniqueid(String secondBridgeUniqueid) {
        this.secondBridgeUniqueid = secondBridgeUniqueid;
    }

    /**
     * @return the secondBridgeType
     */
    public String getSecondBridgeType() {
        return secondBridgeType;
    }

    /**
     * @param secondBridgeType the secondBridgeType to set
     */
    public void setSecondBridgeType(String secondBridgeType) {
        this.secondBridgeType = secondBridgeType;
    }

    /**
     * @return the secondBridgeTechnology
     */
    public String getSecondBridgeTechnology() {
        return secondBridgeTechnology;
    }

    /**
     * @param secondBridgeTechnology the secondBridgeTechnology to set
     */
    public void setSecondBridgeTechnology(String secondBridgeTechnology) {
        this.secondBridgeTechnology = secondBridgeTechnology;
    }

    /**
     * @return the secondBridgeCreator
     */
    public String getSecondBridgeCreator() {
        return secondBridgeCreator;
    }

    /**
     * @param secondBridgeCreator the secondBridgeCreator to set
     */
    public void setSecondBridgeCreator(String secondBridgeCreator) {
        this.secondBridgeCreator = secondBridgeCreator;
    }

    /**
     * @return the secondBridgeName
     */
    public String getSecondBridgeName() {
        return secondBridgeName;
    }

    /**
     * @param secondBridgeName the secondBridgeName to set
     */
    public void setSecondBridgeName(String secondBridgeName) {
        this.secondBridgeName = secondBridgeName;
    }

    /**
     * @return the secondBridgeNumChannels
     */
    public Integer getSecondBridgeNumChannels() {
        return secondBridgeNumChannels;
    }

    /**
     * @param secondBridgeNumChannels the secondBridgeNumChannels to set
     */
    public void setSecondBridgeNumChannels(Integer secondBridgeNumChannels) {
        this.secondBridgeNumChannels = secondBridgeNumChannels;
    }

    /**
     * @return the secondBridgeVideoSourceMode
     */
    public String getSecondBridgeVideoSourceMode() {
        return secondBridgeVideoSourceMode;
    }

    /**
     * @param secondBridgeVideoSourceMode the secondBridgeVideoSourceMode to set
     */
    public void setSecondBridgeVideoSourceMode(String secondBridgeVideoSourceMode) {
        this.secondBridgeVideoSourceMode = secondBridgeVideoSourceMode;
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
     * @return the transferTargetChannel
     */
    public String getTransferTargetChannel() {
        return transferTargetChannel;
    }

    /**
     * @param transferTargetChannel the transferTargetChannel to set
     */
    public void setTransferTargetChannel(String transferTargetChannel) {
        this.transferTargetChannel = transferTargetChannel;
    }

    /**
     * @return the transferTargetChannelState
     */
    public Integer getTransferTargetChannelState() {
        return transferTargetChannelState;
    }

    /**
     * @param transferTargetChannelState the transferTargetChannelState to set
     */
    public void setTransferTargetChannelState(Integer transferTargetChannelState) {
        this.transferTargetChannelState = transferTargetChannelState;
    }

    /**
     * @return the transferTargetChannelStateDesc
     */
    public String getTransferTargetChannelStateDesc() {
        return transferTargetChannelStateDesc;
    }

    /**
     * @param transferTargetChannelStateDesc the transferTargetChannelStateDesc
     * to set
     */
    public void setTransferTargetChannelStateDesc(String transferTargetChannelStateDesc) {
        this.transferTargetChannelStateDesc = transferTargetChannelStateDesc;
    }

    /**
     * @return the transferTargetCallerIDNum
     */
    public String getTransferTargetCallerIDNum() {
        return transferTargetCallerIDNum;
    }

    /**
     * @param transferTargetCallerIDNum the transferTargetCallerIDNum to set
     */
    public void setTransferTargetCallerIDNum(String transferTargetCallerIDNum) {
        this.transferTargetCallerIDNum = transferTargetCallerIDNum;
    }

    /**
     * @return the transferTargetCallerIDName
     */
    public String getTransferTargetCallerIDName() {
        return transferTargetCallerIDName;
    }

    /**
     * @param transferTargetCallerIDName the transferTargetCallerIDName to set
     */
    public void setTransferTargetCallerIDName(String transferTargetCallerIDName) {
        this.transferTargetCallerIDName = transferTargetCallerIDName;
    }

    /**
     * @return the transferTargetConnectedLineNum
     */
    public String getTransferTargetConnectedLineNum() {
        return transferTargetConnectedLineNum;
    }

    /**
     * @param transferTargetConnectedLineNum the transferTargetConnectedLineNum
     * to set
     */
    public void setTransferTargetConnectedLineNum(String transferTargetConnectedLineNum) {
        this.transferTargetConnectedLineNum = transferTargetConnectedLineNum;
    }

    /**
     * @return the transferTargetConnectedLineName
     */
    public String getTransferTargetConnectedLineName() {
        return transferTargetConnectedLineName;
    }

    /**
     * @param transferTargetConnectedLineName the
     * transferTargetConnectedLineName to set
     */
    public void setTransferTargetConnectedLineName(String transferTargetConnectedLineName) {
        this.transferTargetConnectedLineName = transferTargetConnectedLineName;
    }

    /**
     * @return the transferTargetLanguage
     */
    public String getTransferTargetLanguage() {
        return transferTargetLanguage;
    }

    /**
     * @param transferTargetLanguage the transferTargetLanguage to set
     */
    public void setTransferTargetLanguage(String transferTargetLanguage) {
        this.transferTargetLanguage = transferTargetLanguage;
    }

    /**
     * @return the transferTargetAccountCode
     */
    public String getTransferTargetAccountCode() {
        return transferTargetAccountCode;
    }

    /**
     * @param transferTargetAccountCode the transferTargetAccountCode to set
     */
    public void setTransferTargetAccountCode(String transferTargetAccountCode) {
        this.transferTargetAccountCode = transferTargetAccountCode;
    }

    /**
     * @return the transferTargetContext
     */
    public String getTransferTargetContext() {
        return transferTargetContext;
    }

    /**
     * @param transferTargetContext the transferTargetContext to set
     */
    public void setTransferTargetContext(String transferTargetContext) {
        this.transferTargetContext = transferTargetContext;
    }

    /**
     * @return the transferTargetExten
     */
    public String getTransferTargetExten() {
        return transferTargetExten;
    }

    /**
     * @param transferTargetExten the transferTargetExten to set
     */
    public void setTransferTargetExten(String transferTargetExten) {
        this.transferTargetExten = transferTargetExten;
    }

    /**
     * @return the transferTargetPriority
     */
    public Integer getTransferTargetPriority() {
        return transferTargetPriority;
    }

    /**
     * @param transferTargetPriority the transferTargetPriority to set
     */
    public void setTransferTargetPriority(Integer transferTargetPriority) {
        this.transferTargetPriority = transferTargetPriority;
    }

    /**
     * @return the transferTargetUniqueid
     */
    public String getTransferTargetUniqueid() {
        return transferTargetUniqueid;
    }

    /**
     * @param transferTargetUniqueid the transferTargetUniqueid to set
     */
    public void setTransferTargetUniqueid(String transferTargetUniqueid) {
        this.transferTargetUniqueid = transferTargetUniqueid;
    }

    /**
     * @return the transferTargetLinkedid
     */
    public String getTransferTargetLinkedid() {
        return transferTargetLinkedid;
    }

    /**
     * @param transferTargetLinkedid the transferTargetLinkedid to set
     */
    public void setTransferTargetLinkedid(String transferTargetLinkedid) {
        this.transferTargetLinkedid = transferTargetLinkedid;
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
     * @return the destType
     */
    public String getDestType() {
        return destType;
    }

    /**
     * @param destType the destType to set
     */
    public void setDestType(String destType) {
        this.destType = destType;
    }

    /**
     * @return the destBridgeUniqueid
     */
    public String getDestBridgeUniqueid() {
        return destBridgeUniqueid;
    }

    /**
     * @param destBridgeUniqueid the destBridgeUniqueid to set
     */
    public void setDestBridgeUniqueid(String destBridgeUniqueid) {
        this.destBridgeUniqueid = destBridgeUniqueid;
    }
}
