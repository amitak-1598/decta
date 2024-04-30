package com.TestingAPI.TestingAPI.Entities;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {

		
	@Id
    @GeneratedValue
    private UUID id;
	
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Orderproduct> products;
		
	@OneToOne(mappedBy = "order",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonManagedReference
    private Orderclient client;
	
	
	@OneToOne(mappedBy = "order",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonManagedReference
    private ServiceLocation serviceLocation;
	
	@OneToOne(mappedBy = "order",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonManagedReference
    private AccountOrder account;	 
	
	@OneToOne(mappedBy = "order",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonManagedReference
    private Country paidFromIpCountry;
		
	@OneToOne(mappedBy = "order",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonManagedReference
    private DownloadLinks downloadLinks;
	
	@OneToOne(mappedBy = "order",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonManagedReference
    private PrintLinks printLinks;	
	
	@OneToOne(mappedBy = "order",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonManagedReference	
	private Issuer issuer;
	
	
//  private Brand brand;
//  private Website website;
	
	
//	private created created_by;
//  private Author author;		
//  private StatusChange[] statusChanges;
//  private TransactionDetails transactionDetails;
	
	
//  private TravelData travelData;
	
	private String type;
	
	
	
	private List<String> requestClientInfo;
	private String currency;
	private String number;
	private Long due;
	private Boolean deny_overdue_payment;
	private Boolean skip_capture;
	private String language;
	private String notes;
	private Boolean is_test;
	private Boolean save_card;
	private Boolean pan_first;
	private Boolean is_moto;
	private Boolean verify_card;
	private Boolean use_verified_card;
	private String sdwo_merchant_id;
	private String payment_system;
	private String dynamic_descriptor;
	private Integer max_payment_attempts;
	private Boolean is_payable;
	private String terminal_processing_id;

	private String success_redirect;
	private String in_progress_redirect;
	private String failure_redirect;
	private String cancel_redirect;
	private String custom_invoice_url;
	private String link;
	private String download_link;

	private String print_link;
	private String full_page_checkout;
	private String iframe_checkout;
	private String direct_post;
	private Boolean iframe_checkout_send_invoice;
	private Double subtotal;
	private Double total_tax;
	private Double total_discount;
	private Double total;
	private Double subtotal_override;
	private Double total_tax_override;
	private Double total_discount_override;
	private Double total_override;
	private Double refund_amount;
	private Double fee_amount;
	private Double fee_discount;

	private List<String> status;


	private Long issued;
	private Double amount_refunded;
	private Double amount_refund_initial;
	private Double amount_refund_reversal;
	private Long modified;
	private Long viewed;
	private Long captured;
	private Long paid;
	private Long issued_override;
	private String client_display_name;
	private String timezone;
	private Boolean from_api;
	private Boolean from_subscription;
	private Boolean issued_by_client;
	private String referrer;
	private String api_do_url;
	private String api_do_applepay;
	private String api_do_googlepay;
	private String api_init_paypal;
	private String api_init_alipay;
	private String api_init_wechat;
	private String api_init_volt;
	private String api_init_zimpler;
	private String api_init_openbanking;
	private String referrer_display_name;

	private String card_product_class;
	private String card_product_type;
	private String card_issuer_region;
	private String descriptor_city;
    private List<String> descriptor_state;
	private Boolean enable_avs;
	private Boolean show_preview;
	private List<String> permitted_actions;
	private String setup_future_use;
	private String use_scenario;
	private Boolean force_save_method;
	private String sca_exemption;
	private String merchant;

	
	
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
	

	
	public List<Orderproduct> getProducts() {
		return products;
	}
	public void setProducts(List<Orderproduct> products) {
		this.products = products;
	}
		
	public Orderclient getClient() {
		return client;
	}
	
	public void setClient(Orderclient client) {
		this.client = client;
	}
	
	public List<String> getRequestClientInfo() {
		return requestClientInfo;
	}
	public void setRequestClientInfo(List<String> requestClientInfo) {
		this.requestClientInfo = requestClientInfo;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Long getDue() {
		return due;
	}
	public void setDue(Long due) {
		this.due = due;
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
	public Boolean getIs_test() {
		return is_test;
	}
	public void setIs_test(Boolean is_test) {
		this.is_test = is_test;
	}
	public Boolean getSave_card() {
		return save_card;
	}
	public void setSave_card(Boolean save_card) {
		this.save_card = save_card;
	}
	public Boolean getPan_first() {
		return pan_first;
	}
	public void setPan_first(Boolean pan_first) {
		this.pan_first = pan_first;
	}
	public Boolean getIs_moto() {
		return is_moto;
	}
	public void setIs_moto(Boolean is_moto) {
		this.is_moto = is_moto;
	}
	public Boolean getVerify_card() {
		return verify_card;
	}
	public void setVerify_card(Boolean verify_card) {
		this.verify_card = verify_card;
	}
	public Boolean getUse_verified_card() {
		return use_verified_card;
	}
	public void setUse_verified_card(Boolean use_verified_card) {
		this.use_verified_card = use_verified_card;
	}
	public String getSdwo_merchant_id() {
		return sdwo_merchant_id;
	}
	public void setSdwo_merchant_id(String sdwo_merchant_id) {
		this.sdwo_merchant_id = sdwo_merchant_id;
	}
	public String getPayment_system() {
		return payment_system;
	}
	public void setPayment_system(String payment_system) {
		this.payment_system = payment_system;
	}
	public String getDynamic_descriptor() {
		return dynamic_descriptor;
	}
	public void setDynamic_descriptor(String dynamic_descriptor) {
		this.dynamic_descriptor = dynamic_descriptor;
	}
	public Integer getMax_payment_attempts() {
		return max_payment_attempts;
	}
	public void setMax_payment_attempts(Integer max_payment_attempts) {
		this.max_payment_attempts = max_payment_attempts;
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
	public String getSuccess_redirect() {
		return success_redirect;
	}
	public void setSuccess_redirect(String success_redirect) {
		this.success_redirect = success_redirect;
	}
	public String getIn_progress_redirect() {
		return in_progress_redirect;
	}
	public void setIn_progress_redirect(String in_progress_redirect) {
		this.in_progress_redirect = in_progress_redirect;
	}
	public String getFailure_redirect() {
		return failure_redirect;
	}
	public void setFailure_redirect(String failure_redirect) {
		this.failure_redirect = failure_redirect;
	}
	public String getCancel_redirect() {
		return cancel_redirect;
	}
	public void setCancel_redirect(String cancel_redirect) {
		this.cancel_redirect = cancel_redirect;
	}
	public String getCustom_invoice_url() {
		return custom_invoice_url;
	}
	public void setCustom_invoice_url(String custom_invoice_url) {
		this.custom_invoice_url = custom_invoice_url;
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
	public String getFull_page_checkout() {
		return full_page_checkout;
	}
	public void setFull_page_checkout(String full_page_checkout) {
		this.full_page_checkout = full_page_checkout;
	}
	public String getIframe_checkout() {
		return iframe_checkout;
	}
	public void setIframe_checkout(String iframe_checkout) {
		this.iframe_checkout = iframe_checkout;
	}
	public String getDirect_post() {
		return direct_post;
	}
	public void setDirect_post(String direct_post) {
		this.direct_post = direct_post;
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
	public Double getRefund_amount() {
		return refund_amount;
	}
	public void setRefund_amount(Double refund_amount) {
		this.refund_amount = refund_amount;
	}
	public Double getFee_amount() {
		return fee_amount;
	}
	public void setFee_amount(Double fee_amount) {
		this.fee_amount = fee_amount;
	}
	public Double getFee_discount() {
		return fee_discount;
	}
	public void setFee_discount(Double fee_discount) {
		this.fee_discount = fee_discount;
	}
	public List<String> getStatus() {
		return status;
	}
	public void setStatus(List<String> status) {
		this.status = status;
	}
	public Long getIssued() {
		return issued;
	}
	public void setIssued(Long issued) {
		this.issued = issued;
	}
	public Double getAmount_refunded() {
		return amount_refunded;
	}
	public void setAmount_refunded(Double amount_refunded) {
		this.amount_refunded = amount_refunded;
	}
	public Double getAmount_refund_initial() {
		return amount_refund_initial;
	}
	public void setAmount_refund_initial(Double amount_refund_initial) {
		this.amount_refund_initial = amount_refund_initial;
	}
	public Double getAmount_refund_reversal() {
		return amount_refund_reversal;
	}
	public void setAmount_refund_reversal(Double amount_refund_reversal) {
		this.amount_refund_reversal = amount_refund_reversal;
	}
	public Long getModified() {
		return modified;
	}
	public void setModified(Long modified) {
		this.modified = modified;
	}
	public Long getViewed() {
		return viewed;
	}
	public void setViewed(Long viewed) {
		this.viewed = viewed;
	}
	public Long getCaptured() {
		return captured;
	}
	public void setCaptured(Long captured) {
		this.captured = captured;
	}
	public Long getPaid() {
		return paid;
	}
	public void setPaid(Long paid) {
		this.paid = paid;
	}
	public Long getIssued_override() {
		return issued_override;
	}
	public void setIssued_override(Long issued_override) {
		this.issued_override = issued_override;
	}
	public String getClient_display_name() {
		return client_display_name;
	}
	public void setClient_display_name(String client_display_name) {
		this.client_display_name = client_display_name;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public Boolean getFrom_api() {
		return from_api;
	}
	public void setFrom_api(Boolean from_api) {
		this.from_api = from_api;
	}
	public Boolean getFrom_subscription() {
		return from_subscription;
	}
	public void setFrom_subscription(Boolean from_subscription) {
		this.from_subscription = from_subscription;
	}
	public Boolean getIssued_by_client() {
		return issued_by_client;
	}
	public void setIssued_by_client(Boolean issued_by_client) {
		this.issued_by_client = issued_by_client;
	}
	public String getReferrer() {
		return referrer;
	}
	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}
	public String getApi_do_url() {
		return api_do_url;
	}
	public void setApi_do_url(String api_do_url) {
		this.api_do_url = api_do_url;
	}
	public String getApi_do_applepay() {
		return api_do_applepay;
	}
	public void setApi_do_applepay(String api_do_applepay) {
		this.api_do_applepay = api_do_applepay;
	}
	public String getApi_do_googlepay() {
		return api_do_googlepay;
	}
	public void setApi_do_googlepay(String api_do_googlepay) {
		this.api_do_googlepay = api_do_googlepay;
	}
	public String getApi_init_paypal() {
		return api_init_paypal;
	}
	public void setApi_init_paypal(String api_init_paypal) {
		this.api_init_paypal = api_init_paypal;
	}
	public String getApi_init_alipay() {
		return api_init_alipay;
	}
	public void setApi_init_alipay(String api_init_alipay) {
		this.api_init_alipay = api_init_alipay;
	}
	public String getApi_init_wechat() {
		return api_init_wechat;
	}
	public void setApi_init_wechat(String api_init_wechat) {
		this.api_init_wechat = api_init_wechat;
	}
	public String getApi_init_volt() {
		return api_init_volt;
	}
	public void setApi_init_volt(String api_init_volt) {
		this.api_init_volt = api_init_volt;
	}
	public String getApi_init_zimpler() {
		return api_init_zimpler;
	}
	public void setApi_init_zimpler(String api_init_zimpler) {
		this.api_init_zimpler = api_init_zimpler;
	}
	public String getApi_init_openbanking() {
		return api_init_openbanking;
	}
	public void setApi_init_openbanking(String api_init_openbanking) {
		this.api_init_openbanking = api_init_openbanking;
	}
	public String getReferrer_display_name() {
		return referrer_display_name;
	}
	public void setReferrer_display_name(String referrer_display_name) {
		this.referrer_display_name = referrer_display_name;
	}
	public String getCard_product_class() {
		return card_product_class;
	}
	public void setCard_product_class(String card_product_class) {
		this.card_product_class = card_product_class;
	}
	public String getCard_product_type() {
		return card_product_type;
	}
	public void setCard_product_type(String card_product_type) {
		this.card_product_type = card_product_type;
	}
	public String getCard_issuer_region() {
		return card_issuer_region;
	}
	public void setCard_issuer_region(String card_issuer_region) {
		this.card_issuer_region = card_issuer_region;
	}
	public String getDescriptor_city() {
		return descriptor_city;
	}
	public void setDescriptor_city(String descriptor_city) {
		this.descriptor_city = descriptor_city;
	}
	public List<String> getDescriptor_state() {
		return descriptor_state;
	}
	public void setDescriptor_state(List<String> descriptor_state) {
		this.descriptor_state = descriptor_state;
	}
	public Boolean getEnable_avs() {
		return enable_avs;
	}
	public void setEnable_avs(Boolean enable_avs) {
		this.enable_avs = enable_avs;
	}
	public Boolean getShow_preview() {
		return show_preview;
	}
	public void setShow_preview(Boolean show_preview) {
		this.show_preview = show_preview;
	}
	public List<String> getPermitted_actions() {
		return permitted_actions;
	}
	public void setPermitted_actions(List<String> permitted_actions) {
		this.permitted_actions = permitted_actions;
	}
	public String getSetup_future_use() {
		return setup_future_use;
	}
	public void setSetup_future_use(String setup_future_use) {
		this.setup_future_use = setup_future_use;
	}
	public String getUse_scenario() {
		return use_scenario;
	}
	public void setUse_scenario(String use_scenario) {
		this.use_scenario = use_scenario;
	}
	public Boolean getForce_save_method() {
		return force_save_method;
	}
	public void setForce_save_method(Boolean force_save_method) {
		this.force_save_method = force_save_method;
	}
	public String getSca_exemption() {
		return sca_exemption;
	}
	public void setSca_exemption(String sca_exemption) {
		this.sca_exemption = sca_exemption;
	}
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public ServiceLocation getServiceLocation() {
		return serviceLocation;
	}
	public void setServiceLocation(ServiceLocation serviceLocation) {
		this.serviceLocation = serviceLocation;
	}
	public AccountOrder getAccount() {
		return account;
	}
	public void setAccount(AccountOrder account) {
		this.account = account;
	}
	public Country getPaidFromIpCountry() {
		return paidFromIpCountry;
	}
	public void setPaidFromIpCountry(Country paidFromIpCountry) {
		this.paidFromIpCountry = paidFromIpCountry;
	}
	public DownloadLinks getDownloadLinks() {
		return downloadLinks;
	}
	public void setDownloadLinks(DownloadLinks downloadLinks) {
		this.downloadLinks = downloadLinks;
	}
	public PrintLinks getPrintLinks() {
		return printLinks;
	}
	public void setPrintLinks(PrintLinks printLinks) {
		this.printLinks = printLinks;
	}
	public Issuer getIssuer() {
		return issuer;
	}
	public void setIssuer(Issuer issuer) {
		this.issuer = issuer;
	}
	
	
	
}
