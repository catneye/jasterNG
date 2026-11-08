/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.actions;

import java.util.UUID;

/** AMI QueuePenalty action. */
public class QueuePenalty implements Action {

    private final UUID uuid = UUID.randomUUID();
    private final String action = "QueuePenalty";

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

    private String queue;

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
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
        if (interface != null) {
            message.append("Interface: ").append(interface).append("\r\n");
        }
        if (penalty != null) {
            message.append("Penalty: ").append(penalty).append("\r\n");
        }
        if (queue != null) {
            message.append("Queue: ").append(queue).append("\r\n");
        }
        return message.toString();
    }
}
