package com.TestingAPI.TestingAPI.Controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;
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
import com.TestingAPI.TestingAPI.Entities.OrderTemplate;
import com.TestingAPI.TestingAPI.Entities.Orderclient;
import com.TestingAPI.TestingAPI.Entities.Orderproduct;
import com.TestingAPI.TestingAPI.Entities.Orders;
import com.TestingAPI.TestingAPI.Entities.Product;
import com.TestingAPI.TestingAPI.Repository.ClientRepository;
import com.TestingAPI.TestingAPI.Repository.OrderclientRepository;
import com.TestingAPI.TestingAPI.Repository.OrderproductRepository;
import com.TestingAPI.TestingAPI.Service.ClientService;
import com.TestingAPI.TestingAPI.Service.OrderTemplateService;

@RestController
@RequestMapping("/ordertemplate/")
public class Ordertemplatecontroller {

	@Autowired
	private OrderTemplateService ordertemplateservice;

	@Autowired
	private OrderproductRepository orderproductrepository;

	@Autowired
	private ClientRepository clientrepository;

	@Autowired
	private ClientService clientservice;

	@Autowired
	private OrderclientRepository orderclientrepository;

	// OrderTemplate

	@PostMapping
	public ResponseEntity<OrderTemplate> createOrderTemplate(@RequestBody OrderTemplate invoiceRequest) {
		OrderTemplate createdInvoiceRequest = ordertemplateservice.createInvoiceRequest(invoiceRequest);
		return new ResponseEntity<>(createdInvoiceRequest, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<OrderTemplate>> getAllOrderTemplate() {
		List<OrderTemplate> invoiceRequests = ordertemplateservice.getAllInvoiceRequests();
		return new ResponseEntity<>(invoiceRequests, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<OrderTemplate> getOrderTemplateById(@PathVariable UUID id) {
		Optional<OrderTemplate> invoiceRequest = ordertemplateservice.getInvoiceRequestById(id);
		return invoiceRequest.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PutMapping("/{id}")
	public ResponseEntity<OrderTemplate> updateOrderTemplate(@PathVariable UUID id,
			@RequestBody OrderTemplate OrderTemplateRequest) {
		OrderTemplate orderRequest = ordertemplateservice.updateInvoiceRequest(id, OrderTemplateRequest);
		if (orderRequest != null) {
			return new ResponseEntity<>(orderRequest, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PatchMapping("/{id}")
	public ResponseEntity<OrderTemplate> partialUpdateOrderTemplate(@PathVariable UUID id,
			@RequestBody Map<String, Object> updates) {
		Optional<OrderTemplate> optionalInvoiceRequest = ordertemplateservice.getInvoiceRequestById(id);
		System.out.println(optionalInvoiceRequest);
		if (optionalInvoiceRequest.isPresent()) {
			OrderTemplate invoiceRequest = optionalInvoiceRequest.get();
			ordertemplateservice.applyUpdatesToInvoiceRequest(invoiceRequest, updates);
			OrderTemplate updatedInvoiceRequest = ordertemplateservice.partialUpdateInvoiceRequest(invoiceRequest);
			return new ResponseEntity<>(updatedInvoiceRequest, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteOrderTemplateRequest(@PathVariable UUID id) {
		ordertemplateservice.deleteInvoiceRequest(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	// OrderTemplateProduct

	@PostMapping("/{id}/product")
	public ResponseEntity<Orderproduct> createTemplateOrderproduct(@RequestBody Orderproduct orderproductRequest,
			@PathVariable("id") UUID tempid) {
		orderproductRequest.setTemplateid(tempid);
		Orderproduct createdproductRequest = orderproductrepository.save(orderproductRequest);
		return new ResponseEntity<>(createdproductRequest, HttpStatus.CREATED);
	}

	@GetMapping("/{id}/product")
	public ResponseEntity<List<Orderproduct>> getAllTemplateOrderProduct(@PathVariable("id") UUID tempid) {
		List<Orderproduct> orderproducttemplate = orderproductrepository.findByTemplateid(tempid);
		return new ResponseEntity<>(orderproducttemplate, HttpStatus.OK);
	}

	@GetMapping("/{id}/product/{orderproductid}")
	public ResponseEntity<Orderproduct> getOrderProduct(@PathVariable("id") UUID tempid,
			@PathVariable("orderproductid") UUID orderproductid) {
		Orderproduct producttemplate = orderproductrepository.findByIdAndTemplateid(orderproductid, tempid);
		return new ResponseEntity<>(producttemplate, HttpStatus.OK);
	}

	@PutMapping("/{id}/product/{orderproductid}")
	public ResponseEntity<Orderproduct> updateTemplateOrderProduct(@PathVariable("id") UUID tempid,
			@PathVariable("orderproductid") UUID orderproductid, @RequestBody Orderproduct orderproduct) {
		Orderproduct orderRequest = ordertemplateservice.updateOrderproduct(tempid, orderproductid, orderproduct);
		if (orderRequest != null) {
			return new ResponseEntity<>(orderRequest, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/{id}/products/bulkupdate")
	public ResponseEntity<List<Orderproduct>> bulkupdateOrderproductList(@RequestBody List<Orderproduct> orderproducts,
			@PathVariable("id") UUID tempid) {

		List<Orderproduct> updatedOrderproduct = ordertemplateservice.bulkupdateOrderproduct(tempid, orderproducts);
		return new ResponseEntity<>(updatedOrderproduct, HttpStatus.OK);
	}

	@PostMapping("/{id}/products/bulkdelete")
	public ResponseEntity<String> bulkdeleteOrderproductList(@RequestBody List<Orderproduct> orderproducts,
			@PathVariable("id") UUID tempid) {

		String response = ordertemplateservice.bulkdeleteOrderproduct(tempid, orderproducts);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@DeleteMapping("/{id}/products/{orderproductid}")
	public ResponseEntity<Void> deleteOrderProduct(@PathVariable("id") UUID templateid,
			@PathVariable("orderproductid") UUID orderproductid) {
		ordertemplateservice.deleteOrderproduct(orderproductid, templateid);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@PatchMapping("/{id}/product/{orderproductid}")
	public ResponseEntity<Orderproduct> patchOrderProduct(@PathVariable("id") UUID tempid,
			@PathVariable("orderproductid") UUID orderproductid, @RequestBody Orderproduct orderproductRequest) {

		Orderproduct updatedorderproduct = ordertemplateservice.UpdateOrderproduct(orderproductid, tempid,
				orderproductRequest);
		return new ResponseEntity<>(updatedorderproduct, HttpStatus.OK);

	}

	// OrderTemplateClient

	@PostMapping("/{templateId}/clients")
	public ResponseEntity<Client> createOrdertemplateclient(@RequestBody Client clientRequest,
			@PathVariable("templateId") UUID templateid) {
		clientRequest.setTemplateid(templateid);

		Client createdclientRequest = clientrepository.save(clientRequest);
		return new ResponseEntity<>(createdclientRequest, HttpStatus.CREATED);
	}

//	@PostMapping("/{templateId}/clients")
//	public ResponseEntity<Client> createOrdertemplateclient(@RequestBody Orderclient clientRequest,
//			@PathVariable("templateId") UUID templateid) {
//		clientRequest.setTemplateid(templateid);
//
//		Client createdclientRequest = clientrepository.save(clientRequest);
//		return new ResponseEntity<>(createdclientRequest, HttpStatus.CREATED);
//	}

	@GetMapping("/{templateId}/clients")
	public ResponseEntity<List<Client>> getAlltemplateclients(@PathVariable("templateId") UUID templateId) {
		List<Client> client = ordertemplateservice.getAllClient(templateId);
		return new ResponseEntity<>(client, HttpStatus.OK);
	}

	@GetMapping("/{templateId}/clients/{clientid}")
	public ResponseEntity<Client> getAClient(@PathVariable("templateId") UUID tempid,
			@PathVariable("clientid") UUID clientid) {
		Client clienttemplate = clientrepository.findByIdAndTemplateid(clientid, tempid);
		return new ResponseEntity<>(clienttemplate, HttpStatus.OK);
	}

	@PutMapping("/{templateId}/clients/{clientid}")
	public ResponseEntity<Client> updateTemplateClient(@PathVariable("templateId") UUID tempid,
			@PathVariable("clientid") UUID clientid, @RequestBody Client client) {

		Client clientrequest = clientservice.updateclient(tempid, clientid, client);
		if (clientrequest != null) {
			return new ResponseEntity<>(clientrequest, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{templateId}/clients/{clientid}")
	public ResponseEntity<Void> deleteTemplateAClient(@PathVariable("templateId") UUID templateid,
			@PathVariable("clientid") UUID clientid) {
		clientservice.deleteTemplateClient(clientid, templateid);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@PostMapping("/{templateId}/clients/bulk_update")
	public ResponseEntity<Void> updateClientTemplate(@RequestBody List<Client> clients,
			@PathVariable("templateId") UUID templateid) {
		ordertemplateservice.updateOrderClients(clients, templateid);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PatchMapping("/{templateid}/clients/{orderclientid}")
	public ResponseEntity<Void> patchField(@PathVariable("templateid") UUID templateid,
			@PathVariable("orderclientid") UUID id, @RequestBody Orderclient body) {
		Optional<Orderclient> data = orderclientrepository.findByIdAndTemplateid(id, templateid);
		Orderclient databaseEntity = data.get();
		databaseEntity.setIs_added(body.isIs_added());
		orderclientrepository.save(databaseEntity);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

	@PostMapping("/{templateId}/duplicate")
	public ResponseEntity<OrderTemplate> duplicateOrderTemplate(@PathVariable("templateId") UUID templateid) {
		OrderTemplate duplicateordertemplate = ordertemplateservice.duplicate(templateid);
		return new ResponseEntity<>(duplicateordertemplate, HttpStatus.CREATED);
	}

	@GetMapping("/{templateId}/orders")
	public ResponseEntity<List<Orders>> getAlltemplateOrders(@PathVariable("templateId") UUID templateId) {
		List<Orders> ordertemplate = ordertemplateservice.getAllOrderFromTemplate(templateId);
		return new ResponseEntity<>(ordertemplate, HttpStatus.OK);
	}

	// Auxillary

	@PostMapping("/orderclient")
	public ResponseEntity<Orderclient> createOrderTemplate(@RequestBody Orderclient orderclient) {
		Orderclient orderclientsave = orderclientrepository.save(orderclient);
		return new ResponseEntity<>(orderclientsave, HttpStatus.CREATED);
	}

}
