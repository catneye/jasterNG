package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI QueueReload action. */
public class QueueReload implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="QueueReload";
 private String queue;
 public String getQueue(){return queue;}
 public void setQueue(String queue){this.queue=queue;}
 private String members;
 public String getMembers(){return members;}
 public void setMembers(String members){this.members=members;}
 private String rules;
 public String getRules(){return rules;}
 public void setRules(String rules){this.rules=rules;}
 private String parameters;
 public String getParameters(){return parameters;}
 public void setParameters(String parameters){this.parameters=parameters;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(queue!=null)m.append("Queue: ").append(queue).append("\r\n");
 if(members!=null)m.append("Members: ").append(members).append("\r\n");
 if(rules!=null)m.append("Rules: ").append(rules).append("\r\n");
 if(parameters!=null)m.append("Parameters: ").append(parameters).append("\r\n");
 return m.toString();}
}
