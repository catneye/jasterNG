package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI GetConfig action. */
public class GetConfig implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="GetConfig";
 private String filename;
 public String getFilename(){return filename;}
 public void setFilename(String filename){this.filename=filename;}
 private String category;
 public String getCategory(){return category;}
 public void setCategory(String category){this.category=category;}
 private String filter;
 public String getFilter(){return filter;}
 public void setFilter(String filter){this.filter=filter;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(filename!=null)m.append("Filename: ").append(filename).append("\r\n");
 if(category!=null)m.append("Category: ").append(category).append("\r\n");
 if(filter!=null)m.append("Filter: ").append(filter).append("\r\n");
 return m.toString();}
}
