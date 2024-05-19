package com.educajava.curso.repositories;

import com.educajava.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
