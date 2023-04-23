/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.DAO;


import com.edusys.entity.Learner;
import com.edusys.entity.Student;
import com.edusys.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nongn
 */
public class StudentDAO extends EduSysDAO<Student, Integer> {

    String INSERT_SQL = "INSERT INTO HocVien(MaKH, MaNH, Diem) VALUES(?, ?, ?)";
    String UPDATE_SQL = "UPDATE HocVien SET MaKH=?, MaNH=?, Diem=? WHERE MaHV=?";
    String DELETE_SQL = "DELETE FROM HocVien WHERE MaHV=?";
    String SELECT_ALL_SQL = "SELECT * FROM HocVien";
    String SELECT_BY_ID_SQL = "SELECT*FROM HocVien WHERE MaHV=?";

    @Override
    public void insert(Student entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getCourseCode(),
                entity.getLearnerCode(),
                entity.getPoint());
    }

    @Override
    public void update(Student entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getCourseCode(),
                entity.getLearnerCode(),
                entity.getPoint(),
                entity.getStudentCode());
    }

    @Override
    public List<Student> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);

    }

    @Override
	public List<Student> selectBySql(String sql, Object... args) {
        List<Student> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while (rs.next()) {
                    Student model = readFromResultSet(rs);
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

    private Student readFromResultSet(ResultSet rs) throws SQLException {
        Student model = new Student();
        model.setStudentCode(rs.getInt("MaHV"));
        model.setCourseCode(rs.getInt("MaKH"));
        model.setLearnerCode(rs.getString("MaNH"));
        model.setPoint(rs.getFloat("Diem"));
        return model;
    }


@Override
public void delete(Integer id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
public Student selectById(Integer id) {
        List<Student> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<Student> selectByCourse(int courseId) {
        String sql = "SELECT * FROM HocVien Where MaKH = ?";
        return this.selectBySql(sql, courseId);
    }

}

