/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.events.base;

/**
 *
 * @author plintus
 */
public class DialEvent extends SystemEvent {
    
    private String channel;
    private Integer channelState;
    private String channelStateDesc;
    private String callerIDNum;
    private String callerIDName;
    private String connectedLineNum;
    private String connectedLineName;
    private String language;
    private String accountCode;
    private String context;
    private String exten;
    private String priority;
    private String uniqueid;
    private String linkedid;
    
    private String destChannel;
    private Integer destChannelState;
    private String destChannelStateDesc;
    private String destCallerIDNum;
    private String destCallerIDName;
    private String destConnectedLineNum;
    private String destConnectedLineName;
    private String destLanguage;
    private Integer destAccountCode;
    private String destContext;
    private String destExten;
    private String destPriority;
    private String destUniqueid;
    private String destLinkedid;

    /**
     * @return the destChannel
     */
    public String getDestChannel() {
        return destChannel;
    }

    /**
     * @param destChannel the destChannel to set
     */
    public void setDestChannel(String destChannel) {
        this.destChannel = destChannel;
    }

    /**
     * @return the destChannelState
     */
    public Integer getDestChannelState() {
        return destChannelState;
    }

    /**
     * @param destChannelState the destChannelState to set
     */
    public void setDestChannelState(Integer destChannelState) {
        this.destChannelState = destChannelState;
    }

    /**
     * @return the destChannelStateDesc
     */
    public String getDestChannelStateDesc() {
        return destChannelStateDesc;
    }

    /**
     * @param destChannelStateDesc the destChannelStateDesc to set
     */
    public void setDestChannelStateDesc(String destChannelStateDesc) {
        this.destChannelStateDesc = destChannelStateDesc;
    }

    /**
     * @return the destCallerIDNum
     */
    public String getDestCallerIDNum() {
        return destCallerIDNum;
    }

    /**
     * @param destCallerIDNum the destCallerIDNum to set
     */
    public void setDestCallerIDNum(String destCallerIDNum) {
        this.destCallerIDNum = destCallerIDNum;
    }

    /**
     * @return the destCallerIDName
     */
    public String getDestCallerIDName() {
        return destCallerIDName;
    }

    /**
     * @param destCallerIDName the destCallerIDName to set
     */
    public void setDestCallerIDName(String destCallerIDName) {
        this.destCallerIDName = destCallerIDName;
    }

    /**
     * @return the destConnectedLineNum
     */
    public String getDestConnectedLineNum() {
        return destConnectedLineNum;
    }

    /**
     * @param destConnectedLineNum the destConnectedLineNum to set
     */
    public void setDestConnectedLineNum(String destConnectedLineNum) {
        this.destConnectedLineNum = destConnectedLineNum;
    }

    /**
     * @return the destConnectedLineName
     */
    public String getDestConnectedLineName() {
        return destConnectedLineName;
    }

    /**
     * @param destConnectedLineName the destConnectedLineName to set
     */
    public void setDestConnectedLineName(String destConnectedLineName) {
        this.destConnectedLineName = destConnectedLineName;
    }

    /**
     * @return the destLanguage
     */
    public String getDestLanguage() {
        return destLanguage;
    }

    /**
     * @param destLanguage the destLanguage to set
     */
    public void setDestLanguage(String destLanguage) {
        this.destLanguage = destLanguage;
    }

    /**
     * @return the destAccountCode
     */
    public Integer getDestAccountCode() {
        return destAccountCode;
    }

    /**
     * @param destAccountCode the destAccountCode to set
     */
    public void setDestAccountCode(Integer destAccountCode) {
        this.destAccountCode = destAccountCode;
    }

    /**
     * @return the destContext
     */
    public String getDestContext() {
        return destContext;
    }

    /**
     * @param destContext the destContext to set
     */
    public void setDestContext(String destContext) {
        this.destContext = destContext;
    }

    /**
     * @return the destExten
     */
    public String getDestExten() {
        return destExten;
    }

    /**
     * @param destExten the destExten to set
     */
    public void setDestExten(String destExten) {
        this.destExten = destExten;
    }

    /**
     * @return the destPriority
     */
    public String getDestPriority() {
        return destPriority;
    }

    /**
     * @param destPriority the destPriority to set
     */
    public void setDestPriority(String destPriority) {
        this.destPriority = destPriority;
    }

    /**
     * @return the destUniqueid
     */
    public String getDestUniqueid() {
        return destUniqueid;
    }

    /**
     * @param destUniqueid the destUniqueid to set
     */
    public void setDestUniqueid(String destUniqueid) {
        this.destUniqueid = destUniqueid;
    }

    /**
     * @return the destLinkedid
     */
    public String getDestLinkedid() {
        return destLinkedid;
    }

    /**
     * @param destLinkedid the destLinkedid to set
     */
    public void setDestLinkedid(String destLinkedid) {
        this.destLinkedid = destLinkedid;
    }

    /**
     * @return the channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel the channel to set
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * @return the channelState
     */
    public Integer getChannelState() {
        return channelState;
    }

    /**
     * @param channelState the channelState to set
     */
    public void setChannelState(Integer channelState) {
        this.channelState = channelState;
    }

    /**
     * @return the channelStateDesc
     */
    public String getChannelStateDesc() {
        return channelStateDesc;
    }

    /**
     * @param channelStateDesc the channelStateDesc to set
     */
    public void setChannelStateDesc(String channelStateDesc) {
        this.channelStateDesc = channelStateDesc;
    }

    /**
     * @return the callerIDNum
     */
    public String getCallerIDNum() {
        return callerIDNum;
    }

    /**
     * @param callerIDNum the callerIDNum to set
     */
    public void setCallerIDNum(String callerIDNum) {
        this.callerIDNum = callerIDNum;
    }

    /**
     * @return the callerIDName
     */
    public String getCallerIDName() {
        return callerIDName;
    }

    /**
     * @param callerIDName the callerIDName to set
     */
    public void setCallerIDName(String callerIDName) {
        this.callerIDName = callerIDName;
    }

    /**
     * @return the connectedLineNum
     */
    public String getConnectedLineNum() {
        return connectedLineNum;
    }

    /**
     * @param connectedLineNum the connectedLineNum to set
     */
    public void setConnectedLineNum(String connectedLineNum) {
        this.connectedLineNum = connectedLineNum;
    }

    /**
     * @return the connectedLineName
     */
    public String getConnectedLineName() {
        return connectedLineName;
    }

    /**
     * @param connectedLineName the connectedLineName to set
     */
    public void setConnectedLineName(String connectedLineName) {
        this.connectedLineName = connectedLineName;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the accountCode
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * @param accountCode the accountCode to set
     */
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    /**
     * @return the context
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context the context to set
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * @return the exten
     */
    public String getExten() {
        return exten;
    }

    /**
     * @param exten the exten to set
     */
    public void setExten(String exten) {
        this.exten = exten;
    }

    /**
     * @return the priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * @return the uniqueid
     */
    public String getUniqueid() {
        return uniqueid;
    }

    /**
     * @param uniqueid the uniqueid to set
     */
    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    /**
     * @return the linkedid
     */
    public String getLinkedid() {
        return linkedid;
    }

    /**
     * @param linkedid the linkedid to set
     */
    public void setLinkedid(String linkedid) {
        this.linkedid = linkedid;
    }
}
