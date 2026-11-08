package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI Park action. */
public class Park implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="Park";
 private String channel;
 public String getChannel(){return channel;}
 public void setChannel(String channel){this.channel=channel;}
 private Integer timeout;
 public Integer getTimeout(){return timeout;}
 public void setTimeout(Integer timeout){this.timeout=timeout;}
 private String parkingLot;
 public String getParkingLot(){return parkingLot;}
 public void setParkingLot(String parkingLot){this.parkingLot=parkingLot;}
 private String announce;
 public String getAnnounce(){return announce;}
 public void setAnnounce(String announce){this.announce=announce;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(channel!=null)m.append("Channel: ").append(channel).append("\r\n");
 if(timeout!=null)m.append("Timeout: ").append(timeout).append("\r\n");
 if(parkingLot!=null)m.append("ParkingLot: ").append(parkingLot).append("\r\n");
 if(announce!=null)m.append("Announce: ").append(announce).append("\r\n");
 return m.toString();}
}
