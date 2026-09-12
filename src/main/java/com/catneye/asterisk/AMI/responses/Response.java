/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.catneye.asterisk.AMI.responses;

import java.util.UUID;

/**
 *
 * @author plintus
 */
public interface Response {
    public UUID getActionID();
    public String getResponse();
    public String getMessage();
}
