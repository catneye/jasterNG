package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI VoicemailBoxSummary action. */
public class VoicemailBoxSummary implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="VoicemailBoxSummary";
 private String context;
 public String getContext(){return context;}
 public void setContext(String context){this.context=context;}
 private String mailbox;
 public String getMailbox(){return mailbox;}
 public void setMailbox(String mailbox){this.mailbox=mailbox;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(context!=null)m.append("Context: ").append(context).append("\r\n");
 if(mailbox!=null)m.append("Mailbox: ").append(mailbox).append("\r\n");
 return m.toString();}
}
