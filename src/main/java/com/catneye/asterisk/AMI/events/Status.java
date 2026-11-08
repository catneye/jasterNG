/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI Status event. */
public class Status extends ChannelEvent implements Serializable {
    public Status() { super.setEvent("Status"); super.setUuid(UUID.randomUUID()); }
    private String actionID;
    public String getActionID() { return actionID; }
    public void setActionID(String actionID) { this.actionID = actionID; }
    private String type;
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    private String dnid;
    public String getDnid() { return dnid; }
    public void setDnid(String dnid) { this.dnid = dnid; }
    private String effectiveConnectedLineNum;
    public String getEffectiveConnectedLineNum() { return effectiveConnectedLineNum; }
    public void setEffectiveConnectedLineNum(String effectiveConnectedLineNum) { this.effectiveConnectedLineNum = effectiveConnectedLineNum; }
    private String effectiveConnectedLineName;
    public String getEffectiveConnectedLineName() { return effectiveConnectedLineName; }
    public void setEffectiveConnectedLineName(String effectiveConnectedLineName) { this.effectiveConnectedLineName = effectiveConnectedLineName; }
    private Integer timeToHangup;
    public Integer getTimeToHangup() { return timeToHangup; }
    public void setTimeToHangup(Integer timeToHangup) { this.timeToHangup = timeToHangup; }
    private String bridgeID;
    public String getBridgeID() { return bridgeID; }
    public void setBridgeID(String bridgeID) { this.bridgeID = bridgeID; }
    private String application;
    public String getApplication() { return application; }
    public void setApplication(String application) { this.application = application; }
    private String data;
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    private String nativeformats;
    public String getNativeformats() { return nativeformats; }
    public void setNativeformats(String nativeformats) { this.nativeformats = nativeformats; }
    private String readformat;
    public String getReadformat() { return readformat; }
    public void setReadformat(String readformat) { this.readformat = readformat; }
    private String readtrans;
    public String getReadtrans() { return readtrans; }
    public void setReadtrans(String readtrans) { this.readtrans = readtrans; }
    private String writeformat;
    public String getWriteformat() { return writeformat; }
    public void setWriteformat(String writeformat) { this.writeformat = writeformat; }
    private String writetrans;
    public String getWritetrans() { return writetrans; }
    public void setWritetrans(String writetrans) { this.writetrans = writetrans; }
    private String callgroup;
    public String getCallgroup() { return callgroup; }
    public void setCallgroup(String callgroup) { this.callgroup = callgroup; }
    private String pickupgroup;
    public String getPickupgroup() { return pickupgroup; }
    public void setPickupgroup(String pickupgroup) { this.pickupgroup = pickupgroup; }
    private Integer seconds;
    public Integer getSeconds() { return seconds; }
    public void setSeconds(Integer seconds) { this.seconds = seconds; }
}
