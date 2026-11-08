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
 * Modified by Kurchenko O.E. and OpenAI ChatGPT 2026-11-08.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.AgentEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 * AMI AgentDump event.
 *
 * @author Kurchenko O.E.
 */
public class AgentDump extends AgentEvent implements Serializable {

    private String queue;
    private String memberName;
    private String interfaze;

    public AgentDump() {
        super.setEvent("AgentDump");
        super.setUuid(UUID.randomUUID());
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getInterfaze() {
        return interfaze;
    }

    public void setInterfaze(String interfaze) {
        this.interfaze = interfaze;
    }

}
