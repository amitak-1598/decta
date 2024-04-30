package com.TestingAPI.TestingAPI.Entities;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class DefaultTerminal {
    
   @Id
   @GeneratedValue 
   private UUID id;
   private String type;
   private String currency;
   @OneToOne(mappedBy = "default_terminal",cascade = CascadeType.ALL)
   @JsonManagedReference
   private Brand brand;
   private String brand_name;
   private String descriptor;
   private String descriptor_city;
   private String descriptor_state;
   @OneToOne
   @JsonBackReference
   private Website website;
   private String processing_id;
   private String status_3d_secure;
   private BigDecimal max_single_transaction;
   private BigDecimal max_per_month;
   private BigDecimal current_month_turnover;
   private int current_month_paid_count;
   private List<String>mcc;
   private String status;
   private int transaction_count_limit;
   private boolean is_oct;
   private String processing_c_ref_b2p;
   private String processing_c_ref_p2p;
   private List<String>payment_methods;
   @OneToMany(mappedBy = "defaultTerminal")
   @JsonManagedReference
   private List<ProductPermission> product_permissions;

  
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
public String getCurrency() {
    return currency;
}
public void setCurrency(String currency) {
    this.currency = currency;
}
public Brand getBrand() {
    return brand;
}
public void setBrand(Brand brand) {
    this.brand = brand;
}
public String getBrand_name() {
    return brand_name;
}
public void setBrand_name(String brand_name) {
    this.brand_name = brand_name;
}
public String getDescriptor() {
    return descriptor;
}
public void setDescriptor(String descriptor) {
    this.descriptor = descriptor;
}
public String getDescriptor_city() {
    return descriptor_city;
}
public void setDescriptor_city(String descriptor_city) {
    this.descriptor_city = descriptor_city;
}
public String getDescriptor_state() {
    return descriptor_state;
}
public void setDescriptor_state(String descriptor_state) {
    this.descriptor_state = descriptor_state;
}
public Website getWebsite() {
    return website;
}
public void setWebsite(Website website) {
    this.website = website;
}
public String getProcessing_id() {
    return processing_id;
}
public void setProcessing_id(String processing_id) {
    this.processing_id = processing_id;
}
public String getStatus_3d_secure() {
    return status_3d_secure;
}
public void setStatus_3d_secure(String status_3d_secure) {
    this.status_3d_secure = status_3d_secure;
}
public BigDecimal getMax_single_transaction() {
    return max_single_transaction;
}
public void setMax_single_transaction(BigDecimal max_single_transaction) {
    this.max_single_transaction = max_single_transaction;
}
public BigDecimal getMax_per_month() {
    return max_per_month;
}
public void setMax_per_month(BigDecimal max_per_month) {
    this.max_per_month = max_per_month;
}
public BigDecimal getCurrent_month_turnover() {
    return current_month_turnover;
}
public void setCurrent_month_turnover(BigDecimal current_month_turnover) {
    this.current_month_turnover = current_month_turnover;
}
public int getCurrent_month_paid_count() {
    return current_month_paid_count;
}
public void setCurrent_month_paid_count(int current_month_paid_count) {
    this.current_month_paid_count = current_month_paid_count;
}
public List<String> getMcc() {
    return mcc;
}
public void setMcc(List<String> mcc) {
    this.mcc = mcc;
}
public String getStatus() {
    return status;
}
public void setStatus(String status) {
    this.status = status;
}
public int getTransaction_count_limit() {
    return transaction_count_limit;
}
public void setTransaction_count_limit(int transaction_count_limit) {
    this.transaction_count_limit = transaction_count_limit;
}
public boolean isIs_oct() {
    return is_oct;
}
public void setIs_oct(boolean is_oct) {
    this.is_oct = is_oct;
}
public String getProcessing_c_ref_b2p() {
    return processing_c_ref_b2p;
}
public void setProcessing_c_ref_b2p(String processing_c_ref_b2p) {
    this.processing_c_ref_b2p = processing_c_ref_b2p;
}
public String getProcessing_c_ref_p2p() {
    return processing_c_ref_p2p;
}
public void setProcessing_c_ref_p2p(String processing_c_ref_p2p) {
    this.processing_c_ref_p2p = processing_c_ref_p2p;
}
public List<String> getPayment_methods() {
    return payment_methods;
}
public void setPayment_methods(List<String> payment_methods) {
    this.payment_methods = payment_methods;
}
public List<ProductPermission> getProduct_permissions() {
    return product_permissions;
}
public void setProduct_permissions(List<ProductPermission> product_permissions) {
    this.product_permissions = product_permissions;
}
   
   

   






}
