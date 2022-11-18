package br.com.api.jrd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.api.jrd.controller.UserController;
import br.com.api.jrd.dto.UserDTO;
import br.com.api.jrd.entity.User;
import br.com.api.jrd.service.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;


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
	private UserService userService;

	@Mock
	private ModelMapper modelMapper;

	@BeforeEach
	void setup() {
		MockitoAnnotations.openMocks(this);
		startUser();

	}

	
	@Test
    void whenFindByIdThenReturnSuccess() {
      when(userService.findById(anyLong())).thenReturn(user);
      when(modelMapper.map(any(), any())).thenReturn(userDTO);
      
      ResponseEntity<UserDTO> response = userController.findById(ID);

      assertNotNull(response);
      assertNotNull(response.getBody());
      assertEquals(ResponseEntity.class, response.getClass());
      assertEquals(UserDTO.class, response.getBody().getClass());

      assertEquals(ID, response.getBody().getId());
      assertEquals(NAME, response.getBody().getName());
      assertEquals(EMAIL, response.getBody().getEmail());
      assertEquals(PASSWORD, response.getBody().getPassword());
        
    }
	
	
	@Test
    void whenFindAllThenReturnAListOfUserDTO() {
        when(userService.findAll()).thenReturn(List.of(user));
        when(modelMapper.map(any(), any())).thenReturn(userDTO);

        ResponseEntity<List<UserDTO>> response = userController.findAll();

        assertNotNull(response);
        assertNotNull(response.getBody());
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(ResponseEntity.class, response.getClass());
        assertEquals(ArrayList.class, response.getBody().getClass());
        assertEquals(UserDTO.class, response.getBody().get(INDEX).getClass());

        assertEquals(ID, response.getBody().get(INDEX).getId());
        assertEquals(NAME, response.getBody().get(INDEX).getName());
        assertEquals(EMAIL, response.getBody().get(INDEX).getEmail());
        assertEquals(PASSWORD, response.getBody().get(INDEX).getPassword());
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
