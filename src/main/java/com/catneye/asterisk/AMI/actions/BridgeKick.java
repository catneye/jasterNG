package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI BridgeKick action. */
public class BridgeKick implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="BridgeKick";
 private String bridgeUniqueid;
 public String getBridgeUniqueid(){return bridgeUniqueid;}
 public void setBridgeUniqueid(String bridgeUniqueid){this.bridgeUniqueid=bridgeUniqueid;}
 private String channel;
 public String getChannel(){return channel;}
 public void setChannel(String channel){this.channel=channel;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(bridgeUniqueid!=null)m.append("BridgeUniqueid: ").append(bridgeUniqueid).append("\r\n");
 if(channel!=null)m.append("Channel: ").append(channel).append("\r\n");
 return m.toString();}
}
