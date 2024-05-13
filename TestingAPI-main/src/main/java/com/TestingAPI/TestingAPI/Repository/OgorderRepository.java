package com.TestingAPI.TestingAPI.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestingAPI.TestingAPI.Entities.OGOrder;

@Repository
public interface OgorderRepository extends JpaRepository<OGOrder,UUID>{

}
