package com.TestingAPI.TestingAPI.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.TestingAPI.TestingAPI.Entities.Orderproduct;

@Repository
public interface OrderproductRepository  extends JpaRepository<Orderproduct,UUID> {

	List<Orderproduct> findByTemplateid(UUID tempid);

	Orderproduct findByIdAndTemplateid(UUID orderproductid, UUID tempid);

	boolean existsByIdAndTemplateid(UUID id, UUID orderproductid);

//	Orderproduct deleteByIdAndTemplateid(UUID id, UUID templateid);

	
}
