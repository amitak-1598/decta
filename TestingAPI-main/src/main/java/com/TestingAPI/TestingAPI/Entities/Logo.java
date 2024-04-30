package com.TestingAPI.TestingAPI.Entities;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Logo {
    @Id
    @GeneratedValue
    private UUID id;
  
    private String type;

    private String image_type;

    private String original_filename;

    private int width;

    private int height;
    private String image;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getImage_type() {
        return image_type;
    }
    public void setImage_type(String image_type) {
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
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    @OneToOne
    @JsonBackReference
    private Website website;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    
  
    public Website getWebsite() {
        return website;
    }
    public void setWebsite(Website website) {
        this.website = website;
    }


  
    
}
