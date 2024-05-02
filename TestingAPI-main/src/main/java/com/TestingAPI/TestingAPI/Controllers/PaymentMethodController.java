package com.TestingAPI.TestingAPI.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TestingAPI.TestingAPI.Entities.Paymentmethods;
import com.TestingAPI.TestingAPI.Service.PaymentmethodService;

@RestController
@RequestMapping("/paymentmethods")
public class PaymentMethodController {

	@Autowired
	private PaymentmethodService paymentmethodservice;

	@PostMapping
	public Paymentmethods addPaymentMethods(@RequestBody Paymentmethods paymentmethods) {
		return paymentmethodservice.addPaymentMethods(paymentmethods);
	}
}
