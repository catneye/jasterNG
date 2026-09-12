/*
 * jasterNG - Java interface for Asterisk
 *
 * Copyright (C) 2026 Kurchenko O.E.
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
 * Modified by Kurchenko O.E. 2026-09-12.
 */
package com.catneye.asterisk.AMI.events.base;

import java.time.LocalDateTime;

/**
 *
 * @author Kurchenko O.E.
 */
public class SecurityEvent extends SystemEvent {
    
    private LocalDateTime eventTV;
    private String severity;
    private String service;
    private Integer eventVersion;
    private String accountID;
    private String sessionID;
    private String localAddress;
    private String remoteAddress;

    /**
     * @return the eventTV
     */
    public LocalDateTime getEventTV() {
        return eventTV;
    }

    /**
     * @param eventTV the eventTV to set
     */
    public void setEventTV(LocalDateTime eventTV) {
        this.eventTV = eventTV;
    }

    /**
     * @return the severity
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * @param severity the severity to set
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * @return the service
     */
    public String getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * @return the eventVersion
     */
    public Integer getEventVersion() {
        return eventVersion;
    }

    /**
     * @param eventVersion the eventVersion to set
     */
    public void setEventVersion(Integer eventVersion) {
        this.eventVersion = eventVersion;
    }

    /**
     * @return the accountID
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * @param accountID the accountID to set
     */
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    /**
     * @return the sessionID
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * @param sessionID the sessionID to set
     */
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    /**
     * @return the localAddress
     */
    public String getLocalAddress() {
        return localAddress;
    }

    /**
     * @param localAddress the localAddress to set
     */
    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    /**
     * @return the remoteAddress
     */
    public String getRemoteAddress() {
        return remoteAddress;
    }

    /**
     * @param remoteAddress the remoteAddress to set
     */
    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }
}
