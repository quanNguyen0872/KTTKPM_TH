package com.iuh.se.springbootresttemplatecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iuh.se.springbootresttemplatecrud.entity.User;
import com.iuh.se.springbootresttemplatecrud.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users/{userId}")
	public User findById(@PathVariable int userId) {
		return userService.getUserById(userId);
	}
	
	@GetMapping("/users")
	public List<User> findAll() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/users")
	public User save(@RequestBody User user) {
		user.setId(0);
		userService.saveUser(user);
		return user;
	}
	
	@PutMapping("/users")
	public User update(@RequestBody User user) {
		userService.saveUser(user);
		return user;
	}
	
	@DeleteMapping("/users/{userId}")
	public String deleteById(@PathVariable int userId) {
		User user = userService.getUserById(userId);
		if(user == null) {
			throw new RuntimeException("User id not found - " + userId);
		}
		userService.deleteUserById(userId);
		return "Delete user id - " + userId;
	}
}
