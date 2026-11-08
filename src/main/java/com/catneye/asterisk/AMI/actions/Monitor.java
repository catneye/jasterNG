package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI Monitor action. */
public class Monitor implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="Monitor";
 private String channel;
 public String getChannel(){return channel;}
 public void setChannel(String channel){this.channel=channel;}
 private String file;
 public String getFile(){return file;}
 public void setFile(String file){this.file=file;}
 private String format;
 public String getFormat(){return format;}
 public void setFormat(String format){this.format=format;}
 private Boolean mix;
 public Boolean getMix(){return mix;}
 public void setMix(Boolean mix){this.mix=mix;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(channel!=null)m.append("Channel: ").append(channel).append("\r\n");
 if(file!=null)m.append("File: ").append(file).append("\r\n");
 if(format!=null)m.append("Format: ").append(format).append("\r\n");
 if(mix!=null)m.append("Mix: ").append(mix).append("\r\n");
 return m.toString();}
}
