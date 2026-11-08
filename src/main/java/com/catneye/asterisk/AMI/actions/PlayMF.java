package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI PlayMF action. */
public class PlayMF implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="PlayMF";
 private String channel;
 public String getChannel(){return channel;}
 public void setChannel(String channel){this.channel=channel;}
 private String digit;
 public String getDigit(){return digit;}
 public void setDigit(String digit){this.digit=digit;}
 private Integer duration;
 public Integer getDuration(){return duration;}
 public void setDuration(Integer duration){this.duration=duration;}
 private Integer between;
 public Integer getBetween(){return between;}
 public void setBetween(Integer between){this.between=between;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(channel!=null)m.append("Channel: ").append(channel).append("\r\n");
 if(digit!=null)m.append("Digit: ").append(digit).append("\r\n");
 if(duration!=null)m.append("Duration: ").append(duration).append("\r\n");
 if(between!=null)m.append("Between: ").append(between).append("\r\n");
 return m.toString();}
}
