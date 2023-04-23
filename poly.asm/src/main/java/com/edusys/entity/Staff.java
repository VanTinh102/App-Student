/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.entity;

public class Staff {
    String staffCode,password,name;
    Boolean role = false;
    @Override
    public String toString(){
        return  this.name;
    };

    public String getStaffCode() {
        return staffCode;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Boolean getRole() {
        return role;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(Boolean role) {
        this.role = role;
    }

    
}

