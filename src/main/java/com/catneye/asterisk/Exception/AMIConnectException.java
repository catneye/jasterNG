/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.catneye.asterisk.Exception;

import java.util.UUID;

/**
 *
 * @author Zaleskovskiy
 */
public class AMIConnectException  extends RuntimeException { 
    private UUID uuid;
    public AMIConnectException(String error, UUID uuid) {
        super(error);
        this.uuid=uuid;
    }

    /**
     * @return the uuid
     */
    public UUID getUuid() {
        return uuid;
    }
}