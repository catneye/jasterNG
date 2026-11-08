package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI AGI action. */
public class AGI implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="AGI";
 private String channel;
 public String getChannel(){return channel;}
 public void setChannel(String channel){this.channel=channel;}
 private String command;
 public String getCommand(){return command;}
 public void setCommand(String command){this.command=command;}
 private String commandID;
 public String getCommandID(){return commandID;}
 public void setCommandID(String commandID){this.commandID=commandID;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){
 StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(channel!=null)m.append("Channel: ").append(channel).append("\r\n");
 if(command!=null)m.append("Command: ").append(command).append("\r\n");
 if(commandID!=null)m.append("CommandID: ").append(commandID).append("\r\n");
 return m.toString();
 }
}
