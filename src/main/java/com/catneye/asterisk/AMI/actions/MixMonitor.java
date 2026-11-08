package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI MixMonitor action. */
public class MixMonitor implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="MixMonitor";
 private String channel;
 public String getChannel(){return channel;}
 public void setChannel(String channel){this.channel=channel;}
 private String file;
 public String getFile(){return file;}
 public void setFile(String file){this.file=file;}
 private String options;
 public String getOptions(){return options;}
 public void setOptions(String options){this.options=options;}
 private String command;
 public String getCommand(){return command;}
 public void setCommand(String command){this.command=command;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(channel!=null)m.append("Channel: ").append(channel).append("\r\n");
 if(file!=null)m.append("File: ").append(file).append("\r\n");
 if(options!=null)m.append("Options: ").append(options).append("\r\n");
 if(command!=null)m.append("Command: ").append(command).append("\r\n");
 return m.toString();}
}
