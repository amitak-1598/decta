package com.TestingAPI.TestingAPI.Entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Subscription {

	@Id
    @GeneratedValue
    private UUID id;
	
	private String type;
    private String title;
    private String brand;
    private String currency;
    private Integer due;
    private Integer due_type;
    private Boolean deny_overdue_payment;  
    private Boolean skip_capture;
    private String language;
    private String notes;
    private Boolean is_payable;  
    private String terminal_processing_id;
    private String terminal;
    private String link;
    private String download_link;
    private String print_link;
    private Boolean iframe_checkout_send_invoice;
    private Double subtotal;
    private Double total_tax;   
    private Double total_discount;
    private Double total;    
    private Double subtotal_override;    
    private Double total_tax_override;    
    private Double total_discount_override;    
    private Double total_override;
    private Integer created;
    private Integer modified;
    private Integer viewed;
    private String referrer;  
    private String referrer_display_name;    
    private Integer client_count;
    private Integer product_count;
    private Integer order_count;
    private Integer purchase_count;
    private Double revenue;
    private Integer last_purchase_on;
    private Boolean active;
    private String mode;    
    private String period_units;   
    private Integer period_length;
    private Boolean paused;    
    private String start_on;
    
    @Column(name="request_client_info")
    private List<String> requestClientInfo;
 
    @OneToOne(mappedBy = "subscription", cascade = CascadeType.ALL)
    private CreatedBy createdBy;

    @OneToOne(mappedBy = "subscription", cascade = CascadeType.ALL)
    private Issuer issuer;

    @OneToMany(mappedBy = "subscription", cascade = CascadeType.ALL)
    private List<SocialShare> socialShares;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getDue() {
		return due;
	}

	public void setDue(Integer due) {
		this.due = due;
	}

	public Integer getDue_type() {
		return due_type;
	}

	public void setDue_type(Integer due_type) {
		this.due_type = due_type;
	}

	public Boolean getDeny_overdue_payment() {
		return deny_overdue_payment;
	}

	public void setDeny_overdue_payment(Boolean deny_overdue_payment) {
		this.deny_overdue_payment = deny_overdue_payment;
	}

	public Boolean getSkip_capture() {
		return skip_capture;
	}

	public void setSkip_capture(Boolean skip_capture) {
		this.skip_capture = skip_capture;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Boolean getIs_payable() {
		return is_payable;
	}

	public void setIs_payable(Boolean is_payable) {
		this.is_payable = is_payable;
	}

	public String getTerminal_processing_id() {
		return terminal_processing_id;
	}

	public void setTerminal_processing_id(String terminal_processing_id) {
		this.terminal_processing_id = terminal_processing_id;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDownload_link() {
		return download_link;
	}

	public void setDownload_link(String download_link) {
		this.download_link = download_link;
	}

	public String getPrint_link() {
		return print_link;
	}

	public void setPrint_link(String print_link) {
		this.print_link = print_link;
	}

	public Boolean getIframe_checkout_send_invoice() {
		return iframe_checkout_send_invoice;
	}

	public void setIframe_checkout_send_invoice(Boolean iframe_checkout_send_invoice) {
		this.iframe_checkout_send_invoice = iframe_checkout_send_invoice;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getTotal_tax() {
		return total_tax;
	}

	public void setTotal_tax(Double total_tax) {
		this.total_tax = total_tax;
	}

	public Double getTotal_discount() {
		return total_discount;
	}

	public void setTotal_discount(Double total_discount) {
		this.total_discount = total_discount;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getSubtotal_override() {
		return subtotal_override;
	}

	public void setSubtotal_override(Double subtotal_override) {
		this.subtotal_override = subtotal_override;
	}

	public Double getTotal_tax_override() {
		return total_tax_override;
	}

	public void setTotal_tax_override(Double total_tax_override) {
		this.total_tax_override = total_tax_override;
	}

	public Double getTotal_discount_override() {
		return total_discount_override;
	}

	public void setTotal_discount_override(Double total_discount_override) {
		this.total_discount_override = total_discount_override;
	}

	public Double getTotal_override() {
		return total_override;
	}

	public void setTotal_override(Double total_override) {
		this.total_override = total_override;
	}

	public Integer getCreated() {
		return created;
	}

	public void setCreated(Integer created) {
		this.created = created;
	}

	public Integer getModified() {
		return modified;
	}

	public void setModified(Integer modified) {
		this.modified = modified;
	}

	public Integer getViewed() {
		return viewed;
	}

	public void setViewed(Integer viewed) {
		this.viewed = viewed;
	}

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public String getReferrer_display_name() {
		return referrer_display_name;
	}

	public void setReferrer_display_name(String referrer_display_name) {
		this.referrer_display_name = referrer_display_name;
	}

	public Integer getClient_count() {
		return client_count;
	}

	public void setClient_count(Integer client_count) {
		this.client_count = client_count;
	}

	public Integer getProduct_count() {
		return product_count;
	}

	public void setProduct_count(Integer product_count) {
		this.product_count = product_count;
	}

	public Integer getOrder_count() {
		return order_count;
	}

	public void setOrder_count(Integer order_count) {
		this.order_count = order_count;
	}

	public Integer getPurchase_count() {
		return purchase_count;
	}

	public void setPurchase_count(Integer purchase_count) {
		this.purchase_count = purchase_count;
	}

	public Double getRevenue() {
		return revenue;
	}

	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}

	public Integer getLast_purchase_on() {
		return last_purchase_on;
	}

	public void setLast_purchase_on(Integer last_purchase_on) {
		this.last_purchase_on = last_purchase_on;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getPeriod_units() {
		return period_units;
	}

	public void setPeriod_units(String period_units) {
		this.period_units = period_units;
	}

	public Integer getPeriod_length() {
		return period_length;
	}

	public void setPeriod_length(Integer period_length) {
		this.period_length = period_length;
	}

	public Boolean getPaused() {
		return paused;
	}

	public void setPaused(Boolean paused) {
		this.paused = paused;
	}

	public String getStart_on() {
		return start_on;
	}

	public void setStart_on(String start_on) {
		this.start_on = start_on;
	}

	public List<String> getRequestClientInfo() {
		return requestClientInfo;
	}

	public void setRequestClientInfo(List<String> requestClientInfo) {
		this.requestClientInfo = requestClientInfo;
	}

	public CreatedBy getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(CreatedBy createdBy) {
		this.createdBy = createdBy;
	}

	public Issuer getIssuer() {
		return issuer;
	}

	public void setIssuer(Issuer issuer) {
		this.issuer = issuer;
	}

	public List<SocialShare> getSocialShares() {
		return socialShares;
	}

	public void setSocialShares(List<SocialShare> socialShares) {
		this.socialShares = socialShares;
	}

	
    
    
}
