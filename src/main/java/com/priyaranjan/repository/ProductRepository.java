package com.priyaranjan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyaranjan.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	
}
