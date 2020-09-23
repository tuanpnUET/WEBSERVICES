package com.itplus.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.itplus.model.UserDTO;
import com.itplus.service.UserService;

@RestController
public class UserRestController {	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/ws-list-user", method = RequestMethod.GET)
	//public List<UserDTO> getUserList(HttpServletRequest request) {
	public String getUserList(HttpServletRequest request) {
		//Gọi service để lấy danh sách người dùng
		List<UserDTO> list = userService.getAll();
		//gửi list ra view
		//request.setAttribute("listUser", list);
		Gson gson = new Gson();
		return gson.toJson(list);
	}
	@RequestMapping(value = "/ws-add-new-user", method = RequestMethod.POST)
	public String addUser(HttpServletRequest request, @RequestParam(name = "name") String name, 
			@RequestParam(name = "phone") String phone, @RequestParam(name = "age") int age) {		
		UserDTO userDTO = new UserDTO();
		userDTO.setName(name);
		userDTO.setPhone(phone);
		userDTO.setAge(age);
		try {
			userService.addUser(userDTO);
			return "add success";
		} catch (Exception e) {
			// TODO: handle exception
			return "add error";
		}		
	}
	@RequestMapping(value = "/ws-add-new-user2", method = RequestMethod.POST)
	public String addUser2(@RequestBody UserDTO userDTO) {		
		try {
			userService.addUser(userDTO);
			return "add success 2";
		} catch (Exception e) {
			// TODO: handle exception
			return "add error 2";
		}		
	}
}
