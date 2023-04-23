/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.DAO;


import java.util.ArrayList;
import java.util.List;


import com.edusys.entity.Course;
import com.edusys.utils.JdbcHelper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nongn
 */
public class CourseDAO extends EduSysDAO<Course, Integer> {

    String INSERT_SQL = "INSERT INTO KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE KhoaHoc SET MaCD=?, HocPhi=?, ThoiLuong=?, NgayKG=?, GhiChu=?, MaNV=? WHERE MaKH=?";
    String DELETE_SQL = "DELETE FROM KhoaHoc WHERE MaKH=?";
    String SELECT_ALL_SQL = "SELECT *FROM KhoaHoc";
    String SELECT_BY_ID_SQL = "SELECT*FROM KhoaHoc WHERE MaKH=?";

    @Override
    public void insert(Course entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getThematicCode(),
                entity.getTuition(),
                entity.getTime(),
                entity.getKhaigiang(),
                entity.getNote(),
                entity.getStaffCode());
    }

    @Override
    public void update(Course entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getThematicCode(),
                entity.getTuition(),
                entity.getTime(),
                entity.getKhaigiang(),
                entity.getNote(),
                entity.getStaffCode(),
                entity.getCourseCode());
    }

    @Override
    public List<Course> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
	public List<Course> selectBySql(String sql, Object... args) {
        List<Course> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while (rs.next()) {
                    Course model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private Course readFromResultSet(ResultSet rs) throws SQLException {
        Course model = new Course();
        model.setCourseCode(rs.getInt("MaKH"));
        model.setTuition(rs.getDouble("HocPhi"));
        model.setTime(rs.getInt("ThoiLuong"));
        model.setKhaigiang(rs.getDate("NgayKG"));
        model.setNote(rs.getString("GhiChu"));
        model.setStaffCode(rs.getString("MaNV"));
        model.setNgaytaoDate(rs.getDate("NgayTao"));
        model.setThematicCode(rs.getString("MaCD"));
        return model;

    }

    @Override
    public void delete(Integer id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public Course selectById(Integer id) {
        List<Course> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<Course> selectByThematic(String cd) {
        String sql = "SELECT * FROM KhoaHoc WHERE MaCD=?";
        return this.selectBySql(sql, cd);
    }
    public List<Integer> selectYears(){
        String sql = "SELECT DISTINCT year(NgayKG) Year FROM KhoaHoc ORDER BY Year DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while(rs.next()){
                list.add(rs.getInt(1));
            };
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}

