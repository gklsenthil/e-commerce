package com.practice.e_commerce.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.e_commerce.entity.CartItem;
import com.practice.e_commerce.service.OrderService;

@RequestMapping("/order")
@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping
	public Map<String, Object> createOrder(@RequestBody List<CartItem> cartItems) {
		return orderService.createOrder(cartItems);
	}

}
