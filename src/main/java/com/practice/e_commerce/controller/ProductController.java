package com.practice.e_commerce.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.e_commerce.service.ProductService;

@RequestMapping("/product")
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public Map<String, Object> getAllProducts(@RequestParam(required = false, defaultValue = "") String name){
		return productService.getAllProducts(name);
	}

	@GetMapping("{id}")
	public Map<String, Object> getProductById(@PathVariable String id){
		return productService.getProductById(id);
	}
	
	@GetMapping("/searchByName")
	public Map<String, Object> getProductsByName(@RequestParam String name){
		return productService.getProductsByName(name);
	}
}
