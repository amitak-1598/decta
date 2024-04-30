package com.TestingAPI.TestingAPI.Entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Image {

	@Column(name = "image")
    private String image;
	
//	private String type;
	
	
	private List<String> image_type;
	private String original_filename;
	private int width;
	private int height;
	
	

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}

	public List<String> getImage_type() {
		return image_type;
	}

	public void setImage_type(List<String> image_type) {
		this.image_type = image_type;
	}

	public String getOriginal_filename() {
		return original_filename;
	}

	public void setOriginal_filename(String original_filename) {
		this.original_filename = original_filename;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
}
