package com.TestingAPI.TestingAPI.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;

	@Entity
	@Table(name = "order_clients")
	public class Orderclient {

		@Id
	    @GeneratedValue
	    private UUID id;

		
	
		public Orders getOrder() {
			return order;
		}
		public void setOrder(Orders order) {
			this.order = order;
		}
		@OneToOne
        @JsonBackReference
	    private Orders order;
		
		
	    private String type;
	    private String email;	    
	    private String phone;	  
	    private String first_name;	   
	    private String last_name;
	    private LocalDate birth_date;
	    private String personal_code;	  
	    private String brand_name;	  
	    private String legal_name;	  
//      private Shippingdetails shipping_details;
	    private String registration_nr;	   
	    private String vat_payer_nr;	
	    private String legal_address;
	    private String address;	  
//	    private Country country;	  
	    private String state;	  
	    private String city;	 
	    private String zip_code;	  
	    private String bank_account;   
	    private String bank_code;	   
	    private List<String> cc;	  
	    private boolean send_cc; 
	    private List<String> bcc;	   
	    private boolean recurring_paused;	  
	    private boolean send_to_email;	   
	    private boolean send_to_phone;	   
	    private String last_order_id;	    
	    private String last_order_status;	    
	    private List<String> last_order_permitted_actions	;	 
	    private LocalDate last_order_issued;	   
	    private String last_order_link;	  
	    private String last_order_download_link;
	    private String last_order_print_link;	 
	    private LocalDate next_order_issued;  
//	    private OriginalClient originalClient;	  
	    private UUID recurring_payment_method;	   
	    private UUID recurring_card;	   
	    private boolean is_added;	  
	    private int order_count;	  
	    private String account_type;
	    
	    private UUID templateid;
	    
	    
	    
		public UUID getId() {
			return id;
		}
		public void setId(UUID id) {
			this.id = id;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
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
		public LocalDate getBirth_date() {
			return birth_date;
		}
		public void setBirth_date(LocalDate birth_date) {
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
		public String getZip_code() {
			return zip_code;
		}
		public void setZip_code(String zip_code) {
			this.zip_code = zip_code;
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
		public List<String> getCc() {
			return cc;
		}
		public void setCc(List<String> cc) {
			this.cc = cc;
		}
		public boolean isSend_cc() {
			return send_cc;
		}
		public void setSend_cc(boolean send_cc) {
			this.send_cc = send_cc;
		}
		public List<String> getBcc() {
			return bcc;
		}
		public void setBcc(List<String> bcc) {
			this.bcc = bcc;
		}
		public boolean isRecurring_paused() {
			return recurring_paused;
		}
		public void setRecurring_paused(boolean recurring_paused) {
			this.recurring_paused = recurring_paused;
		}
		public boolean isSend_to_email() {
			return send_to_email;
		}
		public void setSend_to_email(boolean send_to_email) {
			this.send_to_email = send_to_email;
		}
		public boolean isSend_to_phone() {
			return send_to_phone;
		}
		public void setSend_to_phone(boolean send_to_phone) {
			this.send_to_phone = send_to_phone;
		}
		public String getLast_order_id() {
			return last_order_id;
		}
		public void setLast_order_id(String last_order_id) {
			this.last_order_id = last_order_id;
		}
		public String getLast_order_status() {
			return last_order_status;
		}
		public void setLast_order_status(String last_order_status) {
			this.last_order_status = last_order_status;
		}
		public List<String> getLast_order_permitted_actions() {
			return last_order_permitted_actions;
		}
		public void setLast_order_permitted_actions(List<String> last_order_permitted_actions) {
			this.last_order_permitted_actions = last_order_permitted_actions;
		}
		public LocalDate getLast_order_issued() {
			return last_order_issued;
		}
		public void setLast_order_issued(LocalDate last_order_issued) {
			this.last_order_issued = last_order_issued;
		}
		public String getLast_order_link() {
			return last_order_link;
		}
		public void setLast_order_link(String last_order_link) {
			this.last_order_link = last_order_link;
		}
		public String getLast_order_download_link() {
			return last_order_download_link;
		}
		public void setLast_order_download_link(String last_order_download_link) {
			this.last_order_download_link = last_order_download_link;
		}
		public String getLast_order_print_link() {
			return last_order_print_link;
		}
		public void setLast_order_print_link(String last_order_print_link) {
			this.last_order_print_link = last_order_print_link;
		}
		public LocalDate getNext_order_issued() {
			return next_order_issued;
		}
		public void setNext_order_issued(LocalDate next_order_issued) {
			this.next_order_issued = next_order_issued;
		}
		public UUID getRecurring_payment_method() {
			return recurring_payment_method;
		}
		public void setRecurring_payment_method(UUID recurring_payment_method) {
			this.recurring_payment_method = recurring_payment_method;
		}
		public UUID getRecurring_card() {
			return recurring_card;
		}
		public void setRecurring_card(UUID recurring_card) {
			this.recurring_card = recurring_card;
		}
		public boolean isIs_added() {
			return is_added;
		}
		public void setIs_added(boolean is_added) {
			this.is_added = is_added;
		}
		public int getOrder_count() {
			return order_count;
		}
		public void setOrder_count(int order_count) {
			this.order_count = order_count;
		}
		public String getAccount_type() {
			return account_type;
		}
		public void setAccount_type(String account_type) {
			this.account_type = account_type;
		}
		public UUID getTemplateid() {
			return templateid;
		}
		public void setTemplateid(UUID templateid) {
			this.templateid = templateid;
		}

	   
		
	

}
