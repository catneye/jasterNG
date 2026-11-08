package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI Challenge action. */
public class Challenge implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="Challenge";
 private String authType;
 public String getAuthType(){return authType;}
 public void setAuthType(String authType){this.authType=authType;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(authType!=null)m.append("AuthType: ").append(authType).append("\r\n");
 return m.toString();}
}
