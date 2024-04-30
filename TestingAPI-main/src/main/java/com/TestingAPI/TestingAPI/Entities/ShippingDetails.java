package com.TestingAPI.TestingAPI.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shipping_details")
public class ShippingDetails {

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String phone;
	    private String first_name;
	    private String last_name;
	    private String birth_date;
	    private String personal_code;
	    private String brand_name;
	    private String legal_name;
	    private String registration_nr;
	    private String vat_payer_nr;
	    private String country;
	    private String state;
	    private String city;
	    private String street;
	    private String zip_code;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getBirth_date() {
			return birth_date;
		}
		public void setBirth_date(String birth_date) {
			this.birth_date = birth_date;
		}
		public String getPersonal_code() {
			return personal_code;
		}
		public void setPersonal_code(String personal_code) {
			this.personal_code = personal_code;
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
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getZip_code() {
			return zip_code;
		}
		public void setZip_code(String zip_code) {
			this.zip_code = zip_code;
		}
	
	    
		
	    
	    
}
