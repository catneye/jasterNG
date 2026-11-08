/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.actions;

/** AMI QueuePenalty action. */
public class QueuePenalty extends AbstractAction {

    public QueuePenalty() {
        super("QueuePenalty");
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

    private String queue;

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    @Override
    public String toString() {
        StringBuilder message = startMessage();
        appendField(message, "Interface", interface);
        appendField(message, "Penalty", penalty);
        appendField(message, "Queue", queue);
        return message.toString();
    }
}
