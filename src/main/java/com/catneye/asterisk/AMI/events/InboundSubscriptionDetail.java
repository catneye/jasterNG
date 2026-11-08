/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
import java.time.LocalDateTime;
/** AMI InboundSubscriptionDetail event. */
public class InboundSubscriptionDetail extends SystemEvent implements Serializable {
    public InboundSubscriptionDetail() { super.setEvent("InboundSubscriptionDetail"); super.setUuid(UUID.randomUUID()); }
    private String role;
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    private String endpoint;
    public String getEndpoint() { return endpoint; }
    public void setEndpoint(String endpoint) { this.endpoint = endpoint; }
    private String callid;
    public String getCallid() { return callid; }
    public void setCallid(String callid) { this.callid = callid; }
    private String state;
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    private String callerid;
    public String getCallerid() { return callerid; }
    public void setCallerid(String callerid) { this.callerid = callerid; }
    private String subscriptionType;
    public String getSubscriptionType() { return subscriptionType; }
    public void setSubscriptionType(String subscriptionType) { this.subscriptionType = subscriptionType; }
    private String extension;
    public String getExtension() { return extension; }
    public void setExtension(String extension) { this.extension = extension; }
    private String extensionStates;
    public String getExtensionStates() { return extensionStates; }
    public void setExtensionStates(String extensionStates) { this.extensionStates = extensionStates; }
    private String mailboxes;
    public String getMailboxes() { return mailboxes; }
    public void setMailboxes(String mailboxes) { this.mailboxes = mailboxes; }
}
