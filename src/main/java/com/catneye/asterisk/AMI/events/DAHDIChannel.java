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
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI DAHDIChannel event. */
public class DAHDIChannel extends ChannelEvent implements Serializable {
    public DAHDIChannel() { super.setEvent("DAHDIChannel"); super.setUuid(UUID.randomUUID()); }
    private String dahdiGroup;
    public String getDahdiGroup() { return dahdiGroup; }
    public void setDahdiGroup(String dahdiGroup) { this.dahdiGroup = dahdiGroup; }
    private Integer dahdiSpan;
    public Integer getDahdiSpan() { return dahdiSpan; }
    public void setDahdiSpan(Integer dahdiSpan) { this.dahdiSpan = dahdiSpan; }
    private Integer dahdiChannel;
    public Integer getDahdiChannel() { return dahdiChannel; }
    public void setDahdiChannel(Integer dahdiChannel) { this.dahdiChannel = dahdiChannel; }
}
