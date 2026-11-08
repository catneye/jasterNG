/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI MeetmeJoin event. */
public class MeetmeJoin extends ChannelEvent implements Serializable {
    public MeetmeJoin() { super.setEvent("MeetmeJoin"); super.setUuid(UUID.randomUUID()); }
    private String meetme;
    public String getMeetme() { return meetme; }
    public void setMeetme(String meetme) { this.meetme = meetme; }
    private String user;
    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }
}
