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
/** AMI Monitor action. */
public class Monitor implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="Monitor";
 private String channel;
 public String getChannel(){return channel;}
 public void setChannel(String channel){this.channel=channel;}
 private String file;
 public String getFile(){return file;}
 public void setFile(String file){this.file=file;}
 private String format;
 public String getFormat(){return format;}
 public void setFormat(String format){this.format=format;}
 private Boolean mix;
 public Boolean getMix(){return mix;}
 public void setMix(Boolean mix){this.mix=mix;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(channel!=null)m.append("Channel: ").append(channel).append("\r\n");
 if(file!=null)m.append("File: ").append(file).append("\r\n");
 if(format!=null)m.append("Format: ").append(format).append("\r\n");
 if(mix!=null)m.append("Mix: ").append(mix).append("\r\n");
 return m.toString();}
}
