package com.TestingAPI.TestingAPI.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.TestingAPI.TestingAPI.Entities.Paymentmethods;

@Repository
public interface PaymentRepository extends JpaRepository<Paymentmethods,UUID> {

	List<Paymentmethods> findByClient(UUID clientId);

	Paymentmethods findByIdAndClient(UUID clientId, UUID paymentmethodid);

	boolean existsByIdAndClient(UUID paymentmethodid, UUID clientid);

}
