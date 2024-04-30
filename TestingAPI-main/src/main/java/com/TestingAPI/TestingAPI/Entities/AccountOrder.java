package com.TestingAPI.TestingAPI.Entities;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class AccountOrder {

	
	@Id
    @GeneratedValue
    private UUID id;
	
	@OneToOne
    @JsonBackReference
    private Orders order;
	
	private String type;
	private String currency;
	private String processing_id;
	private List<String> mcc;
	private List<String> payment_methods;
	
// 	private Productpermissions product_permissions;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getProcessing_id() {
		return processing_id;
	}
	public void setProcessing_id(String processing_id) {
		this.processing_id = processing_id;
	}
	public List<String> getMcc() {
		return mcc;
	}
	public void setMcc(List<String> mcc) {
		this.mcc = mcc;
	}
	public List<String> getPayment_methods() {
		return payment_methods;
	}
	public void setPayment_methods(List<String> payment_methods) {
		this.payment_methods = payment_methods;
	}
	
	
}
