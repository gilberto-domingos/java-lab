package com.jrd.rhuser.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@PostMapping
	public ResponseEntity<User>  save(User user) {
		User us = this.userService.create(user);
		
	  return ResponseEntity.ok(us);
	}

	@GetMapping("/{id}")	
	public ResponseEntity<User>  findByid(@PathVariable(value = "id")  Long id) {
	User userId =	this.userService.findById(id);
		
		return ResponseEntity.ok(userId);
	}
	
	
	@GetMapping("/search")
	@ResponseBody
	public ResponseEntity<User>findByEmail(@RequestParam("email") String email) {
		User obj = this.userService.findByEmail(email);
		return ResponseEntity.ok(obj);
	}
	
	

}
















