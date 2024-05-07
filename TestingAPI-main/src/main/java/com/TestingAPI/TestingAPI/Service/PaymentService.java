package com.TestingAPI.TestingAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.Apidourlbody;
import com.TestingAPI.TestingAPI.Repository.PaymentBodyRepository;


@Service
public class PaymentService {

	@Autowired
	PaymentBodyRepository paymentbodyrepository;
	
	public Apidourlbody addPayment(Apidourlbody paymentbody) {
		  return paymentbodyrepository.save(paymentbody);
	}
}
