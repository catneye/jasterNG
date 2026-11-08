package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI Events action. */
public class Events implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="Events";
 private String eventMask;
 public String getEventMask(){return eventMask;}
 public void setEventMask(String eventMask){this.eventMask=eventMask;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(eventMask!=null)m.append("EventMask: ").append(eventMask).append("\r\n");
 return m.toString();}
}
