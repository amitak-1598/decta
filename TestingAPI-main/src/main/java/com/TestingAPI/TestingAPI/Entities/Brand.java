package com.TestingAPI.TestingAPI.Entities;


import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Brand {

@Id
@GeneratedValue
private UUID id;
private String type;
private String badge_code;
private String brand_name;
private String support_email;
private String support_phone_code;
private String support_phone;
private String merchant_url;
private String sms_sender_name;
private String default_currency;
private String default_invoice_language;
private boolean default_skip_capture;
private boolean default_deny_overdue_payment;
private boolean use_dies;
private boolean original_product_generation;
private List<String>default_request_client_info;
private List<String>default_required_client_info;
private String default_timezone;
private String logo_text;
@OneToOne
@JsonManagedReference
private Logo logo;
@OneToMany
@JsonBackReference
private List<Website>websites;
private String branded_card_decline_reason;
private String branded_card_design;
private List<String>branded_card_status;
private List<String> card_custom_design;
private String branded_card_brand_name;
private List<String>branded_card_currencies;
private int max_payment_attempts;
private int websites_count;
private int accounts_count;
private boolean reverse_downgraded_payments;
@OneToOne
@JsonBackReference
private DefaultTerminal default_terminal;
public UUID getId() {
    return id;
}
public void setId(UUID id) {
    this.id = id;
}
public String getType() {
    return type;
}
public void setType(String type) {
    this.type = type;
}
public String getBadge_code() {
    return badge_code;
}
public void setBadge_code(String badge_code) {
    this.badge_code = badge_code;
}
public String getBrand_name() {
    return brand_name;
}
public void setBrand_name(String brand_name) {
    this.brand_name = brand_name;
}
public String getSupport_email() {
    return support_email;
}
public void setSupport_email(String support_email) {
    this.support_email = support_email;
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
public String getMerchant_url() {
    return merchant_url;
}
public void setMerchant_url(String merchant_url) {
    this.merchant_url = merchant_url;
}
public String getSms_sender_name() {
    return sms_sender_name;
}
public void setSms_sender_name(String sms_sender_name) {
    this.sms_sender_name = sms_sender_name;
}
public String getDefault_currency() {
    return default_currency;
}
public void setDefault_currency(String default_currency) {
    this.default_currency = default_currency;
}
public String getDefault_invoice_language() {
    return default_invoice_language;
}
public void setDefault_invoice_language(String default_invoice_language) {
    this.default_invoice_language = default_invoice_language;
}
public boolean isDefault_skip_capture() {
    return default_skip_capture;
}
public void setDefault_skip_capture(boolean default_skip_capture) {
    this.default_skip_capture = default_skip_capture;
}
public boolean isDefault_deny_overdue_payment() {
    return default_deny_overdue_payment;
}
public void setDefault_deny_overdue_payment(boolean default_deny_overdue_payment) {
    this.default_deny_overdue_payment = default_deny_overdue_payment;
}
public boolean isUse_dies() {
    return use_dies;
}
public void setUse_dies(boolean use_dies) {
    this.use_dies = use_dies;
}
public boolean isOriginal_product_generation() {
    return original_product_generation;
}
public void setOriginal_product_generation(boolean original_product_generation) {
    this.original_product_generation = original_product_generation;
}
public List<String> getDefault_request_client_info() {
    return default_request_client_info;
}
public void setDefault_request_client_info(List<String> default_request_client_info) {
    this.default_request_client_info = default_request_client_info;
}
public List<String> getDefault_required_client_info() {
    return default_required_client_info;
}
public void setDefault_required_client_info(List<String> default_required_client_info) {
    this.default_required_client_info = default_required_client_info;
}
public String getDefault_timezone() {
    return default_timezone;
}
public void setDefault_timezone(String default_timezone) {
    this.default_timezone = default_timezone;
}
public String getLogo_text() {
    return logo_text;
}
public void setLogo_text(String logo_text) {
    this.logo_text = logo_text;
}
public Logo getLogo() {
    return logo;
}
public void setLogo(Logo logo) {
    this.logo = logo;
}
public List<Website> getWebsites() {
    return websites;
}
public void setWebsites(List<Website> websites) {
    this.websites = websites;
}
public String getBranded_card_decline_reason() {
    return branded_card_decline_reason;
}
public void setBranded_card_decline_reason(String branded_card_decline_reason) {
    this.branded_card_decline_reason = branded_card_decline_reason;
}
public String getBranded_card_design() {
    return branded_card_design;
}
public void setBranded_card_design(String branded_card_design) {
    this.branded_card_design = branded_card_design;
}
public List<String> getBranded_card_status() {
    return branded_card_status;
}
public void setBranded_card_status(List<String> branded_card_status) {
    this.branded_card_status = branded_card_status;
}
public List<String> getCard_custom_design() {
    return card_custom_design;
}
public void setCard_custom_design(List<String> card_custom_design) {
    this.card_custom_design = card_custom_design;
}
public String getBranded_card_brand_name() {
    return branded_card_brand_name;
}
public void setBranded_card_brand_name(String branded_card_brand_name) {
    this.branded_card_brand_name = branded_card_brand_name;
}
public List<String> getBranded_card_currencies() {
    return branded_card_currencies;
}
public void setBranded_card_currencies(List<String> branded_card_currencies) {
    this.branded_card_currencies = branded_card_currencies;
}
public int getMax_payment_attempts() {
    return max_payment_attempts;
}
public void setMax_payment_attempts(int max_payment_attempts) {
    this.max_payment_attempts = max_payment_attempts;
}
public int getWebsites_count() {
    return websites_count;
}
public void setWebsites_count(int websites_count) {
    this.websites_count = websites_count;
}
public int getAccounts_count() {
    return accounts_count;
}
public void setAccounts_count(int accounts_count) {
    this.accounts_count = accounts_count;
}
public boolean isReverse_downgraded_payments() {
    return reverse_downgraded_payments;
}
public void setReverse_downgraded_payments(boolean reverse_downgraded_payments) {
    this.reverse_downgraded_payments = reverse_downgraded_payments;
}
public DefaultTerminal getDefault_terminal() {
    return default_terminal;
}
public void setDefault_terminal(DefaultTerminal default_terminal) {
    this.default_terminal = default_terminal;
}






}
