/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
import java.time.LocalDateTime;
/** AMI CEL event. */
public class CEL extends SystemEvent implements Serializable {
    public CEL() { super.setEvent("CEL"); super.setUuid(UUID.randomUUID()); }
    private String eventName;
    public String getEventName() { return eventName; }
    public void setEventName(String eventName) { this.eventName = eventName; }
    private String accountCode;
    public String getAccountCode() { return accountCode; }
    public void setAccountCode(String accountCode) { this.accountCode = accountCode; }
    private String callerIDnum;
    public String getCallerIDnum() { return callerIDnum; }
    public void setCallerIDnum(String callerIDnum) { this.callerIDnum = callerIDnum; }
    private String callerIDname;
    public String getCallerIDname() { return callerIDname; }
    public void setCallerIDname(String callerIDname) { this.callerIDname = callerIDname; }
    private String callerIDani;
    public String getCallerIDani() { return callerIDani; }
    public void setCallerIDani(String callerIDani) { this.callerIDani = callerIDani; }
    private String callerIDrdnis;
    public String getCallerIDrdnis() { return callerIDrdnis; }
    public void setCallerIDrdnis(String callerIDrdnis) { this.callerIDrdnis = callerIDrdnis; }
    private String callerIDdnid;
    public String getCallerIDdnid() { return callerIDdnid; }
    public void setCallerIDdnid(String callerIDdnid) { this.callerIDdnid = callerIDdnid; }
    private String exten;
    public String getExten() { return exten; }
    public void setExten(String exten) { this.exten = exten; }
    private String context;
    public String getContext() { return context; }
    public void setContext(String context) { this.context = context; }
    private String application;
    public String getApplication() { return application; }
    public void setApplication(String application) { this.application = application; }
    private String appData;
    public String getAppData() { return appData; }
    public void setAppData(String appData) { this.appData = appData; }
    private LocalDateTime eventTime;
    public LocalDateTime getEventTime() { return eventTime; }
    public void setEventTime(LocalDateTime eventTime) { this.eventTime = eventTime; }
    private String amaFlags;
    public String getAmaFlags() { return amaFlags; }
    public void setAmaFlags(String amaFlags) { this.amaFlags = amaFlags; }
    private String uniqueID;
    public String getUniqueID() { return uniqueID; }
    public void setUniqueID(String uniqueID) { this.uniqueID = uniqueID; }
    private String linkedID;
    public String getLinkedID() { return linkedID; }
    public void setLinkedID(String linkedID) { this.linkedID = linkedID; }
    private String userField;
    public String getUserField() { return userField; }
    public void setUserField(String userField) { this.userField = userField; }
    private String peer;
    public String getPeer() { return peer; }
    public void setPeer(String peer) { this.peer = peer; }
    private String peerAccount;
    public String getPeerAccount() { return peerAccount; }
    public void setPeerAccount(String peerAccount) { this.peerAccount = peerAccount; }
    private String extra;
    public String getExtra() { return extra; }
    public void setExtra(String extra) { this.extra = extra; }
}
