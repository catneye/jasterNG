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
/** AMI Bridge action. */
public class Bridge implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="Bridge";
 private String channel1;
 public String getChannel1(){return channel1;}
 public void setChannel1(String channel1){this.channel1=channel1;}
 private String channel2;
 public String getChannel2(){return channel2;}
 public void setChannel2(String channel2){this.channel2=channel2;}
 private String tone;
 public String getTone(){return tone;}
 public void setTone(String tone){this.tone=tone;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(channel1!=null)m.append("Channel1: ").append(channel1).append("\r\n");
 if(channel2!=null)m.append("Channel2: ").append(channel2).append("\r\n");
 if(tone!=null)m.append("Tone: ").append(tone).append("\r\n");
 return m.toString();}
}
