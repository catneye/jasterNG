/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.catneye.asterisk.AMI.actions;

import java.util.UUID;


/**
 *
 * @author plintus
 */
public interface Action {
    public UUID getUuid();
    public String getAction();
}
