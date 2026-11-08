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

/** AMI ChanSpyStop event. */
public class ChanSpyStop extends SystemEvent implements Serializable {

    public ChanSpyStop() {
        super.setEvent("ChanSpyStop");
        super.setUuid(UUID.randomUUID());
    }

    private String spyerChannel;

    public String getSpyerChannel() {
        return spyerChannel;
    }

    public void setSpyerChannel(String spyerChannel) {
        this.spyerChannel = spyerChannel;
    }

    private Integer spyerChannelState;

    public Integer getSpyerChannelState() {
        return spyerChannelState;
    }

    public void setSpyerChannelState(Integer spyerChannelState) {
        this.spyerChannelState = spyerChannelState;
    }

    private String spyerChannelStateDesc;

    public String getSpyerChannelStateDesc() {
        return spyerChannelStateDesc;
    }

    public void setSpyerChannelStateDesc(String spyerChannelStateDesc) {
        this.spyerChannelStateDesc = spyerChannelStateDesc;
    }

    private String spyerCallerIDNum;

    public String getSpyerCallerIDNum() {
        return spyerCallerIDNum;
    }

    public void setSpyerCallerIDNum(String spyerCallerIDNum) {
        this.spyerCallerIDNum = spyerCallerIDNum;
    }

    private String spyerCallerIDName;

    public String getSpyerCallerIDName() {
        return spyerCallerIDName;
    }

    public void setSpyerCallerIDName(String spyerCallerIDName) {
        this.spyerCallerIDName = spyerCallerIDName;
    }

    private String spyerConnectedLineNum;

    public String getSpyerConnectedLineNum() {
        return spyerConnectedLineNum;
    }

    public void setSpyerConnectedLineNum(String spyerConnectedLineNum) {
        this.spyerConnectedLineNum = spyerConnectedLineNum;
    }

    private String spyerConnectedLineName;

    public String getSpyerConnectedLineName() {
        return spyerConnectedLineName;
    }

    public void setSpyerConnectedLineName(String spyerConnectedLineName) {
        this.spyerConnectedLineName = spyerConnectedLineName;
    }

    private String spyerLanguage;

    public String getSpyerLanguage() {
        return spyerLanguage;
    }

    public void setSpyerLanguage(String spyerLanguage) {
        this.spyerLanguage = spyerLanguage;
    }

    private String spyerAccountCode;

    public String getSpyerAccountCode() {
        return spyerAccountCode;
    }

    public void setSpyerAccountCode(String spyerAccountCode) {
        this.spyerAccountCode = spyerAccountCode;
    }

    private String spyerContext;

    public String getSpyerContext() {
        return spyerContext;
    }

    public void setSpyerContext(String spyerContext) {
        this.spyerContext = spyerContext;
    }

    private String spyerExten;

    public String getSpyerExten() {
        return spyerExten;
    }

    public void setSpyerExten(String spyerExten) {
        this.spyerExten = spyerExten;
    }

    private String spyerPriority;

    public String getSpyerPriority() {
        return spyerPriority;
    }

    public void setSpyerPriority(String spyerPriority) {
        this.spyerPriority = spyerPriority;
    }

    private String spyerUniqueid;

    public String getSpyerUniqueid() {
        return spyerUniqueid;
    }

    public void setSpyerUniqueid(String spyerUniqueid) {
        this.spyerUniqueid = spyerUniqueid;
    }

    private String spyerLinkedid;

    public String getSpyerLinkedid() {
        return spyerLinkedid;
    }

    public void setSpyerLinkedid(String spyerLinkedid) {
        this.spyerLinkedid = spyerLinkedid;
    }

    private String spyeeChannel;

    public String getSpyeeChannel() {
        return spyeeChannel;
    }

    public void setSpyeeChannel(String spyeeChannel) {
        this.spyeeChannel = spyeeChannel;
    }

    private Integer spyeeChannelState;

    public Integer getSpyeeChannelState() {
        return spyeeChannelState;
    }

    public void setSpyeeChannelState(Integer spyeeChannelState) {
        this.spyeeChannelState = spyeeChannelState;
    }

    private String spyeeChannelStateDesc;

    public String getSpyeeChannelStateDesc() {
        return spyeeChannelStateDesc;
    }

    public void setSpyeeChannelStateDesc(String spyeeChannelStateDesc) {
        this.spyeeChannelStateDesc = spyeeChannelStateDesc;
    }

    private String spyeeCallerIDNum;

    public String getSpyeeCallerIDNum() {
        return spyeeCallerIDNum;
    }

    public void setSpyeeCallerIDNum(String spyeeCallerIDNum) {
        this.spyeeCallerIDNum = spyeeCallerIDNum;
    }

    private String spyeeCallerIDName;

    public String getSpyeeCallerIDName() {
        return spyeeCallerIDName;
    }

    public void setSpyeeCallerIDName(String spyeeCallerIDName) {
        this.spyeeCallerIDName = spyeeCallerIDName;
    }

    private String spyeeConnectedLineNum;

    public String getSpyeeConnectedLineNum() {
        return spyeeConnectedLineNum;
    }

    public void setSpyeeConnectedLineNum(String spyeeConnectedLineNum) {
        this.spyeeConnectedLineNum = spyeeConnectedLineNum;
    }

    private String spyeeConnectedLineName;

    public String getSpyeeConnectedLineName() {
        return spyeeConnectedLineName;
    }

    public void setSpyeeConnectedLineName(String spyeeConnectedLineName) {
        this.spyeeConnectedLineName = spyeeConnectedLineName;
    }

    private String spyeeLanguage;

    public String getSpyeeLanguage() {
        return spyeeLanguage;
    }

    public void setSpyeeLanguage(String spyeeLanguage) {
        this.spyeeLanguage = spyeeLanguage;
    }

    private String spyeeAccountCode;

    public String getSpyeeAccountCode() {
        return spyeeAccountCode;
    }

    public void setSpyeeAccountCode(String spyeeAccountCode) {
        this.spyeeAccountCode = spyeeAccountCode;
    }

    private String spyeeContext;

    public String getSpyeeContext() {
        return spyeeContext;
    }

    public void setSpyeeContext(String spyeeContext) {
        this.spyeeContext = spyeeContext;
    }

    private String spyeeExten;

    public String getSpyeeExten() {
        return spyeeExten;
    }

    public void setSpyeeExten(String spyeeExten) {
        this.spyeeExten = spyeeExten;
    }

    private String spyeePriority;

    public String getSpyeePriority() {
        return spyeePriority;
    }

    public void setSpyeePriority(String spyeePriority) {
        this.spyeePriority = spyeePriority;
    }

    private String spyeeUniqueid;

    public String getSpyeeUniqueid() {
        return spyeeUniqueid;
    }

    public void setSpyeeUniqueid(String spyeeUniqueid) {
        this.spyeeUniqueid = spyeeUniqueid;
    }

    private String spyeeLinkedid;

    public String getSpyeeLinkedid() {
        return spyeeLinkedid;
    }

    public void setSpyeeLinkedid(String spyeeLinkedid) {
        this.spyeeLinkedid = spyeeLinkedid;
    }

}
