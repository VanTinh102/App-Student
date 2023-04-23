/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.entity;

public class Thematic {
    String thematicCode,thematicName,avatar,note;
    Double tuition;
    Integer time;
    @Override
    public String toString() {
        return this.thematicName;
    }
//     @Override
//    public boolean equals(Object obj) {
//        Thematic other = (Thematic) obj;
//        return other.getThematicCode().equals(this.getThematicCode());
//    }
    

    public String getThematicCode() {
        return thematicCode;
    }

    public String getThematicName() {
        return thematicName;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getNote() {
        return note;
    }

    public Double getTuition() {
        return tuition;
    }

    public Integer getTime() {
        return time;
    }

    public void setThematicCode(String thematicCode) {
        this.thematicCode = thematicCode;
    }

    public void setThematicName(String thematicName) {
        this.thematicName = thematicName;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setTuition(Double tuition) {
//         if (tuition < 0) {
//        throw new IllegalArgumentException("Tuition cannot be negative");
//    }
        this.tuition = tuition;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public void setTuition(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

   
    
}

