package com.educajava.curso.service;


import com.educajava.curso.entities.User;
import com.educajava.curso.repositories.UserRepository;
import com.educajava.curso.service.exceptions.DataBaseException;
import com.educajava.curso.service.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository; // injeta a dependencia do repositorio no serviço

    // metodo que retorna uma lidta de todos usuários
    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id)); // se o id não existir lança a exceção
    }

    public User insert(User user) {
        return  userRepository.save(user);
    }

    public void delete(Long id) {
        if (!userRepository.existsById(id)) {

            throw new ResourceNotFoundException("User with ID " + id + " not found");
        }
        try {
            userRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {

            logger.debug("Failed to delete user with ID {}. Details: {}", id, e.getMessage());
            throw new DataBaseException(e.getMessage());
        }
    }

    public User updateUser(Long id, User user) {

        try {
          User entity = userRepository.getReferenceById(id);
          updateData(entity, user);
          return userRepository.save(entity);
      }catch (EntityNotFoundException e) {
          throw  new ResourceNotFoundException(e.getMessage());
      }
    }

    private void updateData(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }
}


