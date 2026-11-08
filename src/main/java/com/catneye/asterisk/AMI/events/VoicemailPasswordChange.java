/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI VoicemailPasswordChange event. */
public class VoicemailPasswordChange extends SystemEvent implements Serializable {
    public VoicemailPasswordChange() { super.setEvent("VoicemailPasswordChange"); super.setUuid(UUID.randomUUID()); }
    private String context;
    public String getContext() { return context; }
    public void setContext(String context) { this.context = context; }
    private String mailbox;
    public String getMailbox() { return mailbox; }
    public void setMailbox(String mailbox) { this.mailbox = mailbox; }
    private String newPassword;
    public String getNewPassword() { return newPassword; }
    public void setNewPassword(String newPassword) { this.newPassword = newPassword; }
}
