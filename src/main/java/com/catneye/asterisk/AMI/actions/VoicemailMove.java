package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI VoicemailMove action. */
public class VoicemailMove implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="VoicemailMove";
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
 private String destinationFolder;
 public String getDestinationFolder(){return destinationFolder;}
 public void setDestinationFolder(String destinationFolder){this.destinationFolder=destinationFolder;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(context!=null)m.append("Context: ").append(context).append("\r\n");
 if(mailbox!=null)m.append("Mailbox: ").append(mailbox).append("\r\n");
 if(folder!=null)m.append("Folder: ").append(folder).append("\r\n");
 if(messages!=null)m.append("Messages: ").append(messages).append("\r\n");
 if(destinationFolder!=null)m.append("DestinationFolder: ").append(destinationFolder).append("\r\n");
 return m.toString();}
}
