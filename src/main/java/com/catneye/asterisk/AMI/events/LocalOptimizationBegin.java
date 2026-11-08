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
/** AMI LocalOptimizationBegin event. */
public class LocalOptimizationBegin extends SystemEvent implements Serializable {
    public LocalOptimizationBegin() { super.setEvent("LocalOptimizationBegin"); super.setUuid(UUID.randomUUID()); }
    private String localOneChannel;
    public String getLocalOneChannel() { return localOneChannel; }
    public void setLocalOneChannel(String localOneChannel) { this.localOneChannel = localOneChannel; }
    private Integer localOneChannelState;
    public Integer getLocalOneChannelState() { return localOneChannelState; }
    public void setLocalOneChannelState(Integer localOneChannelState) { this.localOneChannelState = localOneChannelState; }
    private String localOneChannelStateDesc;
    public String getLocalOneChannelStateDesc() { return localOneChannelStateDesc; }
    public void setLocalOneChannelStateDesc(String localOneChannelStateDesc) { this.localOneChannelStateDesc = localOneChannelStateDesc; }
    private String localOneCallerIDNum;
    public String getLocalOneCallerIDNum() { return localOneCallerIDNum; }
    public void setLocalOneCallerIDNum(String localOneCallerIDNum) { this.localOneCallerIDNum = localOneCallerIDNum; }
    private String localOneCallerIDName;
    public String getLocalOneCallerIDName() { return localOneCallerIDName; }
    public void setLocalOneCallerIDName(String localOneCallerIDName) { this.localOneCallerIDName = localOneCallerIDName; }
    private String localOneConnectedLineNum;
    public String getLocalOneConnectedLineNum() { return localOneConnectedLineNum; }
    public void setLocalOneConnectedLineNum(String localOneConnectedLineNum) { this.localOneConnectedLineNum = localOneConnectedLineNum; }
    private String localOneConnectedLineName;
    public String getLocalOneConnectedLineName() { return localOneConnectedLineName; }
    public void setLocalOneConnectedLineName(String localOneConnectedLineName) { this.localOneConnectedLineName = localOneConnectedLineName; }
    private String localOneLanguage;
    public String getLocalOneLanguage() { return localOneLanguage; }
    public void setLocalOneLanguage(String localOneLanguage) { this.localOneLanguage = localOneLanguage; }
    private String localOneAccountCode;
    public String getLocalOneAccountCode() { return localOneAccountCode; }
    public void setLocalOneAccountCode(String localOneAccountCode) { this.localOneAccountCode = localOneAccountCode; }
    private String localOneContext;
    public String getLocalOneContext() { return localOneContext; }
    public void setLocalOneContext(String localOneContext) { this.localOneContext = localOneContext; }
    private String localOneExten;
    public String getLocalOneExten() { return localOneExten; }
    public void setLocalOneExten(String localOneExten) { this.localOneExten = localOneExten; }
    private String localOnePriority;
    public String getLocalOnePriority() { return localOnePriority; }
    public void setLocalOnePriority(String localOnePriority) { this.localOnePriority = localOnePriority; }
    private String localOneUniqueid;
    public String getLocalOneUniqueid() { return localOneUniqueid; }
    public void setLocalOneUniqueid(String localOneUniqueid) { this.localOneUniqueid = localOneUniqueid; }
    private String localOneLinkedid;
    public String getLocalOneLinkedid() { return localOneLinkedid; }
    public void setLocalOneLinkedid(String localOneLinkedid) { this.localOneLinkedid = localOneLinkedid; }
    private String localTwoChannel;
    public String getLocalTwoChannel() { return localTwoChannel; }
    public void setLocalTwoChannel(String localTwoChannel) { this.localTwoChannel = localTwoChannel; }
    private Integer localTwoChannelState;
    public Integer getLocalTwoChannelState() { return localTwoChannelState; }
    public void setLocalTwoChannelState(Integer localTwoChannelState) { this.localTwoChannelState = localTwoChannelState; }
    private String localTwoChannelStateDesc;
    public String getLocalTwoChannelStateDesc() { return localTwoChannelStateDesc; }
    public void setLocalTwoChannelStateDesc(String localTwoChannelStateDesc) { this.localTwoChannelStateDesc = localTwoChannelStateDesc; }
    private String localTwoCallerIDNum;
    public String getLocalTwoCallerIDNum() { return localTwoCallerIDNum; }
    public void setLocalTwoCallerIDNum(String localTwoCallerIDNum) { this.localTwoCallerIDNum = localTwoCallerIDNum; }
    private String localTwoCallerIDName;
    public String getLocalTwoCallerIDName() { return localTwoCallerIDName; }
    public void setLocalTwoCallerIDName(String localTwoCallerIDName) { this.localTwoCallerIDName = localTwoCallerIDName; }
    private String localTwoConnectedLineNum;
    public String getLocalTwoConnectedLineNum() { return localTwoConnectedLineNum; }
    public void setLocalTwoConnectedLineNum(String localTwoConnectedLineNum) { this.localTwoConnectedLineNum = localTwoConnectedLineNum; }
    private String localTwoConnectedLineName;
    public String getLocalTwoConnectedLineName() { return localTwoConnectedLineName; }
    public void setLocalTwoConnectedLineName(String localTwoConnectedLineName) { this.localTwoConnectedLineName = localTwoConnectedLineName; }
    private String localTwoLanguage;
    public String getLocalTwoLanguage() { return localTwoLanguage; }
    public void setLocalTwoLanguage(String localTwoLanguage) { this.localTwoLanguage = localTwoLanguage; }
    private String localTwoAccountCode;
    public String getLocalTwoAccountCode() { return localTwoAccountCode; }
    public void setLocalTwoAccountCode(String localTwoAccountCode) { this.localTwoAccountCode = localTwoAccountCode; }
    private String localTwoContext;
    public String getLocalTwoContext() { return localTwoContext; }
    public void setLocalTwoContext(String localTwoContext) { this.localTwoContext = localTwoContext; }
    private String localTwoExten;
    public String getLocalTwoExten() { return localTwoExten; }
    public void setLocalTwoExten(String localTwoExten) { this.localTwoExten = localTwoExten; }
    private String localTwoPriority;
    public String getLocalTwoPriority() { return localTwoPriority; }
    public void setLocalTwoPriority(String localTwoPriority) { this.localTwoPriority = localTwoPriority; }
    private String localTwoUniqueid;
    public String getLocalTwoUniqueid() { return localTwoUniqueid; }
    public void setLocalTwoUniqueid(String localTwoUniqueid) { this.localTwoUniqueid = localTwoUniqueid; }
    private String localTwoLinkedid;
    public String getLocalTwoLinkedid() { return localTwoLinkedid; }
    public void setLocalTwoLinkedid(String localTwoLinkedid) { this.localTwoLinkedid = localTwoLinkedid; }
    private String sourceChannel;
    public String getSourceChannel() { return sourceChannel; }
    public void setSourceChannel(String sourceChannel) { this.sourceChannel = sourceChannel; }
    private Integer sourceChannelState;
    public Integer getSourceChannelState() { return sourceChannelState; }
    public void setSourceChannelState(Integer sourceChannelState) { this.sourceChannelState = sourceChannelState; }
    private String sourceChannelStateDesc;
    public String getSourceChannelStateDesc() { return sourceChannelStateDesc; }
    public void setSourceChannelStateDesc(String sourceChannelStateDesc) { this.sourceChannelStateDesc = sourceChannelStateDesc; }
    private String sourceCallerIDNum;
    public String getSourceCallerIDNum() { return sourceCallerIDNum; }
    public void setSourceCallerIDNum(String sourceCallerIDNum) { this.sourceCallerIDNum = sourceCallerIDNum; }
    private String sourceCallerIDName;
    public String getSourceCallerIDName() { return sourceCallerIDName; }
    public void setSourceCallerIDName(String sourceCallerIDName) { this.sourceCallerIDName = sourceCallerIDName; }
    private String sourceConnectedLineNum;
    public String getSourceConnectedLineNum() { return sourceConnectedLineNum; }
    public void setSourceConnectedLineNum(String sourceConnectedLineNum) { this.sourceConnectedLineNum = sourceConnectedLineNum; }
    private String sourceConnectedLineName;
    public String getSourceConnectedLineName() { return sourceConnectedLineName; }
    public void setSourceConnectedLineName(String sourceConnectedLineName) { this.sourceConnectedLineName = sourceConnectedLineName; }
    private String sourceLanguage;
    public String getSourceLanguage() { return sourceLanguage; }
    public void setSourceLanguage(String sourceLanguage) { this.sourceLanguage = sourceLanguage; }
    private String sourceAccountCode;
    public String getSourceAccountCode() { return sourceAccountCode; }
    public void setSourceAccountCode(String sourceAccountCode) { this.sourceAccountCode = sourceAccountCode; }
    private String sourceContext;
    public String getSourceContext() { return sourceContext; }
    public void setSourceContext(String sourceContext) { this.sourceContext = sourceContext; }
    private String sourceExten;
    public String getSourceExten() { return sourceExten; }
    public void setSourceExten(String sourceExten) { this.sourceExten = sourceExten; }
    private String sourcePriority;
    public String getSourcePriority() { return sourcePriority; }
    public void setSourcePriority(String sourcePriority) { this.sourcePriority = sourcePriority; }
    private String sourceUniqueid;
    public String getSourceUniqueid() { return sourceUniqueid; }
    public void setSourceUniqueid(String sourceUniqueid) { this.sourceUniqueid = sourceUniqueid; }
    private String sourceLinkedid;
    public String getSourceLinkedid() { return sourceLinkedid; }
    public void setSourceLinkedid(String sourceLinkedid) { this.sourceLinkedid = sourceLinkedid; }
    private String destUniqueId;
    public String getDestUniqueId() { return destUniqueId; }
    public void setDestUniqueId(String destUniqueId) { this.destUniqueId = destUniqueId; }
    private Integer id;
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
}
