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
	private String zimpler_user_id;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public String getZimpler_approve_url() {
		return zimpler_approve_url;
	}
	public void setZimpler_approve_url(String zimpler_approve_url) {
		this.zimpler_approve_url = zimpler_approve_url;
	}
	public String getInternal_id() {
		return internal_id;
	}
	public void setInternal_id(String internal_id) {
		this.internal_id = internal_id;
	}
	public String getZimpler_user_id() {
		return zimpler_user_id;
	}
	public void setZimpler_user_id(String zimpler_user_id) {
		this.zimpler_user_id = zimpler_user_id;
	}
	
	

}
