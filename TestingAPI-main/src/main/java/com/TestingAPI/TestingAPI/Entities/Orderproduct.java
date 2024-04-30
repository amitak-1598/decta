package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_product")
public class Orderproduct {

	
	@Id
    @GeneratedValue
    private UUID id;
	
	@ManyToOne
	@JsonBackReference
	private Orders order;
	
//	private String type;
	
    private String title;
    
       
  
    private double price;

    private double total;
    private String currency;
    
    private UUID templateid;
    
    
  
    private String description;

    
    private int quantity;

    @Embedded
    private Tax tax;
    
    @Embedded
    private Image image;

   
    private double tax_percent;

 
    private double discount_percent;

   
    private double discount_amount;

    
    private String image_url;

    
    private double tax_amount;


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


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public UUID getTemplateid() {
		return templateid;
	}


	public void setTemplateid(UUID templateid) {
		this.templateid = templateid;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Tax getTax() {
		return tax;
	}


	public void setTax(Tax tax) {
		this.tax = tax;
	}


	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}


	public double getTax_percent() {
		return tax_percent;
	}


	public void setTax_percent(double tax_percent) {
		this.tax_percent = tax_percent;
	}


	public double getDiscount_percent() {
		return discount_percent;
	}


	public void setDiscount_percent(double discount_percent) {
		this.discount_percent = discount_percent;
	}


	public double getDiscount_amount() {
		return discount_amount;
	}


	public void setDiscount_amount(double discount_amount) {
		this.discount_amount = discount_amount;
	}


	public String getImage_url() {
		return image_url;
	}


	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}


	public double getTax_amount() {
		return tax_amount;
	}


	public void setTax_amount(double tax_amount) {
		this.tax_amount = tax_amount;
	}

	
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}

	
    
	
	
    
}
