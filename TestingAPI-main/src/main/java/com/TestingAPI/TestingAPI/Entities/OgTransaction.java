package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OgTransaction {
	
	    @Id
	    @GeneratedValue
	    private UUID id;

	    private String card_number2;
	    private int exp_month2;
	    private int exp_year2;
	    private String payment_cardholder_name;
	    
	    
		public String getCard_number2() {
			return card_number2;
		}
		public void setCard_number2(String card_number2) {
			this.card_number2 = card_number2;
		}
		public int getExp_month2() {
			return exp_month2;
		}
		public void setExp_month2(int exp_month2) {
			this.exp_month2 = exp_month2;
		}
		public int getExp_year2() {
			return exp_year2;
		}
		public void setExp_year2(int exp_year2) {
			this.exp_year2 = exp_year2;
		}
		public String getPayment_cardholder_name() {
			return payment_cardholder_name;
		}
		public void setPayment_cardholder_name(String payment_cardholder_name) {
			this.payment_cardholder_name = payment_cardholder_name;
		}
		public UUID getId() {
			return id;
		}
		public void setId(UUID id) {
			this.id = id;
		}
	    
	    
	    

}
