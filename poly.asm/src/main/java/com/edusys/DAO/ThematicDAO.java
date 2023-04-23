/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.DAO;

import com.edusys.entity.Thematic;
import com.edusys.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author nongn
 */
public class ThematicDAO extends EduSysDAO<Thematic, String> {

    String INSERT_SQL = "INSERT INTO ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa) VALUES (?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE ChuyenDe SET TenCD=?, HocPhi=?, ThoiLuong=?, Hinh=?, MoTa=? WHERE MaCD=?";
    String DELETE_SQL = "DELETE FROM ChuyenDe WHERE MaCD=?";
    String SELECT_ALL_SQL = "SELECT * FROM ChuyenDe";
    String SELECT_BY_ID_SQL = "SELECT * FROM ChuyenDe WHERE MaCD=?";

    @Override
    public void insert(Thematic entity) {
        if (entity == null) {
            throw new NullPointerException("Thematic entity cannot be null");
        }
        if (entity.getThematicCode() == null || entity.getThematicName() == null) {
            throw new NullPointerException("Thematic code and name cannot be null");
        }
        JdbcHelper.update(INSERT_SQL, entity.getThematicCode(), entity.getThematicName(), entity.getTuition(), entity.getTime(), entity.getAvatar(), entity.getNote());
    }

    @Override
    public void update(Thematic entity) {
        if (entity == null) {
            throw new NullPointerException("Thematic entity cannot be null");
        }
        if (entity.getThematicCode() == null || entity.getThematicName() == null) {
            throw new NullPointerException("Thematic code and name cannot be null");
        }
        JdbcHelper.update(UPDATE_SQL, entity.getThematicName(), entity.getTuition(), entity.getTime(), entity.getAvatar(), entity.getNote(), entity.getThematicCode());
    }

    @Override
    public void delete(String id) {
    if (id == null || id.isEmpty() || !id.matches("^\\w+$")) {
        throw new IllegalArgumentException("Invalid id: " + id);
    }
    JdbcHelper.update(DELETE_SQL, id);
}


    @Override
    public Thematic selectById(String id) {
        List<Thematic> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<Thematic> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
	public List<Thematic> selectBySql(String sql, Object... args) {
        List<Thematic> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            if (rs != null) {
                while (rs.next()) {
                    Thematic entity = new Thematic();
                    entity.setThematicCode(rs.getString("MaCD"));
                    entity.setThematicName(rs.getString("TenCD"));
                    entity.setTuition(rs.getDouble("HocPhi"));
                    entity.setTime(rs.getInt("ThoiLuong"));
                    entity.setAvatar(rs.getString("Hinh"));
                    entity.setNote(rs.getString("MoTa"));
                    list.add(entity);
                }
                rs.getStatement().getConnection().close();
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
