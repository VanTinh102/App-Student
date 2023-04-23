/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.DAO;

import com.edusys.entity.Learner;
import com.edusys.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author nongn
 */
public class LearnerDAO extends EduSysDAO<Learner, String> {

    String INSERT_SQL = "INSERT INTO NguoiHoc (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV)\n"
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE NguoiHoc SET HoTen=?, NgaySinh=?, GioiTinh=?, DienThoai=?, Email=?, GhiChu=?,\n"
            + "MaNV=? WHERE MaNH=?";
    String DELETE_SQL = "DELETE FROM NguoiHoc WHERE MaNH=?";
    String SELECT_ALL_SQL = "SELECT * FROM NguoiHoc";
    String SELECT_BY_ID_SQL = "SELECT * FROM NguoiHoc WHERE MaNH=?";

    @Override
    public void insert(Learner entity) {
        try {
			JdbcHelper.update(INSERT_SQL,
			        entity.getLearnerCode(),
			        entity.getName(),
			        entity.getDateOfBirth(),
			        entity.getSex(),
			        entity.getPhone(),
			        entity.getEmail(),
			        entity.getNote(),
			        entity.getStaffCode());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public void update(Learner entity) {
        try {
			JdbcHelper.update(UPDATE_SQL,
			        entity.getName(),
			        entity.getDateOfBirth(),
			        entity.getSex(),
			        entity.getPhone(),
			        entity.getEmail(),
			        entity.getNote(),
			        entity.getStaffCode(),
			        entity.getLearnerCode());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public void delete(String id) {
try {
	JdbcHelper.update(DELETE_SQL, id);
} catch (Exception e) {
	// TODO: handle exception
	throw new RuntimeException("Fail");
}
			

    }

    @Override
    public Learner selectById(String id) {
        List<Learner> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<Learner> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<Learner> selectBySql(String sql, Object... args) {
        List<Learner> list = new ArrayList<Learner>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while (rs.next()) {
                    Learner model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private Learner readFromResultSet(ResultSet rs) throws SQLException {
        Learner model = new Learner();
        model.setLearnerCode(rs.getString("MaNH"));
        model.setName(rs.getString("HoTen"));
        model.setDateOfBirth(rs.getDate("NgaySinh"));
        model.setSex(rs.getBoolean("GioiTinh"));
        model.setPhone(rs.getString("DienThoai"));
        model.setEmail(rs.getString("Email"));
        model.setNote(rs.getString("GhiChu"));
        model.setStaffCode(rs.getString("MaNV"));
        model.setDateOfBirth(rs.getDate("NgayDK"));
        return model;
    }

    public List<Learner> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM NguoiHoc WHERE HoTen LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    ;
//    public List<Learner> selectNotlnCourse(int courseId, String keyword) {
//        String sql = "SELECT * FROM NguoiHoc"
//                +"WHERE HoTen LIKE ? AND "
//                +"MaNH NOT IN(SELECT MaNH FROM HocVien WHERE MaKH = ? )";
//        return this.selectBySql(sql, "%" + keyword + "%", courseId);
//    }
    public List<Learner> selectNotInCourse(int makh, String keyword){
        String sql = "SELECT * FROM NguoiHoc WHERE HoTen LIKE ? AND MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH = ?)";
        return this.selectBySql(sql, "%" + keyword+ "%", makh);
    }

}

