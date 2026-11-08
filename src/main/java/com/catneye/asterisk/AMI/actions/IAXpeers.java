package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI IAXpeers action. */
public class IAXpeers implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="IAXpeers";
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 return m.toString();}
}
