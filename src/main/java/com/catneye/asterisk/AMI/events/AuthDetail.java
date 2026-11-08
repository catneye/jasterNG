/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 * Modified by Kurchenko O.E. and OpenAI ChatGPT 2026-11-08.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI AuthDetail event. */
public class AuthDetail extends SystemEvent implements Serializable {

    public AuthDetail() {
        super.setEvent("AuthDetail");
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

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    private Integer nonceLifetime;

    public Integer getNonceLifetime() {
        return nonceLifetime;
    }

    public void setNonceLifetime(Integer nonceLifetime) {
        this.nonceLifetime = nonceLifetime;
    }

    private String authType;

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    private String endpointName;

    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    private String oauthClientid;

    public String getOauthClientid() {
        return oauthClientid;
    }

    public void setOauthClientid(String oauthClientid) {
        this.oauthClientid = oauthClientid;
    }

    private String oauthSecret;

    public String getOauthSecret() {
        return oauthSecret;
    }

    public void setOauthSecret(String oauthSecret) {
        this.oauthSecret = oauthSecret;
    }

    private String passwordDigest;

    public String getPasswordDigest() {
        return passwordDigest;
    }

    public void setPasswordDigest(String passwordDigest) {
        this.passwordDigest = passwordDigest;
    }

    private String refreshToken;

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    private String supportedAlgorithmsUac;

    public String getSupportedAlgorithmsUac() {
        return supportedAlgorithmsUac;
    }

    public void setSupportedAlgorithmsUac(String supportedAlgorithmsUac) {
        this.supportedAlgorithmsUac = supportedAlgorithmsUac;
    }

    private String supportedAlgorithmsUas;

    public String getSupportedAlgorithmsUas() {
        return supportedAlgorithmsUas;
    }

    public void setSupportedAlgorithmsUas(String supportedAlgorithmsUas) {
        this.supportedAlgorithmsUas = supportedAlgorithmsUas;
    }

}
