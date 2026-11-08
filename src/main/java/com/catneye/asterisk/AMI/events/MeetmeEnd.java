/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI MeetmeEnd event. */
public class MeetmeEnd extends SystemEvent implements Serializable {
    public MeetmeEnd() { super.setEvent("MeetmeEnd"); super.setUuid(UUID.randomUUID()); }
    private String meetme;
    public String getMeetme() { return meetme; }
    public void setMeetme(String meetme) { this.meetme = meetme; }
}
