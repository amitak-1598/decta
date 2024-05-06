package com.TestingAPI.TestingAPI.Controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TestingAPI.TestingAPI.Entities.Client;
import com.TestingAPI.TestingAPI.Service.MerchantService;

@RestController
@RequestMapping("/partner_merchants")
public class MerchantController {

	@Autowired
	MerchantService merchatservice;

	@GetMapping
	public List<Client> getAllClients() {
		return merchatservice.getAllMerchants();
	}
	
	@GetMapping("/{id}")
	public Client getPartnerMerchantById(@PathVariable UUID id) {
		return merchatservice.getMerchantById(id);
	}
}
