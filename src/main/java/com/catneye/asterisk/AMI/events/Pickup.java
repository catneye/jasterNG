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

import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Kurchenko O.E.
 */
public class Pickup extends ChannelEvent implements Serializable {

    public Pickup() {
        super.setEvent("Pickup");
        super.setUuid(UUID.randomUUID());
    }

    private String targetChannel;
    private Integer targetChannelState;
    private String targetChannelStateDesc;
    private String targetCallerIDNum;
    private String targetCallerIDName;
    private String targetConnectedLineNum;
    private String targetConnectedLineName;
    private String targetLanguage;
    private String targetAccountCode;
    private String targetContext;
    private String targetExten;
    private String targetPriority;
    private String targetUniqueid;
    private String targetLinkedid;

    /**
     * @return the targetChannel
     */
    public String getTargetChannel() {
        return targetChannel;
    }

    /**
     * @param targetChannel the targetChannel to set
     */
    public void setTargetChannel(String targetChannel) {
        this.targetChannel = targetChannel;
    }

    /**
     * @return the targetChannelState
     */
    public Integer getTargetChannelState() {
        return targetChannelState;
    }

    /**
     * @param targetChannelState the targetChannelState to set
     */
    public void setTargetChannelState(Integer targetChannelState) {
        this.targetChannelState = targetChannelState;
    }

    /**
     * @return the targetChannelStateDesc
     */
    public String getTargetChannelStateDesc() {
        return targetChannelStateDesc;
    }

    /**
     * @param targetChannelStateDesc the targetChannelStateDesc to set
     */
    public void setTargetChannelStateDesc(String targetChannelStateDesc) {
        this.targetChannelStateDesc = targetChannelStateDesc;
    }

    /**
     * @return the targetCallerIDNum
     */
    public String getTargetCallerIDNum() {
        return targetCallerIDNum;
    }

    /**
     * @param targetCallerIDNum the targetCallerIDNum to set
     */
    public void setTargetCallerIDNum(String targetCallerIDNum) {
        this.targetCallerIDNum = targetCallerIDNum;
    }

    /**
     * @return the targetCallerIDName
     */
    public String getTargetCallerIDName() {
        return targetCallerIDName;
    }

    /**
     * @param targetCallerIDName the targetCallerIDName to set
     */
    public void setTargetCallerIDName(String targetCallerIDName) {
        this.targetCallerIDName = targetCallerIDName;
    }

    /**
     * @return the targetConnectedLineNum
     */
    public String getTargetConnectedLineNum() {
        return targetConnectedLineNum;
    }

    /**
     * @param targetConnectedLineNum the targetConnectedLineNum to set
     */
    public void setTargetConnectedLineNum(String targetConnectedLineNum) {
        this.targetConnectedLineNum = targetConnectedLineNum;
    }

    /**
     * @return the targetConnectedLineName
     */
    public String getTargetConnectedLineName() {
        return targetConnectedLineName;
    }

    /**
     * @param targetConnectedLineName the targetConnectedLineName to set
     */
    public void setTargetConnectedLineName(String targetConnectedLineName) {
        this.targetConnectedLineName = targetConnectedLineName;
    }

    /**
     * @return the targetLanguage
     */
    public String getTargetLanguage() {
        return targetLanguage;
    }

    /**
     * @param targetLanguage the targetLanguage to set
     */
    public void setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    /**
     * @return the targetAccountCode
     */
    public String getTargetAccountCode() {
        return targetAccountCode;
    }

    /**
     * @param targetAccountCode the targetAccountCode to set
     */
    public void setTargetAccountCode(String targetAccountCode) {
        this.targetAccountCode = targetAccountCode;
    }

    /**
     * @return the targetContext
     */
    public String getTargetContext() {
        return targetContext;
    }

    /**
     * @param targetContext the targetContext to set
     */
    public void setTargetContext(String targetContext) {
        this.targetContext = targetContext;
    }

    /**
     * @return the targetExten
     */
    public String getTargetExten() {
        return targetExten;
    }

    /**
     * @param targetExten the targetExten to set
     */
    public void setTargetExten(String targetExten) {
        this.targetExten = targetExten;
    }

    /**
     * @return the targetPriority
     */
    public String getTargetPriority() {
        return targetPriority;
    }

    /**
     * @param targetPriority the targetPriority to set
     */
    public void setTargetPriority(String targetPriority) {
        this.targetPriority = targetPriority;
    }

    /**
     * @return the targetUniqueid
     */
    public String getTargetUniqueid() {
        return targetUniqueid;
    }

    /**
     * @param targetUniqueid the targetUniqueid to set
     */
    public void setTargetUniqueid(String targetUniqueid) {
        this.targetUniqueid = targetUniqueid;
    }

    /**
     * @return the targetLinkedid
     */
    public String getTargetLinkedid() {
        return targetLinkedid;
    }

    /**
     * @param targetLinkedid the targetLinkedid to set
     */
    public void setTargetLinkedid(String targetLinkedid) {
        this.targetLinkedid = targetLinkedid;
    }

}
