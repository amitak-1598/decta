package com.TestingAPI.TestingAPI.Controllers;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	@GetMapping
	public List<Orders> getAllOrder() {
		return orderservice.getAllOrder();
	}
	
	@DeleteMapping("/{orderId}")
	public ResponseEntity<Void> deleteOrder(@PathVariable("orderId") UUID orderId){
		
		boolean deleted = orderservice.deleteOrder(orderId);
		if(deleted) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/{orderId}")
	public Orders updateOrderStatus(@RequestBody Map<String, Object> order, @PathVariable("orderId") UUID orderid) {
		return orderservice.updateStatus(order, orderid);
	}

	@PostMapping("/{orderId}")
	public Orders orderStatusReceived(@PathVariable("orderId") UUID orderid) {
		return orderservice.updateStatusAsReceived(orderid);
	}
}
