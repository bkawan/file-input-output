/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bk.fileapp.entity;

/**
 *
 * @author bkawan
 * @date Mar 3, 2016
 * @time 12:47:10 PM
 */
public class Course {

    
    
    private int cid;
    private boolean status;

    public Course() {
    }
    
    
    public Course(int cid, boolean status) {
        this.cid = cid;
        this.status = status;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

   
    
}
