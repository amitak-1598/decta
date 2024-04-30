package com.TestingAPI.TestingAPI.Dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestingAPI.TestingAPI.Entities.Logo;

@Repository
public interface LogoRepository extends JpaRepository<Logo,UUID>{
    
}
