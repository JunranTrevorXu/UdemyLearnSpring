package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student student = new Student();
		System.out.println("create student: " + student);
		model.addAttribute("student", student);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
		return "student-confirmation";
	}
	
	@RequestMapping("/modelPass")
	public String modelPass(@ModelAttribute("student") Student student) {
		System.out.println(student);
		return "model-pass";
	}
}
