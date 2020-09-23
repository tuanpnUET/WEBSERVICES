package com.itplus.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.itplus.dao.UserDao;
import com.itplus.entity.User;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		//Kết nối csdl ở đây
		String sql = "select * from khach_hang";
		
		List<User> listUser = jdbcTemplate.query(sql, new Object[] {}, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setTen_kh(rs.getString("ten_kh"));
				user.setSo_dt(rs.getString("so_dt"));
				user.setTuoi(rs.getInt("tuoi"));
				return user;
			}
			
		});
		return listUser;
		
	}
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into khach_hang(ten_kh, so_dt, tuoi) values(?, ?, ?)";
		jdbcTemplate.update(sql, user.getTen_kh(), user.getSo_dt(), user.getTuoi());
		
	}
	
}
