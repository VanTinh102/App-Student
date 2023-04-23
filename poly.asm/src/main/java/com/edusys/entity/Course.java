/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.entity;

import com.edusys.utils.XDate;
import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author nongn
 */
public class Course {

    Integer courseCode, time;
    String thematicCode, staffCode, note;
    Double tuition;
    Date khaigiang;
    private Date ngaytaoDate;

    @Override
    public String toString() {
        return this.thematicCode + " (" + this.khaigiang + ")";
    }

    public Integer getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(Integer courseCode) {
        this.courseCode = courseCode;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getThematicCode() {
        return thematicCode;
    }

    public void setThematicCode(String thematicCode) {
        this.thematicCode = thematicCode;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Double getTuition() {
        return tuition;
    }

    public void setTuition(Double tuition) {
        this.tuition = tuition;
    }

    public Date getKhaigiang() {
        return khaigiang;
    }

    public void setKhaigiang(Date khaigiang) {
        this.khaigiang = khaigiang;
    }

    public Date getNgaytaoDate() {
        return ngaytaoDate;
    }

    public void setNgaytaoDate(Date ngaytaoDate) {
        this.ngaytaoDate = ngaytaoDate;
    }

}

