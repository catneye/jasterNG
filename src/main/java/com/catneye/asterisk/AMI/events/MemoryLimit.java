/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SecurityEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI MemoryLimit event. */
public class MemoryLimit extends SecurityEvent implements Serializable {
    public MemoryLimit() { super.setEvent("MemoryLimit"); super.setUuid(UUID.randomUUID()); }
}
