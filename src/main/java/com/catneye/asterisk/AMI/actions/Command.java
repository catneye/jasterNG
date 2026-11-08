package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI Command action. */
public class Command implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="Command";
 private String command;
 public String getCommand(){return command;}
 public void setCommand(String command){this.command=command;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(command!=null)m.append("Command: ").append(command).append("\r\n");
 return m.toString();}
}
