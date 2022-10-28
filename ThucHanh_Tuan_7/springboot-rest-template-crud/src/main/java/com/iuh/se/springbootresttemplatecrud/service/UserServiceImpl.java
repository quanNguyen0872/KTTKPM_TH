package com.iuh.se.springbootresttemplatecrud.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iuh.se.springbootresttemplatecrud.entity.User;
import com.iuh.se.springbootresttemplatecrud.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	@Transactional
	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(users::add);
		return users;
	}

	@Override
	@Transactional
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	@Transactional
	public void deleteUserById(int id) {
		userRepository.deleteById(id);
	}

}
