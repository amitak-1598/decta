package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Issuer {

	@Id
    @GeneratedValue
    private UUID id;
	
	    @OneToOne
	    @JoinColumn(name = "subscription_id")
	    private Subscription subscription;

	    private String email;
	    private String phone;
	    private String brandName;
	    private String legalName;
	    private String registrationNr;
	    private String vatPayerNr;
	    private String legalAddress;
	    private String address;
	    private String bankAccount;
	    private String bankCode;
		public UUID getId() {
			return id;
		}
		public void setId(UUID id) {
			this.id = id;
		}
		public Subscription getSubscription() {
			return subscription;
		}
		public void setSubscription(Subscription subscription) {
			this.subscription = subscription;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getBrandName() {
			return brandName;
		}
		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}
		public String getLegalName() {
			return legalName;
		}
		public void setLegalName(String legalName) {
			this.legalName = legalName;
		}
		public String getRegistrationNr() {
			return registrationNr;
		}
		public void setRegistrationNr(String registrationNr) {
			this.registrationNr = registrationNr;
		}
		public String getVatPayerNr() {
			return vatPayerNr;
		}
		public void setVatPayerNr(String vatPayerNr) {
			this.vatPayerNr = vatPayerNr;
		}
		public String getLegalAddress() {
			return legalAddress;
		}
		public void setLegalAddress(String legalAddress) {
			this.legalAddress = legalAddress;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getBankAccount() {
			return bankAccount;
		}
		public void setBankAccount(String bankAccount) {
			this.bankAccount = bankAccount;
		}
		public String getBankCode() {
			return bankCode;
		}
		public void setBankCode(String bankCode) {
			this.bankCode = bankCode;
		}
	    
	    
	    
}
