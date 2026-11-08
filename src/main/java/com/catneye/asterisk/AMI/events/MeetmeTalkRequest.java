/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI MeetmeTalkRequest event. */
public class MeetmeTalkRequest extends ChannelEvent implements Serializable {
    public MeetmeTalkRequest() { super.setEvent("MeetmeTalkRequest"); super.setUuid(UUID.randomUUID()); }
    private String meetme;
    public String getMeetme() { return meetme; }
    public void setMeetme(String meetme) { this.meetme = meetme; }
    private String user;
    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }
    private String status;
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
