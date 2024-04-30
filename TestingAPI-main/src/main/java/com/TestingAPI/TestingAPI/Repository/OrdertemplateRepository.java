package com.TestingAPI.TestingAPI.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestingAPI.TestingAPI.Entities.OrderTemplate;

@Repository
public interface OrdertemplateRepository  extends JpaRepository<OrderTemplate,UUID>{

}
