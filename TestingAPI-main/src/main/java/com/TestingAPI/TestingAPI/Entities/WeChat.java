package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "wechat")
public class WeChat {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;	
	
	private String code_o2bpNaITMKjx;
	private String merchant_code;
	private String pay_url;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getCode_o2bpNaITMKjx() {
		return code_o2bpNaITMKjx;
	}
	public void setCode_o2bpNaITMKjx(String code_o2bpNaITMKjx) {
		this.code_o2bpNaITMKjx = code_o2bpNaITMKjx;
	}
	public String getMerchant_code() {
		return merchant_code;
	}
	public void setMerchant_code(String merchant_code) {
		this.merchant_code = merchant_code;
	}
	public String getPay_url() {
		return pay_url;
	}
	public void setPay_url(String pay_url) {
		this.pay_url = pay_url;
	}
}
