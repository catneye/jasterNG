/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AMI.syncactons;

import com.catneye.asterisk.AMI.actions.Action;
import com.catneye.asterisk.AMI.responses.Response;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author plintus
 */
public class SyncAction {

    private Action action;
    private Response response;
    private Boolean responsed = false;
    private LocalDateTime createDT = LocalDateTime.now();
    private LocalDateTime responseDT = null;

    /**
     * @return the action
     */
    public Action getAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(Action action) {
        this.action = action;
    }

    /**
     * @return the response
     */
    public Response getResponse() {
        return response;
    }

    /**
     * @param response the response to set
     */
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     * @return the responsed
     */
    public Boolean isResponsed() {
        return responsed;
    }

    /**
     * @param responsed the responsed to set
     */
    public void setResponsed(Boolean responsed) {
        this.responsed = responsed;
        responseDT = LocalDateTime.now();
    }

    public Boolean isExperied(Integer milliseconds) {
        Boolean ret = false;
        if (responseDT != null) {
            ret=responseDT.plus(milliseconds, ChronoUnit.MILLIS).isBefore(LocalDateTime.now());
        }
        return ret;
    }

    /**
     * @return the createDT
     */
    public LocalDateTime getCreateDT() {
        return createDT;
    }

    /**
     * @param createDT the createDT to set
     */
    public void setCreateDT(LocalDateTime createDT) {
        this.createDT = createDT;
    }
    
    @Override
    public String toString(){
        return "action: "+action.getAction()+"; response: "+response.getResponse()+"; responsed: "+responsed;
    }

}
