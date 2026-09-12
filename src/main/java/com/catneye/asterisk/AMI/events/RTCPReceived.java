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
import java.net.InetSocketAddress;
import java.util.UUID;

/**
 *
 * @author Kurchenko O.E.
 */
public class RTCPReceived extends ChannelEvent implements Serializable {

    public RTCPReceived() {
        super.setEvent("RTCPReceived");
        super.setUuid(UUID.randomUUID());
    }

    private InetSocketAddress to;
    private InetSocketAddress from;
    private Float RTT;
    private Float MES;
    private String SSRC;
    private String PT;
    private Integer ReportCount;
    private String SentNTP;
    private String SentRTP;
    private Integer SentPackets;
    private Integer SentOctets;
    private String Report0SourceSSRC;
    private Integer Report0FractionLost;
    private Integer Report0CumulativeLost;
    private Integer Report0HighestSequence;
    private Integer Report0SequenceNumberCycles;
    private Integer Report0IAJitter;
    private Integer Report0LSR;
    private Float Report0DLSR;

    /*
    Event: RTCPReceived, 
    Privilege: reporting,all, 
    SequenceNumber: 146, 
    File: manager.c, 
    Line: 2023, 
    Func: manager_default_msg_cb, 
    SystemName: asterisk, 
    
    Channel: PJSIP/000-00000000, 
    ChannelState: 6, 
    ChannelStateDesc: Up, 
    CallerIDNum: 000, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: <unknown>, 
    ConnectedLineName: <unknown>, 
    Language: en, 
    AccountCode: , 
    Context: from-000, 
    Exten: 888, 
    Priority: 9, 
    Uniqueid: asterisk-1722255899.0, 
    Linkedid: asterisk-1722255899.0, 
    
    To: 10.0.3.15:11993, 
    From: 10.0.3.1:7079, 
    RTT: 0.0000, 
    MES: 88.1, 
    SSRC: 0xea52089d, 
    PT: 200(SR), 
    ReportCount: 1, 
    SentNTP: 1722255901.523657, 
    SentRTP: 2687797219, 
    SentPackets: 82, 
    SentOctets: 13120, 
    Report0SourceSSRC: 0x4cb651ec, 
    Report0FractionLost: 0, 
    Report0CumulativeLost: 0, 
    Report0HighestSequence: 22331, 
    Report0SequenceNumberCycles: 0, 
    Report0IAJitter: 1, 
    Report0LSR: 0, 
    Report0DLSR: 0.0000
    
     */
    /**
     * @return the to
     */
    public InetSocketAddress getTo() {
        return to;
    }

    /**
     * @param to the to to set
     */
    public void setTo(InetSocketAddress to) {
        this.to = to;
    }

