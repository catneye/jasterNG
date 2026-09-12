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
public class LocalBridge extends SystemEvent implements Serializable {

    public LocalBridge() {
        super.setEvent("LocalBridge");
        super.setUuid(UUID.randomUUID());
    }

    private String channel;

    private String localOneChannel;
    private Integer localOneChannelState;
    private String localOneChannelStateDesc;
    private String localOneCallerIDNum;
    private String localOneCallerIDName;
    private String localOneConnectedLineNum;
    private String localOneConnectedLineName;
    private String localOneLanguage;
    private Integer localOneAccountCode;
    private String localOneContext;
    private String localOneExten;
    private Integer localOnePriority;
    private String localOneUniqueid;
    private String localOneLinkedid;
    private String localTwoChannel;
    private Integer localTwoChannelState;
    private String localTwoChannelStateDesc;
    private String localTwoCallerIDNum;
    private String localTwoCallerIDName;
    private String localTwoConnectedLineNum;
    private String localTwoConnectedLineName;
    private String localTwoLanguage;
    private Integer localTwoAccountCode;
    private String localTwoContext;
    private String localTwoExten;
    private String localTwoPriority;
    private String localTwoUniqueid;
    private String localTwoLinkedid;
    private String context;
    private String exten;
    private String localOptimization;

    /*Event: LocalBridge, 
    Privilege: call,all, 
    SequenceNumber: 246, 
    File: manager.c, 
    Line: 2023, 
    Func: manager_default_msg_cb,
    SystemName: asterisk, 
    LocalOneChannel: Local/000@internal-00000003;1, 
    LocalOneChannelState: 0,
    LocalOneChannelStateDesc: Down, 
    LocalOneCallerIDNum: <unknown>, 
    LocalOneCallerIDName: <unknown>, 
    LocalOneConnectedLineNum: <unknown>, 
    LocalOneConnectedLineName: <unknown>,
    LocalOneLanguage: en, 
    LocalOneAccountCode: , 
    LocalOneContext: internal, 
    LocalOneExten: 000, 
    LocalOnePriority: 1, 
    LocalOneUniqueid: asterisk-1722860694.14, 
    LocalOneLinkedid: asterisk-1722860694.14, 
    LocalTwoChannel: Local/000@internal-00000003;2,
    LocalTwoChannelState: 4, 
    LocalTwoChannelStateDesc: Ring, 
    LocalTwoCallerIDNum: <unknown>, 
    LocalTwoCallerIDName: <unknown>,
    LocalTwoConnectedLineNum: <unknown>, 
    LocalTwoConnectedLineName: <unknown>, 
    LocalTwoLanguage: en, LocalTwoAccountCode: , 
    LocalTwoContext: internal, 
    LocalTwoExten: 000, 
    LocalTwoPriority: 1, 
    LocalTwoUniqueid: asterisk-1722860694.15, 
    LocalTwoLinkedid: asterisk-1722860694.14,
    Context: internal, 
    Exten: 000, 
    LocalOptimization: Yes
    
     */

    /**
     * @param sequenceNumber the sequenceNumber to set
     */
    public void setSequenceNumber(int sequenceNumber) {
        this.setSequenceNumber((Integer) sequenceNumber);
    }

