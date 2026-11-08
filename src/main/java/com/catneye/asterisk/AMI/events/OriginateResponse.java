/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI OriginateResponse event. */
public class OriginateResponse extends ChannelEvent implements Serializable {
    public OriginateResponse() { super.setEvent("OriginateResponse"); super.setUuid(UUID.randomUUID()); }
    private String actionID;
    public String getActionID() { return actionID; }
    public void setActionID(String actionID) { this.actionID = actionID; }
    private String response;
    public String getResponse() { return response; }
    public void setResponse(String response) { this.response = response; }
    private String application;
    public String getApplication() { return application; }
    public void setApplication(String application) { this.application = application; }
    private String data;
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    private Integer reason;
    public Integer getReason() { return reason; }
    public void setReason(Integer reason) { this.reason = reason; }
}
