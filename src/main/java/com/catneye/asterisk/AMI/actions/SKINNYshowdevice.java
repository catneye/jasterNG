package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI SKINNYshowdevice action. */
public class SKINNYshowdevice implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="SKINNYshowdevice";
 private String device;
 public String getDevice(){return device;}
 public void setDevice(String device){this.device=device;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(device!=null)m.append("Device: ").append(device).append("\r\n");
 return m.toString();}
}
