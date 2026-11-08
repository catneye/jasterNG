/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI SpanAlarm event. */
public class SpanAlarm extends SystemEvent implements Serializable {
    public SpanAlarm() { super.setEvent("SpanAlarm"); super.setUuid(UUID.randomUUID()); }
    private String span;
    public String getSpan() { return span; }
    public void setSpan(String span) { this.span = span; }
    private String alarm;
    public String getAlarm() { return alarm; }
    public void setAlarm(String alarm) { this.alarm = alarm; }
}
