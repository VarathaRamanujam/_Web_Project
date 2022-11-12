package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.UserDao;
import com.example.demo.model.User;

@RestController
public class UserController {
	
//	@Autowired
//	 UserDao obj;
	
	@RequestMapping("index")
	public String User(User user ) {
		return "index.jsp";
	}
	
	@RequestMapping("addUser")
	public String AddUser(User user) {	
		//obj.save(user);
		return "index.jsp";
	}
	

}
