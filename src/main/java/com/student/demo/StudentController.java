package com.student.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/getAll")
	public String getAll(Model model) {
		List <Students> ls= objRepo.findAll();
		  ls.forEach(System.out::println);
		ls.sort(new MyComparator());
		  
		  System.out.println();
		  System.out.println();
		  ls.forEach(System.out::println);
		model.addAttribute("id", ls);
	return	"StudentInfo";
	}
	
	@GetMapping("/createUsers")
	public String create() {
		return "create";
	}
	
	@GetMapping("/deleteUsers")
	public String delete() {
		return "delete";
	}

	@GetMapping("/addUser")
	public String getUser(@RequestParam("registerNo")Integer registerNo,@RequestParam("name")String name, Model model) {	
//		System.out.println( ls);
		Optional<Students> i=objRepo.findById(registerNo);
		Students id=i.get();
		model.addAttribute("id", id);
		System.out.println(name);
		return "StudentInfo";
	}
	
//	@GetMapping("/GetUser/{id}")
//	@ResponseBody
//	public Optional<Students> getUser(@PathVariable Integer id){
//	System.out.println(objRepo.findById(id));	
//	return 	objRepo.findById(id);
//	}
	
	@GetMapping("/createUser")
	
	public String createuser(@RequestParam("registerNumber")int registerNumber,@RequestParam("name")String name,@RequestParam("phonenumber")String phonenumber) {	
		//System.out.println(dob);
		Students students=new Students(name, registerNumber,phonenumber);
		objRepo.save(students);
		return "index";
	}
	
	@GetMapping("/deleteUser")
	public String deleteUser(@RequestParam("registerNumber")int registerNumber) {	
		objRepo.deleteById(registerNumber);	
		return "index";
	}
	
}
