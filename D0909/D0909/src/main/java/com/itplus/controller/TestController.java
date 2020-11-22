package com.itplus.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itplus.model.BookDTO;
import com.itplus.model.CategoryDTO;
import com.itplus.service.BookService;
import com.itplus.service.CategoryService;


@Controller
public class TestController {
	@Autowired
	CategoryService categoryService;
	@Autowired
	BookService bookService;
	
	@RequestMapping(value = "/list-category", method = RequestMethod.GET)
	public String getCategoryList(HttpServletRequest request) {
		List<CategoryDTO> list = categoryService.getAll();
		request.setAttribute("listCategory", list);
		return "categoryList";
	}
	@RequestMapping(value = "add-new-book", method = RequestMethod.GET)
	public String addBook(HttpServletRequest request) {
		request.setAttribute("bookDTO", new BookDTO());
		return "book/addBook";
	}
	
	@RequestMapping(value = "/add-new-book", method = RequestMethod.POST)
	public String addBook(HttpServletRequest request, @ModelAttribute("bookDTO") @Valid BookDTO bookDTO, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "book/addBook";
		}
		bookService.addBook(bookDTO);
		return "redirect:/list-category";
	}
}

