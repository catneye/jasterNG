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
/** AMI PresenceStatus event. */
public class PresenceStatus extends SystemEvent implements Serializable {
    public PresenceStatus() { super.setEvent("PresenceStatus"); super.setUuid(UUID.randomUUID()); }
    private String presentity;
    public String getPresentity() { return presentity; }
    public void setPresentity(String presentity) { this.presentity = presentity; }
    private String status;
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    private String subtype;
    public String getSubtype() { return subtype; }
    public void setSubtype(String subtype) { this.subtype = subtype; }
    private String message;
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
