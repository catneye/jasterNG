/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SecurityEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI SessionLimit event. */
public class SessionLimit extends SecurityEvent implements Serializable {
    public SessionLimit() { super.setEvent("SessionLimit"); super.setUuid(UUID.randomUUID()); }
}
