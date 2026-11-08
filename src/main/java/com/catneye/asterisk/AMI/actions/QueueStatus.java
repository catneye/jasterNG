package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI QueueStatus action. */
public class QueueStatus implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="QueueStatus";
 private String queue;
 public String getQueue(){return queue;}
 public void setQueue(String queue){this.queue=queue;}
 private String member;
 public String getMember(){return member;}
 public void setMember(String member){this.member=member;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(queue!=null)m.append("Queue: ").append(queue).append("\r\n");
 if(member!=null)m.append("Member: ").append(member).append("\r\n");
 return m.toString();}
}
