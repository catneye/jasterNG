/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI MWIGet event. */
public class MWIGet extends SystemEvent implements Serializable {
    public MWIGet() { super.setEvent("MWIGet"); super.setUuid(UUID.randomUUID()); }
    private String actionID;
    public String getActionID() { return actionID; }
    public void setActionID(String actionID) { this.actionID = actionID; }
    private String mailbox;
    public String getMailbox() { return mailbox; }
    public void setMailbox(String mailbox) { this.mailbox = mailbox; }
    private Integer oldMessages;
    public Integer getOldMessages() { return oldMessages; }
    public void setOldMessages(Integer oldMessages) { this.oldMessages = oldMessages; }
    private Integer newMessages;
    public Integer getNewMessages() { return newMessages; }
    public void setNewMessages(Integer newMessages) { this.newMessages = newMessages; }
}
