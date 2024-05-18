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
	User usuario = new User();
	User usuario2 = new User(null, "ednaldo@gmail.com","Ednaldo","123456","99999999");
	User usuario1 = new User(null, "miguel@gmail.com","Miguel","123456","99999999");
	return ResponseEntity.ok().body(usuario1);
}
}
