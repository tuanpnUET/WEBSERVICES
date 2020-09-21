package com.itplus.controller;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
	@RequestMapping("/cal")
	public String showForm() {
		return "Calculator";
	}
//	@RequestMapping(value = "/result", method = RequestMethod.POST)
//	@RequestMapping(value = "/result", method = RequestMethod.GET)
	@RequestMapping("/result")
	public String cal(HttpServletRequest request,@RequestParam("result") double result, Model model) {
		double numberA = Double.parseDouble(request.getParameter("numberA"));
		double numberB = Double.parseDouble(request.getParameter("numberB"));
		result = numberA+numberB;
		model.addAttribute("result", result);
		return "result";
	}
}
