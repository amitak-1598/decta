
package com.TestingAPI.TestingAPI.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.Client;
import com.TestingAPI.TestingAPI.Repository.ClientRepository;

import jakarta.transaction.Transactional;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

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
	
}
