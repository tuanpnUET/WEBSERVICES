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

import com.itplus.model.UserDTO;
import com.itplus.service.UserService;


@Controller
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping(value = "/list-user", method = RequestMethod.GET)
	public String getUserList(HttpServletRequest request) {
		//Gọi service để lấy danh sách người dùng
		List<UserDTO> list = userService.getAll();
		//gửi list ra view
		request.setAttribute("listUser", list);
		return "userList";
	}
	
	@RequestMapping(value = "add-new-user", method = RequestMethod.GET)
	public String addUser(HttpServletRequest request) {
		request.setAttribute("userDTO", new UserDTO());
		return "user/addUser";
	}
	
	@RequestMapping(value = "/add-new-user", method = RequestMethod.POST)
	public String addUser(HttpServletRequest request, @ModelAttribute("userDTO") @Valid UserDTO userDTO, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "user/addUser";
		}
		userService.addUser(userDTO);
		return "redirect:/list-user";
	}
}
