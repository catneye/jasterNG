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
/** AMI ControlPlayback action. */
public class ControlPlayback implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="ControlPlayback";
 private String channel;
 public String getChannel(){return channel;}
 public void setChannel(String channel){this.channel=channel;}
 private String control;
 public String getControl(){return control;}
 public void setControl(String control){this.control=control;}
 private Integer skipms;
 public Integer getSkipms(){return skipms;}
 public void setSkipms(Integer skipms){this.skipms=skipms;}
 private Integer forward;
 public Integer getForward(){return forward;}
 public void setForward(Integer forward){this.forward=forward;}
 private Integer rewind;
 public Integer getRewind(){return rewind;}
 public void setRewind(Integer rewind){this.rewind=rewind;}
 private Boolean pause;
 public Boolean getPause(){return pause;}
 public void setPause(Boolean pause){this.pause=pause;}
 private Boolean stop;
 public Boolean getStop(){return stop;}
 public void setStop(Boolean stop){this.stop=stop;}
 private Boolean restart;
 public Boolean getRestart(){return restart;}
 public void setRestart(Boolean restart){this.restart=restart;}
 private Integer start;
 public Integer getStart(){return start;}
 public void setStart(Integer start){this.start=start;}
 private Integer offset;
 public Integer getOffset(){return offset;}
 public void setOffset(Integer offset){this.offset=offset;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 m.append("Channel").append(": ").append(channel).append("\r\n");
 m.append("Control").append(": ").append(control).append("\r\n");
 m.append("Skipms").append(": ").append(skipms).append("\r\n");
 m.append("Forward").append(": ").append(forward).append("\r\n");
 m.append("Rewind").append(": ").append(rewind).append("\r\n");
 m.append("Pause").append(": ").append(pause).append("\r\n");
 m.append("Stop").append(": ").append(stop).append("\r\n");
 m.append("Restart").append(": ").append(restart).append("\r\n");
 m.append("Start").append(": ").append(start).append("\r\n");
 m.append("Offset").append(": ").append(offset).append("\r\n");
 return m.toString();}
}
