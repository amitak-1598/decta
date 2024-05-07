package com.TestingAPI.TestingAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.Moto;
import com.TestingAPI.TestingAPI.Repository.MotoRepository;

@Service
public class MotoService {

	@Autowired
	MotoRepository motorepository;

	public Moto addMoto(Moto motobody) {
		return motorepository.save(motobody);
	}
}
