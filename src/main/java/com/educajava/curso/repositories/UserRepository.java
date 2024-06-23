package com.educajava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educajava.curso.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