    /**
     * @return the channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel the channel to set
     */
    public void setChannel(String channel) {
        this.channel = channel;
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
     * @return the localOneChannel
     */
    public String getLocalOneChannel() {
        return localOneChannel;
    }

    /**
     * @param localOneChannel the localOneChannel to set
     */
    public void setLocalOneChannel(String localOneChannel) {
        this.localOneChannel = localOneChannel;
    }

    /**
     * @return the localOneChannelState
     */
    public Integer getLocalOneChannelState() {
        return localOneChannelState;
    }

    /**
     * @param localOneChannelState the localOneChannelState to set
     */
    public void setLocalOneChannelState(Integer localOneChannelState) {
        this.localOneChannelState = localOneChannelState;
    }

    /**
     * @return the localOneChannelStateDesc
     */
    public String getLocalOneChannelStateDesc() {
        return localOneChannelStateDesc;
    }

    /**
     * @param localOneChannelStateDesc the localOneChannelStateDesc to set
     */
    public void setLocalOneChannelStateDesc(String localOneChannelStateDesc) {
        this.localOneChannelStateDesc = localOneChannelStateDesc;
    }

    /**
     * @return the localOneCallerIDNum
     */
    public String getLocalOneCallerIDNum() {
        return localOneCallerIDNum;
    }

    /**
     * @param localOneCallerIDNum the localOneCallerIDNum to set
     */
    public void setLocalOneCallerIDNum(String localOneCallerIDNum) {
        this.localOneCallerIDNum = localOneCallerIDNum;
    }

    /**
     * @return the localOneCallerIDName
     */
    public String getLocalOneCallerIDName() {
        return localOneCallerIDName;
    }

    /**
     * @param localOneCallerIDName the localOneCallerIDName to set
     */
    public void setLocalOneCallerIDName(String localOneCallerIDName) {
        this.localOneCallerIDName = localOneCallerIDName;
    }

    /**
     * @return the localOneConnectedLineNum
     */
    public String getLocalOneConnectedLineNum() {
        return localOneConnectedLineNum;
    }

    /**
     * @param localOneConnectedLineNum the localOneConnectedLineNum to set
     */
    public void setLocalOneConnectedLineNum(String localOneConnectedLineNum) {
        this.localOneConnectedLineNum = localOneConnectedLineNum;
    }

    /**
     * @return the localOneConnectedLineName
     */
    public String getLocalOneConnectedLineName() {
        return localOneConnectedLineName;
    }

    /**
     * @param localOneConnectedLineName the localOneConnectedLineName to set
     */
    public void setLocalOneConnectedLineName(String localOneConnectedLineName) {
        this.localOneConnectedLineName = localOneConnectedLineName;
    }

    /**
     * @return the localOneLanguage
     */
    public String getLocalOneLanguage() {
        return localOneLanguage;
    }

    /**
     * @param localOneLanguage the localOneLanguage to set
     */
    public void setLocalOneLanguage(String localOneLanguage) {
        this.localOneLanguage = localOneLanguage;
    }

    /**
     * @return the localOneAccountCode
     */
    public Integer getLocalOneAccountCode() {
        return localOneAccountCode;
    }

    /**
     * @param localOneAccountCode the localOneAccountCode to set
     */
    public void setLocalOneAccountCode(Integer localOneAccountCode) {
        this.localOneAccountCode = localOneAccountCode;
    }

    /**
     * @return the localOneContext
     */
    public String getLocalOneContext() {
        return localOneContext;
    }

    /**
     * @param localOneContext the localOneContext to set
     */
    public void setLocalOneContext(String localOneContext) {
        this.localOneContext = localOneContext;
    }

    /**
     * @return the localOneExten
     */
    public String getLocalOneExten() {
        return localOneExten;
    }

    /**
     * @param localOneExten the localOneExten to set
     */
    public void setLocalOneExten(String localOneExten) {
        this.localOneExten = localOneExten;
    }

    /**
     * @return the localOnePriority
     */
    public Integer getLocalOnePriority() {
        return localOnePriority;
    }

    /**
     * @param localOnePriority the localOnePriority to set
     */
    public void setLocalOnePriority(Integer localOnePriority) {
        this.localOnePriority = localOnePriority;
    }

    /**
     * @return the localOneUniqueid
     */
    public String getLocalOneUniqueid() {
        return localOneUniqueid;
    }

    /**
     * @param localOneUniqueid the localOneUniqueid to set
     */
    public void setLocalOneUniqueid(String localOneUniqueid) {
        this.localOneUniqueid = localOneUniqueid;
    }

    /**
     * @return the localOneLinkedid
     */
    public String getLocalOneLinkedid() {
        return localOneLinkedid;
    }

    /**
     * @param localOneLinkedid the localOneLinkedid to set
     */
    public void setLocalOneLinkedid(String localOneLinkedid) {
        this.localOneLinkedid = localOneLinkedid;
    }

    /**
     * @return the localTwoChannel
     */
    public String getLocalTwoChannel() {
        return localTwoChannel;
    }

    /**
     * @param localTwoChannel the localTwoChannel to set
     */
    public void setLocalTwoChannel(String localTwoChannel) {
        this.localTwoChannel = localTwoChannel;
    }

    /**
     * @return the localTwoChannelState
     */
    public Integer getLocalTwoChannelState() {
        return localTwoChannelState;
    }

    /**
     * @param localTwoChannelState the localTwoChannelState to set
     */
    public void setLocalTwoChannelState(Integer localTwoChannelState) {
        this.localTwoChannelState = localTwoChannelState;
    }

    /**
     * @return the localTwoChannelStateDesc
     */
    public String getLocalTwoChannelStateDesc() {
        return localTwoChannelStateDesc;
    }

    /**
     * @param localTwoChannelStateDesc the localTwoChannelStateDesc to set
     */
    public void setLocalTwoChannelStateDesc(String localTwoChannelStateDesc) {
        this.localTwoChannelStateDesc = localTwoChannelStateDesc;
    }

    /**
     * @return the localTwoCallerIDNum
     */
    public String getLocalTwoCallerIDNum() {
        return localTwoCallerIDNum;
    }

    /**
     * @param localTwoCallerIDNum the localTwoCallerIDNum to set
     */
    public void setLocalTwoCallerIDNum(String localTwoCallerIDNum) {
        this.localTwoCallerIDNum = localTwoCallerIDNum;
    }

    /**
     * @return the localTwoCallerIDName
     */
    public String getLocalTwoCallerIDName() {
        return localTwoCallerIDName;
    }

    /**
     * @param localTwoCallerIDName the localTwoCallerIDName to set
     */
    public void setLocalTwoCallerIDName(String localTwoCallerIDName) {
        this.localTwoCallerIDName = localTwoCallerIDName;
    }

    /**
     * @return the localTwoConnectedLineNum
     */
    public String getLocalTwoConnectedLineNum() {
        return localTwoConnectedLineNum;
    }

    /**
     * @param localTwoConnectedLineNum the localTwoConnectedLineNum to set
     */
    public void setLocalTwoConnectedLineNum(String localTwoConnectedLineNum) {
        this.localTwoConnectedLineNum = localTwoConnectedLineNum;
    }

    /**
     * @return the localTwoConnectedLineName
     */
    public String getLocalTwoConnectedLineName() {
        return localTwoConnectedLineName;
    }

    /**
     * @param localTwoConnectedLineName the localTwoConnectedLineName to set
     */
    public void setLocalTwoConnectedLineName(String localTwoConnectedLineName) {
        this.localTwoConnectedLineName = localTwoConnectedLineName;
    }

    /**
     * @return the localTwoLanguage
     */
    public String getLocalTwoLanguage() {
        return localTwoLanguage;
    }

    /**
     * @param localTwoLanguage the localTwoLanguage to set
     */
    public void setLocalTwoLanguage(String localTwoLanguage) {
        this.localTwoLanguage = localTwoLanguage;
    }

    /**
     * @return the localTwoAccountCode
     */
    public Integer getLocalTwoAccountCode() {
        return localTwoAccountCode;
    }

    /**
     * @param localTwoAccountCode the localTwoAccountCode to set
     */
    public void setLocalTwoAccountCode(Integer localTwoAccountCode) {
        this.localTwoAccountCode = localTwoAccountCode;
    }

    /**
     * @return the localTwoContext
     */
    public String getLocalTwoContext() {
        return localTwoContext;
    }

    /**
     * @param localTwoContext the localTwoContext to set
     */
    public void setLocalTwoContext(String localTwoContext) {
        this.localTwoContext = localTwoContext;
    }

    /**
     * @return the localTwoExten
     */
    public String getLocalTwoExten() {
        return localTwoExten;
    }

    /**
     * @param localTwoExten the localTwoExten to set
     */
    public void setLocalTwoExten(String localTwoExten) {
        this.localTwoExten = localTwoExten;
    }

    /**
     * @return the localTwoPriority
     */
    public String getLocalTwoPriority() {
        return localTwoPriority;
    }

    /**
     * @param localTwoPriority the localTwoPriority to set
     */
    public void setLocalTwoPriority(String localTwoPriority) {
        this.localTwoPriority = localTwoPriority;
    }

    /**
     * @return the localTwoUniqueid
     */
    public String getLocalTwoUniqueid() {
        return localTwoUniqueid;
    }

    /**
     * @param localTwoUniqueid the localTwoUniqueid to set
     */
    public void setLocalTwoUniqueid(String localTwoUniqueid) {
        this.localTwoUniqueid = localTwoUniqueid;
    }

    /**
     * @return the localTwoLinkedid
     */
    public String getLocalTwoLinkedid() {
        return localTwoLinkedid;
    }

    /**
     * @param localTwoLinkedid the localTwoLinkedid to set
     */
    public void setLocalTwoLinkedid(String localTwoLinkedid) {
        this.localTwoLinkedid = localTwoLinkedid;
    }

    /**
     * @return the localOptimization
     */
    public String getLocalOptimization() {
        return localOptimization;
    }

    /**
     * @param localOptimization the localOptimization to set
     */
    public void setLocalOptimization(String localOptimization) {
        this.localOptimization = localOptimization;
    }

}
