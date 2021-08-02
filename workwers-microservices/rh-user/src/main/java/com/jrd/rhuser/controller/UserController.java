package com.jrd.rhuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.rhuser.entity.User;
import com.jrd.rhuser.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/{id}")	
	public ResponseEntity<User>  findByid(@PathVariable(value = "id")  Long id) {
	User userId =	this.userService.findById(id);
		
		return ResponseEntity.ok(userId);
	}

}
