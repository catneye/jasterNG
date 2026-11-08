/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI Unload event. */
public class Unload extends SystemEvent implements Serializable {
    public Unload() { super.setEvent("Unload"); super.setUuid(UUID.randomUUID()); }
    private String module;
    public String getModule() { return module; }
    public void setModule(String module) { this.module = module; }
    private String status;
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
