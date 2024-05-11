package com.TestingAPI.TestingAPI.Entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_templates")
public class OrderTemplate {
       
	
	    @Id
        @GeneratedValue
        private UUID id;
	    private String title;
	    private List<String> request_client_info;
	    
	   // private Brand brand;
	    private String currency;
	    private long due;
	    private int due_type;
	    private String language;
	    private String terminal;
	    private  Boolean deny_overdue_payment;
	    private Boolean skip_capture;
	    private String notes;
	    private Boolean is_payable;
	    private String terminal_processing_id;
	    private String download_link;
	    private String print_link;
	    private Boolean iframe_checkout_send_invoice;
	    private BigDecimal subtotal;
	    private BigDecimal total_tax;
	    private BigDecimal total_discount;
	    private BigDecimal total;
	    private BigDecimal subtotal_override;
	    private BigDecimal total_tax_override;
	    private BigDecimal total_discount_override;
	    private BigDecimal total_override;
	//    private CreatedBy createdby;
	//    private Issuer issuer;
	    private LocalDateTime created;
	    private LocalDateTime modified;
	    private LocalDateTime viewed;
	    private LocalDateTime issued_override;
	    private String referrer;
	    private String referrer_display_name;
		private int client_count;
	    private int product_count;
	    private int order_count;
	    private int purchase_count;
	    private BigDecimal revenue;
	    private LocalDateTime last_purchase_on;
//	    private List<SocialShare> social_shares;
//	    private List<Permittedactions> permitted_actions;
	    private int max_payment_attempts;
	    
