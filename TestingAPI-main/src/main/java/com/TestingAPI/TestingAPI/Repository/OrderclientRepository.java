package com.TestingAPI.TestingAPI.Repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestingAPI.TestingAPI.Entities.Orderclient;

@Repository
public interface OrderclientRepository extends JpaRepository<Orderclient,UUID>{

	Optional<Orderclient> findByIdAndTemplateid(UUID id, UUID templateid);

}
