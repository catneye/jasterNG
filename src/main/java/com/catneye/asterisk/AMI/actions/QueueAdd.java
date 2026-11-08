/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.actions;

import java.util.UUID;

/** AMI QueueAdd action. */
public class QueueAdd implements Action {

    private final UUID uuid = UUID.randomUUID();
    private final String action = "QueueAdd";

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
        if (queue != null) {
            message.append("Queue: ").append(queue).append("\r\n");
        }
        if (interface != null) {
            message.append("Interface: ").append(interface).append("\r\n");
        }
        if (penalty != null) {
            message.append("Penalty: ").append(penalty).append("\r\n");
        }
        if (paused != null) {
            message.append("Paused: ").append(paused).append("\r\n");
        }
        if (reason != null) {
            message.append("Reason: ").append(reason).append("\r\n");
        }
        if (memberName != null) {
            message.append("MemberName: ").append(memberName).append("\r\n");
        }
        if (stateInterface != null) {
            message.append("StateInterface: ").append(stateInterface).append("\r\n");
        }
        return message.toString();
    }
}
