package com.TestingAPI.TestingAPI.Entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "client")
public class Client {
	
	@Id
    @GeneratedValue
    private UUID id;

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
	
	
//    @OneToOne(cascade = CascadeType.ALL)
//    private Invoice invoice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shipping_details_id")
	private ShippingDetails shipping_details;

	private String bank_account;
	private String bank_code;

	@ElementCollection
	private List<String> cc;

	@ElementCollection
	private List<String> bcc;
	
	private String display_name;
	private String order_count;
	
	@OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Createdby2 createdBy;

	private UUID merchant;
	private String account_type;
	private int saved_cards_count;

	@OneToMany(cascade = CascadeType.ALL)
	private List<VerifiedCard> verified_cards;

							
	private UUID templateid;
	private UUID subscriptionid;
	
	
	public String getDisplay_name() {
		return display_name;
	}

	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	public String getOrder_count() {
		return order_count;
	}

	public void setOrder_count(String order_count) {
		this.order_count = order_count;
	}

	public Createdby2 getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Createdby2 createdBy) {
		this.createdBy = createdBy;
	}

	

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
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

//	public Invoice getInvoice() {
//		return invoice;
//	}
//
//	public void setInvoice(Invoice invoice) {
//		this.invoice = invoice;
//	}

	public ShippingDetails getShipping_details() {
		return shipping_details;
	}

	public void setShipping_details(ShippingDetails shipping_details) {
		this.shipping_details = shipping_details;
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

	public int getSaved_cards_count() {
		return saved_cards_count;
	}

	public void setSaved_cards_count(int saved_cards_count) {
		this.saved_cards_count = saved_cards_count;
	}

	public List<VerifiedCard> getVerified_cards() {
		return verified_cards;
	}

	public void setVerified_cards(List<VerifiedCard> verified_cards) {
		this.verified_cards = verified_cards;
	}

	public UUID getTemplateid() {
		return templateid;
	}

	public void setTemplateid(UUID templateid) {
		this.templateid = templateid;
	}

	public UUID getSubscriptionid() {
		return subscriptionid;
	}

	public void setSubscriptionid(UUID subscriptionid) {
		this.subscriptionid = subscriptionid;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", email=" + email + ", phone=" + phone + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", birth_date=" + birth_date + ", personal_code=" + personal_code
				+ ", brand_name=" + brand_name + ", legal_name=" + legal_name + ", registration_nr=" + registration_nr
				+ ", vat_payer_nr=" + vat_payer_nr + ", legal_address=" + legal_address + ", address=" + address
				+ ", country=" + country + ", state=" + state + ", city=" + city + ", zip_code=" + zip_code
				+ ", shipping_details=" + shipping_details + ", bank_account=" + bank_account + ", bank_code="
				+ bank_code + ", cc=" + cc + ", bcc=" + bcc + ", display_name=" + display_name + ", order_count="
				+ order_count + ", createdBy=" + createdBy + ", merchant=" + merchant + ", account_type=" + account_type
				+ ", saved_cards_count=" + saved_cards_count + ", verified_cards=" + verified_cards + ", templateid="
				+ templateid + ", subscriptionid=" + subscriptionid + "]";
	}



}
