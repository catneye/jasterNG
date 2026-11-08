/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI LogChannel event. */
public class LogChannel extends SystemEvent implements Serializable {
    public LogChannel() { super.setEvent("LogChannel"); super.setUuid(UUID.randomUUID()); }
    private String channel;
    public String getChannel() { return channel; }
    public void setChannel(String channel) { this.channel = channel; }
}
