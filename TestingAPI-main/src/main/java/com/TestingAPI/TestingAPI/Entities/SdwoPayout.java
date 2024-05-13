package com.TestingAPI.TestingAPI.Entities;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="sdwopayout")
public class SdwoPayout {

	@Id
	@GeneratedValue
	private UUID id;
	
	private String account;
	private String terminalProcessingId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "charge_client_id", referencedColumnName = "id")
	private ChargeClient client;
	
	private String sender_name;
	private String sdwo_merchant_id;
	private BigDecimal amount;
	private String currency;
	private String language;
	private String description;
	private boolean isTest;
	private int maxPaymentAttempts;
    private String number;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getTerminalProcessingId() {
		return terminalProcessingId;
	}
	public void setTerminalProcessingId(String terminalProcessingId) {
		this.terminalProcessingId = terminalProcessingId;
	}
	public ChargeClient getClient() {
		return client;
	}
	public void setClient(ChargeClient client) {
		this.client = client;
	}
	public String getSender_name() {
		return sender_name;
	}
	public void setSender_name(String sender_name) {
		this.sender_name = sender_name;
	}
	public String getSdwo_merchant_id() {
		return sdwo_merchant_id;
	}
	public void setSdwo_merchant_id(String sdwo_merchant_id) {
		this.sdwo_merchant_id = sdwo_merchant_id;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isTest() {
		return isTest;
	}
	public void setTest(boolean isTest) {
		this.isTest = isTest;
	}
	public int getMaxPaymentAttempts() {
		return maxPaymentAttempts;
	}
	public void setMaxPaymentAttempts(int maxPaymentAttempts) {
		this.maxPaymentAttempts = maxPaymentAttempts;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
    
    
}
