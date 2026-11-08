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
/** AMI PresenceState action. */
public class PresenceState implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="PresenceState";
 private String provider;
 public String getProvider(){return provider;}
 public void setProvider(String provider){this.provider=provider;}
 private String state;
 public String getState(){return state;}
 public void setState(String state){this.state=state;}
 private String subtype;
 public String getSubtype(){return subtype;}
 public void setSubtype(String subtype){this.subtype=subtype;}
 private String message;
 public String getMessage(){return message;}
 public void setMessage(String message){this.message=message;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(provider!=null)m.append("Provider: ").append(provider).append("\r\n");
 if(state!=null)m.append("State: ").append(state).append("\r\n");
 if(subtype!=null)m.append("Subtype: ").append(subtype).append("\r\n");
 if(message!=null)m.append("Message: ").append(message).append("\r\n");
 return m.toString();}
}
