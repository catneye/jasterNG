package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI PJSIPShowEndpoint action. */
public class PJSIPShowEndpoint implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="PJSIPShowEndpoint";
 private String endpoint;
 public String getEndpoint(){return endpoint;}
 public void setEndpoint(String endpoint){this.endpoint=endpoint;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(endpoint!=null)m.append("Endpoint: ").append(endpoint).append("\r\n");
 return m.toString();}
}
