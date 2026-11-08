/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 * Modified by Kurchenko O.E. and OpenAI ChatGPT 2026-11-08.
 */
package com.catneye.asterisk.AMI.actions;

import java.util.UUID;

/** AMI Redirect action. */
public class Redirect implements Action {

    private final UUID uuid = UUID.randomUUID();
    private final String action = "Redirect";

    private String channel;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    private String extraChannel;

    public String getExtraChannel() {
        return extraChannel;
    }

    public void setExtraChannel(String extraChannel) {
        this.extraChannel = extraChannel;
    }

    private String exten;

    public String getExten() {
        return exten;
    }

    public void setExten(String exten) {
        this.exten = exten;
    }

    private String extraExten;

    public String getExtraExten() {
        return extraExten;
    }

    public void setExtraExten(String extraExten) {
        this.extraExten = extraExten;
    }

    private String context;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    private String extraContext;

    public String getExtraContext() {
        return extraContext;
    }

    public void setExtraContext(String extraContext) {
        this.extraContext = extraContext;
    }

    private Integer priority;

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    private Integer extraPriority;

    public Integer getExtraPriority() {
        return extraPriority;
    }

    public void setExtraPriority(Integer extraPriority) {
        this.extraPriority = extraPriority;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }

    @Override
    public String getAction() {
        return action;
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();
        message.append("Action: ").append(getAction()).append("\r\n");
        message.append("ActionID: ").append(getUuid()).append("\r\n");
        if (channel != null) {
            message.append("Channel: ").append(channel).append("\r\n");
        }
        if (extraChannel != null) {
            message.append("ExtraChannel: ").append(extraChannel).append("\r\n");
        }
        if (exten != null) {
            message.append("Exten: ").append(exten).append("\r\n");
        }
        if (extraExten != null) {
            message.append("ExtraExten: ").append(extraExten).append("\r\n");
        }
        if (context != null) {
            message.append("Context: ").append(context).append("\r\n");
        }
        if (extraContext != null) {
            message.append("ExtraContext: ").append(extraContext).append("\r\n");
        }
        if (priority != null) {
            message.append("Priority: ").append(priority).append("\r\n");
        }
        if (extraPriority != null) {
            message.append("ExtraPriority: ").append(extraPriority).append("\r\n");
        }
        return message.toString();
    }
}
