package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI Atxfer action. */
public class Atxfer implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="Atxfer";
 private String channel;
 public String getChannel(){return channel;}
 public void setChannel(String channel){this.channel=channel;}
 private String exten;
 public String getExten(){return exten;}
 public void setExten(String exten){this.exten=exten;}
 private String context;
 public String getContext(){return context;}
 public void setContext(String context){this.context=context;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){
 StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(channel!=null)m.append("Channel: ").append(channel).append("\r\n");
 if(exten!=null)m.append("Exten: ").append(exten).append("\r\n");
 if(context!=null)m.append("Context: ").append(context).append("\r\n");
 return m.toString();
 }
}
