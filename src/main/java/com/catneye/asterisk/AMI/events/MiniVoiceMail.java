/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI MiniVoiceMail event. */
public class MiniVoiceMail extends ChannelEvent implements Serializable {
    public MiniVoiceMail() { super.setEvent("MiniVoiceMail"); super.setUuid(UUID.randomUUID()); }
    private String action;
    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }
    private String mailbox;
    public String getMailbox() { return mailbox; }
    public void setMailbox(String mailbox) { this.mailbox = mailbox; }
    private Integer counter;
    public Integer getCounter() { return counter; }
    public void setCounter(Integer counter) { this.counter = counter; }
}
