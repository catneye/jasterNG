package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI MuteAudio action. */
public class MuteAudio implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="MuteAudio";
 private String channel;
 public String getChannel(){return channel;}
 public void setChannel(String channel){this.channel=channel;}
 private String direction;
 public String getDirection(){return direction;}
 public void setDirection(String direction){this.direction=direction;}
 private Boolean state;
 public Boolean getState(){return state;}
 public void setState(Boolean state){this.state=state;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(channel!=null)m.append("Channel: ").append(channel).append("\r\n");
 if(direction!=null)m.append("Direction: ").append(direction).append("\r\n");
 if(state!=null)m.append("State: ").append(state).append("\r\n");
 return m.toString();}
}
