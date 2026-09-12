/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.catneye.asterisk.Exception;

/**
 *
 * @author Zaleskovskiy
 */
public class WrongClassException  extends RuntimeException { 
    public WrongClassException(String error) {
        super(error);
    }
}