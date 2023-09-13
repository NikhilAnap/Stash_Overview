package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.User;
import com.cjc.main.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService us;

	@GetMapping("/getSingle/{id}")
	public ResponseEntity<User> getSingle(@PathVariable int id) {

		User user = us.getSingle(id);

		return new ResponseEntity<User>(user, HttpStatus.OK);

	}

}
