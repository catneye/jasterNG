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

import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 * AMI AgentLogoff event.
 *
 * @author Kurchenko O.E.
 */
public class AgentLogoff extends ChannelEvent implements Serializable {

    private String agent;
    private Integer logintime;

    public AgentLogoff() {
        super.setEvent("AgentLogoff");
        super.setUuid(UUID.randomUUID());
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public Integer getLogintime() {
        return logintime;
    }

    public void setLogintime(Integer logintime) {
        this.logintime = logintime;
    }

}
