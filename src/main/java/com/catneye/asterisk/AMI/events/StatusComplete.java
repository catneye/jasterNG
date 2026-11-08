/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI StatusComplete event. */
public class StatusComplete extends SystemEvent implements Serializable {
    public StatusComplete() { super.setEvent("StatusComplete"); super.setUuid(UUID.randomUUID()); }
    private Integer items;
    public Integer getItems() { return items; }
    public void setItems(Integer items) { this.items = items; }
}
