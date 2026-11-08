/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI PresenceStatus event. */
public class PresenceStatus extends SystemEvent implements Serializable {
    public PresenceStatus() { super.setEvent("PresenceStatus"); super.setUuid(UUID.randomUUID()); }
    private String presentity;
    public String getPresentity() { return presentity; }
    public void setPresentity(String presentity) { this.presentity = presentity; }
    private String status;
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    private String subtype;
    public String getSubtype() { return subtype; }
    public void setSubtype(String subtype) { this.subtype = subtype; }
    private String message;
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
