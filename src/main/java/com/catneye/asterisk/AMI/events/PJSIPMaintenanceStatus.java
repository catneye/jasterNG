/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI PJSIPMaintenanceStatus event. */
public class PJSIPMaintenanceStatus extends SystemEvent implements Serializable {
    public PJSIPMaintenanceStatus() { super.setEvent("PJSIPMaintenanceStatus"); super.setUuid(UUID.randomUUID()); }
    private String endpoint;
    public String getEndpoint() { return endpoint; }
    public void setEndpoint(String endpoint) { this.endpoint = endpoint; }
    private String status;
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
