package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="api_do_url_body")
public class Apidourlbody {
        

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
	private String cardholder_name;    
    private String card_number;
    private Integer exp_month;  
    private Integer exp_year;   
    private String csc;
    private boolean save_card;  
    private String eci;   
    private String cavv;
    private String xid;
    private String three_ds_protocol;
    private String three_ds_ds_id;   
    private String card_saved_by_merchant; 
    private String ip_address;
    private String initial_transaction_id;  
    private String scenario;
    private boolean saved_by_merchant;
    private String cof_trace_id;
    
    
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getCardholder_name() {
		return cardholder_name;
	}
	public void setCardholder_name(String cardholder_name) {
		this.cardholder_name = cardholder_name;
	}
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public Integer getExp_month() {
		return exp_month;
	}
	public void setExp_month(Integer exp_month) {
		this.exp_month = exp_month;
	}
	public Integer getExp_year() {
		return exp_year;
	}
	public void setExp_year(Integer exp_year) {
		this.exp_year = exp_year;
	}
	public String getCsc() {
		return csc;
	}
	public void setCsc(String csc) {
		this.csc = csc;
	}
	public boolean isSave_card() {
		return save_card;
	}
	public void setSave_card(boolean save_card) {
		this.save_card = save_card;
	}
	public String getEci() {
		return eci;
	}
	public void setEci(String eci) {
		this.eci = eci;
	}
	public String getCavv() {
		return cavv;
	}
	public void setCavv(String cavv) {
		this.cavv = cavv;
	}
	public String getXid() {
		return xid;
	}
	public void setXid(String xid) {
		this.xid = xid;
	}
	public String getThree_ds_protocol() {
		return three_ds_protocol;
	}
	public void setThree_ds_protocol(String three_ds_protocol) {
		this.three_ds_protocol = three_ds_protocol;
	}
	public String getThree_ds_ds_id() {
		return three_ds_ds_id;
	}
	public void setThree_ds_ds_id(String three_ds_ds_id) {
		this.three_ds_ds_id = three_ds_ds_id;
	}
	public String getCard_saved_by_merchant() {
		return card_saved_by_merchant;
	}
	public void setCard_saved_by_merchant(String card_saved_by_merchant) {
		this.card_saved_by_merchant = card_saved_by_merchant;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public String getInitial_transaction_id() {
		return initial_transaction_id;
	}
	public void setInitial_transaction_id(String initial_transaction_id) {
		this.initial_transaction_id = initial_transaction_id;
	}
	public String getScenario() {
		return scenario;
	}
	public void setScenario(String scenario) {
		this.scenario = scenario;
	}
	public boolean isSaved_by_merchant() {
		return saved_by_merchant;
	}
	public void setSaved_by_merchant(boolean saved_by_merchant) {
		this.saved_by_merchant = saved_by_merchant;
	}
	public String getCof_trace_id() {
		return cof_trace_id;
	}
	public void setCof_trace_id(String cof_trace_id) {
		this.cof_trace_id = cof_trace_id;
	}
    
    
}
