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
/** AMI ParkedCall event. */
public class ParkedCall extends SystemEvent implements Serializable {
    public ParkedCall() { super.setEvent("ParkedCall"); super.setUuid(UUID.randomUUID()); }
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
}
