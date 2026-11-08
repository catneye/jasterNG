package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI MixMonitorMute action. */
public class MixMonitorMute implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="MixMonitorMute";
 private String channel;
 public String getChannel(){return channel;}
 public void setChannel(String channel){this.channel=channel;}
 private String direction;
 public String getDirection(){return direction;}
 public void setDirection(String direction){this.direction=direction;}
 private Boolean state;
 public Boolean getState(){return state;}
 public void setState(Boolean state){this.state=state;}
 private String mixMonitorID;
 public String getMixMonitorID(){return mixMonitorID;}
 public void setMixMonitorID(String mixMonitorID){this.mixMonitorID=mixMonitorID;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(channel!=null)m.append("Channel: ").append(channel).append("\r\n");
 if(direction!=null)m.append("Direction: ").append(direction).append("\r\n");
 if(state!=null)m.append("State: ").append(state).append("\r\n");
 if(mixMonitorID!=null)m.append("MixMonitorID: ").append(mixMonitorID).append("\r\n");
 return m.toString();}
}
