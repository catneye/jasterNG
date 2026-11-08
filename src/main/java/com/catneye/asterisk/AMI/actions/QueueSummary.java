package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI QueueSummary action. */
public class QueueSummary implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="QueueSummary";
 private String queue;
 public String getQueue(){return queue;}
 public void setQueue(String queue){this.queue=queue;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(queue!=null)m.append("Queue: ").append(queue).append("\r\n");
 return m.toString();}
}
