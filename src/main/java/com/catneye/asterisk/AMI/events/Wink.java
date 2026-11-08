/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI Wink event, raised when a wink occurs on a channel. */
public class Wink extends ChannelEvent implements Serializable {

    public Wink() {
        super.setEvent("Wink");
        super.setUuid(UUID.randomUUID());
    }
}
