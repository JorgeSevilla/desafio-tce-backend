package com.br.tcelistuser.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.br.tcelistuser.api.controller.UserController;
import com.br.tcelistuser.api.model.User;
import com.br.tcelistuser.api.repository.UserRepository;

@SpringBootTest
public class UserControllerTests {

    @Autowired
    private UserController userController;

    @MockBean
    private UserRepository userRepository;

    @Test
    public void testGetUserById() {
        User user = new User();
        user.setId((long) 1);
        user.setUsername("JorgeSev");
        user.setName("Jorge");
        user.setEmail("solopunks803@gmail.com");

        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        ResponseEntity<User> response = userController.getUserById(1L);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(user, response.getBody());
    }

    @Test
    public void testGetUserByIdNotFound() {
        when(userRepository.findById(1L)).thenReturn(Optional.empty());

        ResponseEntity<User> response = userController.getUserById(1L);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
    }

}