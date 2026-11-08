/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI MWIGetComplete event. */
public class MWIGetComplete extends SystemEvent implements Serializable {
    public MWIGetComplete() { super.setEvent("MWIGetComplete"); super.setUuid(UUID.randomUUID()); }
    private String actionID;
    public String getActionID() { return actionID; }
    public void setActionID(String actionID) { this.actionID = actionID; }
    private String eventList;
    public String getEventList() { return eventList; }
    public void setEventList(String eventList) { this.eventList = eventList; }
    private Integer listItems;
    public Integer getListItems() { return listItems; }
    public void setListItems(Integer listItems) { this.listItems = listItems; }
}
