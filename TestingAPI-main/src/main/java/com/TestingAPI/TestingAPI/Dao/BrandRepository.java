package com.TestingAPI.TestingAPI.Dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestingAPI.TestingAPI.Entities.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand,UUID> {
    
}
