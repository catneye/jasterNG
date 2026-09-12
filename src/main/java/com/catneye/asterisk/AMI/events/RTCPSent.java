/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.util.UUID;

/**
 *
 * @author plintus
 */
public class RTCPSent extends ChannelEvent implements Serializable {

    public RTCPSent() {
        super.setEvent("RTCPSent");
        super.setUuid(UUID.randomUUID());
    }

    private InetSocketAddress to;
    private InetSocketAddress from;
    private Float MES;
    private String SSRC;
    private String PT;
    private Integer ReportCount;
    private String Report0SourceSSRC;
    private Integer Report0FractionLost;
    private Integer Report0CumulativeLost;
    private Integer Report0HighestSequence;
    private Integer Report0SequenceNumberCycles;
    private Integer Report0IAJitter;
    private Integer Report0LSR;
    private Float Report0DLSR;

    /*
RTCPSent, 
    Privilege: reporting,all, 
    SequenceNumber: 1037, 
    File: manager.c, 
    Line: 2023, 
    Func: manager_default_msg_cb, 
    SystemName: asterisk, 
    Channel: PJSIP/000-0000000f, 
    ChannelState: 6, 
    ChannelStateDesc: Up, 
    CallerIDNum: 000, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: <unknown>, 
    ConnectedLineName: <unknown>, 
    Language: en, AccountCode: , 
    Context: from-000, 
    Exten: 886, 
    Priority: 2, 
    Uniqueid: asterisk-1722942955.69, 
    Linkedid: asterisk-1722942955.69, 
    To: 10.0.3.1:7079, 
    From: 10.0.3.15:14951, 
    MES: 88.1, 
    SSRC: 0x7670df5d, 
    PT: 201(RR), 
    ReportCount: 1, 
    Report0SourceSSRC: 0x4e2f9b68, 
    Report0FractionLost: 0, 
    Report0CumulativeLost: 0, 
    Report0HighestSequence: 1250, 
    Report0SequenceNumberCycles: 0, 
    Report0IAJitter: 60, 
    Report0LSR: 2223254730, 
    Report0DLSR: 0.4790
    
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
