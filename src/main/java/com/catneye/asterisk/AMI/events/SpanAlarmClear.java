/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI SpanAlarmClear event. */
public class SpanAlarmClear extends SystemEvent implements Serializable {
    public SpanAlarmClear() { super.setEvent("SpanAlarmClear"); super.setUuid(UUID.randomUUID()); }
    private String span;
    public String getSpan() { return span; }
    public void setSpan(String span) { this.span = span; }
}
