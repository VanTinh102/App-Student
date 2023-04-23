/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.entity;

import com.edusys.utils.XDate;
import java.util.Date;

/**
 *
 * @author nongn
 */
public class Learner {
    String learnerCode,staffCode,name,phone,email,note;
    Date dateOfBirth;
    String registrationDate = XDate.toString(new Date(), "MM/dd/yyyy");
    Boolean sex;

    public String getLearnerCode() {
        return learnerCode;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getNote() {
        return note;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setLearnerCode(String learnerCode) {
        this.learnerCode = learnerCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
   

}
