package com.mohamed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mohamed.model.Student;

@Controller
@RequestMapping("/student")
public class HandlerController {

	@RequestMapping(value = "/viewForm")
	public String viewForm(Model model) {
		
		model.addAttribute("studentform",new Student());	
		return "student-form";
		
	}
	
	
	@RequestMapping(value = "/registerStudent")
	public String registerStudent(@ModelAttribute("studentform") Student s) {
		
		// we will validate 
		return "viewstudent";
	}
	
	@RequestMapping(value = "/viewstudent")
	public String viewstudent() {
		
		return "viewstudent";
		
	}
	
}
