package br.com.api.jrd.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.jrd.dto.UserDTO;
import br.com.api.jrd.entity.User;
import br.com.api.jrd.repository.UserRepository;
import br.com.api.jrd.service.exceptions.DataIntegratyViolationException;
import br.com.api.jrd.service.exceptions.ObjectNotFoundException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private ModelMapper modelmapper;

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Informação não encontrada"));
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();

	}

	@Override
	public User create(UserDTO obj) {
		findByEmail(obj);
		return userRepository.save(modelmapper.map(obj, User.class));
	}

	@SuppressWarnings("unused")
	private void findByEmail(UserDTO obj) {

		Optional<User> user = userRepository.findByEmail(obj.getEmail());
		
		if(user.isPresent()) {
			throw new DataIntegratyViolationException("Email já cadastrado no sistema");
		}

	}

}
