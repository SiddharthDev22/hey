package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.user;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl  implements UserService{
	@Autowired
	private UserRepository us;
	
	@Override
	public ResponseEntity<user> adduser(user ab){
		
		us.saveAndFlush(ab);
		
		return ResponseEntity.ok(ab);
		
	}
	}

