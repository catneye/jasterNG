package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI QueueLog action. */
public class QueueLog implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="QueueLog";
 private String queuename;
 public String getQueuename(){return queuename;}
 public void setQueuename(String queuename){this.queuename=queuename;}
 private String event;
 public String getEvent(){return event;}
 public void setEvent(String event){this.event=event;}
 private String queueInterface;
 public String getInterface(){return queueInterface;}
 public void setInterface(String queueInterface){this.queueInterface=queueInterface;}
 private String uniqueid;
 public String getUniqueid(){return uniqueid;}
 public void setUniqueid(String uniqueid){this.uniqueid=uniqueid;}
 private String message;
 public String getMessage(){return message;}
 public void setMessage(String message){this.message=message;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(queuename!=null)m.append("Queue: ").append(queuename).append("\r\n");
 if(event!=null)m.append("Event: ").append(event).append("\r\n");
 if(queueInterface!=null)m.append("Interface: ").append(queueInterface).append("\r\n");
 if(uniqueid!=null)m.append("Uniqueid: ").append(uniqueid).append("\r\n");
 if(message!=null)m.append("Message: ").append(message).append("\r\n");
 return m.toString();}
}
