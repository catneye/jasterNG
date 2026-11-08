/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
import java.time.LocalDateTime;
/** AMI SendFAX event. */
public class SendFAX extends ChannelEvent implements Serializable {
    public SendFAX() { super.setEvent("SendFAX"); super.setUuid(UUID.randomUUID()); }
    private String localStationID;
    public String getLocalStationID() { return localStationID; }
    public void setLocalStationID(String localStationID) { this.localStationID = localStationID; }
    private String remoteStationID;
    public String getRemoteStationID() { return remoteStationID; }
    public void setRemoteStationID(String remoteStationID) { this.remoteStationID = remoteStationID; }
    private Integer pagesTransferred;
    public Integer getPagesTransferred() { return pagesTransferred; }
    public void setPagesTransferred(Integer pagesTransferred) { this.pagesTransferred = pagesTransferred; }
    private String resolution;
    public String getResolution() { return resolution; }
    public void setResolution(String resolution) { this.resolution = resolution; }
    private String transferRate;
    public String getTransferRate() { return transferRate; }
    public void setTransferRate(String transferRate) { this.transferRate = transferRate; }
    private String fileName;
    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }
}
