package com.TestingAPI.TestingAPI.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestingAPI.TestingAPI.Entities.Zimpler;


@Repository
public interface ZimplerRepository extends JpaRepository<Zimpler,UUID>{

}
