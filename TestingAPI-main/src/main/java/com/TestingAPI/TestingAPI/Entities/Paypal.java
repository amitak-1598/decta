package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "paypal")
public class Paypal {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    
    private String approve_url;
	private String internal_id;
    
    
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getApprove_url() {
		return approve_url;
	}
	public void setApprove_url(String approve_url) {
		this.approve_url = approve_url;
	}
	public String getInternal_id() {
		return internal_id;
	}
	public void setInternal_id(String internal_id) {
		this.internal_id = internal_id;
	}
	
}
