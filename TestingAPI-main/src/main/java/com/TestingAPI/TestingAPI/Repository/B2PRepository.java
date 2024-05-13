package com.TestingAPI.TestingAPI.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestingAPI.TestingAPI.Entities.B2PTransactionRequest;

@Repository
public interface B2PRepository extends JpaRepository<B2PTransactionRequest,UUID>{

}
