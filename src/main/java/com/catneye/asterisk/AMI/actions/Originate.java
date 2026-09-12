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
package com.catneye.asterisk.AMI.actions;

import java.util.UUID;

/**
 *
 * @author Kurchenko O.E.
 */
public class Originate implements Action {

    private UUID uuid = UUID.randomUUID();
    private String action = "Originate";

    private String channel;
    private String exten;
    private String context;
    private Integer priority;
    private String application;
    private String data;
    private Integer timeout;
    private String callerId;
    private String variable;
    private String account;
    private Boolean earlyMedia;
    private Boolean async;
    private String codecs;
    private String channelId;
    private String otherChannelId;
    private String preDialGoSub;

    /*
        ActionID - ActionID for this transaction. Will be returned.
        Channel - Channel name to call.
        Exten - Extension to use (requires 'Context' and 'Priority')
        Context - Context to use (requires 'Exten' and 'Priority')
        Priority - Priority to use (requires 'Exten' and 'Context')
        Application - Application to execute.
        Data - Data to use (requires 'Application').
        Timeout - How long to wait for call to be answered (in ms.).
        CallerID - Caller ID to be set on the outgoing channel.
        Variable - Channel variable to set, multiple Variable: headers are allowed.
        Account - Account code.
        EarlyMedia - Set to 'true' to force call bridge on early media..
        Async - Set to 'true' for fast origination.
        Codecs - Comma-separated list of codecs to use for this call.
        ChannelId - Channel UniqueId to be set on the channel.
        OtherChannelId - Channel UniqueId to be set on the second local channel.
        PreDialGoSub - PreDialGoSub Context,Extension,Priority to set options/headers needed before start the outgoing extension
     */
    public Originate(String channel, String exten, String context, Integer priority, String callerid, String channelId) {
        this.channel = channel;
        this.exten = exten;
        this.context = context;
        this.priority = priority;
        this.callerId = callerid;
        this.channelId = channelId;
    }

    public Originate(String channel, String exten, String context, Integer priority, String callerid) {
        this.channel = channel;
        this.exten = exten;
        this.context = context;
        this.priority = priority;
        this.callerId = callerid;
    }

    public Originate(String channel, String exten, String context, Integer priority) {
        this.channel = channel;
        this.exten = exten;
        this.context = context;
        this.priority = priority;

    }

    public Originate(String channel, String application, String data) {
        this.channel = channel;
        this.application = application;
        this.data = data;
    }

    public Originate(String channel, String application, String data, String callerid, String channelId) {
        this.channel = channel;
        this.application = application;
        this.data = data;
        this.callerId = callerid;
        this.channelId = channelId;
    }

    @Override
    public String toString() {
        String ret = "Action: " + getAction() + "\r\n"
                + "ActionID: " + getUuid().toString() + "\r\n"
                + ((channel != null) ? "Channel: " + channel + "\r\n" : "")
                + ((exten != null) ? "Exten: " + exten + "\r\n" : "")
                + ((context != null) ? "Context: " + context + "\r\n" : "")
                + ((priority != null) ? "Priority: " + priority + "\r\n" : "")
                + ((application != null) ? "Application: " + application + "\r\n" : "")
                + ((data != null) ? "Data: " + data + "\r\n" : "")
                + ((timeout != null) ? "Timeout: " + timeout + "\r\n" : "")
                + ((callerId != null) ? "CallerId: " + callerId + "\r\n" : "")
                + ((variable != null) ? "Variable: " + variable + "\r\n" : "")
                + ((account != null) ? "Account: " + account + "\r\n" : "")
                + ((earlyMedia != null) ? "EarlyMedia: " + earlyMedia + "\r\n" : "")
                + ((async != null) ? "Async: " + async + "\r\n" : "")
                + ((codecs != null) ? "Codecs: " + codecs + "\r\n" : "")
                + ((channelId != null) ? "ChannelId: " + channelId + "\r\n" : "")
                + ((otherChannelId != null) ? "OtherChannelId: " + otherChannelId + "\r\n" : "")
                + ((preDialGoSub != null) ? "PreDialGoSub: " + preDialGoSub + "\r\n" : "");
        return ret;
    }

    /**
     * @return the uuid
     */
    @Override
    public UUID getUuid() {
        return uuid;
    }

    /**
     * @return the action
     */
    @Override
    public String getAction() {
        return action;
    }

    /**
     * @param uuid the uuid to set
     */
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    /**
     * @param action the action to set
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return the channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel the channel to set
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * @return the exten
     */
    public String getExten() {
        return exten;
    }

    /**
     * @param exten the exten to set
     */
    public void setExten(String exten) {
        this.exten = exten;
    }

    /**
     * @return the context
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context the context to set
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * @return the priority
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * @return the application
     */
    public String getApplication() {
        return application;
    }

    /**
     * @param application the application to set
     */
    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * @param timeout the timeout to set
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * @return the callerId
     */
    public String getCallerId() {
        return callerId;
    }

    /**
     * @param callerId the callerId to set
     */
    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    /**
     * @return the variable
     */
    public String getVariable() {
        return variable;
    }

    /**
     * @param variable the variable to set
     */
    public void setVariable(String variable) {
        this.variable = variable;
    }

    /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return the earlyMedia
     */
    public Boolean getEarlyMedia() {
        return earlyMedia;
    }

    /**
     * @param earlyMedia the earlyMedia to set
     */
    public void setEarlyMedia(Boolean earlyMedia) {
        this.earlyMedia = earlyMedia;
    }

    /**
     * @return the async
     */
    public Boolean getAsync() {
        return async;
    }

    /**
     * @param async the async to set
     */
    public void setAsync(Boolean async) {
        this.async = async;
    }

    /**
     * @return the codecs
     */
    public String getCodecs() {
        return codecs;
    }

    /**
     * @param codecs the codecs to set
     */
    public void setCodecs(String codecs) {
        this.codecs = codecs;
    }

    /**
     * @return the channelId
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * @param channelId the channelId to set
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * @return the otherChannelId
     */
    public String getOtherChannelId() {
        return otherChannelId;
    }

    /**
     * @param otherChannelId the otherChannelId to set
     */
    public void setOtherChannelId(String otherChannelId) {
        this.otherChannelId = otherChannelId;
    }

    /**
     * @return the preDialGoSub
     */
    public String getPreDialGoSub() {
        return preDialGoSub;
    }

    /**
     * @param preDialGoSub the preDialGoSub to set
     */
    public void setPreDialGoSub(String preDialGoSub) {
        this.preDialGoSub = preDialGoSub;
    }

}
