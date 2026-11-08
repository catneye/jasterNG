/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI Rename event. */
public class Rename extends ChannelEvent implements Serializable {
    public Rename() { super.setEvent("Rename"); super.setUuid(UUID.randomUUID()); }
    private String newname;
    public String getNewname() { return newname; }
    public void setNewname(String newname) { this.newname = newname; }
}
