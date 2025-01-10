package com.practice.e_commerce.service;

import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.e_commerce.entity.CartItem;
import com.practice.e_commerce.entity.Order;
import com.practice.e_commerce.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	public Map<String, Object> createOrder(List<CartItem> cartItems) {
		
		int totalPrice = cartItems.stream()
			    .mapToInt(cartItem -> cartItem.getQty() * Integer.valueOf(cartItem.getProduct().getPrice()))
			    .sum();
		
		Order order = new Order();
		order.setCartItems(cartItems);
		order.setStatus("pending");
		order.setAmount(String.valueOf(totalPrice));
		order.setCreatedAt(new Timestamp(System.currentTimeMillis()));
		
		order = orderRepository.save(order);
		
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		response.put("success", true);
		response.put("order", order);
		return response;
	}

}
