/*
 * jasterNG - Java interface for Asterisk
 *
 * Copyright (C) 2026 Kurchenko O.E. and OpenAI ChatGPT
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
 * Modified by Kurchenko O.E. and OpenAI ChatGPT 2026-11-08.
 */
/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.ChannelEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI MCID event. */
public class MCID extends ChannelEvent implements Serializable {
    public MCID() { super.setEvent("MCID"); super.setUuid(UUID.randomUUID()); }
    private Boolean mCallerIDNumValid;
    public Boolean getMCallerIDNumValid() { return mCallerIDNumValid; }
    public void setMCallerIDNumValid(Boolean mCallerIDNumValid) { this.mCallerIDNumValid = mCallerIDNumValid; }
    private String mCallerIDNum;
    public String getMCallerIDNum() { return mCallerIDNum; }
    public void setMCallerIDNum(String mCallerIDNum) { this.mCallerIDNum = mCallerIDNum; }
    private Integer mCallerIDton;
    public Integer getMCallerIDton() { return mCallerIDton; }
    public void setMCallerIDton(Integer mCallerIDton) { this.mCallerIDton = mCallerIDton; }
    private Integer mCallerIDNumPlan;
    public Integer getMCallerIDNumPlan() { return mCallerIDNumPlan; }
    public void setMCallerIDNumPlan(Integer mCallerIDNumPlan) { this.mCallerIDNumPlan = mCallerIDNumPlan; }
    private Integer mCallerIDNumPres;
    public Integer getMCallerIDNumPres() { return mCallerIDNumPres; }
    public void setMCallerIDNumPres(Integer mCallerIDNumPres) { this.mCallerIDNumPres = mCallerIDNumPres; }
    private Boolean mCallerIDNameValid;
    public Boolean getMCallerIDNameValid() { return mCallerIDNameValid; }
    public void setMCallerIDNameValid(Boolean mCallerIDNameValid) { this.mCallerIDNameValid = mCallerIDNameValid; }
    private String mCallerIDName;
    public String getMCallerIDName() { return mCallerIDName; }
    public void setMCallerIDName(String mCallerIDName) { this.mCallerIDName = mCallerIDName; }
    private Integer mCallerIDNameCharSet;
    public Integer getMCallerIDNameCharSet() { return mCallerIDNameCharSet; }
    public void setMCallerIDNameCharSet(Integer mCallerIDNameCharSet) { this.mCallerIDNameCharSet = mCallerIDNameCharSet; }
    private Integer mCallerIDNamePres;
    public Integer getMCallerIDNamePres() { return mCallerIDNamePres; }
    public void setMCallerIDNamePres(Integer mCallerIDNamePres) { this.mCallerIDNamePres = mCallerIDNamePres; }
    private String mCallerIDSubaddr;
    public String getMCallerIDSubaddr() { return mCallerIDSubaddr; }
    public void setMCallerIDSubaddr(String mCallerIDSubaddr) { this.mCallerIDSubaddr = mCallerIDSubaddr; }
    private Integer mCallerIDSubaddrType;
    public Integer getMCallerIDSubaddrType() { return mCallerIDSubaddrType; }
    public void setMCallerIDSubaddrType(Integer mCallerIDSubaddrType) { this.mCallerIDSubaddrType = mCallerIDSubaddrType; }
    private Boolean mCallerIDSubaddrOdd;
    public Boolean getMCallerIDSubaddrOdd() { return mCallerIDSubaddrOdd; }
    public void setMCallerIDSubaddrOdd(Boolean mCallerIDSubaddrOdd) { this.mCallerIDSubaddrOdd = mCallerIDSubaddrOdd; }
    private Integer mCallerIDPres;
    public Integer getMCallerIDPres() { return mCallerIDPres; }
    public void setMCallerIDPres(Integer mCallerIDPres) { this.mCallerIDPres = mCallerIDPres; }
    private Boolean mConnectedIDNumValid;
    public Boolean getMConnectedIDNumValid() { return mConnectedIDNumValid; }
    public void setMConnectedIDNumValid(Boolean mConnectedIDNumValid) { this.mConnectedIDNumValid = mConnectedIDNumValid; }
    private String mConnectedIDNum;
    public String getMConnectedIDNum() { return mConnectedIDNum; }
    public void setMConnectedIDNum(String mConnectedIDNum) { this.mConnectedIDNum = mConnectedIDNum; }
    private Integer mConnectedIDton;
    public Integer getMConnectedIDton() { return mConnectedIDton; }
    public void setMConnectedIDton(Integer mConnectedIDton) { this.mConnectedIDton = mConnectedIDton; }
    private Integer mConnectedIDNumPlan;
    public Integer getMConnectedIDNumPlan() { return mConnectedIDNumPlan; }
    public void setMConnectedIDNumPlan(Integer mConnectedIDNumPlan) { this.mConnectedIDNumPlan = mConnectedIDNumPlan; }
    private Integer mConnectedIDNumPres;
    public Integer getMConnectedIDNumPres() { return mConnectedIDNumPres; }
    public void setMConnectedIDNumPres(Integer mConnectedIDNumPres) { this.mConnectedIDNumPres = mConnectedIDNumPres; }
    private Boolean mConnectedIDNameValid;
    public Boolean getMConnectedIDNameValid() { return mConnectedIDNameValid; }
    public void setMConnectedIDNameValid(Boolean mConnectedIDNameValid) { this.mConnectedIDNameValid = mConnectedIDNameValid; }
    private String mConnectedIDName;
    public String getMConnectedIDName() { return mConnectedIDName; }
    public void setMConnectedIDName(String mConnectedIDName) { this.mConnectedIDName = mConnectedIDName; }
    private Integer mConnectedIDNameCharSet;
    public Integer getMConnectedIDNameCharSet() { return mConnectedIDNameCharSet; }
    public void setMConnectedIDNameCharSet(Integer mConnectedIDNameCharSet) { this.mConnectedIDNameCharSet = mConnectedIDNameCharSet; }
    private Integer mConnectedIDNamePres;
    public Integer getMConnectedIDNamePres() { return mConnectedIDNamePres; }
    public void setMConnectedIDNamePres(Integer mConnectedIDNamePres) { this.mConnectedIDNamePres = mConnectedIDNamePres; }
    private String mConnectedIDSubaddr;
    public String getMConnectedIDSubaddr() { return mConnectedIDSubaddr; }
    public void setMConnectedIDSubaddr(String mConnectedIDSubaddr) { this.mConnectedIDSubaddr = mConnectedIDSubaddr; }
    private Integer mConnectedIDSubaddrType;
    public Integer getMConnectedIDSubaddrType() { return mConnectedIDSubaddrType; }
    public void setMConnectedIDSubaddrType(Integer mConnectedIDSubaddrType) { this.mConnectedIDSubaddrType = mConnectedIDSubaddrType; }
    private Boolean mConnectedIDSubaddrOdd;
    public Boolean getMConnectedIDSubaddrOdd() { return mConnectedIDSubaddrOdd; }
    public void setMConnectedIDSubaddrOdd(Boolean mConnectedIDSubaddrOdd) { this.mConnectedIDSubaddrOdd = mConnectedIDSubaddrOdd; }
    private Integer mConnectedIDPres;
    public Integer getMConnectedIDPres() { return mConnectedIDPres; }
    public void setMConnectedIDPres(Integer mConnectedIDPres) { this.mConnectedIDPres = mConnectedIDPres; }
}
