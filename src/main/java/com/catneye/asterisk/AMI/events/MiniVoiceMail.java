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
/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI MiniVoiceMail event. */
public class MiniVoiceMail extends ChannelEvent implements Serializable {
    public MiniVoiceMail() { super.setEvent("MiniVoiceMail"); super.setUuid(UUID.randomUUID()); }
    private String action;
    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }
    private String mailbox;
    public String getMailbox() { return mailbox; }
    public void setMailbox(String mailbox) { this.mailbox = mailbox; }
    private Integer counter;
    public Integer getCounter() { return counter; }
    public void setCounter(Integer counter) { this.counter = counter; }
}
