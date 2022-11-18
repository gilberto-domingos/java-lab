package br.com.api.jrd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.api.jrd.controller.UserController;
import br.com.api.jrd.dto.UserDTO;
import br.com.api.jrd.entity.User;
import br.com.api.jrd.service.UserServiceImpl;

@SpringBootTest
public class userControllerTest {

	private static final Long ID = (long) 1;
	private static final Integer INDEX = 0;
	private static final String NAME = "Valdir";
	private static final String EMAIL = "val@hotmail.com";
	private static final String PASSWORD = "123";

	private User user = new User();

	private UserDTO userDTO = new UserDTO();

	@InjectMocks
	private UserController userController;

	@Mock
	private UserServiceImpl userServiceImpl;

	@Mock
	private ModelMapper modelMapper;

	@BeforeEach
	void setup() {
		MockitoAnnotations.openMocks(this);
		startUser();

	}

	@Test
	void findById() {

	}

	@Test
	void findAll() {

	}

	@Test
	void update() {

	}

	@Test
	void deleteById() {

	}

	private void startUser() {
		user = new User(ID, NAME, EMAIL, PASSWORD);
		userDTO = new UserDTO(ID, NAME, EMAIL, PASSWORD);

	}

}
