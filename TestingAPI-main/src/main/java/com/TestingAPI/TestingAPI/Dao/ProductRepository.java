package com.TestingAPI.TestingAPI.Dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestingAPI.TestingAPI.Entities.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product,UUID>{

	List<Product> findBySubscriptionid(UUID subscriptionid);

	Product findByIdAndSubscriptionid(UUID productid, UUID subscriptionid);
	
	boolean existsByIdAndSubscriptionid(UUID productid, UUID subscriptionid);
	// public Product findById(UUID id);
	

}
