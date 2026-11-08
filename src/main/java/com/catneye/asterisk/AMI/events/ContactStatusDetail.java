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

/** AMI ContactStatusDetail event. */
public class ContactStatusDetail extends SystemEvent implements Serializable {

    public ContactStatusDetail() {
        super.setEvent("ContactStatusDetail");
        super.setUuid(UUID.randomUUID());
    }

    private String aor;

    public String getAor() {
        return aor;
    }

    public void setAor(String aor) {
        this.aor = aor;
    }

    private String uri;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private Integer roundtripUsec;

    public Integer getRoundtripUsec() {
        return roundtripUsec;
    }

    public void setRoundtripUsec(Integer roundtripUsec) {
        this.roundtripUsec = roundtripUsec;
    }

    private String endpointName;

    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    private String userAgent;

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    private String regExpire;

    public String getRegExpire() {
        return regExpire;
    }

    public void setRegExpire(String regExpire) {
        this.regExpire = regExpire;
    }

    private String viaAddress;

    public String getViaAddress() {
        return viaAddress;
    }

    public void setViaAddress(String viaAddress) {
        this.viaAddress = viaAddress;
    }

    private String callID;

    public String getCallID() {
        return callID;
    }

    public void setCallID(String callID) {
        this.callID = callID;
    }

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Boolean authenticateQualify;

    public Boolean getAuthenticateQualify() {
        return authenticateQualify;
    }

    public void setAuthenticateQualify(Boolean authenticateQualify) {
        this.authenticateQualify = authenticateQualify;
    }

    private String outboundProxy;

    public String getOutboundProxy() {
        return outboundProxy;
    }

    public void setOutboundProxy(String outboundProxy) {
        this.outboundProxy = outboundProxy;
    }

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private Integer qualifyFrequency;

    public Integer getQualifyFrequency() {
        return qualifyFrequency;
    }

    public void setQualifyFrequency(Integer qualifyFrequency) {
        this.qualifyFrequency = qualifyFrequency;
    }

    private Float qualifyTimeout;

    public Float getQualifyTimeout() {
        return qualifyTimeout;
    }

    public void setQualifyTimeout(Float qualifyTimeout) {
        this.qualifyTimeout = qualifyTimeout;
    }

    private Boolean qualify2xxOnly;

    public Boolean getQualify2xxOnly() {
        return qualify2xxOnly;
    }

    public void setQualify2xxOnly(Boolean qualify2xxOnly) {
        this.qualify2xxOnly = qualify2xxOnly;
    }

}
