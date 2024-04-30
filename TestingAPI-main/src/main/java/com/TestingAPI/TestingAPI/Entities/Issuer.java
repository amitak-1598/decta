package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
	    private String brand_name;
	    private String legal_name;
	    private String registration_nr;
	    private String vat_payer_nr;
	    private String legal_address;
	    private String address;
	    private String bank_account;
	    private String bank_code;
	    
	    public Orders getOrder() {
			return order;
		}
		public void setOrder(Orders order) {
			this.order = order;
		}
		
		@OneToOne
        @JsonBackReference
	    private Orders order;
		
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
		public String getBrand_name() {
			return brand_name;
		}
		public void setBrand_name(String brand_name) {
			this.brand_name = brand_name;
		}
		public String getLegal_name() {
			return legal_name;
		}
		public void setLegal_name(String legal_name) {
			this.legal_name = legal_name;
		}
		public String getRegistration_nr() {
			return registration_nr;
		}
		public void setRegistration_nr(String registration_nr) {
			this.registration_nr = registration_nr;
		}
		public String getVat_payer_nr() {
			return vat_payer_nr;
		}
		public void setVat_payer_nr(String vat_payer_nr) {
			this.vat_payer_nr = vat_payer_nr;
		}
		public String getLegal_address() {
			return legal_address;
		}
		public void setLegal_address(String legal_address) {
			this.legal_address = legal_address;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getBank_account() {
			return bank_account;
		}
		public void setBank_account(String bank_account) {
			this.bank_account = bank_account;
		}
		public String getBank_code() {
			return bank_code;
		}
		public void setBank_code(String bank_code) {
			this.bank_code = bank_code;
		}
		
		
	    
	    
	    
}
