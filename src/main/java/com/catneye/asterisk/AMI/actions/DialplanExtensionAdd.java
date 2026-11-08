package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI DialplanExtensionAdd action. */
public class DialplanExtensionAdd implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="DialplanExtensionAdd";
 private String context;
 public String getContext(){return context;}
 public void setContext(String context){this.context=context;}
 private String extension;
 public String getExtension(){return extension;}
 public void setExtension(String extension){this.extension=extension;}
 private Integer priority;
 public Integer getPriority(){return priority;}
 public void setPriority(Integer priority){this.priority=priority;}
 private String application;
 public String getApplication(){return application;}
 public void setApplication(String application){this.application=application;}
 private String appData;
 public String getAppData(){return appData;}
 public void setAppData(String appData){this.appData=appData;}
 private Boolean replace;
 public Boolean getReplace(){return replace;}
 public void setReplace(Boolean replace){this.replace=replace;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(context!=null)m.append("Context: ").append(context).append("\r\n");
 if(extension!=null)m.append("Extension: ").append(extension).append("\r\n");
 if(priority!=null)m.append("Priority: ").append(priority).append("\r\n");
 if(application!=null)m.append("Application: ").append(application).append("\r\n");
 if(appData!=null)m.append("ApplicationData: ").append(appData).append("\r\n");
 if(replace!=null)m.append("Replace: ").append(replace).append("\r\n");
 return m.toString();}
}
