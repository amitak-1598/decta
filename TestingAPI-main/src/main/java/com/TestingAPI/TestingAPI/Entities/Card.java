package com.TestingAPI.TestingAPI.Entities;


import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "card")
public class Card {
	
	@Id
    @GeneratedValue
    private UUID id;
	
	@OneToOne
    @JsonBackReference
    private Paymentmethods paymentmethods;
	
	private int exp_month;
	private int exp_year;
	private Boolean is_default;
	
	public int getExp_month() {
		return exp_month;
	}
	public void setExp_month(int exp_month) {
		this.exp_month = exp_month;
	}
	public int getExp_year() {
		return exp_year;
	}
	public void setExp_year(int exp_year) {
		this.exp_year = exp_year;
	}
	public Boolean getIs_default() {
		return is_default;
	}
	public void setIs_default(Boolean is_default) {
		this.is_default = is_default;
	}
	
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Paymentmethods getPaymentmethods() {
		return paymentmethods;
	}
	public void setPaymentmethods(Paymentmethods paymentmethods) {
		this.paymentmethods = paymentmethods;
	}
	
	
}
