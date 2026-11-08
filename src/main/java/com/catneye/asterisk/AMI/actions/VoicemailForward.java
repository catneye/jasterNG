package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI VoicemailForward action. */
public class VoicemailForward implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="VoicemailForward";
 private String context;
 public String getContext(){return context;}
 public void setContext(String context){this.context=context;}
 private String mailbox;
 public String getMailbox(){return mailbox;}
 public void setMailbox(String mailbox){this.mailbox=mailbox;}
 private String folder;
 public String getFolder(){return folder;}
 public void setFolder(String folder){this.folder=folder;}
 private String messages;
 public String getMessages(){return messages;}
 public void setMessages(String messages){this.messages=messages;}
 private String destinationContext;
 public String getDestinationContext(){return destinationContext;}
 public void setDestinationContext(String destinationContext){this.destinationContext=destinationContext;}
 private String destinationMailbox;
 public String getDestinationMailbox(){return destinationMailbox;}
 public void setDestinationMailbox(String destinationMailbox){this.destinationMailbox=destinationMailbox;}
 private Boolean delete;
 public Boolean getDelete(){return delete;}
 public void setDelete(Boolean delete){this.delete=delete;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(context!=null)m.append("Context: ").append(context).append("\r\n");
 if(mailbox!=null)m.append("Mailbox: ").append(mailbox).append("\r\n");
 if(folder!=null)m.append("Folder: ").append(folder).append("\r\n");
 if(messages!=null)m.append("Messages: ").append(messages).append("\r\n");
 if(destinationContext!=null)m.append("DestinationContext: ").append(destinationContext).append("\r\n");
 if(destinationMailbox!=null)m.append("DestinationMailbox: ").append(destinationMailbox).append("\r\n");
 if(delete!=null)m.append("Delete: ").append(delete).append("\r\n");
 return m.toString();}
}
