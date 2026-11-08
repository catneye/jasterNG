/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI LocalOptimizationEnd event. */
public class LocalOptimizationEnd extends SystemEvent implements Serializable {
    public LocalOptimizationEnd() { super.setEvent("LocalOptimizationEnd"); super.setUuid(UUID.randomUUID()); }
    private String localOneChannel;
    public String getLocalOneChannel() { return localOneChannel; }
    public void setLocalOneChannel(String localOneChannel) { this.localOneChannel = localOneChannel; }
    private String localOneUniqueid;
    public String getLocalOneUniqueid() { return localOneUniqueid; }
    public void setLocalOneUniqueid(String localOneUniqueid) { this.localOneUniqueid = localOneUniqueid; }
    private String localTwoChannel;
    public String getLocalTwoChannel() { return localTwoChannel; }
    public void setLocalTwoChannel(String localTwoChannel) { this.localTwoChannel = localTwoChannel; }
    private String localTwoUniqueid;
    public String getLocalTwoUniqueid() { return localTwoUniqueid; }
    public void setLocalTwoUniqueid(String localTwoUniqueid) { this.localTwoUniqueid = localTwoUniqueid; }
    private Boolean success;
    public Boolean getSuccess() { return success; }
    public void setSuccess(Boolean success) { this.success = success; }
    private Integer id;
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
}
