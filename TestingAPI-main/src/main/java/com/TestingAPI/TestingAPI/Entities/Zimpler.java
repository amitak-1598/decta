package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "zimpler")
public class Zimpler {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private UUID id;
	    
	    private String ip_address;
	    private String zimpler_approve_url;
	    private String internal_id;

}
