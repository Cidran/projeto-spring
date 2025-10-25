package com.cidran.projeto_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cidran.projeto_spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
