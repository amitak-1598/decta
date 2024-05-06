package com.TestingAPI.TestingAPI.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestingAPI.TestingAPI.Entities.Client;

@Repository
public interface ClientRepository  extends JpaRepository<Client, UUID>{

	List<Client> findByTemplateid(UUID templateId);

	Client findByIdAndTemplateid(UUID clientid, UUID tempid);

	boolean existsByIdAndTemplateid(UUID clientid, UUID templateid);

	List<Client> findBySubscriptionid(UUID tempId);

	Client findByIdAndSubscriptionid(UUID clientid, UUID subscriptionId);

	boolean existsByIdAndSubscriptionid(UUID clientid, UUID subscriptionid);

	Client findByMerchant(UUID id);

}
