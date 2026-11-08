package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI QueueRemove action. */
public class QueueRemove implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="QueueRemove";
 private String queue;
 public String getQueue(){return queue;}
 public void setQueue(String queue){this.queue=queue;}
 private String queueInterface;
 public String getInterface(){return queueInterface;}
 public void setInterface(String queueInterface){this.queueInterface=queueInterface;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(queue!=null)m.append("Queue: ").append(queue).append("\r\n");
 if(queueInterface!=null)m.append("Interface: ").append(queueInterface).append("\r\n");
 return m.toString();}
}
