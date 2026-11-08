/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI DAHDIChannel event. */
public class DAHDIChannel extends ChannelEvent implements Serializable {
    public DAHDIChannel() { super.setEvent("DAHDIChannel"); super.setUuid(UUID.randomUUID()); }
    private String dahdiGroup;
    public String getDahdiGroup() { return dahdiGroup; }
    public void setDahdiGroup(String dahdiGroup) { this.dahdiGroup = dahdiGroup; }
    private Integer dahdiSpan;
    public Integer getDahdiSpan() { return dahdiSpan; }
    public void setDahdiSpan(Integer dahdiSpan) { this.dahdiSpan = dahdiSpan; }
    private Integer dahdiChannel;
    public Integer getDahdiChannel() { return dahdiChannel; }
    public void setDahdiChannel(Integer dahdiChannel) { this.dahdiChannel = dahdiChannel; }
}
