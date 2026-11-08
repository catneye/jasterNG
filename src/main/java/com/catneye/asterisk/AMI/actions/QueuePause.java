package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI QueuePause action. */
public class QueuePause implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="QueuePause";
 private String queueInterface;
 public String getInterface(){return queueInterface;}
 public void setInterface(String queueInterface){this.queueInterface=queueInterface;}
 private Boolean paused;
 public Boolean getPaused(){return paused;}
 public void setPaused(Boolean paused){this.paused=paused;}
 private String queue;
 public String getQueue(){return queue;}
 public void setQueue(String queue){this.queue=queue;}
 private String reason;
 public String getReason(){return reason;}
 public void setReason(String reason){this.reason=reason;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(queueInterface!=null)m.append("Interface: ").append(queueInterface).append("\r\n");
 if(paused!=null)m.append("Paused: ").append(paused).append("\r\n");
 if(queue!=null)m.append("Queue: ").append(queue).append("\r\n");
 if(reason!=null)m.append("Reason: ").append(reason).append("\r\n");
 return m.toString();}
}
