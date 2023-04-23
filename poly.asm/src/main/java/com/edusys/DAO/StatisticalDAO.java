/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.DAO;

import com.edusys.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nongn
 */
public class StatisticalDAO {
    public List<Object[]> getListOfArray(String sql,String[] cols,Object...args){
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for(int i = 0; i<cols.length;i++){
                    vals[i] = rs.getObject(cols[i]);	
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return  list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } 
    };
    public List<Object[]> getCourse(Integer makh){
        String sql = "{CALL sp_BangDiem(?)}";
        String[] cols= {"MaNH","HoTen","Diem"};
        return this.getListOfArray(sql, cols, makh);
        
    };
    public List<Object[]> getNumberOfLearner(){
        String sql = "{CALL sp_LuongNguoiHoc}";
        String[] cols = {"Nam","SoLuong","DauTien","CuoiCung"};
        return this.getListOfArray(sql, cols);
        
    };
    public List<Object[]> getTopicalPoint(){
        String sql = "{CALL sp_DiemChuyenDe}";
        String[] cols = {"ChuyenDe","SoHV","ThapNhat","TrungBinh"};
        return this.getListOfArray(sql, cols);
        
    };
    public List<Object[]> getRivenue(int nam){
        String sql = "{CALL sp_DoanhThu(?)}";
        String[] cols = {"ChuyenDe","SoKH","SoHV","DoanhThu","ThapNhat","CaoNhat","TrungBinh"};
        return this.getListOfArray(sql, cols,nam);
        
    };
            
}

