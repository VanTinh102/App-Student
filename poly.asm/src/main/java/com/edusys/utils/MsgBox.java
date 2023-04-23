/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author nongn
 */
public class MsgBox {
    public static void alert(Component parent, String message){
        JOptionPane.showMessageDialog(parent, message,"EduSyS-Message",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean confirm(Component parent,String message){
    int resutl = JOptionPane.showConfirmDialog(parent, message,"EduSyS-Message",
                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    return resutl==JOptionPane.YES_OPTION;           
    }
    public static String prompt(Component parent, String message){
        return JOptionPane.showInputDialog(parent, message,"EduSyS-Message",
                JOptionPane.INFORMATION_MESSAGE);
    }
    public static String errPassword ="You entered the wrong password or username";
    public static String errPassword2 ="You entered the wrong password";
    public static String msgLogin ="please Login!!!";
    public static String errdata ="data query error";
    public static String msginsert ="successfully added new";
    public static String msgnotinsert ="add new failure";
    public static String msgupdate ="successfully updated new";
    public static String msgnotupdate ="update failed";
}


