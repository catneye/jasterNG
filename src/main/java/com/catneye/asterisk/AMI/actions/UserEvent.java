package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI UserEvent action. */
public class UserEvent implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="UserEvent";
 private String event;
 public String getEvent(){return event;}
 public void setEvent(String event){this.event=event;}
 private String header;
 public String getHeader(){return header;}
 public void setHeader(String header){this.header=header;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(event!=null)m.append("UserEvent: ").append(event).append("\r\n");
 if(header!=null)m.append("Header: ").append(header).append("\r\n");
 return m.toString();}
}
