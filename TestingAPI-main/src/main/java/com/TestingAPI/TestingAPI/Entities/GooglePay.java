package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "googlepay")
public class GooglePay {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;	
	
	private String signature;
	// private IntermediateSigningKey intermediateSigningKey;
	private String protocolVersion;
	private String signedMessage;
	private String ip_address;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getProtocolVersion() {
		return protocolVersion;
	}
	public void setProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}
	public String getSignedMessage() {
		return signedMessage;
	}
	public void setSignedMessage(String signedMessage) {
		this.signedMessage = signedMessage;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	
	
	
}
