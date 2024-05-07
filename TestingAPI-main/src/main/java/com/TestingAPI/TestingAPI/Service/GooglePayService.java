package com.TestingAPI.TestingAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.GooglePay;
import com.TestingAPI.TestingAPI.Repository.GooglePayRepository;

@Service
public class GooglePayService {

	@Autowired
	GooglePayRepository googlepayrepository;

	public GooglePay addGooglePay(GooglePay googlepaybody) {
		return googlepayrepository.save(googlepaybody);
	}
}
