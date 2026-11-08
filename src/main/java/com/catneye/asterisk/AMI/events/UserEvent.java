/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI UserEvent event. */
public class UserEvent extends ChannelEvent implements Serializable {
    public UserEvent() { super.setEvent("UserEvent"); super.setUuid(UUID.randomUUID()); }
    private String userEvent;
    public String getUserEvent() { return userEvent; }
    public void setUserEvent(String userEvent) { this.userEvent = userEvent; }
}
