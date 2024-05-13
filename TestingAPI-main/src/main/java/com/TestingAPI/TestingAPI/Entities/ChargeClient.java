package com.TestingAPI.TestingAPI.Entities;


import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChargeClient {
 @Id
    @GeneratedValue
    private UUID id;
    
    private String email;
    private String phone;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String personalCode;
    private String brandName;
    private String legalName;
    private String registrationNr;
    private String vatPayerNr;
    private String legalAddress;
    private String address;
    private String country;
    private String state;
    private String city;
    private String zipCode;
    private String bankAccount;
    private String bankCode;
   
    
    
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
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getPersonalCode() {
        return personalCode;
    }
    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public String getLegalName() {
        return legalName;
    }
    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }
    public String getRegistrationNr() {
        return registrationNr;
    }
    public void setRegistrationNr(String registrationNr) {
        this.registrationNr = registrationNr;
    }
    public String getVatPayerNr() {
        return vatPayerNr;
    }
    public void setVatPayerNr(String vatPayerNr) {
        this.vatPayerNr = vatPayerNr;
    }
    public String getLegalAddress() {
        return legalAddress;
    }
    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
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
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
    public String getBankCode() {
        return bankCode;
    }
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
    



    
}

