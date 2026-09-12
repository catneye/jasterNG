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

/**
 *
 * @author Kurchenko O.E.
 */
public class SystemEvent extends Event {
    
    private String privilege;
    private String systemName;
    private Integer sequenceNumber;
    private String file;
    private Integer line;
    private String func;
    /**
     * @return the privilege
     */
    public String getPrivilege() {
        return privilege;
    }

    /**
     * @param privilege the privilege to set
     */
    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    /**
     * @return the systemName
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * @param systemName the systemName to set
     */
    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    /**
     * @return the sequenceNumber
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * @param sequenceNumber the sequenceNumber to set
     */
    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * @return the file
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(String file) {
        this.file = file;
    }

    /**
     * @return the line
     */
    public Integer getLine() {
        return line;
    }

    /**
     * @param line the line to set
     */
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * @return the func
     */
    public String getFunc() {
        return func;
    }

    /**
     * @param func the func to set
     */
    public void setFunc(String func) {
        this.func = func;
    }
}
