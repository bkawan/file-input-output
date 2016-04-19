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
 * @time 12:45:45 PM
 */
public class Student {
    private int id;
    private int courseID;
    private boolean stutus;
    private Course course;
    
    
     
    public Student() {
    }


    public Student(int id, boolean stutus) {
        this.id = id;
        this.stutus = stutus;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStutus() {
        return stutus;
    }

    public void setStutus(boolean stutus) {
        this.stutus = stutus;
    }
    
     
}
