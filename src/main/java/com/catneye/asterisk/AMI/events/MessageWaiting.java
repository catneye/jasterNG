/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI MessageWaiting event. */
public class MessageWaiting extends ChannelEvent implements Serializable {
    public MessageWaiting() { super.setEvent("MessageWaiting"); super.setUuid(UUID.randomUUID()); }
    private String mailbox;
    public String getMailbox() { return mailbox; }
    public void setMailbox(String mailbox) { this.mailbox = mailbox; }
    private Boolean waiting;
    public Boolean getWaiting() { return waiting; }
    public void setWaiting(Boolean waiting) { this.waiting = waiting; }
    private Integer new;
    public Integer getNew() { return new; }
    public void setNew(Integer new) { this.new = new; }
    private Integer old;
    public Integer getOld() { return old; }
    public void setOld(Integer old) { this.old = old; }
}
