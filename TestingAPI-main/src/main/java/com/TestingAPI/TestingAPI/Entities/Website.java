package com.TestingAPI.TestingAPI.Entities;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;

@Entity
public class Website {
    @Id
    @GeneratedValue
    private UUID uid;
    private String type;
    private int id;
    private String web_page;
    @OneToOne(mappedBy = "website",cascade = CascadeType.ALL)
    @JsonManagedReference
    private Logo logo;
    private int accounts_count;
    private List<String>currencies;
    private String support_phone_code;
    private String support_phone;
    private String support_email;
    private UUID default_account;
    private String default_language;
    private String default_currency;
    private String timezone;
    private String sms_sender_name;
    private boolean require_terms_on_payment;
    @OneToOne(mappedBy = "website",cascade = CascadeType.ALL)
    @JsonManagedReference
    private DefaultTerminal default_terminal;
    private int max_payment_attempts;
    public UUID getUid() {
        return uid;
    }
    public void setUid(UUID uid) {
        this.uid = uid;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getWeb_page() {
        return web_page;
    }
    public void setWeb_page(String web_page) {
        this.web_page = web_page;
    }
    public Logo getLogo() {
        return logo;
    }
    public void setLogo(Logo logo) {
        this.logo = logo;
    }
    public int getAccounts_count() {
        return accounts_count;
    }
    public void setAccounts_count(int accounts_count) {
        this.accounts_count = accounts_count;
    }
    public List<String> getCurrencies() {
        return currencies;
    }
    public void setCurrencies(List<String> currencies) {
        this.currencies = currencies;
    }
    public String getSupport_phone_code() {
        return support_phone_code;
    }
    public void setSupport_phone_code(String support_phone_code) {
        this.support_phone_code = support_phone_code;
    }
    public String getSupport_phone() {
        return support_phone;
    }
    public void setSupport_phone(String support_phone) {
        this.support_phone = support_phone;
    }
    public String getSupport_email() {
        return support_email;
    }
    public void setSupport_email(String support_email) {
        this.support_email = support_email;
    }
    public UUID getDefault_account() {
        return default_account;
    }
    public void setDefault_account(UUID default_account) {
        this.default_account = default_account;
    }
    public String getDefault_language() {
        return default_language;
    }
    public void setDefault_language(String default_language) {
        this.default_language = default_language;
    }
    public String getDefault_currency() {
        return default_currency;
    }
    public void setDefault_currency(String default_currency) {
        this.default_currency = default_currency;
    }
    public String getTimezone() {
        return timezone;
    }
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
    public String getSms_sender_name() {
        return sms_sender_name;
    }
    public void setSms_sender_name(String sms_sender_name) {
        this.sms_sender_name = sms_sender_name;
    }
    public boolean isRequire_terms_on_payment() {
        return require_terms_on_payment;
    }
    public void setRequire_terms_on_payment(boolean require_terms_on_payment) {
        this.require_terms_on_payment = require_terms_on_payment;
    }
    public DefaultTerminal getDefault_terminal() {
        return default_terminal;
    }
    public void setDefault_terminal(DefaultTerminal default_terminal) {
        this.default_terminal = default_terminal;
    }
    public int getMax_payment_attempts() {
        return max_payment_attempts;
    }
    public void setMax_payment_attempts(int max_payment_attempts) {
        this.max_payment_attempts = max_payment_attempts;
    }


    



    
}
