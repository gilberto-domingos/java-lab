package br.com.api.jrd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.api.jrd.dto.UserDTO;
import br.com.api.jrd.entity.User;
import br.com.api.jrd.repository.UserRepository;
import br.com.api.jrd.service.UserServiceImpl;
import br.com.api.jrd.service.exceptions.DataIntegratyViolationException;
import br.com.api.jrd.service.exceptions.ObjectNotFoundException;

@SpringBootTest
public class UserServiceImplTest {

	private static final Long ID = (long) 1;
	private static final Integer INDEX = 0;
	private static final String NAME = "Valdir";
	private static final String EMAIL = "val@hotmail.com";
	private static final String PASSWORD = "123";

	private static final String INFOMACAO_NAO_ENCONTRADA = "Informação não encontrada";
	private static final String EMAIL_JA_CADASTRADO_NO_SISTEMA = "Email já cadastrado no sistema";

	@InjectMocks
	private UserServiceImpl userServiceImpl;

	@Mock
	private UserRepository userRepository;

	@Mock
	private ModelMapper modelMapper;

	private User user;
	private UserDTO userDTO;
	private Optional<User> optionalUser;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		startUser();
	}

	@Test
	void whenFindByIdThenReturnAnUserInstance() {
		Mockito.when(userRepository.findById(Mockito.anyLong())).thenReturn(optionalUser);

		User response = userServiceImpl.findById(ID);

		assertNotNull(response);

		assertEquals(User.class, response.getClass());
		assertEquals(ID, response.getId());
		assertEquals(NAME, response.getName());
		assertEquals(EMAIL, response.getEmail());
	}

	@Test
	void whenFindByIdThenReturnAnObjectNotFoundException() {
		when(userRepository.findById(anyLong())).thenThrow(new ObjectNotFoundException(INFOMACAO_NAO_ENCONTRADA));

		try {
			userServiceImpl.findById(ID);
		} catch (Exception ex) {
			assertEquals(ObjectNotFoundException.class, ex.getClass());
			assertEquals(INFOMACAO_NAO_ENCONTRADA, ex.getMessage());
		}

	}

	@Test
	void whenFidAllThenReturnAnListOfUsers() {
		when(userRepository.findAll()).thenReturn(List.of(user));

		List<User> response = userServiceImpl.findAll();

		assertNotNull(response);
		assertEquals(1, response.size());
		assertEquals(User.class, response.get(INDEX).getClass());
		assertEquals(ID, response.get(INDEX).getId());
		assertEquals(NAME, response.get(INDEX).getName());
		assertEquals(EMAIL, response.get(INDEX).getEmail());
		assertEquals(PASSWORD, response.get(INDEX).getPassword());
	}

	@Test
	void whenCreateThenReturnSucess() {
		when(userRepository.save(any())).thenReturn(user);

		User response = userServiceImpl.create(userDTO);

		assertNotNull(response);
		assertEquals(User.class, response.getClass());
		assertEquals(ID, response.getId());
		assertEquals(NAME, response.getName());
		assertEquals(EMAIL, response.getEmail());
		assertEquals(PASSWORD, response.getPassword());

	}

	@Test
	void whenCreateThenReturnAnDataIntegratyViolationException() {
		when(userRepository.findByEmail(anyString())).thenReturn(optionalUser);

		try {
			optionalUser.get().setId((long) 2);
			userServiceImpl.create(userDTO);
		} catch (Exception ex) {
			assertEquals(DataIntegratyViolationException.class, ex.getClass());
			assertEquals(EMAIL_JA_CADASTRADO_NO_SISTEMA, ex.getMessage());
		}
	}

	@Test
	void whenUpdateThenReturnSuccess() {
		when(userRepository.save(any())).thenReturn(user);

		User response = userServiceImpl.update(userDTO);

		assertNotNull(response);
		assertEquals(User.class, response.getClass());
		assertEquals(ID, response.getId());
		assertEquals(NAME, response.getName());
		assertEquals(EMAIL, response.getEmail());
		assertEquals(PASSWORD, response.getPassword());
	}

	@Test
	void whenUpdateThenReturnAnDataIntegrityViolationException() {
		when(userRepository.findByEmail(anyString())).thenReturn(optionalUser);

		try {
			optionalUser.get().setId((long) 2);
			userServiceImpl.create(userDTO);
		} catch (Exception ex) {
			assertEquals(DataIntegratyViolationException.class, ex.getClass());
			assertEquals(EMAIL_JA_CADASTRADO_NO_SISTEMA, ex.getMessage());
		}
	}

	@Test
	void deleteWithSuccess() {
		when(userRepository.findById(anyLong())).thenReturn(optionalUser);
		doNothing().when(userRepository).deleteById(anyLong());
		userServiceImpl.delete(ID);
		verify(userRepository, times(1)).deleteById(anyLong());
	}

	@Test
	void whenDeleteThenReturnObjectNotFoundException() {
		when(userRepository.findById(anyLong())).thenThrow(new ObjectNotFoundException(INFOMACAO_NAO_ENCONTRADA));
		try {
			userServiceImpl.delete(ID);
		} catch (Exception ex) {
			assertEquals(ObjectNotFoundException.class, ex.getClass());
			assertEquals(INFOMACAO_NAO_ENCONTRADA, ex.getMessage());
		}
	}

	private void startUser() {
		user = new User(ID, NAME, EMAIL, PASSWORD);
		userDTO = new UserDTO(ID, NAME, EMAIL, PASSWORD);
		optionalUser = Optional.of(new User(ID, NAME, EMAIL, PASSWORD));
	}

}
