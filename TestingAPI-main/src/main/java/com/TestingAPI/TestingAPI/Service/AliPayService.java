package com.TestingAPI.TestingAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.AliPay;
import com.TestingAPI.TestingAPI.Repository.AliPayRepository;

@Service
public class AliPayService {

	@Autowired
	AliPayRepository alipayrepository;
	
	public AliPay addAliPay(AliPay alipaybody) {
		return alipayrepository.save(alipaybody);
	}
}
