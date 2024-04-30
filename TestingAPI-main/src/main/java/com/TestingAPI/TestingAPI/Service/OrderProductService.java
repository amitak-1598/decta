package com.TestingAPI.TestingAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.Orderproduct;
import com.TestingAPI.TestingAPI.Repository.OrderproductRepository;

@Service
public class OrderProductService {

	
	@Autowired
    private OrderproductRepository orderproductrepository;
	
	public Orderproduct createOrderProduct(Orderproduct orderproduct) {
		
		return orderproductrepository.save(orderproduct);
	}
}
