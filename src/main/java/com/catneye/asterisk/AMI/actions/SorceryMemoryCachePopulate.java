package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI SorceryMemoryCachePopulate action. */
public class SorceryMemoryCachePopulate implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="SorceryMemoryCachePopulate";
 private String cache;
 public String getCache(){return cache;}
 public void setCache(String cache){this.cache=cache;}
 private String objectType;
 public String getObjectType(){return objectType;}
 public void setObjectType(String objectType){this.objectType=objectType;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(cache!=null)m.append("Cache: ").append(cache).append("\r\n");
 if(objectType!=null)m.append("ObjectType: ").append(objectType).append("\r\n");
 return m.toString();}
}
