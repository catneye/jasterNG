package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI MeetmeList action. */
public class MeetmeList implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="MeetmeList";
 private String conference;
 public String getConference(){return conference;}
 public void setConference(String conference){this.conference=conference;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(conference!=null)m.append("Conference: ").append(conference).append("\r\n");
 return m.toString();}
}
