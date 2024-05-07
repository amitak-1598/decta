package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "applepay")
public class ApplePay {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;	
	private String data;
	private String version;
	private String signature;
	private String ephemeralPublicKey;
	private String publicKeyHash;
	private String transactionId;
	private String applicationData;
	private String ip_address;
	private boolean save_card;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getEphemeralPublicKey() {
		return ephemeralPublicKey;
	}
	public void setEphemeralPublicKey(String ephemeralPublicKey) {
		this.ephemeralPublicKey = ephemeralPublicKey;
	}
	public String getPublicKeyHash() {
		return publicKeyHash;
	}
	public void setPublicKeyHash(String publicKeyHash) {
		this.publicKeyHash = publicKeyHash;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getApplicationData() {
		return applicationData;
	}
	public void setApplicationData(String applicationData) {
		this.applicationData = applicationData;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public boolean isSave_card() {
		return save_card;
	}
	public void setSave_card(boolean save_card) {
		this.save_card = save_card;
	}
	
	
	
}
