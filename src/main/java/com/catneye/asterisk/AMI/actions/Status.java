package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI Status action. */
public class Status implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="Status";
 private String channel;
 public String getChannel(){return channel;}
 public void setChannel(String channel){this.channel=channel;}
 private String variables;
 public String getVariables(){return variables;}
 public void setVariables(String variables){this.variables=variables;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(channel!=null)m.append("Channel: ").append(channel).append("\r\n");
 if(variables!=null)m.append("Variables: ").append(variables).append("\r\n");
 return m.toString();}
}
