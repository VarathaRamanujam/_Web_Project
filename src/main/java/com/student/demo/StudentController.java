package com.student.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.demo.model.Students;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepo objRepo;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	

	@GetMapping("/addUser")
	//@ResponseBody
	public String addUser( Model model) {
		List <Students> ls= objRepo.findAll();
		System.out.println( ls);
		Students id=ls.get(1);
		model.addAttribute("id", id);
		return "bootstrap";
	}
	
	@GetMapping("/GetUser/{id}")
	@ResponseBody
	public Optional<Students> getUser(@PathVariable Integer id){
		System.out.println(objRepo.findById(id));
	return 	objRepo.findById(id);
	}
}