	    private UUID orderid;
	    
	    
	    @OneToMany(cascade = CascadeType.ALL)
	  	private List<Orderproduct> orderproduct;
	  	    
	    
	    
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
		public BigDecimal getSubtotal() {
			return subtotal;
		}
		public void setSubtotal(BigDecimal subtotal) {
			this.subtotal = subtotal;
		}
		public BigDecimal getTotal_tax() {
			return total_tax;
		}
		public void setTotal_tax(BigDecimal total_tax) {
			this.total_tax = total_tax;
		}
		public BigDecimal getTotal_discount() {
			return total_discount;
		}
		public void setTotal_discount(BigDecimal total_discount) {
			this.total_discount = total_discount;
		}
		public BigDecimal getTotal() {
			return total;
		}
		public void setTotal(BigDecimal total) {
			this.total = total;
		}
		public BigDecimal getSubtotal_override() {
			return subtotal_override;
		}
		public void setSubtotal_override(BigDecimal subtotal_override) {
			this.subtotal_override = subtotal_override;
		}
		public BigDecimal getTotal_tax_override() {
			return total_tax_override;
		}
		public void setTotal_tax_override(BigDecimal total_tax_override) {
			this.total_tax_override = total_tax_override;
		}
		public BigDecimal getTotal_discount_override() {
			return total_discount_override;
		}
		public void setTotal_discount_override(BigDecimal total_discount_override) {
			this.total_discount_override = total_discount_override;
		}
		public BigDecimal getTotal_override() {
			return total_override;
		}
		public void setTotal_override(BigDecimal total_override) {
			this.total_override = total_override;
		}
		public LocalDateTime getCreated() {
			return created;
		}
		public void setCreated(LocalDateTime created) {
			this.created = created;
		}
		public LocalDateTime getModified() {
			return modified;
		}
		public void setModified(LocalDateTime modified) {
			this.modified = modified;
		}
		public LocalDateTime getViewed() {
			return viewed;
		}
		public void setViewed(LocalDateTime viewed) {
			this.viewed = viewed;
		}
		public LocalDateTime getIssued_override() {
			return issued_override;
		}
		public void setIssued_override(LocalDateTime issued_override) {
			this.issued_override = issued_override;
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
		public int getClient_count() {
			return client_count;
		}
		public void setClient_count(int client_count) {
			this.client_count = client_count;
		}
		public int getProduct_count() {
			return product_count;
		}
		public void setProduct_count(int product_count) {
			this.product_count = product_count;
		}
		public int getOrder_count() {
			return order_count;
		}
		public void setOrder_count(int order_count) {
			this.order_count = order_count;
		}
		public int getPurchase_count() {
			return purchase_count;
		}
		public void setPurchase_count(int purchase_count) {
			this.purchase_count = purchase_count;
		}
		public BigDecimal getRevenue() {
			return revenue;
		}
		public void setRevenue(BigDecimal revenue) {
			this.revenue = revenue;
		}
		public LocalDateTime getLast_purchase_on() {
			return last_purchase_on;
		}
		public void setLast_purchase_on(LocalDateTime last_purchase_on) {
			this.last_purchase_on = last_purchase_on;
		}
		public int getMax_payment_attempts() {
			return max_payment_attempts;
		}
		public void setMax_payment_attempts(int max_payment_attempts) {
			this.max_payment_attempts = max_payment_attempts;
		}

	    
	  
	    	    
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public List<String> getRequest_client_info() {
			return request_client_info;
		}
		public void setRequest_client_info(List<String> request_client_info) {
			this.request_client_info = request_client_info;
		}
		
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public long getDue() {
			return due;
		}
		public void setDue(long due) {
			this.due = due;
		}
		public int getDue_type() {
			return due_type;
		}
		public void setDue_type(int due_type) {
			this.due_type = due_type;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public String getTerminal() {
			return terminal;
		}
		public void setTerminal(String terminal) {
			this.terminal = terminal;
		}
		public UUID getId() {
			return id;
		}
		public void setId(UUID id) {
			this.id = id;
		}
		public List<Orderproduct> getOrderproduct() {
			return orderproduct;
		}
		public void setOrderproduct(List<Orderproduct> orderproduct) {
			this.orderproduct = orderproduct;
		}
		public OrderTemplate(String title, List<String> request_client_info, String currency, long due, int due_type,
				String language, String terminal, Boolean deny_overdue_payment, Boolean skip_capture, String notes,
				Boolean is_payable, String terminal_processing_id, String download_link, String print_link,
				Boolean iframe_checkout_send_invoice, BigDecimal subtotal, BigDecimal total_tax,
				BigDecimal total_discount, BigDecimal total, BigDecimal subtotal_override,
				BigDecimal total_tax_override, BigDecimal total_discount_override, BigDecimal total_override,
				LocalDateTime created, LocalDateTime modified, LocalDateTime viewed, LocalDateTime issued_override,
				String referrer, String referrer_display_name, int client_count, int product_count, int order_count,
				int purchase_count, BigDecimal revenue, LocalDateTime last_purchase_on, int max_payment_attempts,
				List<Orderproduct> orderproduct) {
			super();
			this.title = title;
			this.request_client_info = request_client_info;
			this.currency = currency;
			this.due = due;
			this.due_type = due_type;
			this.language = language;
			this.terminal = terminal;
			this.deny_overdue_payment = deny_overdue_payment;
			this.skip_capture = skip_capture;
			this.notes = notes;
			this.is_payable = is_payable;
			this.terminal_processing_id = terminal_processing_id;
			this.download_link = download_link;
			this.print_link = print_link;
			this.iframe_checkout_send_invoice = iframe_checkout_send_invoice;
			this.subtotal = subtotal;
			this.total_tax = total_tax;
			this.total_discount = total_discount;
			this.total = total;
			this.subtotal_override = subtotal_override;
			this.total_tax_override = total_tax_override;
			this.total_discount_override = total_discount_override;
			this.total_override = total_override;
			this.created = created;
			this.modified = modified;
			this.viewed = viewed;
			this.issued_override = issued_override;
			this.referrer = referrer;
			this.referrer_display_name = referrer_display_name;
			this.client_count = client_count;
			this.product_count = product_count;
			this.order_count = order_count;
			this.purchase_count = purchase_count;
			this.revenue = revenue;
			this.last_purchase_on = last_purchase_on;
			this.max_payment_attempts = max_payment_attempts;
			this.orderproduct = orderproduct;
		}
		
		
	
		public OrderTemplate() {}
		public UUID getOrderid() {
			return orderid;
		}
		public void setOrderid(UUID orderid) {
			this.orderid = orderid;
		}
		
		
		
		
		
		
		
	    
	    
}
