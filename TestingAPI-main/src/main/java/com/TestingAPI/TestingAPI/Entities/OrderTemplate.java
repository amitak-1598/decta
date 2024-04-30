package com.TestingAPI.TestingAPI.Entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_templates")
public class OrderTemplate {
       
	
	    @Id
        @GeneratedValue
        private UUID id;
	    private String title;
	    private List<String> request_client_info;
	    private String brand;
	    private String currency;
	    private long due;
	    private int due_type;
	    private String language;
	    private String terminal;
	    
	    @OneToMany(cascade = CascadeType.ALL)
		private List<Orderproduct> orderproduct;
	    
	    	    
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public List<String> getRequest_client_info() {
			return request_client_info;
		}
		public void setRequest_client_info(List<String> request_client_info) {
			this.request_client_info = request_client_info;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public long getDue() {
			return due;
		}
		public void setDue(long due) {
			this.due = due;
		}
		public int getDue_type() {
			return due_type;
		}
		public void setDue_type(int due_type) {
			this.due_type = due_type;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public String getTerminal() {
			return terminal;
		}
		public void setTerminal(String terminal) {
			this.terminal = terminal;
		}
		public UUID getId() {
			return id;
		}
		public void setId(UUID id) {
			this.id = id;
		}
		public List<Orderproduct> getOrderproduct() {
			return orderproduct;
		}
		public void setOrderproduct(List<Orderproduct> orderproduct) {
			this.orderproduct = orderproduct;
		}
	
	
		
		
		
		
		
		
		
	    
	    
}
