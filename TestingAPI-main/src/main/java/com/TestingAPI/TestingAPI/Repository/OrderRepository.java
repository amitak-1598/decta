package com.TestingAPI.TestingAPI.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestingAPI.TestingAPI.Entities.Orders;

@Repository
public interface OrderRepository  extends JpaRepository<Orders,UUID>{

	List<Orders> findBySubscriptionid(UUID subscriptionid);

	List<Orders> findByTemplateid(UUID templateid);

}
