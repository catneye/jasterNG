/*
 * jasterNG - Java interface for Asterisk
 *
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG.
 *
 * jasterNG is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, version 2.
 *
 * jasterNG is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jasterNG. If not, see <https://www.gnu.org/licenses/>.
 *
 * Modified by Kurchenko O.E. 2026-09-12.
 */
package com.catneye.asterisk.Events;

import com.catneye.asterisk.AMI.AMIServer;
import com.catneye.asterisk.AMI.AMIThread;
import com.catneye.asterisk.AMI.events.base.Event;

/**
 *
 * @author Kurchenko O.E.
 */
public interface AsteriskListener {
    public void onEvent(Event e, AMIServer server);
    public void onConnect(AMIThread ami, AMIServer server);
}
