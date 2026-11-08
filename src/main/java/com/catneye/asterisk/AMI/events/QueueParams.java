/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 * Licensed under GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI QueueParams event. */
public class QueueParams extends SystemEvent implements Serializable {
    public QueueParams() {
        super.setEvent("QueueParams");
        super.setUuid(UUID.randomUUID());
    }

    private String queue;
    public String getQueue() { return queue; }
    public void setQueue(String queue) { this.queue = queue; }

    private Integer max;
    public Integer getMax() { return max; }
    public void setMax(Integer max) { this.max = max; }

    private String strategy;
    public String getStrategy() { return strategy; }
    public void setStrategy(String strategy) { this.strategy = strategy; }

    private Integer calls;
    public Integer getCalls() { return calls; }
    public void setCalls(Integer calls) { this.calls = calls; }

    private Integer holdtime;
    public Integer getHoldtime() { return holdtime; }
    public void setHoldtime(Integer holdtime) { this.holdtime = holdtime; }

    private Integer talktime;
    public Integer getTalktime() { return talktime; }
    public void setTalktime(Integer talktime) { this.talktime = talktime; }

    private Integer completed;
    public Integer getCompleted() { return completed; }
    public void setCompleted(Integer completed) { this.completed = completed; }

    private Integer abandoned;
    public Integer getAbandoned() { return abandoned; }
    public void setAbandoned(Integer abandoned) { this.abandoned = abandoned; }

    private Integer serviceLevel;
    public Integer getServiceLevel() { return serviceLevel; }
    public void setServiceLevel(Integer serviceLevel) { this.serviceLevel = serviceLevel; }

    private Float servicelevelPerf;
    public Float getServicelevelPerf() { return servicelevelPerf; }
    public void setServicelevelPerf(Float servicelevelPerf) { this.servicelevelPerf = servicelevelPerf; }

    private Integer weight;
    public Integer getWeight() { return weight; }
    public void setWeight(Integer weight) { this.weight = weight; }

    private String actionID;
    public String getActionID() { return actionID; }
    public void setActionID(String actionID) { this.actionID = actionID; }

}
