package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI MeetmeMute action. */
public class MeetmeMute implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="MeetmeMute";
 private String conference;
 public String getConference(){return conference;}
 public void setConference(String conference){this.conference=conference;}
 private String usernum;
 public String getUsernum(){return usernum;}
 public void setUsernum(String usernum){this.usernum=usernum;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(conference!=null)m.append("Conference: ").append(conference).append("\r\n");
 if(usernum!=null)m.append("Usernum: ").append(usernum).append("\r\n");
 return m.toString();}
}
