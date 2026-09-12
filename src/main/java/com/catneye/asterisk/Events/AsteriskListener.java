/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.catneye.asterisk.Events;

import com.catneye.asterisk.AMI.AMIServer;
import com.catneye.asterisk.AMI.AMIThread;
import com.catneye.asterisk.AMI.events.base.Event;

/**
 *
 * @author plintus
 */
public interface AsteriskListener {
    public void onEvent(Event e, AMIServer server);
    public void onConnect(AMIThread ami, AMIServer server);
}
