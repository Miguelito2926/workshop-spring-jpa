package com.educajava.curso.service;

import com.educajava.curso.entities.User;
import com.educajava.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository; // injeta a dependencia do repositorio no serviço

// metodo que retorna uma lidta de todos usuários
    public List<User> findAll() {
        return  userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }
}
