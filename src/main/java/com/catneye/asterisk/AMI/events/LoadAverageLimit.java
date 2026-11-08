/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SecurityEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI LoadAverageLimit event. */
public class LoadAverageLimit extends SecurityEvent implements Serializable {
    public LoadAverageLimit() { super.setEvent("LoadAverageLimit"); super.setUuid(UUID.randomUUID()); }
}
