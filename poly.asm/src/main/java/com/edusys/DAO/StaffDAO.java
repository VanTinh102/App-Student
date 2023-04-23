/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.DAO;


import com.edusys.entity.Staff;
import com.edusys.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nongn
 */
public class StaffDAO extends EduSysDAO<Staff, String> {
    String INSERT_SQL ="INSERT INTO NhanVien(MaNV,MatKhau,HoTen,VaiTro)VALUES(?,?,?,?)";
    String UPDATE_SQL ="UPDATE NhanVien SET MatKhau=?,HoTen=?,VaiTro=? WHERE MaNV=?";
    String DELETE_SQL ="DELETE FROM NhanVien WHERE MaNV=?";
    String SELECT_ALL_SQL ="SELECT*FROM NhanVien";
    String SELECT_BY_ID_SQL="SELECT*FROM NhanVien WHERE MaNV=?";

    @Override
    public void insert(Staff entity) {
        JdbcHelper.update(INSERT_SQL, entity.getStaffCode(),entity.getPassword(),entity.getName(),entity.getRole());
    }

    @Override
    public void update(Staff entity) {
       JdbcHelper.update(UPDATE_SQL,entity.getPassword(), entity.getName(),entity.getRole(),entity.getStaffCode());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public Staff selectById(String id) {
       List<Staff> list = this.selectBySql(SELECT_BY_ID_SQL, id);
       if(list.isEmpty()){
           return null;
       }
        return list.get(0);
       
    }

    @Override
    public List<Staff> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<Staff> selectBySql(String sql, Object... args) {
           List<Staff>list = new ArrayList<Staff>();
           try {
               ResultSet rs = JdbcHelper.query(sql, args);
               while (rs.next()) {
                   Staff entity = new Staff();
                   entity.setStaffCode(rs.getString("MaNV"));
                   entity.setName(rs.getString("HoTen"));
                   entity.setPassword(rs.getString("MatKhau"));
                   entity.setRole(rs.getBoolean("VaiTro"));
                   list.add(entity);
               }
               rs.getStatement().getConnection().close();
               return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
       
        
    }

    
    
}

