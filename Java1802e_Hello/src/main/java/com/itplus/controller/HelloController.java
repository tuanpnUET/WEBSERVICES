package com.itplus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.itplus.entity.User;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String sayHello(ModelMap map) {
		map.addAttribute("msg", "Hello Spring MVC!!!!");
		return "hello";
	}

	@RequestMapping("/get-name")
	public String getName(HttpServletRequest request) {
		String hoTen = "Nguyen Thai Son";
		request.setAttribute("name", hoTen);
		return "display";
	}

	@RequestMapping(value = "/get-url-param", method = RequestMethod.GET)
	public String getUrlParam(ModelMap map, @RequestParam(name = "username") String username,
			@RequestParam(name = "age") int age) {

		map.addAttribute("name", username);
		map.addAttribute("age", age);
		return "display";
	}

	@RequestMapping("/hello/{name}/{id}")
	public String getPathVariable(HttpServletRequest request, @PathVariable(name = "name") String name,
			@PathVariable(name = "id") int id) {
		request.setAttribute("name", name);
		request.setAttribute("age", id);
		return "display";
	}
	
	@RequestMapping(value = "/form-user", method = RequestMethod.GET)
	public String addUsser(HttpServletRequest request) {	
		User user = new User();
		request.setAttribute("user", user);
		return "formUser";
	}
	@RequestMapping(value = "/add-user", method = RequestMethod.POST)
	public String addUser(HttpServletRequest request, 
			@ModelAttribute("user") @Valid User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "formUser";
		}
		request.setAttribute("user", user);
		return "viewUser";
	}


}
