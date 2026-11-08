/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI FAXSessionsComplete event. */
public class FAXSessionsComplete extends SystemEvent implements Serializable {
    public FAXSessionsComplete() { super.setEvent("FAXSessionsComplete"); super.setUuid(UUID.randomUUID()); }
    private String actionID;
    public String getActionID() { return actionID; }
    public void setActionID(String actionID) { this.actionID = actionID; }
    private Integer total;
    public Integer getTotal() { return total; }
    public void setTotal(Integer total) { this.total = total; }
}
