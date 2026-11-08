/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI MeetmeList event. */
public class MeetmeList extends ChannelEvent implements Serializable {
    public MeetmeList() { super.setEvent("MeetmeList"); super.setUuid(UUID.randomUUID()); }
    private String conference;
    public String getConference() { return conference; }
    public void setConference(String conference) { this.conference = conference; }
    private Integer userNumber;
    public Integer getUserNumber() { return userNumber; }
    public void setUserNumber(Integer userNumber) { this.userNumber = userNumber; }
    private Boolean admin;
    public Boolean getAdmin() { return admin; }
    public void setAdmin(Boolean admin) { this.admin = admin; }
    private String role;
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    private Boolean markedUser;
    public Boolean getMarkedUser() { return markedUser; }
    public void setMarkedUser(Boolean markedUser) { this.markedUser = markedUser; }
    private Boolean muted;
    public Boolean getMuted() { return muted; }
    public void setMuted(Boolean muted) { this.muted = muted; }
    private Boolean talking;
    public Boolean getTalking() { return talking; }
    public void setTalking(Boolean talking) { this.talking = talking; }
}
