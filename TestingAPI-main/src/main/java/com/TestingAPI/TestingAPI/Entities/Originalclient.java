package com.TestingAPI.TestingAPI.Entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Originalclient {

	
	@Id
    @GeneratedValue
    private UUID id;
	
	private String type;
	private String email;
	private String phone;
	private String first_name;
	private String last_name;
	private String birth_date;
	private String personal_code;
	private String brand_name;
	private String legal_name;
	private String registration_nr;
	private String vat_payer_nr;
	private String legal_address;
	private String address;
	private String country;
	private String state;
	private String city;
	private String zip_code;
// private Shippingdetails shipping_details;
	private String bank_account;
	private String bank_code;
	private List<String> cc;
	private List<String> bcc;
// private CreatedBy createdby;
	private String display_name;
	private Integer order_count;
	private UUID merchant;
	private String account_type;
	private Integer saved_cards_count;
//  private Verifiedcards verified_cards;
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
	public List<String> getBcc() {
		return bcc;
	}
	public void setBcc(List<String> bcc) {
		this.bcc = bcc;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public Integer getOrder_count() {
		return order_count;
	}
	public void setOrder_count(Integer order_count) {
		this.order_count = order_count;
	}
	public UUID getMerchant() {
		return merchant;
	}
	public void setMerchant(UUID merchant) {
		this.merchant = merchant;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public Integer getSaved_cards_count() {
		return saved_cards_count;
	}
	public void setSaved_cards_count(Integer saved_cards_count) {
		this.saved_cards_count = saved_cards_count;
	}
	
	
	
}
