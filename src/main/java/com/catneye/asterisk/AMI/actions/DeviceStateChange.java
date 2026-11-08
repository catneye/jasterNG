package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI DeviceStateChange action. */
public class DeviceStateChange implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="DeviceStateChange";
 private String device;
 public String getDevice(){return device;}
 public void setDevice(String device){this.device=device;}
 private String state;
 public String getState(){return state;}
 public void setState(String state){this.state=state;}
 private Boolean cachable;
 public Boolean getCachable(){return cachable;}
 public void setCachable(Boolean cachable){this.cachable=cachable;}
 private String entityID;
 public String getEntityID(){return entityID;}
 public void setEntityID(String entityID){this.entityID=entityID;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(device!=null)m.append("Device: ").append(device).append("\r\n");
 if(state!=null)m.append("State: ").append(state).append("\r\n");
 if(cachable!=null)m.append("Cachable: ").append(cachable).append("\r\n");
 if(entityID!=null)m.append("EntityID: ").append(entityID).append("\r\n");
 return m.toString();}
}
