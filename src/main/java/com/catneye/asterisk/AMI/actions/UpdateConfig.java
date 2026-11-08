package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI UpdateConfig action. */
public class UpdateConfig implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="UpdateConfig";
 private String srcFilename;
 public String getSrcFilename(){return srcFilename;}
 public void setSrcFilename(String srcFilename){this.srcFilename=srcFilename;}
 private String dstFilename;
 public String getDstFilename(){return dstFilename;}
 public void setDstFilename(String dstFilename){this.dstFilename=dstFilename;}
 private String action;
 public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 private String category;
 public String getCategory(){return category;}
 public void setCategory(String category){this.category=category;}
 private String variable;
 public String getVariable(){return variable;}
 public void setVariable(String variable){this.variable=variable;}
 private String value;
 public String getValue(){return value;}
 public void setValue(String value){this.value=value;}
 private String match;
 public String getMatch(){return match;}
 public void setMatch(String match){this.match=match;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(srcFilename!=null)m.append("SrcFilename: ").append(srcFilename).append("\r\n");
 if(dstFilename!=null)m.append("DstFilename: ").append(dstFilename).append("\r\n");
 if(action!=null)m.append("Action: ").append(action).append("\r\n");
 if(category!=null)m.append("Category: ").append(category).append("\r\n");
 if(variable!=null)m.append("Variable: ").append(variable).append("\r\n");
 if(value!=null)m.append("Value: ").append(value).append("\r\n");
 if(match!=null)m.append("Match: ").append(match).append("\r\n");
 return m.toString();}
}
