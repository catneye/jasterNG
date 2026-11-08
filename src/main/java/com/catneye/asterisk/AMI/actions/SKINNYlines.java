package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI SKINNYlines action. */
public class SKINNYlines implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="SKINNYlines";
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 return m.toString();}
}
