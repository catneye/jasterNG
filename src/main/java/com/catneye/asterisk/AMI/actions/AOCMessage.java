package com.catneye.asterisk.AMI.actions;
import java.util.UUID;
/** AMI AOCMessage action. */
public class AOCMessage implements Action {
 private UUID uuid=UUID.randomUUID();
 private String action="AOCMessage";
 private String channel;
 public String getChannel(){return channel;}
 public void setChannel(String channel){this.channel=channel;}
 private String msgType;
 public String getMsgType(){return msgType;}
 public void setMsgType(String msgType){this.msgType=msgType;}
 private String currency;
 public String getCurrency(){return currency;}
 public void setCurrency(String currency){this.currency=currency;}
 private String currencyAmount;
 public String getCurrencyAmount(){return currencyAmount;}
 public void setCurrencyAmount(String currencyAmount){this.currencyAmount=currencyAmount;}
 private String currencyMultiplier;
 public String getCurrencyMultiplier(){return currencyMultiplier;}
 public void setCurrencyMultiplier(String currencyMultiplier){this.currencyMultiplier=currencyMultiplier;}
 private String billingID;
 public String getBillingID(){return billingID;}
 public void setBillingID(String billingID){this.billingID=billingID;}
 private String totalType;
 public String getTotalType(){return totalType;}
 public void setTotalType(String totalType){this.totalType=totalType;}
 private String total;
 public String getTotal(){return total;}
 public void setTotal(String total){this.total=total;}
 private String chargingType;
 public String getChargingType(){return chargingType;}
 public void setChargingType(String chargingType){this.chargingType=chargingType;}
 private String charging;
 public String getCharging(){return charging;}
 public void setCharging(String charging){this.charging=charging;}
 private String recordedUnits;
 public String getRecordedUnits(){return recordedUnits;}
 public void setRecordedUnits(String recordedUnits){this.recordedUnits=recordedUnits;}
 private String recorded;
 public String getRecorded(){return recorded;}
 public void setRecorded(String recorded){this.recorded=recorded;}
 private String plan;
 public String getPlan(){return plan;}
 public void setPlan(String plan){this.plan=plan;}
 @Override public UUID getUuid(){return uuid;}
 public void setUuid(UUID uuid){this.uuid=uuid;}
 @Override public String getAction(){return action;}
 public void setAction(String action){this.action=action;}
 @Override public String toString(){StringBuilder m=new StringBuilder("Action: "+getAction()+"\r\nActionID: "+getUuid()+"\r\n");
 if(channel!=null)m.append("Channel: ").append(channel).append("\r\n");
 if(msgType!=null)m.append("MsgType: ").append(msgType).append("\r\n");
 if(currency!=null)m.append("Currency: ").append(currency).append("\r\n");
 if(currencyAmount!=null)m.append("CurrencyAmount: ").append(currencyAmount).append("\r\n");
 if(currencyMultiplier!=null)m.append("CurrencyMultiplier: ").append(currencyMultiplier).append("\r\n");
 if(billingID!=null)m.append("BillingID: ").append(billingID).append("\r\n");
 if(totalType!=null)m.append("TotalType: ").append(totalType).append("\r\n");
 if(total!=null)m.append("Total: ").append(total).append("\r\n");
 if(chargingType!=null)m.append("ChargingType: ").append(chargingType).append("\r\n");
 if(charging!=null)m.append("Charging: ").append(charging).append("\r\n");
 if(recordedUnits!=null)m.append("RecordedUnits: ").append(recordedUnits).append("\r\n");
 if(recorded!=null)m.append("Recorded: ").append(recorded).append("\r\n");
 if(plan!=null)m.append("Plan: ").append(plan).append("\r\n");
 return m.toString();}
}
