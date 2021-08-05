package com.jrd.rhuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrd.rhuser.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByEmail(String email);
}
