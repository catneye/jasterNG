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

import com.catneye.asterisk.AMI.events.base.ChannelEvent;

/**
 *
 * @author Kurchenko O.E.
 */
public class AgentEvent extends ChannelEvent{
    
    private String destChannel;
    private Integer destChannelState;
    private String destChannelStateDesc;
    private String destCallerIDNum;
    private String destCallerIDName;
    private String destConnectedLineNum;
    private String destConnectedLineName;
    private String destLanguage;
    private Integer destAccountCode;
    private String destContext;
    private String destExten;
    private String destPriority;
    private String destUniqueid;
    private String destLinkedid;

    /**
     * @return the destChannel
     */
    public String getDestChannel() {
        return destChannel;
    }

    /**
     * @param destChannel the destChannel to set
     */
    public void setDestChannel(String destChannel) {
        this.destChannel = destChannel;
    }

    /**
     * @return the destChannelState
     */
    public Integer getDestChannelState() {
        return destChannelState;
    }

    /**
     * @param destChannelState the destChannelState to set
     */
    public void setDestChannelState(Integer destChannelState) {
        this.destChannelState = destChannelState;
    }

    /**
     * @return the destChannelStateDesc
     */
    public String getDestChannelStateDesc() {
        return destChannelStateDesc;
    }

    /**
     * @param destChannelStateDesc the destChannelStateDesc to set
     */
    public void setDestChannelStateDesc(String destChannelStateDesc) {
        this.destChannelStateDesc = destChannelStateDesc;
    }

    /**
     * @return the destCallerIDNum
     */
    public String getDestCallerIDNum() {
        return destCallerIDNum;
    }

    /**
     * @param destCallerIDNum the destCallerIDNum to set
     */
    public void setDestCallerIDNum(String destCallerIDNum) {
        this.destCallerIDNum = destCallerIDNum;
    }

    /**
     * @return the destCallerIDName
     */
    public String getDestCallerIDName() {
        return destCallerIDName;
    }

    /**
     * @param destCallerIDName the destCallerIDName to set
     */
    public void setDestCallerIDName(String destCallerIDName) {
        this.destCallerIDName = destCallerIDName;
    }

    /**
     * @return the destConnectedLineNum
     */
    public String getDestConnectedLineNum() {
        return destConnectedLineNum;
    }

    /**
     * @param destConnectedLineNum the destConnectedLineNum to set
     */
    public void setDestConnectedLineNum(String destConnectedLineNum) {
        this.destConnectedLineNum = destConnectedLineNum;
    }

    /**
     * @return the destConnectedLineName
     */
    public String getDestConnectedLineName() {
        return destConnectedLineName;
    }

    /**
     * @param destConnectedLineName the destConnectedLineName to set
     */
    public void setDestConnectedLineName(String destConnectedLineName) {
        this.destConnectedLineName = destConnectedLineName;
    }

    /**
     * @return the destLanguage
     */
    public String getDestLanguage() {
        return destLanguage;
    }

    /**
     * @param destLanguage the destLanguage to set
     */
    public void setDestLanguage(String destLanguage) {
        this.destLanguage = destLanguage;
    }

    /**
     * @return the destAccountCode
     */
    public Integer getDestAccountCode() {
        return destAccountCode;
    }

    /**
     * @param destAccountCode the destAccountCode to set
     */
    public void setDestAccountCode(Integer destAccountCode) {
        this.destAccountCode = destAccountCode;
    }

    /**
     * @return the destContext
     */
    public String getDestContext() {
        return destContext;
    }

    /**
     * @param destContext the destContext to set
     */
    public void setDestContext(String destContext) {
        this.destContext = destContext;
    }

    /**
     * @return the destExten
     */
    public String getDestExten() {
        return destExten;
    }

    /**
     * @param destExten the destExten to set
     */
    public void setDestExten(String destExten) {
        this.destExten = destExten;
    }

    /**
     * @return the destPriority
     */
    public String getDestPriority() {
        return destPriority;
    }

    /**
     * @param destPriority the destPriority to set
     */
    public void setDestPriority(String destPriority) {
        this.destPriority = destPriority;
    }

    /**
     * @return the destUniqueid
     */
    public String getDestUniqueid() {
        return destUniqueid;
    }

    /**
     * @param destUniqueid the destUniqueid to set
     */
    public void setDestUniqueid(String destUniqueid) {
        this.destUniqueid = destUniqueid;
    }

    /**
     * @return the destLinkedid
     */
    public String getDestLinkedid() {
        return destLinkedid;
    }

    /**
     * @param destLinkedid the destLinkedid to set
     */
    public void setDestLinkedid(String destLinkedid) {
        this.destLinkedid = destLinkedid;
    }
}
