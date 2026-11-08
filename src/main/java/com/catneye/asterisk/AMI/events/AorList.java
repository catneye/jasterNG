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
import java.util.UUID;

/**
 * AMI AorList event.
 *
 * @author Kurchenko O.E.
 */
public class AorList extends SystemEvent implements Serializable {

    private String objectType;
    private String objectName;
    private Integer minimumExpiration;
    private Integer maximumExpiration;
    private Integer defaultExpiration;
    private Integer qualifyFrequency;
    private Boolean authenticateQualify;
    private Integer maxContacts;
    private Boolean removeExisting;
    private Boolean removeUnavailable;
    private String mailboxes;
    private String outboundProxy;
    private Boolean supportPath;
    private Boolean qualify2xxOnly;
    private Float qualifyTimeout;
    private String voicemailExtension;

    public AorList() {
        super.setEvent("AorList");
        super.setUuid(UUID.randomUUID());
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Integer getMinimumExpiration() {
        return minimumExpiration;
    }

    public void setMinimumExpiration(Integer minimumExpiration) {
        this.minimumExpiration = minimumExpiration;
    }

    public Integer getMaximumExpiration() {
        return maximumExpiration;
    }

    public void setMaximumExpiration(Integer maximumExpiration) {
        this.maximumExpiration = maximumExpiration;
    }

    public Integer getDefaultExpiration() {
        return defaultExpiration;
    }

    public void setDefaultExpiration(Integer defaultExpiration) {
        this.defaultExpiration = defaultExpiration;
    }

    public Integer getQualifyFrequency() {
        return qualifyFrequency;
    }

    public void setQualifyFrequency(Integer qualifyFrequency) {
        this.qualifyFrequency = qualifyFrequency;
    }

    public Boolean getAuthenticateQualify() {
        return authenticateQualify;
    }

    public void setAuthenticateQualify(Boolean authenticateQualify) {
        this.authenticateQualify = authenticateQualify;
    }

    public Integer getMaxContacts() {
        return maxContacts;
    }

    public void setMaxContacts(Integer maxContacts) {
        this.maxContacts = maxContacts;
    }

    public Boolean getRemoveExisting() {
        return removeExisting;
    }

    public void setRemoveExisting(Boolean removeExisting) {
        this.removeExisting = removeExisting;
    }

    public Boolean getRemoveUnavailable() {
        return removeUnavailable;
    }

    public void setRemoveUnavailable(Boolean removeUnavailable) {
        this.removeUnavailable = removeUnavailable;
    }

    public String getMailboxes() {
        return mailboxes;
    }

    public void setMailboxes(String mailboxes) {
        this.mailboxes = mailboxes;
    }

    public String getOutboundProxy() {
        return outboundProxy;
    }

    public void setOutboundProxy(String outboundProxy) {
        this.outboundProxy = outboundProxy;
    }

    public Boolean getSupportPath() {
        return supportPath;
    }

    public void setSupportPath(Boolean supportPath) {
        this.supportPath = supportPath;
    }

    public Boolean getQualify2xxOnly() {
        return qualify2xxOnly;
    }

    public void setQualify2xxOnly(Boolean qualify2xxOnly) {
        this.qualify2xxOnly = qualify2xxOnly;
    }

    public Float getQualifyTimeout() {
        return qualifyTimeout;
    }

    public void setQualifyTimeout(Float qualifyTimeout) {
        this.qualifyTimeout = qualifyTimeout;
    }

    public String getVoicemailExtension() {
        return voicemailExtension;
    }

    public void setVoicemailExtension(String voicemailExtension) {
        this.voicemailExtension = voicemailExtension;
    }

}