    /**
     * @return the from
     */
    public InetSocketAddress getFrom() {
        return from;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(InetSocketAddress from) {
        this.from = from;
    }

    /**
     * @return the RTT
     */
    public Float getRTT() {
        return RTT;
    }

    /**
     * @param RTT the RTT to set
     */
    public void setRTT(Float RTT) {
        this.RTT = RTT;
    }

    /**
     * @return the MES
     */
    public Float getMES() {
        return MES;
    }

    /**
     * @param MES the MES to set
     */
    public void setMES(Float MES) {
        this.MES = MES;
    }

    /**
     * @return the SSRC
     */
    public String getSSRC() {
        return SSRC;
    }

    /**
     * @param SSRC the SSRC to set
     */
    public void setSSRC(String SSRC) {
        this.SSRC = SSRC;
    }

    /**
     * @return the PT
     */
    public String getPT() {
        return PT;
    }

    /**
     * @param PT the PT to set
     */
    public void setPT(String PT) {
        this.PT = PT;
    }

    /**
     * @return the ReportCount
     */
    public Integer getReportCount() {
        return ReportCount;
    }

    /**
     * @param ReportCount the ReportCount to set
     */
    public void setReportCount(Integer ReportCount) {
        this.ReportCount = ReportCount;
    }

    /**
     * @return the SentNTP
     */
    public String getSentNTP() {
        return SentNTP;
    }

    /**
     * @param SentNTP the SentNTP to set
     */
    public void setSentNTP(String SentNTP) {
        this.SentNTP = SentNTP;
    }

    /**
     * @return the SentRTP
     */
    public String getSentRTP() {
        return SentRTP;
    }

    /**
     * @param SentRTP the SentRTP to set
     */
    public void setSentRTP(String SentRTP) {
        this.SentRTP = SentRTP;
    }

    /**
     * @return the SentPackets
     */
    public Integer getSentPackets() {
        return SentPackets;
    }

    /**
     * @param SentPackets the SentPackets to set
     */
    public void setSentPackets(Integer SentPackets) {
        this.SentPackets = SentPackets;
    }

    /**
     * @return the SentOctets
     */
    public Integer getSentOctets() {
        return SentOctets;
    }

    /**
     * @param SentOctets the SentOctets to set
     */
    public void setSentOctets(Integer SentOctets) {
        this.SentOctets = SentOctets;
    }

    /**
     * @return the Report0SourceSSRC
     */
    public String getReport0SourceSSRC() {
        return Report0SourceSSRC;
    }

    /**
     * @param Report0SourceSSRC the Report0SourceSSRC to set
     */
    public void setReport0SourceSSRC(String Report0SourceSSRC) {
        this.Report0SourceSSRC = Report0SourceSSRC;
    }

    /**
     * @return the Report0FractionLost
     */
    public Integer getReport0FractionLost() {
        return Report0FractionLost;
    }

    /**
     * @param Report0FractionLost the Report0FractionLost to set
     */
    public void setReport0FractionLost(Integer Report0FractionLost) {
        this.Report0FractionLost = Report0FractionLost;
    }

    /**
     * @return the Report0CumulativeLost
     */
    public Integer getReport0CumulativeLost() {
        return Report0CumulativeLost;
    }

    /**
     * @param Report0CumulativeLost the Report0CumulativeLost to set
     */
    public void setReport0CumulativeLost(Integer Report0CumulativeLost) {
        this.Report0CumulativeLost = Report0CumulativeLost;
    }

    /**
     * @return the Report0HighestSequence
     */
    public Integer getReport0HighestSequence() {
        return Report0HighestSequence;
    }

    /**
     * @param Report0HighestSequence the Report0HighestSequence to set
     */
    public void setReport0HighestSequence(Integer Report0HighestSequence) {
        this.Report0HighestSequence = Report0HighestSequence;
    }

    /**
     * @return the Report0SequenceNumberCycles
     */
    public Integer getReport0SequenceNumberCycles() {
        return Report0SequenceNumberCycles;
    }

    /**
     * @param Report0SequenceNumberCycles the Report0SequenceNumberCycles to set
     */
    public void setReport0SequenceNumberCycles(Integer Report0SequenceNumberCycles) {
        this.Report0SequenceNumberCycles = Report0SequenceNumberCycles;
    }

    /**
     * @return the Report0IAJitter
     */
    public Integer getReport0IAJitter() {
        return Report0IAJitter;
    }

    /**
     * @param Report0IAJitter the Report0IAJitter to set
     */
    public void setReport0IAJitter(Integer Report0IAJitter) {
        this.Report0IAJitter = Report0IAJitter;
    }

    /**
     * @return the Report0LSR
     */
    public Integer getReport0LSR() {
        return Report0LSR;
    }

    /**
     * @param Report0LSR the Report0LSR to set
     */
    public void setReport0LSR(Integer Report0LSR) {
        this.Report0LSR = Report0LSR;
    }

    /**
     * @return the Report0DLSR
     */
    public Float getReport0DLSR() {
        return Report0DLSR;
    }

    /**
     * @param Report0DLSR the Report0DLSR to set
     */
    public void setReport0DLSR(Float Report0DLSR) {
        this.Report0DLSR = Report0DLSR;
    }

}
