package com.TestingAPI.TestingAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.Volt;
import com.TestingAPI.TestingAPI.Repository.VoltRepository;

@Service
public class VoltService {

	@Autowired
	VoltRepository voltrepository;

	public Volt addVolt(Volt voltbody) {
		return voltrepository.save(voltbody);
	}
}
