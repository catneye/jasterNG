/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author plintus
 */
public class QueueCallerJoin extends ChannelEvent implements Serializable {

    public QueueCallerJoin() {
        super.setEvent("QueueCallerJoin");
        super.setUuid(UUID.randomUUID());
    }

    private String queue;
    private Integer position;
    private Integer count;

    /*
    Event: QueueCallerLeave, 
    Privilege: agent,all, 
    SystemName: asterisk, 
    
    Channel: PJSIP/dev-000000bd, 
    ChannelState: 6, 
    ChannelStateDesc: Up, 
    CallerIDNum: 000193393, 
    CallerIDName: <unknown>, 
    ConnectedLineNum: 000, 
    ConnectedLineName: <unknown>, 
    Language: ru, 
    AccountCode: , 
    Context: incoming-dev, 
    Exten: s, 
    Priority: 5, 
    Uniqueid: asterisk-1740666060.311, 
    Linkedid: asterisk-1740666060.311, 
    Queue: test, 
    Position: 1, 
    Count: 0
    
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
     * @return the position
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * @return the count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

}
