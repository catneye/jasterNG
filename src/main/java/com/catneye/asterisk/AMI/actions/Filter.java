package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI Filter action. */
public class Filter implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="Filter";
 private String operation;
 public String getOperation(){return operation;}
 public void setOperation(String operation){this.operation=operation;}
 private String filter;
 public String getFilter(){return filter;}
 public void setFilter(String filter){this.filter=filter;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(operation!=null)m.append("Operation: ").append(operation).append("\r\n");
 if(filter!=null)m.append("Filter: ").append(filter).append("\r\n");
 return m.toString();}
}
