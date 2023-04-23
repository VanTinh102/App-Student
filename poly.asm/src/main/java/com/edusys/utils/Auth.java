/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.utils;

import com.edusys.entity.Staff;

/**
 *
 * @author nongn
 */
public class Auth {
    public static Staff userStaff = null;
    public static void clear(){
        Auth.userStaff =null;
    }
    public static boolean isLogin(){
        return Auth.userStaff !=null;
    }
    public static boolean isManager(){
        return Auth.isLogin() && userStaff.getRole();
    }
}

