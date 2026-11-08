package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI SorceryMemoryCacheExpire action. */
public class SorceryMemoryCacheExpire implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="SorceryMemoryCacheExpire";
 private String cache;
 public String getCache(){return cache;}
 public void setCache(String cache){this.cache=cache;}
 private String object;
 public String getObject(){return object;}
 public void setObject(String object){this.object=object;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(cache!=null)m.append("Cache: ").append(cache).append("\r\n");
 if(object!=null)m.append("Object: ").append(object).append("\r\n");
 return m.toString();}
}
