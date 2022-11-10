package br.com.api.jrd.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.api.jrd.entity.User;
import br.com.api.jrd.repository.UserRepository;

@Configuration
@Profile("local")
public class LocalConfig {
	
	@Autowired
	private UserRepository userRepository;
	
	@Bean
	public void startDB() {
		User u1 = new User(null, "Valdir", "val@hotmail.com", "123");
		User u2= new User(null, "Luiz", "luiz@hotmail.com", "123");
		
		
		userRepository.saveAll(List.of(u1,u2));
	}

}
