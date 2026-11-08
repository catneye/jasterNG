/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.actions;

/** AMI Redirect action. */
public class Redirect extends AbstractAction {

    public Redirect() {
        super("Redirect");
    }

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
    public String toString() {
        StringBuilder message = startMessage();
        appendField(message, "Channel", channel);
        appendField(message, "ExtraChannel", extraChannel);
        appendField(message, "Exten", exten);
        appendField(message, "ExtraExten", extraExten);
        appendField(message, "Context", context);
        appendField(message, "ExtraContext", extraContext);
        appendField(message, "Priority", priority);
        appendField(message, "ExtraPriority", extraPriority);
        return message.toString();
    }
}
