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
/** AMI FAXStats event. */
public class FAXStats extends SystemEvent implements Serializable {
    public FAXStats() { super.setEvent("FAXStats"); super.setUuid(UUID.randomUUID()); }
    private String actionID;
    public String getActionID() { return actionID; }
    public void setActionID(String actionID) { this.actionID = actionID; }
    private Integer currentSessions;
    public Integer getCurrentSessions() { return currentSessions; }
    public void setCurrentSessions(Integer currentSessions) { this.currentSessions = currentSessions; }
    private Integer reservedSessions;
    public Integer getReservedSessions() { return reservedSessions; }
    public void setReservedSessions(Integer reservedSessions) { this.reservedSessions = reservedSessions; }
    private Integer transmitAttempts;
    public Integer getTransmitAttempts() { return transmitAttempts; }
    public void setTransmitAttempts(Integer transmitAttempts) { this.transmitAttempts = transmitAttempts; }
    private Integer receiveAttempts;
    public Integer getReceiveAttempts() { return receiveAttempts; }
    public void setReceiveAttempts(Integer receiveAttempts) { this.receiveAttempts = receiveAttempts; }
    private Integer completedFAXes;
    public Integer getCompletedFAXes() { return completedFAXes; }
    public void setCompletedFAXes(Integer completedFAXes) { this.completedFAXes = completedFAXes; }
    private Integer failedFAXes;
    public Integer getFailedFAXes() { return failedFAXes; }
    public void setFailedFAXes(Integer failedFAXes) { this.failedFAXes = failedFAXes; }
}
