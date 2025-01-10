package com.practice.e_commerce.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practice.e_commerce.entity.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

}
