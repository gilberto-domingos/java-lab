package br.com.api.jrd.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.jrd.dto.UserDTO;
import br.com.api.jrd.entity.User;
import br.com.api.jrd.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	private ModelMapper modelMapper = new ModelMapper();

	@Autowired
	private UserService userService;

	/*
	 * @GetMapping(value = "/{id}") public ResponseEntity<User>
	 * findById(@PathVariable Long id) { return
	 * ResponseEntity.ok().body(userService.findById(id)); }
	 */

	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(modelMapper.map(userService.findById(id), UserDTO.class));
	}

}
