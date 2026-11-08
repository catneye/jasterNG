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

/** AMI ContactList event. */
public class ContactList extends SystemEvent implements Serializable {

    public ContactList() {
        super.setEvent("ContactList");
        super.setUuid(UUID.randomUUID());
    }

    private String objectType;

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    private String objectName;

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    private String viaAddr;

    public String getViaAddr() {
        return viaAddr;
    }

    public void setViaAddr(String viaAddr) {
        this.viaAddr = viaAddr;
    }

    private Integer viaPort;

    public Integer getViaPort() {
        return viaPort;
    }

    public void setViaPort(Integer viaPort) {
        this.viaPort = viaPort;
    }

    private Float qualifyTimeout;

    public Float getQualifyTimeout() {
        return qualifyTimeout;
    }

    public void setQualifyTimeout(Float qualifyTimeout) {
        this.qualifyTimeout = qualifyTimeout;
    }

    private String callId;

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    private String regServer;

    public String getRegServer() {
        return regServer;
    }

    public void setRegServer(String regServer) {
        this.regServer = regServer;
    }

    private Boolean pruneOnBoot;

    public Boolean getPruneOnBoot() {
        return pruneOnBoot;
    }

    public void setPruneOnBoot(Boolean pruneOnBoot) {
        this.pruneOnBoot = pruneOnBoot;
    }

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private String endpoint;

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    private Boolean authenticateQualify;

    public Boolean getAuthenticateQualify() {
        return authenticateQualify;
    }

    public void setAuthenticateQualify(Boolean authenticateQualify) {
        this.authenticateQualify = authenticateQualify;
    }

    private String uri;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    private Integer qualifyFrequency;

    public Integer getQualifyFrequency() {
        return qualifyFrequency;
    }

    public void setQualifyFrequency(Integer qualifyFrequency) {
        this.qualifyFrequency = qualifyFrequency;
    }

    private String userAgent;

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    private String expirationTime;

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    private String outboundProxy;

    public String getOutboundProxy() {
        return outboundProxy;
    }

    public void setOutboundProxy(String outboundProxy) {
        this.outboundProxy = outboundProxy;
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

    private Boolean qualify2xxOnly;

    public Boolean getQualify2xxOnly() {
        return qualify2xxOnly;
    }

    public void setQualify2xxOnly(Boolean qualify2xxOnly) {
        this.qualify2xxOnly = qualify2xxOnly;
    }

}
