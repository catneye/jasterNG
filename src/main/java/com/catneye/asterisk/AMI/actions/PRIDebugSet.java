package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI PRIDebugSet action. */
public class PRIDebugSet implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="PRIDebugSet";
 private Integer span;
 public Integer getSpan(){return span;}
 public void setSpan(Integer span){this.span=span;}
 private String level;
 public String getLevel(){return level;}
 public void setLevel(String level){this.level=level;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(span!=null)m.append("Span: ").append(span).append("\r\n");
 if(level!=null)m.append("Level: ").append(level).append("\r\n");
 return m.toString();}
}
