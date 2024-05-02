package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment_methods")
public class Paymentmethods {

	
	@Id
    @GeneratedValue
    private UUID id;
	
	private String transaction_type;
	private String transaction_uid;
	private UUID client;
	private UUID merchant;
	private String method_type;
	
	@OneToOne(mappedBy = "paymentmethods",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonManagedReference
    private Card card;

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public String getTransaction_uid() {
		return transaction_uid;
	}

	public void setTransaction_uid(String transaction_uid) {
		this.transaction_uid = transaction_uid;
	}

	public UUID getClient() {
		return client;
	}

	public void setClient(UUID client) {
		this.client = client;
	}

	public UUID getMerchant() {
		return merchant;
	}

	public void setMerchant(UUID merchant) {
		this.merchant = merchant;
	}

	public String getMethod_type() {
		return method_type;
	}

	public void setMethod_type(String method_type) {
		this.method_type = method_type;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
  
}
