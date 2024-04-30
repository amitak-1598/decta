package com.TestingAPI.TestingAPI.Controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TestingAPI.TestingAPI.Entities.Orders;
import com.TestingAPI.TestingAPI.Service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	
	@Autowired
	private OrderService orderservice;
	
	@PostMapping
	public Orders addOrder(@RequestBody Orders order) {
	
		return orderservice.addOrder(order);
	}
	
	@GetMapping("/{id}")
	public Orders getOrderById(@PathVariable UUID id) {
		return orderservice.getOrderById(id);
	}
	
}
