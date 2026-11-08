package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI WaitEvent action. */
public class WaitEvent implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="WaitEvent";
 private Integer timeout;
 public Integer getTimeout(){return timeout;}
 public void setTimeout(Integer timeout){this.timeout=timeout;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(timeout!=null)m.append("Timeout: ").append(timeout).append("\r\n");
 return m.toString();}
}
