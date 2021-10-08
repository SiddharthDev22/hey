package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.user;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UserController {
	@Autowired
	private UserService srv;
	 
	@PostMapping ("/adduser")
	public ResponseEntity<user> adduser(@RequestBody user ab){
		return this.srv.adduser(ab);
	}
	
	

}
