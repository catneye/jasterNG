/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI FAXSessionsEntry event. */
public class FAXSessionsEntry extends ChannelEvent implements Serializable {
    public FAXSessionsEntry() { super.setEvent("FAXSessionsEntry"); super.setUuid(UUID.randomUUID()); }
    private String actionID;
    public String getActionID() { return actionID; }
    public void setActionID(String actionID) { this.actionID = actionID; }
    private String technology;
    public String getTechnology() { return technology; }
    public void setTechnology(String technology) { this.technology = technology; }
    private Integer sessionNumber;
    public Integer getSessionNumber() { return sessionNumber; }
    public void setSessionNumber(Integer sessionNumber) { this.sessionNumber = sessionNumber; }
    private String sessionType;
    public String getSessionType() { return sessionType; }
    public void setSessionType(String sessionType) { this.sessionType = sessionType; }
    private String operation;
    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }
    private String state;
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    private String files;
    public String getFiles() { return files; }
    public void setFiles(String files) { this.files = files; }
}
