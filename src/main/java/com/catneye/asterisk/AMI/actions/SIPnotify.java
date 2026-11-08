package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI SIPnotify action. */
public class SIPnotify implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="SIPnotify";
 private String peer;
 public String getPeer(){return peer;}
 public void setPeer(String peer){this.peer=peer;}
 private String message;
 public String getMessage(){return message;}
 public void setMessage(String message){this.message=message;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(peer!=null)m.append("Peer: ").append(peer).append("\r\n");
 if(message!=null)m.append("Message: ").append(message).append("\r\n");
 return m.toString();}
}
