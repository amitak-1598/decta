package com.TestingAPI.TestingAPI.Controllers;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.TestingAPI.TestingAPI.Entities.Client;
import com.TestingAPI.TestingAPI.Entities.Paymentmethods;
import com.TestingAPI.TestingAPI.Service.ClientService;
import com.fasterxml.jackson.core.JsonProcessingException;


@RestController
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping
	public List<Client> getAllClients() {
		return clientService.getAllClients();
	}

	@PostMapping
	public Client addClient(@RequestBody Client client) {
		return clientService.addClient(client);
	}

	@GetMapping("/{id}")
	public Client getClientById(@PathVariable UUID id) {
		return clientService.getClientById(id);
	}

	@PutMapping("/{id}")
	public Client updateClient(@PathVariable UUID id, @RequestBody Client client) {
		return clientService.updateClient(id, client);
	}

	@DeleteMapping("/{id}")
	public void deleteClient(@PathVariable UUID id) {
		clientService.deleteClient(id);
	}

	@GetMapping("/{id}/payments_method")
	public List<Paymentmethods> getAllPaymentMethods(@PathVariable UUID id) {
		return clientService.getAllClientPaymentMethods(id);
	}

	@GetMapping("/{id}/payments_method/{paymentmethodid}")
	public Paymentmethods getClientPaymentMethod(@PathVariable UUID id,
			@PathVariable("paymentmethodid") UUID paymentmethodid) {
		return clientService.getClientPaymentMethod(id, paymentmethodid);
	}

	@PutMapping("/{id}/payments_method/{paymentmethodid}")
	public Paymentmethods updatePaymentMethods(@PathVariable UUID id,
			@PathVariable("paymentmethodid") UUID paymentmethodid, @RequestBody Paymentmethods paymentmethods) {
		return clientService.updatePaymentMethod(id, paymentmethodid, paymentmethods);
	}

	@DeleteMapping("/{id}/payments_method/{paymentmethodid}")
	public void deletePaymentMethods(@PathVariable UUID id, @PathVariable("paymentmethodid") UUID paymentmethodid) {
		clientService.deleteClientPaymentMethod(paymentmethodid, id);
	}
	
	@PatchMapping("/{id}/payments_method/{paymentmethodid}")
	public ResponseEntity<Paymentmethods> partiallyUpdateMethods(@PathVariable UUID id, @PathVariable("paymentmethodid") UUID paymentmethodid,@RequestBody Map<String, Object> updates) throws JsonProcessingException, IllegalArgumentException{
		Paymentmethods paymentmethods = clientService.PartiallyUpdatePaymentmethod(paymentmethodid, id, updates);
		if(paymentmethods!=null) {
			return new ResponseEntity<>(paymentmethods,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
