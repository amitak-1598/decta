package com.TestingAPI.TestingAPI.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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

	@Transactional
	public List<Orders> getAllOrder() {
		return orderrepository.findAll();
	}

	public boolean deleteOrder(UUID id) {
		if (orderrepository.existsById(id)) {
			orderrepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	public Orders updateStatus(Map<String, Object> body, UUID orderid) {
		Optional<Orders> orderentity = orderrepository.findById(orderid);
		if (orderentity != null) {
			String status = (String) body.get("status");
			Orders order = orderentity.get();
			order.setStatus(status);
			orderrepository.save(order);
			return order;
		}
		return null;
	}

	public Orders updateStatusAsReceived(UUID orderid) {
		Optional<Orders> orderentity = orderrepository.findById(orderid);
		if (orderentity != null) {
			Orders order = orderentity.get();
			order.setStatus("received");
			orderrepository.save(order);
			return order;
		}
		return null;
	}

	public Orders cancelAnOrder(UUID orderid) {
		Optional<Orders> orderentity = orderrepository.findById(orderid);
		if (orderentity != null) {
			Orders order = orderentity.get();
			String previousstatus = order.getStatus();
			if ((previousstatus != "paid") || (previousstatus != "draft") || (previousstatus != "cancelled")) {
				order.setStatus("cancel");
				orderrepository.save(order);
				return order;
			}
		}
		return null;
	}

	public List<Orders> getAllOrderSubscription(UUID subscriptionid) {
		return orderrepository.findBySubscriptionid(subscriptionid);
	}

}
