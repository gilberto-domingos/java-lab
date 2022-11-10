package br.com.api.jrd.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.jrd.entity.User;
import br.com.api.jrd.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findById(Long id) {
		Optional<User>obj = userRepository.findById(id);
		return obj.orElse(null);
	}

}
