package com.TestingAPI.TestingAPI.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.Client;
import com.TestingAPI.TestingAPI.Repository.ClientRepository;

import jakarta.transaction.Transactional;

@Service
public class MerchantService {

	@Autowired
	ClientRepository clientrepository;

	public List<Client> getAllMerchants() {
		List<Client> validmerchants = clientrepository.findAll().stream().filter(i -> i.getMerchant() != null)
				.collect(Collectors.toList());
		System.out.println(validmerchants);
		return validmerchants;
	}
	
	@Transactional
	public Client getMerchantById(UUID id) {
		return clientrepository.findByMerchant(id);
	}
}
