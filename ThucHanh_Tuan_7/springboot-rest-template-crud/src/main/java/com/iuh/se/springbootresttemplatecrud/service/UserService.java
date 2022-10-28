package com.iuh.se.springbootresttemplatecrud.service;

import java.util.List;

import com.iuh.se.springbootresttemplatecrud.entity.User;

public interface UserService {
	public User getUserById(int id);
	public List<User> getAllUsers();
	public void saveUser(User user);
	public void deleteUserById(int id);
}
