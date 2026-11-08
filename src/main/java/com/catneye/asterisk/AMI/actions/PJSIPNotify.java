package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI PJSIPNotify action. */
public class PJSIPNotify implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="PJSIPNotify";
 private String endpoint;
 public String getEndpoint(){return endpoint;}
 public void setEndpoint(String endpoint){this.endpoint=endpoint;}
 private String uri;
 public String getUri(){return uri;}
 public void setUri(String uri){this.uri=uri;}
 private String variable;
 public String getVariable(){return variable;}
 public void setVariable(String variable){this.variable=variable;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(endpoint!=null)m.append("Endpoint: ").append(endpoint).append("\r\n");
 if(uri!=null)m.append("URI: ").append(uri).append("\r\n");
 if(variable!=null)m.append("Variable: ").append(variable).append("\r\n");
 return m.toString();}
}
