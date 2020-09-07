package com.itplus;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/Hello")
	public String sayHello(ModelMap map) {
		map.addAttribute("msg","Hello Spring MVC");
		return "Hello";
	}
	@RequestMapping("/get-name")
	public String getName(HttpServletRequest request) {
		String hoten = "Tuan Pham Ngoc";
		request.setAttribute("name", hoten);
		return "display";
	}
	
}
