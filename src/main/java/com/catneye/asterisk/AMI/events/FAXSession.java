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
/** AMI FAXSession event. */
public class FAXSession extends SystemEvent implements Serializable {
    public FAXSession() { super.setEvent("FAXSession"); super.setUuid(UUID.randomUUID()); }
    private String actionID;
    public String getActionID() { return actionID; }
    public void setActionID(String actionID) { this.actionID = actionID; }
    private Integer sessionNumber;
    public Integer getSessionNumber() { return sessionNumber; }
    public void setSessionNumber(Integer sessionNumber) { this.sessionNumber = sessionNumber; }
    private String operation;
    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }
    private String state;
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    private String errorCorrectionMode;
    public String getErrorCorrectionMode() { return errorCorrectionMode; }
    public void setErrorCorrectionMode(String errorCorrectionMode) { this.errorCorrectionMode = errorCorrectionMode; }
    private Integer dataRate;
    public Integer getDataRate() { return dataRate; }
    public void setDataRate(Integer dataRate) { this.dataRate = dataRate; }
    private String imageResolution;
    public String getImageResolution() { return imageResolution; }
    public void setImageResolution(String imageResolution) { this.imageResolution = imageResolution; }
    private Integer pageNumber;
    public Integer getPageNumber() { return pageNumber; }
    public void setPageNumber(Integer pageNumber) { this.pageNumber = pageNumber; }
    private String fileName;
    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }
    private Integer pagesTransmitted;
    public Integer getPagesTransmitted() { return pagesTransmitted; }
    public void setPagesTransmitted(Integer pagesTransmitted) { this.pagesTransmitted = pagesTransmitted; }
    private Integer pagesReceived;
    public Integer getPagesReceived() { return pagesReceived; }
    public void setPagesReceived(Integer pagesReceived) { this.pagesReceived = pagesReceived; }
    private Integer totalBadLines;
    public Integer getTotalBadLines() { return totalBadLines; }
    public void setTotalBadLines(Integer totalBadLines) { this.totalBadLines = totalBadLines; }
}
