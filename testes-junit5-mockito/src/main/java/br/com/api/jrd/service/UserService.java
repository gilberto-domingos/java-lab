package br.com.api.jrd.service;

import java.util.List;

import br.com.api.jrd.dto.UserDTO;
import br.com.api.jrd.entity.User;

public interface UserService {
	User findById(Long id);

	List<User> findAll();
	
	User create(UserDTO obj);
	
	User update(UserDTO obj);

}
