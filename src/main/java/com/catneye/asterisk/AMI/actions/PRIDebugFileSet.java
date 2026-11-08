package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI PRIDebugFileSet action. */
public class PRIDebugFileSet implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="PRIDebugFileSet";
 private String filename;
 public String getFilename(){return filename;}
 public void setFilename(String filename){this.filename=filename;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(filename!=null)m.append("Filename: ").append(filename).append("\r\n");
 return m.toString();}
}
