package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI ShowDialPlan action. */
public class ShowDialPlan implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="ShowDialPlan";
 private String extension;
 public String getExtension(){return extension;}
 public void setExtension(String extension){this.extension=extension;}
 private String context;
 public String getContext(){return context;}
 public void setContext(String context){this.context=context;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(extension!=null)m.append("Extension: ").append(extension).append("\r\n");
 if(context!=null)m.append("Context: ").append(context).append("\r\n");
 return m.toString();}
}
