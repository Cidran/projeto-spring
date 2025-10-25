package com.cidran.projeto_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cidran.projeto_spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
