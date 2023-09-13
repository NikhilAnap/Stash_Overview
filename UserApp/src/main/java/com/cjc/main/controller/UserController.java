package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.User;
import com.cjc.main.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService us;

	
	@PostMapping("/save")
	public ResponseEntity<User> saveData(@RequestBody User u) {
		User user= us.davedata(u);
		return new ResponseEntity<User>(user, HttpStatus.OK);
		
	}


	@GetMapping("/getall")
	public ResponseEntity<Iterable<User>> getAllData(){
		Iterable<User> user=us.getAllData();
		return new ResponseEntity<Iterable<User>>(user, HttpStatus.OK);
	}
}
