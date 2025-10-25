package com.cidran.projeto_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cidran.projeto_spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
