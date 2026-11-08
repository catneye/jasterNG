/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI FAXStatus event. */
public class FAXStatus extends ChannelEvent implements Serializable {
    public FAXStatus() { super.setEvent("FAXStatus"); super.setUuid(UUID.randomUUID()); }
    private String operation;
    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }
    private String status;
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    private String localStationID;
    public String getLocalStationID() { return localStationID; }
    public void setLocalStationID(String localStationID) { this.localStationID = localStationID; }
    private String fileName;
    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }
}
