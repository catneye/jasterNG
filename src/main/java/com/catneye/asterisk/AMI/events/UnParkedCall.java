/*
 * jasterNG - Java interface for Asterisk
 *
 * Copyright (C) 2026 Kurchenko O.E. and OpenAI ChatGPT
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
 * Modified by Kurchenko O.E. and OpenAI ChatGPT 2026-11-08.
 */
/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI UnParkedCall event. */
public class UnParkedCall extends SystemEvent implements Serializable {
    public UnParkedCall() { super.setEvent("UnParkedCall"); super.setUuid(UUID.randomUUID()); }
    private String parkeeChannel;
    public String getParkeeChannel() { return parkeeChannel; }
    public void setParkeeChannel(String parkeeChannel) { this.parkeeChannel = parkeeChannel; }
    private Integer parkeeChannelState;
    public Integer getParkeeChannelState() { return parkeeChannelState; }
    public void setParkeeChannelState(Integer parkeeChannelState) { this.parkeeChannelState = parkeeChannelState; }
    private String parkeeChannelStateDesc;
    public String getParkeeChannelStateDesc() { return parkeeChannelStateDesc; }
    public void setParkeeChannelStateDesc(String parkeeChannelStateDesc) { this.parkeeChannelStateDesc = parkeeChannelStateDesc; }
    private String parkeeCallerIDNum;
    public String getParkeeCallerIDNum() { return parkeeCallerIDNum; }
    public void setParkeeCallerIDNum(String parkeeCallerIDNum) { this.parkeeCallerIDNum = parkeeCallerIDNum; }
    private String parkeeCallerIDName;
    public String getParkeeCallerIDName() { return parkeeCallerIDName; }
    public void setParkeeCallerIDName(String parkeeCallerIDName) { this.parkeeCallerIDName = parkeeCallerIDName; }
    private String parkeeConnectedLineNum;
    public String getParkeeConnectedLineNum() { return parkeeConnectedLineNum; }
    public void setParkeeConnectedLineNum(String parkeeConnectedLineNum) { this.parkeeConnectedLineNum = parkeeConnectedLineNum; }
    private String parkeeConnectedLineName;
    public String getParkeeConnectedLineName() { return parkeeConnectedLineName; }
    public void setParkeeConnectedLineName(String parkeeConnectedLineName) { this.parkeeConnectedLineName = parkeeConnectedLineName; }
    private String parkeeLanguage;
    public String getParkeeLanguage() { return parkeeLanguage; }
    public void setParkeeLanguage(String parkeeLanguage) { this.parkeeLanguage = parkeeLanguage; }
    private String parkeeAccountCode;
    public String getParkeeAccountCode() { return parkeeAccountCode; }
    public void setParkeeAccountCode(String parkeeAccountCode) { this.parkeeAccountCode = parkeeAccountCode; }
    private String parkeeContext;
    public String getParkeeContext() { return parkeeContext; }
    public void setParkeeContext(String parkeeContext) { this.parkeeContext = parkeeContext; }
    private String parkeeExten;
    public String getParkeeExten() { return parkeeExten; }
    public void setParkeeExten(String parkeeExten) { this.parkeeExten = parkeeExten; }
    private String parkeePriority;
    public String getParkeePriority() { return parkeePriority; }
    public void setParkeePriority(String parkeePriority) { this.parkeePriority = parkeePriority; }
    private String parkeeUniqueid;
    public String getParkeeUniqueid() { return parkeeUniqueid; }
    public void setParkeeUniqueid(String parkeeUniqueid) { this.parkeeUniqueid = parkeeUniqueid; }
    private String parkeeLinkedid;
    public String getParkeeLinkedid() { return parkeeLinkedid; }
    public void setParkeeLinkedid(String parkeeLinkedid) { this.parkeeLinkedid = parkeeLinkedid; }
    private String parkerChannel;
    public String getParkerChannel() { return parkerChannel; }
    public void setParkerChannel(String parkerChannel) { this.parkerChannel = parkerChannel; }
    private Integer parkerChannelState;
    public Integer getParkerChannelState() { return parkerChannelState; }
    public void setParkerChannelState(Integer parkerChannelState) { this.parkerChannelState = parkerChannelState; }
    private String parkerChannelStateDesc;
    public String getParkerChannelStateDesc() { return parkerChannelStateDesc; }
    public void setParkerChannelStateDesc(String parkerChannelStateDesc) { this.parkerChannelStateDesc = parkerChannelStateDesc; }
    private String parkerCallerIDNum;
    public String getParkerCallerIDNum() { return parkerCallerIDNum; }
    public void setParkerCallerIDNum(String parkerCallerIDNum) { this.parkerCallerIDNum = parkerCallerIDNum; }
    private String parkerCallerIDName;
    public String getParkerCallerIDName() { return parkerCallerIDName; }
    public void setParkerCallerIDName(String parkerCallerIDName) { this.parkerCallerIDName = parkerCallerIDName; }
    private String parkerConnectedLineNum;
    public String getParkerConnectedLineNum() { return parkerConnectedLineNum; }
    public void setParkerConnectedLineNum(String parkerConnectedLineNum) { this.parkerConnectedLineNum = parkerConnectedLineNum; }
    private String parkerConnectedLineName;
    public String getParkerConnectedLineName() { return parkerConnectedLineName; }
    public void setParkerConnectedLineName(String parkerConnectedLineName) { this.parkerConnectedLineName = parkerConnectedLineName; }
    private String parkerLanguage;
    public String getParkerLanguage() { return parkerLanguage; }
    public void setParkerLanguage(String parkerLanguage) { this.parkerLanguage = parkerLanguage; }
    private String parkerAccountCode;
    public String getParkerAccountCode() { return parkerAccountCode; }
    public void setParkerAccountCode(String parkerAccountCode) { this.parkerAccountCode = parkerAccountCode; }
    private String parkerContext;
    public String getParkerContext() { return parkerContext; }
    public void setParkerContext(String parkerContext) { this.parkerContext = parkerContext; }
    private String parkerExten;
    public String getParkerExten() { return parkerExten; }
    public void setParkerExten(String parkerExten) { this.parkerExten = parkerExten; }
    private String parkerPriority;
    public String getParkerPriority() { return parkerPriority; }
    public void setParkerPriority(String parkerPriority) { this.parkerPriority = parkerPriority; }
    private String parkerUniqueid;
    public String getParkerUniqueid() { return parkerUniqueid; }
    public void setParkerUniqueid(String parkerUniqueid) { this.parkerUniqueid = parkerUniqueid; }
    private String parkerLinkedid;
    public String getParkerLinkedid() { return parkerLinkedid; }
    public void setParkerLinkedid(String parkerLinkedid) { this.parkerLinkedid = parkerLinkedid; }
    private String parkerDialString;
    public String getParkerDialString() { return parkerDialString; }
    public void setParkerDialString(String parkerDialString) { this.parkerDialString = parkerDialString; }
    private String parkinglot;
    public String getParkinglot() { return parkinglot; }
    public void setParkinglot(String parkinglot) { this.parkinglot = parkinglot; }
    private String parkingSpace;
    public String getParkingSpace() { return parkingSpace; }
    public void setParkingSpace(String parkingSpace) { this.parkingSpace = parkingSpace; }
    private Integer parkingTimeout;
    public Integer getParkingTimeout() { return parkingTimeout; }
    public void setParkingTimeout(Integer parkingTimeout) { this.parkingTimeout = parkingTimeout; }
    private Integer parkingDuration;
    public Integer getParkingDuration() { return parkingDuration; }
    public void setParkingDuration(Integer parkingDuration) { this.parkingDuration = parkingDuration; }
    private String retrieverChannel;
    public String getRetrieverChannel() { return retrieverChannel; }
    public void setRetrieverChannel(String retrieverChannel) { this.retrieverChannel = retrieverChannel; }
    private Integer retrieverChannelState;
    public Integer getRetrieverChannelState() { return retrieverChannelState; }
    public void setRetrieverChannelState(Integer retrieverChannelState) { this.retrieverChannelState = retrieverChannelState; }
    private String retrieverChannelStateDesc;
    public String getRetrieverChannelStateDesc() { return retrieverChannelStateDesc; }
    public void setRetrieverChannelStateDesc(String retrieverChannelStateDesc) { this.retrieverChannelStateDesc = retrieverChannelStateDesc; }
    private String retrieverCallerIDNum;
    public String getRetrieverCallerIDNum() { return retrieverCallerIDNum; }
    public void setRetrieverCallerIDNum(String retrieverCallerIDNum) { this.retrieverCallerIDNum = retrieverCallerIDNum; }
    private String retrieverCallerIDName;
    public String getRetrieverCallerIDName() { return retrieverCallerIDName; }
    public void setRetrieverCallerIDName(String retrieverCallerIDName) { this.retrieverCallerIDName = retrieverCallerIDName; }
    private String retrieverConnectedLineNum;
    public String getRetrieverConnectedLineNum() { return retrieverConnectedLineNum; }
    public void setRetrieverConnectedLineNum(String retrieverConnectedLineNum) { this.retrieverConnectedLineNum = retrieverConnectedLineNum; }
    private String retrieverConnectedLineName;
    public String getRetrieverConnectedLineName() { return retrieverConnectedLineName; }
    public void setRetrieverConnectedLineName(String retrieverConnectedLineName) { this.retrieverConnectedLineName = retrieverConnectedLineName; }
    private String retrieverLanguage;
    public String getRetrieverLanguage() { return retrieverLanguage; }
    public void setRetrieverLanguage(String retrieverLanguage) { this.retrieverLanguage = retrieverLanguage; }
    private String retrieverAccountCode;
    public String getRetrieverAccountCode() { return retrieverAccountCode; }
    public void setRetrieverAccountCode(String retrieverAccountCode) { this.retrieverAccountCode = retrieverAccountCode; }
    private String retrieverContext;
    public String getRetrieverContext() { return retrieverContext; }
    public void setRetrieverContext(String retrieverContext) { this.retrieverContext = retrieverContext; }
    private String retrieverExten;
    public String getRetrieverExten() { return retrieverExten; }
    public void setRetrieverExten(String retrieverExten) { this.retrieverExten = retrieverExten; }
    private String retrieverPriority;
    public String getRetrieverPriority() { return retrieverPriority; }
    public void setRetrieverPriority(String retrieverPriority) { this.retrieverPriority = retrieverPriority; }
    private String retrieverUniqueid;
    public String getRetrieverUniqueid() { return retrieverUniqueid; }
    public void setRetrieverUniqueid(String retrieverUniqueid) { this.retrieverUniqueid = retrieverUniqueid; }
    private String retrieverLinkedid;
    public String getRetrieverLinkedid() { return retrieverLinkedid; }
    public void setRetrieverLinkedid(String retrieverLinkedid) { this.retrieverLinkedid = retrieverLinkedid; }
}
