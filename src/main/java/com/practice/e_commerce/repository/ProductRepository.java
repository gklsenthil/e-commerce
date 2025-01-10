package com.practice.e_commerce.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.practice.e_commerce.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	
	// Custom query to find products by name (case-insensitive and contains)
    @Query("{ 'name': { $regex: ?0, $options: 'i' } }")
    List<Product> findByNameContainsCaseInSensitive(String name);

}
