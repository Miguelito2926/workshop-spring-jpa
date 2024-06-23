package com.educajava.curso.repositories;

import com.educajava.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>{

}
