package com.cidran.projeto_spring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cidran.projeto_spring.entities.User;
import com.cidran.projeto_spring.repositories.UserRepository;

@Configuration
@Profile("dev")
public class DevConfig implements CommandLineRunner{ //Implementar essa interface garante que o método run seja executado na inicialização da aplicação.
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
