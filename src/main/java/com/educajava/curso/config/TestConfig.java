package com.educajava.curso.config;

import com.educajava.curso.entities.User;
import com.educajava.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User(null, "Ednaldo Tavares", "junior@gmail.com", "1234567896", "12345");
        User user2 = new User(null, "Miguel Tavares", "iguel@gmail.com", "1234567896", "12345");
        userRepository.saveAll(Arrays.asList(user, user2));

    }
}
