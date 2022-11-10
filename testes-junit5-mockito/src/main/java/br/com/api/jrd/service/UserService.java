package br.com.api.jrd.service;

import java.util.List;

import br.com.api.jrd.entity.User;

public interface UserService {
public User findById(Long id);
public List<User> findAll();
	// public List<Car> findAll();
}
