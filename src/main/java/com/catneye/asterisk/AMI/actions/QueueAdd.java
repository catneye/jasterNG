/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.actions;

/** AMI QueueAdd action. */
public class QueueAdd extends AbstractAction {

    public QueueAdd() {
        super("QueueAdd");
    }

    private String queue;

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    private String interface;

    public String getInterface() {
        return interface;
    }

    public void setInterface(String interface) {
        this.interface = interface;
    }

    private Integer penalty;

    public Integer getPenalty() {
        return penalty;
    }

    public void setPenalty(Integer penalty) {
        this.penalty = penalty;
    }

    private Boolean paused;

    public Boolean getPaused() {
        return paused;
    }

    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    private String memberName;

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    private String stateInterface;

    public String getStateInterface() {
        return stateInterface;
    }

    public void setStateInterface(String stateInterface) {
        this.stateInterface = stateInterface;
    }

    @Override
    public String toString() {
        StringBuilder message = startMessage();
        appendField(message, "Queue", queue);
        appendField(message, "Interface", interface);
        appendField(message, "Penalty", penalty);
        appendField(message, "Paused", paused);
        appendField(message, "Reason", reason);
        appendField(message, "MemberName", memberName);
        appendField(message, "StateInterface", stateInterface);
        return message.toString();
    }
}
