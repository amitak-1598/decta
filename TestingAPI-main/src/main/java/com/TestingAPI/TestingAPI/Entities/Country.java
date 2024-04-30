package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	
	@Id
    @GeneratedValue
    private UUID id;

	
	@OneToOne
    @JsonBackReference
    private Orders order;
	
	private String type;
	private String iso_code;
	private String code;
	private String display_name;
		
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIso_code() {
		return iso_code;
	}
	public void setIso_code(String iso_code) {
		this.iso_code = iso_code;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
}
