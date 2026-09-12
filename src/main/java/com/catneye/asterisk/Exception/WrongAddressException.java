/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.catneye.exception;

/**
 *
 * @author Zaleskovskiy
 */
public class WrongAddressException  extends RuntimeException { 
    public WrongAddressException(String error) {
        super(error);
    }
}