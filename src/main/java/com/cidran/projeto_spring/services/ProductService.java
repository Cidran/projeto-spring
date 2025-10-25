package com.cidran.projeto_spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cidran.projeto_spring.entities.Category;
import com.cidran.projeto_spring.entities.Product;
import com.cidran.projeto_spring.entities.User;
import com.cidran.projeto_spring.repositories.CategoryRepository;
import com.cidran.projeto_spring.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
