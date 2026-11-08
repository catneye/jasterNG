/*
 * jasterNG - Java interface for Asterisk
 *
 * Copyright (C) 2026 Kurchenko O.E. and OpenAI ChatGPT
 *
 * This file is part of jasterNG.
 *
 * jasterNG is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, version 2.
 *
 * jasterNG is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jasterNG. If not, see <https://www.gnu.org/licenses/>.
 *
 * Modified by Kurchenko O.E. and OpenAI ChatGPT 2026-11-08.
 */
/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI ResourceListDetail event. */
public class ResourceListDetail extends SystemEvent implements Serializable {
    public ResourceListDetail() { super.setEvent("ResourceListDetail"); super.setUuid(UUID.randomUUID()); }
    private String objectType;
    public String getObjectType() { return objectType; }
    public void setObjectType(String objectType) { this.objectType = objectType; }
    private String objectName;
    public String getObjectName() { return objectName; }
    public void setObjectName(String objectName) { this.objectName = objectName; }
    private String event;
    public String getEvent() { return event; }
    public void setEvent(String event) { this.event = event; }
    private Boolean fullState;
    public Boolean getFullState() { return fullState; }
    public void setFullState(Boolean fullState) { this.fullState = fullState; }
    private String listItem;
    public String getListItem() { return listItem; }
    public void setListItem(String listItem) { this.listItem = listItem; }
    private Integer notificationBatchInterval;
    public Integer getNotificationBatchInterval() { return notificationBatchInterval; }
    public void setNotificationBatchInterval(Integer notificationBatchInterval) { this.notificationBatchInterval = notificationBatchInterval; }
    private Boolean resourceDisplayName;
    public Boolean getResourceDisplayName() { return resourceDisplayName; }
    public void setResourceDisplayName(Boolean resourceDisplayName) { this.resourceDisplayName = resourceDisplayName; }
}
