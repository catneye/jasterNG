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
/** AMI IdentifyDetail event. */
public class IdentifyDetail extends SystemEvent implements Serializable {
    public IdentifyDetail() { super.setEvent("IdentifyDetail"); super.setUuid(UUID.randomUUID()); }
    private String objectType;
    public String getObjectType() { return objectType; }
    public void setObjectType(String objectType) { this.objectType = objectType; }
    private String objectName;
    public String getObjectName() { return objectName; }
    public void setObjectName(String objectName) { this.objectName = objectName; }
    private String endpoint;
    public String getEndpoint() { return endpoint; }
    public void setEndpoint(String endpoint) { this.endpoint = endpoint; }
    private Boolean srvLookups;
    public Boolean getSrvLookups() { return srvLookups; }
    public void setSrvLookups(Boolean srvLookups) { this.srvLookups = srvLookups; }
    private String match;
    public String getMatch() { return match; }
    public void setMatch(String match) { this.match = match; }
    private String matchHeader;
    public String getMatchHeader() { return matchHeader; }
    public void setMatchHeader(String matchHeader) { this.matchHeader = matchHeader; }
    private String matchRequestUri;
    public String getMatchRequestUri() { return matchRequestUri; }
    public void setMatchRequestUri(String matchRequestUri) { this.matchRequestUri = matchRequestUri; }
    private String endpointName;
    public String getEndpointName() { return endpointName; }
    public void setEndpointName(String endpointName) { this.endpointName = endpointName; }
}
