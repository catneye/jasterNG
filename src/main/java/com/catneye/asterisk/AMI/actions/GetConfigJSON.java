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
/** AMI GetConfigJSON action. */
public class GetConfigJSON implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="GetConfigJSON";
 private String filename;
 public String getFilename(){return filename;}
 public void setFilename(String filename){this.filename=filename;}
 private String category;
 public String getCategory(){return category;}
 public void setCategory(String category){this.category=category;}
 private String filter;
 public String getFilter(){return filter;}
 public void setFilter(String filter){this.filter=filter;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 m.append("Filename: ").append(filename).append("\r\n");
 m.append("Category: ").append(category).append("\r\n");
 m.append("Filter: ").append(filter).append("\r\n");
 return m.toString();}
}
