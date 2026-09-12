/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.catneye.asterisk.AMI.events.base;

/**
 *
 * @author plintus
 */
public class ChannelEvent extends SystemEvent {

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

    @Override
    public String toString() {
        return new StringBuilder()
                .append("event: ").append(this.getEvent()).append("; ")
                .append("channel: ").append(channel).append("; ")
                .append("channelState: ").append(channelState).append("; ")
                .append("channelStateDesc: ").append(channelStateDesc).append("; ")
                .append("callerIDNum: ").append(callerIDNum).append("; ")
                .append("callerIDName: ").append(callerIDName).append("; ")
                .append("connectedLineNum: ").append(connectedLineNum).append("; ")
                .append("connectedLineName: ").append(connectedLineName).append("; ")
                .append("language: ").append(language).append("; ")
                .append("accountCode: ").append(accountCode).append("; ")
                .append("context: ").append(context).append("; ")
                .append("exten: ").append(exten).append("; ")
                .append("priority: ").append(priority).append("; ")
                .append("uniqueid: ").append(uniqueid).append("; ")
                .append("linkedid: ").append(linkedid).toString();
    }

}
