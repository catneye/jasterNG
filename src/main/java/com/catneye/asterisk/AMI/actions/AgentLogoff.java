package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI AgentLogoff action. */
public class AgentLogoff implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="AgentLogoff";
 private String agent;
 public String getAgent(){return agent;}
 public void setAgent(String agent){this.agent=agent;}
 private Boolean soft;
 public Boolean getSoft(){return soft;}
 public void setSoft(Boolean soft){this.soft=soft;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(agent!=null)m.append("Agent: ").append(agent).append("\r\n");
 if(soft!=null)m.append("Soft: ").append(soft).append("\r\n");
 return m.toString();}
}
