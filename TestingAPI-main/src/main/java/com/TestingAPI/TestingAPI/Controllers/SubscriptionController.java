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
import org.springframework.web.bind.annotation.RestController;

import com.TestingAPI.TestingAPI.Entities.Client;
import com.TestingAPI.TestingAPI.Entities.Orders;
import com.TestingAPI.TestingAPI.Entities.Product;
import com.TestingAPI.TestingAPI.Entities.Subscription;
import com.TestingAPI.TestingAPI.Repository.ClientRepository;
import com.TestingAPI.TestingAPI.Dao.ProductRepository;
import com.TestingAPI.TestingAPI.Service.ClientService;
import com.TestingAPI.TestingAPI.Service.OrderService;
import com.TestingAPI.TestingAPI.Service.SubscriptionService;

@RestController
public class SubscriptionController {

	@Autowired
	private SubscriptionService subscriptionService;

	@Autowired
	private ProductRepository productrepository;

	@Autowired
	private ClientRepository clientrepository;

	@Autowired
	private ClientService clientservice;

	@Autowired
	private OrderService orderservice;

	
	                               // Subscription
	@PostMapping("/subscriptions")
	public ResponseEntity<Subscription> createSubscription(@RequestBody Subscription subscription) {
		Subscription createdSubscription = subscriptionService.createSubscription(subscription);
		return new ResponseEntity<>(createdSubscription, HttpStatus.CREATED);
	}

	@GetMapping("/subscriptions")
	public ResponseEntity<List<Subscription>> getAllSubscriptions() {
		List<Subscription> subscriptions = subscriptionService.getAllSubscriptions();
		return new ResponseEntity<>(subscriptions, HttpStatus.OK);
	}

	@GetMapping("/subscriptions/{subscriptionId}")
	public ResponseEntity<Subscription> getSubscriptionById(@PathVariable("subscriptionId") UUID subscriptionId) {
		Subscription subscription = subscriptionService.getSubscriptionById(subscriptionId);
		if (subscription != null) {
			return new ResponseEntity<>(subscription, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/subscriptions/{subscriptionId}")
	public ResponseEntity<Subscription> updateSubscription(@PathVariable("subscriptionId") UUID subscriptionId,
			@RequestBody Subscription updatedSubscription) {
		Subscription subscription = subscriptionService.updateSubscription(subscriptionId, updatedSubscription);
		if (subscription != null) {
			return new ResponseEntity<>(subscription, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/subscriptions/{subscriptionId}")
	public ResponseEntity<Void> deleteSubscription(@PathVariable("subscriptionId") UUID subscriptionId) {

		boolean deleted = subscriptionService.deleteSubscription(subscriptionId);
		if (deleted) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PatchMapping("/subscriptions/{subscriptionId}")
	public ResponseEntity<Subscription> partiallyUpdateSubscription(@PathVariable("subscriptionId") UUID subscriptionId,
			@RequestBody Map<String, Object> updates) {
		Subscription subscription = subscriptionService.partiallyUpdateSubscription(subscriptionId, updates);
		if (subscription != null) {
			return new ResponseEntity<>(subscription, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	
	                              // subscriptionproducts
	@PostMapping("/subscriptions/{subscriptionId}/products")
	public ResponseEntity<Product> createSubscriptionproduct(@RequestBody Product productRequest,
			@PathVariable("subscriptionId") UUID subscriptionid) {
		productRequest.setSubscriptionid(subscriptionid);
		Product createdproductRequest = productrepository.save(productRequest);
		return new ResponseEntity<>(createdproductRequest, HttpStatus.CREATED);
	}

	@GetMapping("/subscriptions/{subscriptionId}/products")
	public ResponseEntity<List<Product>> getAllProducts(@PathVariable("subscriptionId") UUID subscriptionid) {
		List<Product> subscriptions = subscriptionService.getAllProduct(subscriptionid);
		return new ResponseEntity<>(subscriptions, HttpStatus.OK);
	}

	@GetMapping("/subscriptions/{subscriptionId}/products/{productId}")
	public ResponseEntity<Product> getSingleSubscriptionproduct(@PathVariable("subscriptionId") UUID subscriptionid,
			@PathVariable("productId") UUID productid) {
		Product product = subscriptionService.getSingleProduct(subscriptionid, productid);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}

	@DeleteMapping("/subscriptions/{subscriptionId}/products/{productId}")
	public ResponseEntity<Void> deleteSubscriptionProduct(@PathVariable("subscriptionId") UUID subscriptionId,
			@PathVariable("productId") UUID productid) {
		subscriptionService.deleteSubscriptionProduct(subscriptionId, productid);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@PatchMapping("/subscriptions/{subscriptionId}/products/{productId}")
	public ResponseEntity<Product> partiallyUpdateSubscriptionProduct(
			@PathVariable("subscriptionId") UUID subscriptionId, @PathVariable("productId") UUID productId,
			@RequestBody Map<String, Object> updates) {

		Product subproduct = subscriptionService.partiallyUpdateSubscriptionProduct(productId, subscriptionId, updates);
		if (subproduct != null) {
			return new ResponseEntity<>(subproduct, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	
	
	                             // Subscriptionclients
	@PostMapping("/subscriptions/{subscriptionId}/clients")
	public ResponseEntity<Client> createSubscriptionClient(@RequestBody Client clientRequest,
			@PathVariable("subscriptionId") UUID subscriptionId) {
		clientRequest.setSubscriptionid(subscriptionId);

		Client createdclientRequest = clientrepository.save(clientRequest);
		return new ResponseEntity<>(createdclientRequest, HttpStatus.CREATED);
	}

	@GetMapping("/subscriptions/{subscriptionId}/clients")
	public ResponseEntity<List<Client>> getAllSubscritpionClients(@PathVariable("subscriptionId") UUID subscriptionId) {
		List<Client> client = clientservice.getAllSubscritpionClients(subscriptionId);
		return new ResponseEntity<>(client, HttpStatus.OK);
	}

	@GetMapping("/subscriptions/{subscriptionId}/clients/{clientid}")
	public ResponseEntity<Client> getASubscriptionClient(@PathVariable("subscriptionId") UUID subscriptionId,
			@PathVariable("clientid") UUID clientid) {
		Client clienttemplate = clientrepository.findByIdAndSubscriptionid(clientid, subscriptionId);
		return new ResponseEntity<>(clienttemplate, HttpStatus.OK);
	}

	@PutMapping("/subscriptions/{subscriptionId}/clients/{clientid}")
	public ResponseEntity<Client> updateSubscriptionClient(@PathVariable("subscriptionId") UUID subscriptionId,
			@PathVariable("clientid") UUID clientid, @RequestBody Client client) {

		Client clientrequest = clientservice.updateSubscriptionClient(subscriptionId, clientid, client);
		if (clientrequest != null) {
			return new ResponseEntity<>(clientrequest, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/subscriptions/{subscriptionId}/clients/{clientid}")
	public ResponseEntity<Void> deleteSubscriptionAClient(@PathVariable("subscriptionId") UUID subscriptionId,
			@PathVariable("clientid") UUID clientid) {
		clientservice.deleteSubscriptionClient(clientid, subscriptionId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/subscriptions/{subscriptionId}/orders")
	public ResponseEntity<List<Orders>> getAllSubscriptionOrder(@PathVariable("subscriptionId") UUID SubscriptionId) {
		List<Orders> ordersubscription = orderservice.getAllOrderSubscription(SubscriptionId);
		return new ResponseEntity<>(ordersubscription, HttpStatus.OK);
	}


}
