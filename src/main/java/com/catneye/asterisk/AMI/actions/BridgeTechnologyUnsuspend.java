package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI BridgeTechnologyUnsuspend action. */
public class BridgeTechnologyUnsuspend implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="BridgeTechnologyUnsuspend";
 private String technology;
 public String getTechnology(){return technology;}
 public void setTechnology(String technology){this.technology=technology;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(technology!=null)m.append("Technology: ").append(technology).append("\r\n");
 return m.toString();}
}
