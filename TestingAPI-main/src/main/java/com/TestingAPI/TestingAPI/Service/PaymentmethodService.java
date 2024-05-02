package com.TestingAPI.TestingAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.Paymentmethods;
import com.TestingAPI.TestingAPI.Repository.PaymentRepository;

@Service
public class PaymentmethodService {

	@Autowired
	private PaymentRepository paymentmethodrepository;
	
	public Paymentmethods addPaymentMethods(Paymentmethods paymentmethods) {
		   return paymentmethodrepository.save(paymentmethods);
	}
}
