package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI ParkedCalls action. */
public class ParkedCalls implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="ParkedCalls";
 private String parkingLot;
 public String getParkingLot(){return parkingLot;}
 public void setParkingLot(String parkingLot){this.parkingLot=parkingLot;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(parkingLot!=null)m.append("ParkingLot: ").append(parkingLot).append("\r\n");
 return m.toString();}
}
