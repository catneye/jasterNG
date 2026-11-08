package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI MWIUpdate action. */
public class MWIUpdate implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="MWIUpdate";
 private String mailbox;
 public String getMailbox(){return mailbox;}
 public void setMailbox(String mailbox){this.mailbox=mailbox;}
 private Integer newMessages;
 public Integer getNewMessages(){return newMessages;}
 public void setNewMessages(Integer newMessages){this.newMessages=newMessages;}
 private Integer oldMessages;
 public Integer getOldMessages(){return oldMessages;}
 public void setOldMessages(Integer oldMessages){this.oldMessages=oldMessages;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(mailbox!=null)m.append("Mailbox: ").append(mailbox).append("\r\n");
 if(newMessages!=null)m.append("NewMessages: ").append(newMessages).append("\r\n");
 if(oldMessages!=null)m.append("OldMessages: ").append(oldMessages).append("\r\n");
 return m.toString();}
}
