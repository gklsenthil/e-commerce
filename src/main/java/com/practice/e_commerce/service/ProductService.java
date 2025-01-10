package com.practice.e_commerce.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.e_commerce.entity.Product;
import com.practice.e_commerce.repository.ProductRepository;
import java.util.function.Function;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Map<String, Object> getAllProducts(String name) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		List<Product> products = new ArrayList<Product>();
		if(name.equals("")) {
			products = productRepository.findAll();
		}else {
			products = productRepository.findByNameContainsCaseInSensitive(name);
		}
		response.put("success", true);
		response.put("products", products);
		return response;
	}

	public Map<String, Object> getProductById(String id) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		Optional<Product> optionalProduct = productRepository.findById(id);
		if(optionalProduct.isPresent()) {
			response.put("success", true);
			response.put("product", optionalProduct.get());
		}else {
			response.put("success", false);
			response.put("message", "Product not found for ID : "+id);
		}
		return response;
	}

	public Map<String, Object> getProductsByName(String name) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		List<Product> products = productRepository.findByNameContainsCaseInSensitive(name);
		response.put("success", true);
		response.put("products", products);
		return response;
	}
	
	public static void main(String[] args) {
		
	}
	
}
