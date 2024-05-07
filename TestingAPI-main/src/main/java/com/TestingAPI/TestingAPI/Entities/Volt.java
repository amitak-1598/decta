package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "volt")
public class Volt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	private String volt_approve_url;
	private String internal_id;
	
	public String getVolt_approve_url() {
		return volt_approve_url;
	}
	public void setVolt_approve_url(String volt_approve_url) {
		this.volt_approve_url = volt_approve_url;
	}
	public String getInternal_id() {
		return internal_id;
	}
	public void setInternal_id(String internal_id) {
		this.internal_id = internal_id;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	
	
	
}
