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
import java.time.LocalDateTime;
/** AMI InboundRegistrationDetail event. */
public class InboundRegistrationDetail extends SystemEvent implements Serializable {
    public InboundRegistrationDetail() { super.setEvent("InboundRegistrationDetail"); super.setUuid(UUID.randomUUID()); }
    private String objectType;
    public String getObjectType() { return objectType; }
    public void setObjectType(String objectType) { this.objectType = objectType; }
    private String objectName;
    public String getObjectName() { return objectName; }
    public void setObjectName(String objectName) { this.objectName = objectName; }
    private Integer minimumExpiration;
    public Integer getMinimumExpiration() { return minimumExpiration; }
    public void setMinimumExpiration(Integer minimumExpiration) { this.minimumExpiration = minimumExpiration; }
    private Integer defaultExpiration;
    public Integer getDefaultExpiration() { return defaultExpiration; }
    public void setDefaultExpiration(Integer defaultExpiration) { this.defaultExpiration = defaultExpiration; }
    private Float qualifyTimeout;
    public Float getQualifyTimeout() { return qualifyTimeout; }
    public void setQualifyTimeout(Float qualifyTimeout) { this.qualifyTimeout = qualifyTimeout; }
    private Boolean qualify2xxOnly;
    public Boolean getQualify2xxOnly() { return qualify2xxOnly; }
    public void setQualify2xxOnly(Boolean qualify2xxOnly) { this.qualify2xxOnly = qualify2xxOnly; }
    private String mailboxes;
    public String getMailboxes() { return mailboxes; }
    public void setMailboxes(String mailboxes) { this.mailboxes = mailboxes; }
    private Boolean supportPath;
    public Boolean getSupportPath() { return supportPath; }
    public void setSupportPath(Boolean supportPath) { this.supportPath = supportPath; }
    private Boolean removeUnavailable;
    public Boolean getRemoveUnavailable() { return removeUnavailable; }
    public void setRemoveUnavailable(Boolean removeUnavailable) { this.removeUnavailable = removeUnavailable; }
    private String voicemailExtension;
    public String getVoicemailExtension() { return voicemailExtension; }
    public void setVoicemailExtension(String voicemailExtension) { this.voicemailExtension = voicemailExtension; }
    private Integer maxContacts;
    public Integer getMaxContacts() { return maxContacts; }
    public void setMaxContacts(Integer maxContacts) { this.maxContacts = maxContacts; }
    private Boolean authenticateQualify;
    public Boolean getAuthenticateQualify() { return authenticateQualify; }
    public void setAuthenticateQualify(Boolean authenticateQualify) { this.authenticateQualify = authenticateQualify; }
    private Integer maximumExpiration;
    public Integer getMaximumExpiration() { return maximumExpiration; }
    public void setMaximumExpiration(Integer maximumExpiration) { this.maximumExpiration = maximumExpiration; }
    private Integer qualifyFrequency;
    public Integer getQualifyFrequency() { return qualifyFrequency; }
    public void setQualifyFrequency(Integer qualifyFrequency) { this.qualifyFrequency = qualifyFrequency; }
    private Boolean removeExisting;
    public Boolean getRemoveExisting() { return removeExisting; }
    public void setRemoveExisting(Boolean removeExisting) { this.removeExisting = removeExisting; }
    private String outboundProxy;
    public String getOutboundProxy() { return outboundProxy; }
    public void setOutboundProxy(String outboundProxy) { this.outboundProxy = outboundProxy; }
    private String contacts;
    public String getContacts() { return contacts; }
    public void setContacts(String contacts) { this.contacts = contacts; }
    private String contact;
    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
}
