package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI JabberSend action. */
public class JabberSend implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="JabberSend";
 private String jabber;
 public String getJabber(){return jabber;}
 public void setJabber(String jabber){this.jabber=jabber;}
 private String screenName;
 public String getScreenName(){return screenName;}
 public void setScreenName(String screenName){this.screenName=screenName;}
 private String message;
 public String getMessage(){return message;}
 public void setMessage(String message){this.message=message;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(jabber!=null)m.append("Jabber: ").append(jabber).append("\r\n");
 if(screenName!=null)m.append("ScreenName: ").append(screenName).append("\r\n");
 if(message!=null)m.append("Message: ").append(message).append("\r\n");
 return m.toString();}
}
