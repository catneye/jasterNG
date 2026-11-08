package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI DAHDIDialOffhook action. */
public class DAHDIDialOffhook implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="DAHDIDialOffhook";
 private String channel;
 public String getChannel(){return channel;}
 public void setChannel(String channel){this.channel=channel;}
 private String number;
 public String getNumber(){return number;}
 public void setNumber(String number){this.number=number;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(channel!=null)m.append("Channel: ").append(channel).append("\r\n");
 if(number!=null)m.append("Number: ").append(number).append("\r\n");
 return m.toString();}
}
