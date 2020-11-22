package com.itplus.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.itplus.dao.CategoryDao;
import com.itplus.entity.Category;

public class CategoryDaoImpl implements CategoryDao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Category> getAll() {
		String sql = "select * from category";
		
		List<Category> listCategory = jdbcTemplate.query(sql, new Object[] {}, new RowMapper<Category>() {
			@Override
			public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Category category = new Category();
				category.setCategoryID(rs.getInt("CategoryID"));
				category.setCategoryName(rs.getString("CategoryName"));
				category.setDescription(rs.getString("Description"));
				return category;
			}
			
		});
		return listCategory;
		
	}
}
