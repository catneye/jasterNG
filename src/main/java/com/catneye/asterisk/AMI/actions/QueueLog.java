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
/** AMI QueueLog action. */
public class QueueLog implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="QueueLog";
 private String queuename;
 public String getQueuename(){return queuename;}
 public void setQueuename(String queuename){this.queuename=queuename;}
 private String event;
 public String getEvent(){return event;}
 public void setEvent(String event){this.event=event;}
 private String queueInterface;
 public String getInterface(){return queueInterface;}
 public void setInterface(String queueInterface){this.queueInterface=queueInterface;}
 private String uniqueid;
 public String getUniqueid(){return uniqueid;}
 public void setUniqueid(String uniqueid){this.uniqueid=uniqueid;}
 private String message;
 public String getMessage(){return message;}
 public void setMessage(String message){this.message=message;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 m.append("Queue: ").append(queuename).append("\r\n");
 m.append("Event: ").append(event).append("\r\n");
 m.append("Interface: ").append(queueInterface).append("\r\n");
 m.append("Uniqueid: ").append(uniqueid).append("\r\n");
 m.append("Message: ").append(message).append("\r\n");
 return m.toString();}
}
