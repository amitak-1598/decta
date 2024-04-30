package com.TestingAPI.TestingAPI.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Tax {

	
//	private String type ;
	
	@Column(name = "tax_name")
    private String name;

    @Column(name = "tax_percentage")
    private double percent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
	
	
    
    
}
