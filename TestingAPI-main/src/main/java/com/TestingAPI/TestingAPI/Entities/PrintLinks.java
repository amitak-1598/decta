package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "printlinks")
public class PrintLinks {

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
	
	
	private String full;
	private String preview;
	private String log;



	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getFull() {
		return full;
	}
	public void setFull(String full) {
		this.full = full;
	}
	public String getPreview() {
		return preview;
	}
	public void setPreview(String preview) {
		this.preview = preview;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
}
