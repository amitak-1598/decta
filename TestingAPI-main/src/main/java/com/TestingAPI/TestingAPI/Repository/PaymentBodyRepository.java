package com.TestingAPI.TestingAPI.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestingAPI.TestingAPI.Entities.Apidourlbody;

@Repository
public interface PaymentBodyRepository extends JpaRepository<Apidourlbody,UUID>{

}
