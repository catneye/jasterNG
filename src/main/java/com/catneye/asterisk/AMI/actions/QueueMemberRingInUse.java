package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI QueueMemberRingInUse action. */
public class QueueMemberRingInUse implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="QueueMemberRingInUse";
 private String interface;
 public String getInterface(){return interface;}
 public void setInterface(String interface){this.interface=interface;}
 private Boolean ringinuse;
 public Boolean getRinginuse(){return ringinuse;}
 public void setRinginuse(Boolean ringinuse){this.ringinuse=ringinuse;}
 private String queue;
 public String getQueue(){return queue;}
 public void setQueue(String queue){this.queue=queue;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(interface!=null)m.append("Interface: ").append(interface).append("\r\n");
 if(ringinuse!=null)m.append("Ringinuse: ").append(ringinuse).append("\r\n");
 if(queue!=null)m.append("Queue: ").append(queue).append("\r\n");
 return m.toString();}
}
