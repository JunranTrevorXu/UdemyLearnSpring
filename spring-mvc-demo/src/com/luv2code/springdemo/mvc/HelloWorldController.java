package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sun.util.logging.resources.logging;

@Controller
public class HelloWorldController {

	// a controller method for initial form
	@RequestMapping("/showForm")
	public String showForm(@ModelAttribute("student") Student student, Model model) {
		System.out.println("ACE weird: " + student);
		model.addAttribute("student", student);
		return "helloworld-form";
	}
	
	// a follow up page
	@RequestMapping("/processForm/a")
	public String processForm() {
		return "helloworld";
	}
	
	// play with model
	@RequestMapping("/processFormV2")
	//public String toUppercase(HttpServletRequest request, Model model) {
	public String toUppercase(@RequestParam("studentName") String name, Model model) {
		
		//String name = request.getParameter("studentName");
		name = name.toUpperCase();
		model.addAttribute("message", "lmfao " + name);
		// this is not gonna work
		// model.addAttribute("param", "lmao");
		return "helloworld";
	}
	
	
	
}
