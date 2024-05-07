package com.TestingAPI.TestingAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.Zimpler;
import com.TestingAPI.TestingAPI.Repository.ZimplerRepository;

@Service
public class ZimplerService {

	@Autowired
	ZimplerRepository zimplerrepository;
	
	public Zimpler addZimpler(Zimpler zimplerbody) {
		return zimplerrepository.save(zimplerbody);
	}
}
