package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI ConfbridgeRecord action. */
public class ConfbridgeRecord implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="ConfbridgeRecord";
 private String conference;
 public String getConference(){return conference;}
 public void setConference(String conference){this.conference=conference;}
 private String recordFile;
 public String getRecordFile(){return recordFile;}
 public void setRecordFile(String recordFile){this.recordFile=recordFile;}
 private String recordFileFormat;
 public String getRecordFileFormat(){return recordFileFormat;}
 public void setRecordFileFormat(String recordFileFormat){this.recordFileFormat=recordFileFormat;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(conference!=null)m.append("Conference: ").append(conference).append("\r\n");
 if(recordFile!=null)m.append("RecordFile: ").append(recordFile).append("\r\n");
 if(recordFileFormat!=null)m.append("RecordFileFormat: ").append(recordFileFormat).append("\r\n");
 return m.toString();}
}
