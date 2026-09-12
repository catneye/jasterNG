/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.AgentEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author plintus
 */
public class AgentConnect extends AgentEvent implements Serializable {

    private String queue;
    private String interfaze;
    private String memberName;
    private Integer holdTime;
    private Integer ringTime;
    
    
    public AgentConnect() {
        super.setEvent("AgentConnect");
        super.setUuid(UUID.randomUUID());
    }
    /*
    
    Event: AgentCalled, 
    Privilege: agent,all, 
    SystemName: asterisk, 
    Channel: PJSIP/dev-000000bd, 
    ChannelState: 6, 
    ChannelStateDesc: Up, 
    CallerIDNum: 000193393, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: <unknown>, 
    ConnectedLineName: <unknown>, 
    Language: ru, AccountCode: , 
    Context: incoming-dev, 
    Exten: s, 
    Priority: 5, 
    Uniqueid: asterisk-1740666060.311, 
    Linkedid: asterisk-1740666060.311, 
    
    DestChannel: PJSIP/000-000000be, 
    DestChannelState: 0, 
    DestChannelStateDesc: Down, 
    DestCallerIDNum: 000, 
    DestCallerIDName: <unknown>, 
    DestConnectedLineNum: 000193393, 
    DestConnectedLineName: <unknown>, 
    DestLanguage: ru, DestAccountCode: , 
    DestContext: from-000, 
    DestExten: s, 
    DestPriority: 1, 
    DestUniqueid: asterisk-1740666060.312, 
    DestLinkedid: asterisk-1740666060.311, 
    
    Queue: test, 
    Interface: PJSIP/000, 
    MemberName: PJSIP/000
    HoldTime: 3, RingTime: 2
    
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
     * @return the holdTime
     */
    public Integer getHoldTime() {
        return holdTime;
    }

    /**
     * @param holdTime the holdTime to set
     */
    public void setHoldTime(Integer holdTime) {
        this.holdTime = holdTime;
    }

    /**
     * @return the ringTime
     */
    public Integer getRingTime() {
        return ringTime;
    }

    /**
     * @param ringTime the ringTime to set
     */
    public void setRingTime(Integer ringTime) {
        this.ringTime = ringTime;
    }


}
