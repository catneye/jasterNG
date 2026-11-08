/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI MixMonitorMute event. */
public class MixMonitorMute extends ChannelEvent implements Serializable {
    public MixMonitorMute() { super.setEvent("MixMonitorMute"); super.setUuid(UUID.randomUUID()); }
    private String direction;
    public String getDirection() { return direction; }
    public void setDirection(String direction) { this.direction = direction; }
    private Integer state;
    public Integer getState() { return state; }
    public void setState(Integer state) { this.state = state; }
}
