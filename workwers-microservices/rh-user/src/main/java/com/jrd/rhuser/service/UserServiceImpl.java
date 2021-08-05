package com.jrd.rhuser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrd.rhuser.entity.User;
import com.jrd.rhuser.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User create(User user) {
		return this.userRepository.save(user);
	}
	
	@Override
	public User findById(Long id) {
		return this.userRepository.findById(id).get();
	}

	@Override
	public User findEmail(String email) {
		return this.userRepository.findByEmail(email);
	}

	
	
	
	
	
}
