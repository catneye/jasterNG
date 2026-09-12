/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author plintus
 */
public class QueueMemberStatus extends SystemEvent implements Serializable {

    public QueueMemberStatus() {
        super.setEvent("QueueMemberStatus");
        super.setUuid(UUID.randomUUID());
    }

    private String queue;
    private String memberName;
    private String interfaze;
    private String stateInterface;
    private String membership;
    private Integer penalty;
    private Integer callsTaken;
    private Integer lastCall;
    private Integer lastPause;
    private Integer loginTime;
    private Integer inCall;
    private Integer status;
    private Integer paused;
    private String pausedReason;
    private Integer ringinuse;
    private Integer wrapuptime;

    /*
    Event: QueueMemberStatus, 
    Privilege: agent,all, 
    SystemName: asterisk, 
    Queue: test, 
    MemberName: PJSIP/000, 
    Interface: PJSIP/000, 
    StateInterface: PJSIP/000, 
    Membership: static, 
    Penalty: 0, 
    CallsTaken: 0, 
    LastCall: 0, 
    LastPause: 0, 
    LoginTime: 1740665494, 
    InCall: 0, 
    Status: 6, 
    Paused: 0, 
    PausedReason: , 
    Ringinuse: 0, 
    Wrapuptime: 0
     */
    /**
     * @return the queue
     */
    public String getQueue() {
        return queue;
    }

    /**
     * @param queue the queue to set
     */
    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * @return the memberName
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * @param memberName the memberName to set
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * @return the interfaze
     */
    public String getInterfaze() {
        return interfaze;
    }

    /**
     * @param interfaze the interfaze to set
     */
    public void setInterfaze(String interfaze) {
        this.interfaze = interfaze;
    }

    /**
     * @return the stateInterface
     */
    public String getStateInterface() {
        return stateInterface;
    }

    /**
     * @param stateInterface the stateInterface to set
     */
    public void setStateInterface(String stateInterface) {
        this.stateInterface = stateInterface;
    }

    /**
     * @return the membership
     */
    public String getMembership() {
        return membership;
    }

    /**
     * @param membership the membership to set
     */
    public void setMembership(String membership) {
        this.membership = membership;
    }

    /**
     * @return the penalty
     */
    public Integer getPenalty() {
        return penalty;
    }

    /**
     * @param penalty the penalty to set
     */
    public void setPenalty(Integer penalty) {
        this.penalty = penalty;
    }

    /**
     * @return the callsTaken
     */
    public Integer getCallsTaken() {
        return callsTaken;
    }

    /**
     * @param callsTaken the callsTaken to set
     */
    public void setCallsTaken(Integer callsTaken) {
        this.callsTaken = callsTaken;
    }

    /**
     * @return the lastCall
     */
    public Integer getLastCall() {
        return lastCall;
    }

    /**
     * @param lastCall the lastCall to set
     */
    public void setLastCall(Integer lastCall) {
        this.lastCall = lastCall;
    }

    /**
     * @return the lastPause
     */
    public Integer getLastPause() {
        return lastPause;
    }

    /**
     * @param lastPause the lastPause to set
     */
    public void setLastPause(Integer lastPause) {
        this.lastPause = lastPause;
    }

    /**
     * @return the loginTime
     */
    public Integer getLoginTime() {
        return loginTime;
    }

    /**
     * @param loginTime the loginTime to set
     */
    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * @return the inCall
     */
    public Integer getInCall() {
        return inCall;
    }

    /**
     * @param inCall the inCall to set
     */
    public void setInCall(Integer inCall) {
        this.inCall = inCall;
    }

    /**
     * @return the status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return the paused
     */
    public Integer getPaused() {
        return paused;
    }

    /**
     * @param paused the paused to set
     */
    public void setPaused(Integer paused) {
        this.paused = paused;
    }

    /**
     * @return the pausedReason
     */
    public String getPausedReason() {
        return pausedReason;
    }

    /**
     * @param pausedReason the pausedReason to set
     */
    public void setPausedReason(String pausedReason) {
        this.pausedReason = pausedReason;
    }

    /**
     * @return the ringinuse
     */
    public Integer getRinginuse() {
        return ringinuse;
    }

    /**
     * @param ringinuse the ringinuse to set
     */
    public void setRinginuse(Integer ringinuse) {
        this.ringinuse = ringinuse;
    }

    /**
     * @return the wrapuptime
     */
    public Integer getWrapuptime() {
        return wrapuptime;
    }

    /**
     * @param wrapuptime the wrapuptime to set
     */
    public void setWrapuptime(Integer wrapuptime) {
        this.wrapuptime = wrapuptime;
    }

    public String getUniqueid() {
        return null;
    }

}
