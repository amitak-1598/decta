package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// @Entity
// public class Product {
//     @Id
//     @GeneratedValue(generator = "uuid")
//     @GenericGenerator(name = "uuid", strategy = "uuid2")
//     private UUID UUID;
//     private String type;
//     private String brand;
//     private String title;
//     private String currency;
//     private double price;
//     private String description;
//     private String tax;
//     private String[] images;


//     private UUID subscriptionid;
//     public Product() {
//     }

//     public UUID getUUID() {
//         return UUID;
//     }

//     public void setUUID(UUID uUID) {
//         UUID = uUID;
//     }

//     public String getType() {
//         return type;
//     }

//     public void setType(String type) {
//         this.type = type;
//     }

//     public String getBrand() {
//         return brand;
//     }

//     public void setBrand(String brand) {
//         this.brand = brand;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public void setTitle(String title) {
//         this.title = title;
//     }

//     public String getCurrency() {
//         return currency;
//     }

//     public void setCurrency(String currency) {
//         this.currency = currency;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public void setPrice(double price) {
//         this.price = price;
//     }

//     public String getDescription() {
//         return description;
//     }

//     public void setDescription(String description) {
//         this.description = description;
//     }

//     public String getTax() {
//         return tax;
//     }

//     public void setTax(String tax) {
//         this.tax = tax;
//     }

//     public String[] getImages() {
//         return images;
//     }

//     public void setImages(String[] images) {
//         this.images = images;
//     }

//     public Product(UUID uUID, String type, String brand, String title, String currency, double price,
//             String description, String tax, String[] images) {
//         UUID = uUID;
//         this.type = type;
//         this.brand = brand;
//         this.title = title;
//         this.currency = currency;
//         this.price = price;
//         this.description = description;
//         this.tax = tax;
//         this.images = images;
//     }

//     public UUID getSubscriptionid() {
//         return subscriptionid;
//     }

//     public void setSubscriptionid(UUID subscriptionid) {
//         this.subscriptionid = subscriptionid;
//     }
@Entity
public class Product {

	@Id
	@GeneratedValue
	private UUID id;

	private String type;
	private String brand;
	private String title;
	private String currency;
	private double price;
	private String description;
	private Tax tax;
	private String[] images;

	private UUID subscriptionid;

	// @ManyToOne
	// @JoinColumn(name = "invoice_id")
	// private Invoice invoice;

	

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getSubscriptionid() {
		return subscriptionid;
	}

	public void setSubscriptionid(UUID subscriptionid) {
		this.subscriptionid = subscriptionid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	// public Invoice getInvoice() {
	// 	return invoice;
	// }

	// public void setInvoice(Invoice invoice) {
	// 	this.invoice = invoice;
	// }
    

}
