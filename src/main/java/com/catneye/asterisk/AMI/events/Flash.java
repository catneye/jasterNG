/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI Flash event. */
public class Flash extends ChannelEvent implements Serializable {
    public Flash() { super.setEvent("Flash"); super.setUuid(UUID.randomUUID()); }
}
