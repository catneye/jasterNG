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
/*
 * jasterNG - Java queueInterface for Asterisk
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

    private String queueInterface;

    public String getInterface() {
        return queueInterface;
    }

    public void setInterface(String queueInterface) {
        this.queueInterface = queueInterface;
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
        message.append("Interface: ").append(queueInterface).append("\r\n");
        message.append("Penalty: ").append(penalty).append("\r\n");
        message.append("Queue: ").append(queue).append("\r\n");
        return message.toString();
    }
}
