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
/** AMI LocalOptimizationEnd event. */
public class LocalOptimizationEnd extends SystemEvent implements Serializable {
    public LocalOptimizationEnd() { super.setEvent("LocalOptimizationEnd"); super.setUuid(UUID.randomUUID()); }
    private String localOneChannel;
    public String getLocalOneChannel() { return localOneChannel; }
    public void setLocalOneChannel(String localOneChannel) { this.localOneChannel = localOneChannel; }
    private String localOneUniqueid;
    public String getLocalOneUniqueid() { return localOneUniqueid; }
    public void setLocalOneUniqueid(String localOneUniqueid) { this.localOneUniqueid = localOneUniqueid; }
    private String localTwoChannel;
    public String getLocalTwoChannel() { return localTwoChannel; }
    public void setLocalTwoChannel(String localTwoChannel) { this.localTwoChannel = localTwoChannel; }
    private String localTwoUniqueid;
    public String getLocalTwoUniqueid() { return localTwoUniqueid; }
    public void setLocalTwoUniqueid(String localTwoUniqueid) { this.localTwoUniqueid = localTwoUniqueid; }
    private Boolean success;
    public Boolean getSuccess() { return success; }
    public void setSuccess(Boolean success) { this.success = success; }
    private Integer id;
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
}
