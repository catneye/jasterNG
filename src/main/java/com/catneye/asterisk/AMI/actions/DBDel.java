package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI DBDel action. */
public class DBDel implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="DBDel";
 private String family;
 public String getFamily(){return family;}
 public void setFamily(String family){this.family=family;}
 private String key;
 public String getKey(){return key;}
 public void setKey(String key){this.key=key;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(family!=null)m.append("Family: ").append(family).append("\r\n");
 if(key!=null)m.append("Key: ").append(key).append("\r\n");
 return m.toString();}
}
