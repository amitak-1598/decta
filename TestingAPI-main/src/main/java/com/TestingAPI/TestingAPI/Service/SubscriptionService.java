package com.TestingAPI.TestingAPI.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.Product;
import com.TestingAPI.TestingAPI.Entities.Subscription;
import com.TestingAPI.TestingAPI.Dao.ProductRepository;
import com.TestingAPI.TestingAPI.Repository.SubscriptionRepository;

import jakarta.transaction.Transactional;

@Service
public class SubscriptionService {

	@Autowired
	private SubscriptionRepository subscriptionrepository;

	@Autowired
	private SubscriptionRepository subscriptionRepository;

	@Autowired
	private ProductRepository productrepository;

	public Subscription createSubscription(Subscription subscription) {
		return subscriptionrepository.save(subscription);
	}

	public List<Subscription> getAllSubscriptions() {
		return subscriptionRepository.findAll();
	}

	public Subscription getSubscriptionById(UUID id) {
		Optional<Subscription> optionalSubscription = subscriptionRepository.findById(id);
		return optionalSubscription.orElse(null);
	}

	public Subscription updateSubscription(UUID id, Subscription updatedSubscription) {

		if (subscriptionRepository.existsById(id)) {
			updatedSubscription.setId(id);
			return subscriptionRepository.save(updatedSubscription);
		} else {
			return null;
		}

	}

	public boolean deleteSubscription(UUID id) {
		if (subscriptionRepository.existsById(id)) {
			subscriptionRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public Subscription partiallyUpdateSubscription(UUID id, Map<String, Object> updates) {
		Subscription subscription = getSubscriptionById(id);
		if (subscription != null) {

			for (Map.Entry<String, Object> entry : updates.entrySet()) {
				String key = entry.getKey();
				Object value = entry.getValue();

				if (key.equals("title")) {
					subscription.setTitle((String) value);
				} else if (key.equals("requestClientInfo")) {
					subscription.setRequestClientInfo((List<String>) value);
				}

			}
			return subscriptionRepository.save(subscription);
		} else {
			return null;
		}
	}

	public List<Product> getAllProduct(UUID subscriptionid) {
		return productrepository.findBySubscriptionid(subscriptionid);
	}

	public Product getSingleProduct(UUID subscriptionid, UUID productid) {
		return productrepository.findByIdAndSubscriptionid(productid, subscriptionid);
	}

	public Product getProductById(UUID id, UUID subscriptionid) {
		Product optionalproduct = productrepository.findByIdAndSubscriptionid(id, subscriptionid);
		return optionalproduct;
	}

	@Transactional
	public void deleteSubscriptionProduct(UUID subscriptionid, UUID productid) {
		if (productrepository.existsByIdAndSubscriptionid(productid, subscriptionid)) {
			productrepository.deleteById(productid);
		}

	}


	public Product partiallyUpdateSubscriptionProduct(UUID productid, UUID subscriptionid,
			Map<String, Object> updates) {
		Product product = getProductById(productid, subscriptionid);
		if (product != null) {

			for (Map.Entry<String, Object> entry : updates.entrySet()) {
				String key = entry.getKey();
				Object value = entry.getValue();

				if (key.equals("title")) {
					product.setTitle((String) value);
				} else if (key.equals("description")) {
					product.setDescription((String) value);
				}

			}
			return productrepository.save(product);
		} else {
			return null;
		}
	}

}
