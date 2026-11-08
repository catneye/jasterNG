package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI PresenceStateList action. */
public class PresenceStateList implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="PresenceStateList";
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 return m.toString();}
}
