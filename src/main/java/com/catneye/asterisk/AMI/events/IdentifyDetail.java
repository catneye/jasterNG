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
