package com.catneye.asterisk.AMI.actions;

import java.util.UUID;

/** AMI AbsoluteTimeout action. */
public class AbsoluteTimeout implements Action {
    private UUID uuid = UUID.randomUUID();
    private String action = "AbsoluteTimeout";
    private String channel;
    private Integer timeout;

    public String getChannel() { return channel; }
    public void setChannel(String channel) { this.channel = channel; }
    public Integer getTimeout() { return timeout; }
    public void setTimeout(Integer timeout) { this.timeout = timeout; }

    @Override
    public UUID getUuid() { return uuid; }
    public void setUuid(UUID uuid) { this.uuid = uuid; }
    @Override
    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();
        message.append("Action: ").append(getAction()).append("\r\n");
        message.append("ActionID: ").append(getUuid()).append("\r\n");
        if (channel != null) message.append("Channel: ").append(channel).append("\r\n");
        if (timeout != null) message.append("Timeout: ").append(timeout).append("\r\n");
        return message.toString();
    }
}
