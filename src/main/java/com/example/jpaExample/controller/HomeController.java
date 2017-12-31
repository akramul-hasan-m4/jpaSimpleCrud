package com.example.jpaExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.jpaExample.Entity.Todo;
import com.example.jpaExample.dao.TodoDaoService;

@Controller
public class HomeController {
	@Autowired
	TodoDaoService service;

	@RequestMapping("/")
	public String homePage(ModelMap map) {
		map.addAttribute("list", service.getAll());
		return "index";
	}


	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String adddata(@ModelAttribute Todo todo) {
		service.savedata(todo);
		return "redirect:/";
		
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String editdata(@ModelAttribute Todo todo) {
		service.savedata(todo);
		return "redirect:/";
		
	}
	@RequestMapping(value = "/delete/{id}")
	public String deletedata(@PathVariable("id") String id) {
		service.deletedata(Long.parseLong(id));
		return "redirect:/";
		
	}
	@RequestMapping(value = "/update/{id}")
	public String findById(@PathVariable("id") String id,ModelMap map) {
		map.addAttribute("editlist", service.findById(Long.parseLong(id)));
		return "edit";
		
	}
}
