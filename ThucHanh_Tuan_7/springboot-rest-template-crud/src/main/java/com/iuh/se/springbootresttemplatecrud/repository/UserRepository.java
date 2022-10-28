package com.iuh.se.springbootresttemplatecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iuh.se.springbootresttemplatecrud.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
