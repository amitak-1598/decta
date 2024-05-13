package com.TestingAPI.TestingAPI.Entities;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ogorder")
public class OGOrder {

	    @Id
	    @GeneratedValue
	    private UUID id;
	    
	    private String account;
	    private String terminalProcessingId;
	      
	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "charge_client_id", referencedColumnName = "id")
	    private ChargeClient client;
	    
	    private BigDecimal amount;
	    private String currency;
	    private String language;
	    private String description;
	    private boolean isTest;
	    private int maxPaymentAttempts;
	    private UUID merchant;
	    private UUID website;
		
	    
	    
	    
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
		public UUID getMerchant() {
			return merchant;
		}
		public void setMerchant(UUID merchant) {
			this.merchant = merchant;
		}
		public UUID getWebsite() {
			return website;
		}
		public void setWebsite(UUID website) {
			this.website = website;
		}
	    
	    
}
