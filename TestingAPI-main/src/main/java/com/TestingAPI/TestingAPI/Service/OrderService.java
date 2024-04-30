package com.TestingAPI.TestingAPI.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.Orderclient;
import com.TestingAPI.TestingAPI.Entities.Orders;
import com.TestingAPI.TestingAPI.Repository.OrderRepository;

import jakarta.transaction.Transactional;



@Service
public class OrderService {

	@Autowired
	private OrderRepository orderrepository;
	
	public Orders addOrder(Orders order) {	
		order.getClient().setOrder(order);
		return orderrepository.save(order);
	}
	
	
	@Transactional
	public Orders getOrderById(UUID id) {
		return orderrepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found with id: " + id));
	}
	
	
}
