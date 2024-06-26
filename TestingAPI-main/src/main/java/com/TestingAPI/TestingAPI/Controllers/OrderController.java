package com.TestingAPI.TestingAPI.Controllers;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TestingAPI.TestingAPI.Entities.APMPayout;
import com.TestingAPI.TestingAPI.Entities.B2POrder;
import com.TestingAPI.TestingAPI.Entities.B2PTransactionRequest;
import com.TestingAPI.TestingAPI.Entities.OGOrder;
import com.TestingAPI.TestingAPI.Entities.OgTransaction;
import com.TestingAPI.TestingAPI.Entities.Orders;
import com.TestingAPI.TestingAPI.Entities.SdwoPayout;
import com.TestingAPI.TestingAPI.Entities.Zimpler;
import com.TestingAPI.TestingAPI.Service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderservice;

	@PostMapping
	public Orders addOrder(@RequestBody Orders order) {

		return orderservice.addOrder(order);
	}

	@GetMapping("/{id}")
	public Orders getOrderById(@PathVariable UUID id) {

		return orderservice.getOrderById(id);
	}

	@GetMapping
	public List<Orders> getAllOrder() {
		return orderservice.getAllOrder();
	}

	@DeleteMapping("/{orderId}")
	public ResponseEntity<Void> deleteOrder(@PathVariable("orderId") UUID orderId) {

		boolean deleted = orderservice.deleteOrder(orderId);
		if (deleted) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/{orderId}")
	public Orders updateOrderStatus(@RequestBody Map<String, Object> order, @PathVariable("orderId") UUID orderid) {
		return orderservice.updateStatus(order, orderid);
	}

	@PostMapping("/{orderId}/received")
	public Orders orderStatusReceived(@PathVariable("orderId") UUID orderid) {
		return orderservice.updateStatusAsReceived(orderid);
	}

	@PostMapping("/{orderId}/cancel")
	public Orders cancleAnOrder(@PathVariable("orderId") UUID orderid) {
		return orderservice.cancelAnOrder(orderid);
	}

	@PostMapping("/{orderId}/generate_template")
	public void postOrderTemplate(@PathVariable("orderId") UUID orderid) {
		orderservice.generateTemplate(orderid);
	}

	// Orders Payment API's

	@PostMapping("/init_og")
	public OGOrder addOgOrder(@RequestBody OGOrder ogorder) {

		return orderservice.postOgorder(ogorder);
	}

	@PostMapping("ogapi_do_url")
	public OgTransaction addOgTransaction(@RequestBody OgTransaction ogtransaction) {

		return orderservice.executeOgTransaction(ogtransaction);
	}

	@PostMapping("init_apm_payout")
	public APMPayout addAPMPayout(@RequestBody APMPayout apmpayout) {
		return orderservice.postAPMPayout(apmpayout);
	}

	@PostMapping("Zimplerapi_do_urlinit_zimpler_payout")
	public Zimpler addZimplerPayout(@RequestBody Zimpler zimpler) {
		return orderservice.postZemplerPayout(zimpler);
	}

	@PostMapping("init_b2p")
	public B2POrder addB2POrder(@RequestBody B2POrder b2porder) {
		return orderservice.postB2POrder(b2porder);
	}

	@PostMapping("b2papi_do_url")
	public B2PTransactionRequest addB2PTransactionRequest(@RequestBody B2PTransactionRequest b2ptransaction) {
		return orderservice.postB2PTransactionRequest(b2ptransaction);
	}

	@PostMapping("init_sdwo_payout")
	public SdwoPayout addSdwoPayout(@RequestBody SdwoPayout sdwopayout) {
		return orderservice.postSdwoPayout(sdwopayout);
	}

}
