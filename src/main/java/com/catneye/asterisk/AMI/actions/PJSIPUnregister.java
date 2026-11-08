package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI PJSIPUnregister action. */
public class PJSIPUnregister implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="PJSIPUnregister";
 private String registration;
 public String getRegistration(){return registration;}
 public void setRegistration(String registration){this.registration=registration;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(registration!=null)m.append("Registration: ").append(registration).append("\r\n");
 return m.toString();}
}
