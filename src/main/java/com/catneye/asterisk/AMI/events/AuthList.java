/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI AuthList event. */
public class AuthList extends SystemEvent implements Serializable {

    public AuthList() {
        super.setEvent("AuthList");
        super.setUuid(UUID.randomUUID());
    }

    private String objectType;

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    private String objectName;

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String md5Cred;

    public String getMd5Cred() {
        return md5Cred;
    }

    public void setMd5Cred(String md5Cred) {
        this.md5Cred = md5Cred;
    }

    private String realm;

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    private String authType;

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private Integer nonceLifetime;

    public Integer getNonceLifetime() {
        return nonceLifetime;
    }

    public void setNonceLifetime(Integer nonceLifetime) {
        this.nonceLifetime = nonceLifetime;
    }

}
