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
package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI MailboxStateChange action. */
public class MailboxStateChange implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="MailboxStateChange";
 private String mailbox;
 public String getMailbox(){return mailbox;}
 public void setMailbox(String mailbox){this.mailbox=mailbox;}
 private Integer newMessages;
 public Integer getNewMessages(){return newMessages;}
 public void setNewMessages(Integer newMessages){this.newMessages=newMessages;}
 private Integer oldMessages;
 public Integer getOldMessages(){return oldMessages;}
 public void setOldMessages(Integer oldMessages){this.oldMessages=oldMessages;}
 private String entityID;
 public String getEntityID(){return entityID;}
 public void setEntityID(String entityID){this.entityID=entityID;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 m.append("Mailbox: ").append(mailbox).append("\r\n");
 m.append("NewMessages: ").append(newMessages).append("\r\n");
 m.append("OldMessages: ").append(oldMessages).append("\r\n");
 m.append("EntityID: ").append(entityID).append("\r\n");
 return m.toString();}
}
