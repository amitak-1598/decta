package com.TestingAPI.TestingAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.ApplePay;
import com.TestingAPI.TestingAPI.Repository.ApplepayRepository;

@Service
public class ApplePayService {

	@Autowired
	ApplepayRepository applepayrepository;

	public ApplePay addApplePay(ApplePay applepay) {
		return applepayrepository.save(applepay);
	}
}
