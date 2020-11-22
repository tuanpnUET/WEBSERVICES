package com.itplus.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.itplus.dao.BookDao;
import com.itplus.entity.Book;

public class BookDaoImpl implements BookDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		String sql = "insert into book(BookCode, Title, NumberOfPage, Author, Price, ReleaseDate, CategoryID) values(?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, book.getBookCode(), book.getTitle(), book.getNumOfPage(), book.getAuthor(), book.getPrice(), book.getReleaseDate(), book.getCategoryID());
	}
}
