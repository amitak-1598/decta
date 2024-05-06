package com.TestingAPI.TestingAPI.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.Client;
import com.TestingAPI.TestingAPI.Entities.OrderTemplate;
import com.TestingAPI.TestingAPI.Entities.Orderproduct;
import com.TestingAPI.TestingAPI.Entities.Orders;
import com.TestingAPI.TestingAPI.Repository.ClientRepository;
import com.TestingAPI.TestingAPI.Repository.OrderRepository;
import com.TestingAPI.TestingAPI.Repository.OrderproductRepository;
import com.TestingAPI.TestingAPI.Repository.OrdertemplateRepository;

import jakarta.transaction.Transactional;

@Service
public class OrderTemplateService {

	@Autowired
	private OrdertemplateRepository Ordertemplaterepository;

	@Autowired
	private OrderproductRepository orderproductrepository;

	@Autowired
	private ClientRepository clientrepository;

	@Autowired
	private OrderRepository orderrepository;

	public OrderTemplate createInvoiceRequest(OrderTemplate OrderTemplate) {
		return Ordertemplaterepository.save(OrderTemplate);
	}

	public OrderTemplate duplicate(UUID templateid) {

		Optional<OrderTemplate> templatebody = Ordertemplaterepository.findById(templateid);
		if (templatebody != null) {
			OrderTemplate ordertemplate = templatebody.get();
			OrderTemplate duplicate = new OrderTemplate(ordertemplate.getTitle(),
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
					ordertemplate.getMax_payment_attempts(), ordertemplate.getOrderproduct());
			Ordertemplaterepository.save(duplicate);
		}
		return null;
	}

	public List<OrderTemplate> getAllInvoiceRequests() {
		return Ordertemplaterepository.findAll();
	}

	public Optional<OrderTemplate> getInvoiceRequestById(UUID id) {
		return Ordertemplaterepository.findById(id);
	}

	public OrderTemplate updateInvoiceRequest(UUID id, OrderTemplate updatedInvoiceRequest) {
		if (Ordertemplaterepository.existsById(id)) {
			updatedInvoiceRequest.setId(id);
			return Ordertemplaterepository.save(updatedInvoiceRequest);
		}
		return null;
	}

	public void deleteInvoiceRequest(UUID id) {
		Ordertemplaterepository.deleteById(id);
	}

	public OrderTemplate partialUpdateInvoiceRequest(OrderTemplate invoiceRequest) {
		return Ordertemplaterepository.save(invoiceRequest);
	}

	public void applyUpdatesToInvoiceRequest(OrderTemplate existingInvoiceRequest, Map<String, Object> updates) {
		BeanUtils.copyProperties(updates, existingInvoiceRequest);

	}

	public Orderproduct updateOrderproduct(UUID id, UUID templateid, Orderproduct updatedorderproduct) {
		if (orderproductrepository.existsByIdAndTemplateid(id, templateid)) {
			updatedorderproduct.setId(id);
			updatedorderproduct.setTemplateid(templateid);
			return orderproductrepository.save(updatedorderproduct);
		}
		return null;
	}

	public List<Orderproduct> bulkupdateOrderproduct(UUID templateid, List<Orderproduct> orderproducts) {
		for (Orderproduct orderproduct : orderproducts) {
			UUID id = orderproduct.getId();
			if (orderproductrepository.existsByIdAndTemplateid(id, templateid)) {
				orderproductrepository.save(orderproduct);
			}

		}
		orderproductrepository.saveAll(orderproducts);
		return orderproducts;
	}

	public String bulkdeleteOrderproduct(UUID templateid, List<Orderproduct> orderproducts) {
		for (Orderproduct orderproduct : orderproducts) {
			UUID id = orderproduct.getId();
			if (orderproductrepository.existsByIdAndTemplateid(id, templateid)) {
				orderproductrepository.delete(orderproduct);
			}

		}

		return "SUCESS";
	}

	public Orderproduct UpdateOrderproduct(UUID id, UUID templateid, Orderproduct updatedorderproduct) {

		Orderproduct Orderproduct = orderproductrepository.findByIdAndTemplateid(id, templateid);

		if (updatedorderproduct.getTitle() != null) {
			Orderproduct.setTitle(updatedorderproduct.getTitle());
		}

		if (!Objects.equals(updatedorderproduct.getPrice(), null)) {
			Orderproduct.setPrice(updatedorderproduct.getPrice());
		}

		if (updatedorderproduct.getDescription() != null) {
			Orderproduct.setDescription(updatedorderproduct.getDescription());
		}

		if (!Objects.equals(updatedorderproduct.getQuantity(), null)) {
			Orderproduct.setQuantity(updatedorderproduct.getQuantity());
		}

		if (!Objects.equals(updatedorderproduct.getTax_percent(), null)) {
			Orderproduct.setTax_percent(updatedorderproduct.getTax_percent());
		}

		if (!Objects.equals(updatedorderproduct.getTax_amount(), null)) {
			Orderproduct.setTax_amount(updatedorderproduct.getTax_amount());
		}

		if (!Objects.equals(updatedorderproduct.getDiscount_amount(), null)) {
			Orderproduct.setDiscount_amount(updatedorderproduct.getDiscount_amount());
		}

		if (!Objects.equals(updatedorderproduct.getDiscount_percent(), null)) {
			Orderproduct.setDiscount_percent(updatedorderproduct.getDiscount_percent());
		}

		if (updatedorderproduct.getTax().getName() != null) {
			Orderproduct.getTax().setName(updatedorderproduct.getTax().getName());
		}

		if (!Objects.equals(updatedorderproduct.getTax().getPercent(), null)) {
			Orderproduct.getTax().setPercent(updatedorderproduct.getTax().getPercent());
		}

		if (updatedorderproduct.getImage().getImage() != null) {
			Orderproduct.getImage().setImage(updatedorderproduct.getImage().getImage());
		}

		orderproductrepository.save(Orderproduct);

		return Orderproduct;
	}

	// Delete a Orderproduct
	@Transactional
	public void deleteOrderproduct(UUID id, UUID templateid) {
		if (orderproductrepository.existsByIdAndTemplateid(id, templateid)) {
			orderproductrepository.deleteById(id);
		}

	}

	public List<Client> getAllClient(UUID templateId) {
		return clientrepository.findByTemplateid(templateId);

	}

	public void updateOrderClients(List<Client> clientbody, UUID tempid) {

		for (Client client : clientbody) {
			UUID clientid = client.getId();
			Client databaseclient = clientrepository.findByIdAndTemplateid(clientid, tempid);
			if (databaseclient != null) {
				clientrepository.save(client);
			}
		}
	}

	public List<Orders> getAllOrderFromTemplate(UUID templateid) {
		return orderrepository.findByTemplateid(templateid);
	}

}
