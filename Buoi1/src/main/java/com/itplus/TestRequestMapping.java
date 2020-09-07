package com.itplus;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class TestRequestMapping {
	@RequestMapping("/sayHello")
	public String sayHello(ModelMap map, @RequestParam(name =
	"username", required = true) String user) {
		map.addAttribute("msg", "Xin chào: "+user);
		return "sayHello";
	}
}
