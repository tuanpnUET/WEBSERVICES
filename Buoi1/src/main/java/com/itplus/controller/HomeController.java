package com.itplus.controller;

import java.awt.List;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.itplus.entity.Person;
@Controller
public class HomeController {
  @RequestMapping("/home")
  public String home() {
    return "home";
  }
  @RequestMapping("/personForm")
  public String personForm() {
    return "FormPerson";
  }
  @RequestMapping("/test1/{id}")
  public String test1(@PathVariable("id") int id, Model model) {
    model.addAttribute("id", id);
    return "test1";
  }
  @RequestMapping("/test2/{id}/{name}")
  public String test2(@PathVariable("id") int id, @PathVariable("name") String name, Model model) {
    model.addAttribute("id", id);
    model.addAttribute("name", name);
    return "test2";
  }
  @RequestMapping("/test3")
  public String test3(@RequestParam("name") String name, @RequestParam("id") int id, Model model) {
    model.addAttribute("id", id);
    model.addAttribute("name", name);
    return "test3";
  }
  @RequestMapping(value = "/add-person", method = RequestMethod.POST)
  public String addPerson(HttpServletRequest request, @ModelAttribute("user") @Valid Person person , BindingResult bindingResult) {
  	if (bindingResult.hasErrors()) {
  		return "FormPerson";
  	}
  	request.setAttribute("person", person);
  	return "displayForm";
  }
  
}