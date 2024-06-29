/*
package com.educajava.curso.service.teste;

import com.educajava.curso.repositories.UserRepository;
import com.educajava.curso.service.UserService;
import com.educajava.curso.service.exceptions.ResourceNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
@Service
class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void deleteUser_whenUserDoesNotExist_shouldThrowResourceNotFoundException() {
        Long nonExistentUserId = 999L; // Certifique-se de que o ID não está nulo

        // Configura o mock para lançar EmptyResultDataAccessException quando deleteById for chamado
        doThrow(new EmptyResultDataAccessException(1)).when(userRepository).deleteById(nonExistentUserId);

        // Verifica se a exceção ResourceNotFoundException é lançada
        assertThrows(ResourceNotFoundException.class, () -> userService.delete(nonExistentUserId));
    }
}
*/
