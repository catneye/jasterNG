package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI PJSIPSetMaintenance action. */
public class PJSIPSetMaintenance implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="PJSIPSetMaintenance";
 private String endpoint;
 public String getEndpoint(){return endpoint;}
 public void setEndpoint(String endpoint){this.endpoint=endpoint;}
 private Boolean maintenance;
 public Boolean getMaintenance(){return maintenance;}
 public void setMaintenance(Boolean maintenance){this.maintenance=maintenance;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(endpoint!=null)m.append("Endpoint: ").append(endpoint).append("\r\n");
 if(maintenance!=null)m.append("Maintenance: ").append(maintenance).append("\r\n");
 return m.toString();}
}
