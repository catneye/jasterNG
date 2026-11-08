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
/** AMI MessageSend action. */
public class MessageSend implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="MessageSend";
 private String to;
 public String getTo(){return to;}
 public void setTo(String to){this.to=to;}
 private String from;
 public String getFrom(){return from;}
 public void setFrom(String from){this.from=from;}
 private String body;
 public String getBody(){return body;}
 public void setBody(String body){this.body=body;}
 private String base64body;
 public String getBase64body(){return base64body;}
 public void setBase64body(String base64body){this.base64body=base64body;}
 private String variables;
 public String getVariables(){return variables;}
 public void setVariables(String variables){this.variables=variables;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(to!=null)m.append("To: ").append(to).append("\r\n");
 if(from!=null)m.append("From: ").append(from).append("\r\n");
 if(body!=null)m.append("Body: ").append(body).append("\r\n");
 if(base64body!=null)m.append("Base64Body: ").append(base64body).append("\r\n");
 if(variables!=null)m.append("Variable: ").append(variables).append("\r\n");
 return m.toString();}
}
