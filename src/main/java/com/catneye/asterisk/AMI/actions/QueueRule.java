package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI QueueRule action. */
public class QueueRule implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="QueueRule";
 private String rule;
 public String getRule(){return rule;}
 public void setRule(String rule){this.rule=rule;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(rule!=null)m.append("Rule: ").append(rule).append("\r\n");
 return m.toString();}
}
