package com.TestingAPI.TestingAPI.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestingAPI.TestingAPI.Entities.B2POrder;

@Repository
public interface B2POrderRepository extends JpaRepository<B2POrder,UUID>{

}
