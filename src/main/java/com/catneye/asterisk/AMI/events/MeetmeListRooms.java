/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI MeetmeListRooms event. */
public class MeetmeListRooms extends SystemEvent implements Serializable {
    public MeetmeListRooms() { super.setEvent("MeetmeListRooms"); super.setUuid(UUID.randomUUID()); }
    private String conference;
    public String getConference() { return conference; }
    public void setConference(String conference) { this.conference = conference; }
    private Integer parties;
    public Integer getParties() { return parties; }
    public void setParties(Integer parties) { this.parties = parties; }
    private Integer marked;
    public Integer getMarked() { return marked; }
    public void setMarked(Integer marked) { this.marked = marked; }
    private String activity;
    public String getActivity() { return activity; }
    public void setActivity(String activity) { this.activity = activity; }
    private String creation;
    public String getCreation() { return creation; }
    public void setCreation(String creation) { this.creation = creation; }
    private Boolean locked;
    public Boolean getLocked() { return locked; }
    public void setLocked(Boolean locked) { this.locked = locked; }
}
