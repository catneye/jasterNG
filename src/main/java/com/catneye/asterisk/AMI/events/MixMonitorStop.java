/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI MixMonitorStop event. */
public class MixMonitorStop extends ChannelEvent implements Serializable {
    public MixMonitorStop() { super.setEvent("MixMonitorStop"); super.setUuid(UUID.randomUUID()); }
}
