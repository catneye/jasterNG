package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI BridgeDestroy action. */
public class BridgeDestroy implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="BridgeDestroy";
 private String bridgeUniqueid;
 public String getBridgeUniqueid(){return bridgeUniqueid;}
 public void setBridgeUniqueid(String bridgeUniqueid){this.bridgeUniqueid=bridgeUniqueid;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(bridgeUniqueid!=null)m.append("BridgeUniqueid: ").append(bridgeUniqueid).append("\r\n");
 return m.toString();}
}
