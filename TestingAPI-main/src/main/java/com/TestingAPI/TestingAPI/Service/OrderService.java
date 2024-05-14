package com.TestingAPI.TestingAPI.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.APMPayout;
import com.TestingAPI.TestingAPI.Entities.B2POrder;
import com.TestingAPI.TestingAPI.Entities.B2PTransactionRequest;
import com.TestingAPI.TestingAPI.Entities.OGOrder;
import com.TestingAPI.TestingAPI.Entities.OgTransaction;
import com.TestingAPI.TestingAPI.Entities.OrderTemplate;
import com.TestingAPI.TestingAPI.Entities.Orders;
import com.TestingAPI.TestingAPI.Entities.SdwoPayout;
import com.TestingAPI.TestingAPI.Entities.Zimpler;
import com.TestingAPI.TestingAPI.Repository.ApmRepository;
import com.TestingAPI.TestingAPI.Repository.B2POrderRepository;
import com.TestingAPI.TestingAPI.Repository.B2PTransactionRepository;
import com.TestingAPI.TestingAPI.Repository.OgTransactionRepository;
import com.TestingAPI.TestingAPI.Repository.OgorderRepository;
import com.TestingAPI.TestingAPI.Repository.OrderRepository;
import com.TestingAPI.TestingAPI.Repository.OrdertemplateRepository;
import com.TestingAPI.TestingAPI.Repository.SdwoRepository;
import com.TestingAPI.TestingAPI.Repository.ZimplerRepository;

import jakarta.transaction.Transactional;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderrepository;

	@Autowired
	private OrdertemplateRepository ordertemplaterepository;

	@Autowired
	private OgorderRepository orgorderrepository;

	@Autowired
	private OgTransactionRepository ogtransactionrepository;

	@Autowired
	private ApmRepository apmpayoutrepository;

	@Autowired
	private ZimplerRepository zimplerrepository;

	@Autowired
	private B2POrderRepository b2prepository;

	@Autowired
	private B2PTransactionRepository b2ptransactionrepository;

	@Autowired
	private SdwoRepository sdworepository;

	public Orders addOrder(Orders order) {
		order.getClient().setOrder(order);
		return orderrepository.save(order);
	}

	@Transactional
	public Orders getOrderById(UUID id) {
		return orderrepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found with id: " + id));
	}

	@Transactional
	public List<Orders> getAllOrder() {
		return orderrepository.findAll();
	}

	public boolean deleteOrder(UUID id) {
		if (orderrepository.existsById(id)) {
			orderrepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	public Orders updateStatus(Map<String, Object> body, UUID orderid) {
		Optional<Orders> orderentity = orderrepository.findById(orderid);
		if (orderentity != null) {
			String status = (String) body.get("status");
			Orders order = orderentity.get();
			order.setStatus(status);
			orderrepository.save(order);
			return order;
		}
		return null;
	}

	public Orders updateStatusAsReceived(UUID orderid) {
		Optional<Orders> orderentity = orderrepository.findById(orderid);
		if (orderentity != null) {
			Orders order = orderentity.get();
			order.setStatus("received");
			orderrepository.save(order);
			return order;
		}
		return null;
	}

	public Orders cancelAnOrder(UUID orderid) {
		Optional<Orders> orderentity = orderrepository.findById(orderid);
		if (orderentity != null) {
			Orders order = orderentity.get();
			String previousstatus = order.getStatus();
			if ((previousstatus != "paid") || (previousstatus != "draft") || (previousstatus != "cancelled")) {
				order.setStatus("cancel");
				orderrepository.save(order);
				return order;
			}
		}
		return null;
	}

	public List<Orders> getAllOrderSubscription(UUID subscriptionid) {
		return orderrepository.findBySubscriptionid(subscriptionid);
	}

	public OGOrder postOgorder(OGOrder ogorder) {
		return orgorderrepository.save(ogorder);
	}

	public OgTransaction executeOgTransaction(OgTransaction ogtransaction) {
		return ogtransactionrepository.save(ogtransaction);
	}

	public APMPayout postAPMPayout(APMPayout apmpayout) {
		return apmpayoutrepository.save(apmpayout);
	}

	public Zimpler postZemplerPayout(Zimpler zimpler) {
		return zimplerrepository.save(zimpler);
	}

	public B2POrder postB2POrder(B2POrder b2porder) {
		return b2prepository.save(b2porder);
	}

	public B2PTransactionRequest postB2PTransactionRequest(B2PTransactionRequest b2ptransaction) {
		return b2ptransactionrepository.save(b2ptransaction);
	}

	public SdwoPayout postSdwoPayout(SdwoPayout sdwopayout) {
		return sdworepository.save(sdwopayout);
	}

	public void generateTemplate(UUID orderid) {
		OrderTemplate ordertemplate = ordertemplaterepository.findByOrderid(orderid);
		OrderTemplate generatedtemplate = new OrderTemplate(ordertemplate.getTitle(),
				ordertemplate.getRequest_client_info(), ordertemplate.getCurrency(), ordertemplate.getDue(),
				ordertemplate.getDue_type(), ordertemplate.getLanguage(), ordertemplate.getTerminal(),
				ordertemplate.getDeny_overdue_payment(), ordertemplate.getSkip_capture(), ordertemplate.getNotes(),
				ordertemplate.getIs_payable(), ordertemplate.getTerminal_processing_id(),
				ordertemplate.getDownload_link(), ordertemplate.getPrint_link(),
				ordertemplate.getIframe_checkout_send_invoice(), ordertemplate.getSubtotal(),
				ordertemplate.getTotal_tax(), ordertemplate.getTotal_discount(), ordertemplate.getTotal(),
				ordertemplate.getSubtotal_override(), ordertemplate.getTotal_tax_override(),
				ordertemplate.getTotal_discount_override(), ordertemplate.getTotal_override(),
				ordertemplate.getCreated(), ordertemplate.getModified(), ordertemplate.getViewed(),
				ordertemplate.getIssued_override(), ordertemplate.getReferrer(),
				ordertemplate.getReferrer_display_name(), ordertemplate.getClient_count(),
				ordertemplate.getProduct_count(), ordertemplate.getOrder_count(), ordertemplate.getPurchase_count(),
				ordertemplate.getRevenue(), ordertemplate.getLast_purchase_on(),
				ordertemplate.getMax_payment_attempts(), null);
		generatedtemplate.setOrderid(orderid);
		ordertemplaterepository.save(generatedtemplate);
	}

}
