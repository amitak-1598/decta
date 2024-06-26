
package com.TestingAPI.TestingAPI.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.Card;
import com.TestingAPI.TestingAPI.Entities.Client;
import com.TestingAPI.TestingAPI.Entities.Paymentmethods;
import com.TestingAPI.TestingAPI.Repository.ClientRepository;
import com.TestingAPI.TestingAPI.Repository.PaymentRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import jakarta.transaction.Transactional;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private PaymentRepository paymentrepository;

	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}

	public Client addClient(Client client) {
		return clientRepository.save(client);
	}

	public Client getClientById(UUID id) {
		return clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Client not found with id: " + id));
	}

	public Client updateClient(UUID id, Client client) {
		if (!clientRepository.existsById(id)) {
			throw new RuntimeException("Client not found with id: " + id);
		}
		client.setId(id);
		return clientRepository.save(client);
	}

	public void deleteClient(UUID id) {
		if (!clientRepository.existsById(id)) {
			throw new RuntimeException("Client not found with id: " + id);
		}
		clientRepository.deleteById(id);
	}

	public Client updateclient(UUID templateid, UUID clientid, Client updateclient) {
		if (clientRepository.existsByIdAndTemplateid(clientid, templateid)) {
			updateclient.setId(clientid);
			updateclient.setTemplateid(templateid);
			return clientRepository.save(updateclient);
		}
		return null;
	}

	@Transactional
	public void deleteTemplateClient(UUID id, UUID templateid) {
		if (clientRepository.existsByIdAndTemplateid(id, templateid)) {
            clientRepository.deleteById(id);
		}
		
		
	}
	
	
	public List<Client> getAllSubscritpionClients(UUID tempId) {
		return clientRepository.findBySubscriptionid(tempId);
	}
	
	public Client updateSubscriptionClient(UUID subscriptionid, UUID clientid, Client updateclient) {
		if (clientRepository.existsByIdAndSubscriptionid(clientid, subscriptionid)) {
			updateclient.setId(clientid);
			updateclient.setSubscriptionid(subscriptionid);
			return clientRepository.save(updateclient);
		}
		return null;
	}
	
	@Transactional
	public void deleteSubscriptionClient(UUID id, UUID subscriptionid) {
		if (clientRepository.existsByIdAndSubscriptionid(id, subscriptionid)) {
            clientRepository.deleteById(id);
		}
		
		
	}
	
	public List<Paymentmethods> getAllClientPaymentMethods(UUID clientId){
		return paymentrepository.findByClient(clientId);
	}
	
	public Paymentmethods getClientPaymentMethod(UUID clientId, UUID paymentmethodid) {
		return paymentrepository.findByIdAndClient(paymentmethodid,clientId);
	}
	
	public Paymentmethods updatePaymentMethod(UUID clientid, UUID paymentmethodid , Paymentmethods updatepaymentmethods) {
		if(paymentrepository.existsByIdAndClient(paymentmethodid,clientid)) {
			updatepaymentmethods.setId(paymentmethodid);
			updatepaymentmethods.setClient(clientid);
			return paymentrepository.save(updatepaymentmethods);
		}
		return null;
	}
	
	@Transactional
	public void deleteClientPaymentMethod(UUID id, UUID clientid) {
		if(paymentrepository.existsByIdAndClient(id, clientid)) {
			paymentrepository.deleteById(id);
		}
	}
	
	public Paymentmethods PartiallyUpdatePaymentmethod(UUID Id, UUID clientid, Map<String, Object> updates)
			throws JsonProcessingException, IllegalArgumentException {

		Paymentmethods paymentmethod = paymentrepository.findByIdAndClient(Id, clientid);
		if (paymentmethod != null) {
			for (Map.Entry<String, Object> entry : updates.entrySet()) {
				String key = entry.getKey();
				Object value = entry.getValue();

				if (key.equals("transaction_type")) {
					paymentmethod.setTransaction_type((String) value);
				} else if (key.equals("method_type")) {
					paymentmethod.setMethod_type((String) value);
				} else if (key.equals("merchant")) {
					paymentmethod.setMerchant((UUID) value);
				} else if (key.equals("card")) {
					System.out.print(value.toString());
					 
					UUID cardid = paymentmethod.getCard().getId();
					ObjectMapper mapper = new ObjectMapper();
					ObjectNode cardNode = mapper.convertValue(value, ObjectNode.class);		
				Card updatedCard = mapper.treeToValue(cardNode, Card.class);
				          updatedCard.setId(cardid);
					     paymentmethod.setCard(updatedCard);
					     updatedCard.setPaymentmethods(paymentmethod);
				
				
				}
			}
			return paymentrepository.save(paymentmethod);

		} else {
			return null;
		}
	}
	
}
