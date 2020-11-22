package com.itplus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.itplus.dao.BookDao;
import com.itplus.entity.Book;
import com.itplus.model.BookDTO;
import com.itplus.service.BookService;

public class BookServiceImpl implements BookService{
	@Autowired
	BookDao bookDao;
	@Override
	public void addBook(BookDTO bookDTO) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setBookCode(bookDTO.getBookCode());
		book.setAuthor(bookDTO.getAuthor());
		book.setCategoryID(bookDTO.getCategoryID());
		book.setNumOfPage(bookDTO.getNumOfPage());
		book.setPrice(bookDTO.getPrice());
		book.setTitle(bookDTO.getTitle());
		book.setReleaseDate(bookDTO.getReleaseDate());
		bookDao.addBook(book);	
	}

}
