package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.user;

@Service
public interface UserService {

	ResponseEntity<user> adduser(user ab);

	
}
