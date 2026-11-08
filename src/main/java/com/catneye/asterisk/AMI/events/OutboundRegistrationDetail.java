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

/**
 * AMI OutboundRegistrationDetail event.
 */
public class OutboundRegistrationDetail extends SystemEvent implements Serializable {

    public OutboundRegistrationDetail() {
        super.setEvent("OutboundRegistrationDetail");
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
    private Integer maxRetries;

    public Integer getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }
    private String clientUri;

    public String getClientUri() {
        return clientUri;
    }

    public void setClientUri(String clientUri) {
        this.clientUri = clientUri;
    }
    private String securityNegotiation;

    public String getSecurityNegotiation() {
        return securityNegotiation;
    }

    public void setSecurityNegotiation(String securityNegotiation) {
        this.securityNegotiation = securityNegotiation;
    }
    private Boolean authRejectionPermanent;

    public Boolean getAuthRejectionPermanent() {
        return authRejectionPermanent;
    }

    public void setAuthRejectionPermanent(Boolean authRejectionPermanent) {
        this.authRejectionPermanent = authRejectionPermanent;
    }
    private String serverUri;

    public String getServerUri() {
        return serverUri;
    }

    public void setServerUri(String serverUri) {
        this.serverUri = serverUri;
    }
    private Integer maxRandomInitialDelay;

    public Integer getMaxRandomInitialDelay() {
        return maxRandomInitialDelay;
    }

    public void setMaxRandomInitialDelay(Integer maxRandomInitialDelay) {
        this.maxRandomInitialDelay = maxRandomInitialDelay;
    }
    private Boolean supportPath;

    public Boolean getSupportPath() {
        return supportPath;
    }

    public void setSupportPath(Boolean supportPath) {
        this.supportPath = supportPath;
    }
    private Integer retryInterval;

    public Integer getRetryInterval() {
        return retryInterval;
    }

    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }
    private String contactHeaderParams;

    public String getContactHeaderParams() {
        return contactHeaderParams;
    }

    public void setContactHeaderParams(String contactHeaderParams) {
        this.contactHeaderParams = contactHeaderParams;
    }
    private Integer expiration;

    public Integer getExpiration() {
        return expiration;
    }

    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
    }
    private String transport;

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }
    private String contactUser;

    public String getContactUser() {
        return contactUser;
    }

    public void setContactUser(String contactUser) {
        this.contactUser = contactUser;
    }
    private String endpoint;

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
    private String userAgent;

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
    private Integer forbiddenRetryInterval;

    public Integer getForbiddenRetryInterval() {
        return forbiddenRetryInterval;
    }

    public void setForbiddenRetryInterval(Integer forbiddenRetryInterval) {
        this.forbiddenRetryInterval = forbiddenRetryInterval;
    }
    private String outboundAuth;

    public String getOutboundAuth() {
        return outboundAuth;
    }

    public void setOutboundAuth(String outboundAuth) {
        this.outboundAuth = outboundAuth;
    }
    private String outboundProxy;

    public String getOutboundProxy() {
        return outboundProxy;
    }

    public void setOutboundProxy(String outboundProxy) {
        this.outboundProxy = outboundProxy;
    }
    private Integer fatalRetryInterval;

    public Integer getFatalRetryInterval() {
        return fatalRetryInterval;
    }

    public void setFatalRetryInterval(Integer fatalRetryInterval) {
        this.fatalRetryInterval = fatalRetryInterval;
    }
    private Boolean supportOutbound;

    public Boolean getSupportOutbound() {
        return supportOutbound;
    }

    public void setSupportOutbound(Boolean supportOutbound) {
        this.supportOutbound = supportOutbound;
    }
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private Integer nextReg;

    public Integer getNextReg() {
        return nextReg;
    }

    public void setNextReg(Integer nextReg) {
        this.nextReg = nextReg;
    }
}
