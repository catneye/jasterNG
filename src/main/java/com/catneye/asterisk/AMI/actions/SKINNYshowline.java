package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI SKINNYshowline action. */
public class SKINNYshowline implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="SKINNYshowline";
 private String line;
 public String getLine(){return line;}
 public void setLine(String line){this.line=line;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(line!=null)m.append("Line: ").append(line).append("\r\n");
 return m.toString();}
}
