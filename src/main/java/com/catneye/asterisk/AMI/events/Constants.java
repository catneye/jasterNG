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
package com.catneye.asterisk.AMI.events;

/**
 *
 * @author Kurchenko O.E.
 */
public class Constants {
    Integer DOWNandAVAILABLE = 0;
    Integer DOWNbutRESERVED = 1;
    Integer OFFHOOK = 2;//Channel is off hook.
    Integer DIALED = 3;//Digits (or equivalent) have been dialed.
    Integer RINGING = 4;//Line is ringing.
    Integer ENDRINGING = 5;//Remote end is ringing.
    Integer UP = 6;//Line is up.
    Integer BUSY = 7;//Line is busy.

}
