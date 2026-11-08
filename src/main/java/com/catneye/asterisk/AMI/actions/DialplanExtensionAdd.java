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
/** AMI DialplanExtensionAdd action. */
public class DialplanExtensionAdd implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="DialplanExtensionAdd";
 private String context;
 public String getContext(){return context;}
 public void setContext(String context){this.context=context;}
 private String extension;
 public String getExtension(){return extension;}
 public void setExtension(String extension){this.extension=extension;}
 private Integer priority;
 public Integer getPriority(){return priority;}
 public void setPriority(Integer priority){this.priority=priority;}
 private String application;
 public String getApplication(){return application;}
 public void setApplication(String application){this.application=application;}
 private String appData;
 public String getAppData(){return appData;}
 public void setAppData(String appData){this.appData=appData;}
 private Boolean replace;
 public Boolean getReplace(){return replace;}
 public void setReplace(Boolean replace){this.replace=replace;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 m.append("Context: ").append(context).append("\r\n");
 m.append("Extension: ").append(extension).append("\r\n");
 m.append("Priority: ").append(priority).append("\r\n");
 m.append("Application: ").append(application).append("\r\n");
 m.append("ApplicationData: ").append(appData).append("\r\n");
 m.append("Replace: ").append(replace).append("\r\n");
 return m.toString();}
}
