package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI ModuleCheck action. */
public class ModuleCheck implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="ModuleCheck";
 private String module;
 public String getModule(){return module;}
 public void setModule(String module){this.module=module;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(module!=null)m.append("Module: ").append(module).append("\r\n");
 return m.toString();}
}
