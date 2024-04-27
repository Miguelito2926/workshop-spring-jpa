package com.educajava.curso.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educajava.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
@GetMapping	
public ResponseEntity<User> findAll(){
	User usuario = new User(1L, "Ed", " ednaldo@gmail.com", " 898"," 123456");
	return ResponseEntity.ok().body(usuario);
}
}
