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
import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author Kurchenko O.E.
 */
public class Cdr extends SystemEvent implements  Serializable {

    private String accountCode;
    private String source;
    private String destination;
    private String destinationContext;
    private String callerID;
    private String channel;
    private String destinationChannel;
    private String lastApplication;
    private String lastData;
    private LocalDateTime startTime;
    private LocalDateTime answerTime;
    private LocalDateTime endTime;
    private Integer duration;
    private Integer billableSeconds;
    private String disposition;
    private String AMAFlags;
    private String uniqueID;
    private String userField;
    
    public Cdr() {
        super.setEvent("Cdr");
        super.setUuid(UUID.randomUUID());
    }

    /*
    Event: Cdr, 
    Privilege: cdr,all, 
    SequenceNumber: 155, 
    File: cdr_manager.c, 
    Line: 309, 
    Func: manager_log, 
    SystemName: asterisk,
    
    AccountCode: , 
    Source: 000, 
    Destination: 888, 
    DestinationContext: from-000, 
    CallerID: "" <000>, 
    Channel: PJSIP/000-00000000, 
    DestinationChannel: ,
    LastApplication: Hangup, 
    LastData: , 
    StartTime: 2024-07-29 15:24:59, 
    AnswerTime: 2024-07-29 15:24:59, 
    EndTime: 2024-07-29 15:25:03, 
    Duration: 3, 
    BillableSeconds: 3, 
    Disposition: ANSWERED, 
    AMAFlags: DOCUMENTATION, 
    UniqueID: asterisk-1722255899.0, 
    UserField: 
    
     */

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
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the destinationContext
     */
    public String getDestinationContext() {
        return destinationContext;
    }

    /**
     * @param destinationContext the destinationContext to set
     */
    public void setDestinationContext(String destinationContext) {
        this.destinationContext = destinationContext;
    }

    /**
     * @return the callerID
     */
    public String getCallerID() {
        return callerID;
    }

    /**
     * @param callerID the callerID to set
     */
    public void setCallerID(String callerID) {
        this.callerID = callerID;
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
     * @return the destinationChannel
     */
    public String getDestinationChannel() {
        return destinationChannel;
    }

    /**
     * @param destinationChannel the destinationChannel to set
     */
    public void setDestinationChannel(String destinationChannel) {
        this.destinationChannel = destinationChannel;
    }

    /**
     * @return the lastApplication
     */
    public String getLastApplication() {
        return lastApplication;
    }

    /**
     * @param lastApplication the lastApplication to set
     */
    public void setLastApplication(String lastApplication) {
        this.lastApplication = lastApplication;
    }

    /**
     * @return the lastData
     */
    public String getLastData() {
        return lastData;
    }

    /**
     * @param lastData the lastData to set
     */
    public void setLastData(String lastData) {
        this.lastData = lastData;
    }

    /**
     * @return the startTime
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the answerTime
     */
    public LocalDateTime getAnswerTime() {
        return answerTime;
    }

    /**
     * @param answerTime the answerTime to set
     */
    public void setAnswerTime(LocalDateTime answerTime) {
        this.answerTime = answerTime;
    }

    /**
     * @return the endTime
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * @return the billableSeconds
     */
    public Integer getBillableSeconds() {
        return billableSeconds;
    }

    /**
     * @param billableSeconds the billableSeconds to set
     */
    public void setBillableSeconds(Integer billableSeconds) {
        this.billableSeconds = billableSeconds;
    }

    /**
     * @return the disposition
     */
    public String getDisposition() {
        return disposition;
    }

    /**
     * @param disposition the disposition to set
     */
    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    /**
     * @return the AMAFlags
     */
    public String getAMAFlags() {
        return AMAFlags;
    }

    /**
     * @param AMAFlags the AMAFlags to set
     */
    public void setAMAFlags(String AMAFlags) {
        this.AMAFlags = AMAFlags;
    }

    /**
     * @return the uniqueID
     */
    public String getUniqueID() {
        return uniqueID;
    }

    /**
     * @param uniqueID the uniqueID to set
     */
    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    /**
     * @return the userField
     */
    public String getUserField() {
        return userField;
    }

    /**
     * @param userField the userField to set
     */
    public void setUserField(String userField) {
        this.userField = userField;
    }

}
