package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI QueueChangePriorityCaller action. */
public class QueueChangePriorityCaller implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="QueueChangePriorityCaller";
 private String queue;
 public String getQueue(){return queue;}
 public void setQueue(String queue){this.queue=queue;}
 private String channel;
 public String getChannel(){return channel;}
 public void setChannel(String channel){this.channel=channel;}
 private Integer priority;
 public Integer getPriority(){return priority;}
 public void setPriority(Integer priority){this.priority=priority;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(queue!=null)m.append("Queue: ").append(queue).append("\r\n");
 if(channel!=null)m.append("Channel: ").append(channel).append("\r\n");
 if(priority!=null)m.append("Priority: ").append(priority).append("\r\n");
 return m.toString();}
}
