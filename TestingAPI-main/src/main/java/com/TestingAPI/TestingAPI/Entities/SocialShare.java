package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class SocialShare {

	
	@Id
    @GeneratedValue
    private UUID id;
	
	@ManyToOne
    @JoinColumn(name = "subscription_id")
    private Subscription subscription;

    private String type;
    private String network;
    private String link;
    private Integer sharedOn;
    private Boolean deactivated;
    
    
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Subscription getSubscription() {
		return subscription;
	}
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Integer getSharedOn() {
		return sharedOn;
	}
	public void setSharedOn(Integer sharedOn) {
		this.sharedOn = sharedOn;
	}
	public Boolean getDeactivated() {
		return deactivated;
	}
	public void setDeactivated(Boolean deactivated) {
		this.deactivated = deactivated;
	}
    
    
    
}
