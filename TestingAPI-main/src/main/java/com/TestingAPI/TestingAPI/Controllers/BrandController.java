package com.TestingAPI.TestingAPI.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.UUID;

import com.TestingAPI.TestingAPI.Dao.BrandRepository;
import com.TestingAPI.TestingAPI.Entities.Brand;

@RestController
@RequestMapping("/brands/")
public class BrandController {

    @Autowired
    private BrandRepository brandRepository;

    @PostMapping
    public ResponseEntity<Brand>postBrand(@RequestBody Brand brand){
        try{
            Brand brand2=new Brand();
            brand2.setAccounts_count(brand.getAccounts_count());
            brand2.setBadge_code(brand.getBadge_code());
            brand2.setBrand_name(brand.getBrand_name());
            brand2.setBranded_card_brand_name(brand.getBranded_card_brand_name());
            brand2.setBranded_card_currencies(brand.getBranded_card_currencies());
            brand2.setBranded_card_decline_reason(brand.getBranded_card_decline_reason());
            brand2.setBranded_card_design(brand.getBranded_card_design());
            brand2.setBranded_card_status(brand.getBranded_card_status());
            brand2.setDefault_currency(brand.getDefault_currency());
            brand2.setCard_custom_design(brand.getCard_custom_design());
            brand2.setDefault_deny_overdue_payment(brand.isDefault_deny_overdue_payment());
            brand2.setDefault_invoice_language(brand.getDefault_invoice_language());
            brand2.setDefault_request_client_info(brand.getDefault_request_client_info());
            brand2.setDefault_required_client_info(brand.getDefault_required_client_info());
            brand2.setDefault_skip_capture(brand.isDefault_skip_capture());
            brand2.setDefault_terminal(brand.getDefault_terminal());
            brand2.setDefault_timezone(brand.getDefault_timezone());
            brand2.setLogo(brand.getLogo());
            brand2.setLogo_text(brand.getLogo_text());
            brand2.setMax_payment_attempts(brand.getMax_payment_attempts());
            brand2.setMerchant_url(brand.getMerchant_url());
            brand2.setOriginal_product_generation(brand.isOriginal_product_generation());
            brand2.setReverse_downgraded_payments(brand.isReverse_downgraded_payments());
            brand2.setSms_sender_name(brand.getSms_sender_name());
            brand2.setSupport_email(brand.getSupport_email());
            brand2.setSupport_phone(brand.getSupport_phone());
            brand2.setSupport_phone_code(brand.getSupport_phone_code());
            brand2.setType(brand.getType());
            brand2.setUse_dies(brand.isUse_dies());
            brand2.setWebsites(brand.getWebsites());
            brand2.setWebsites_count(brand.getWebsites_count());
            brandRepository.save(brand2);
           return ResponseEntity.ok().body(brand);

        }
        catch(Exception e){
            ResponseEntity.internalServerError();
            e.printStackTrace();
        }
        

        
        return ResponseEntity.badRequest().build();

    }

@GetMapping
public ResponseEntity<List<Brand>>getAllBrands(){
    try{
        System.out.println();
       return ResponseEntity.ok().body(brandRepository.findAll());

    }
    catch(Exception e){
    
        e.printStackTrace();
    }
    return null;
}
 
@GetMapping("/{brand_id}/")
public ResponseEntity<List<Brand>>getBrandById(@PathVariable("brand_id") UUID id){
    try {
        List<Brand> br=brandRepository.findById(id)
        .map(List::of) 
        .orElse(List.of());
        System.out.println(br);
        return ResponseEntity.ok().body(br);

    } catch (Exception e) {
     return ResponseEntity.badRequest().body(null);
    }

}
@PutMapping("/{brand_id}/")
public ResponseEntity<Brand> updateBrandById(@PathVariable("brand_id") UUID id,@RequestBody Brand brand){
    try{
        Brand b=brandRepository.findById(id).get();
        b.setAccounts_count(brand.getAccounts_count());
        b.setBadge_code(brand.getBadge_code());
        b.setBrand_name(brand.getBrand_name());
        b.setBranded_card_brand_name(brand.getBranded_card_brand_name());
        b.setBranded_card_currencies(brand.getBranded_card_currencies());
        b.setBranded_card_decline_reason(brand.getBranded_card_decline_reason());
        b.setBranded_card_design(brand.getBranded_card_design());
        b.setBranded_card_status(brand.getBranded_card_status());
        b.setDefault_currency(brand.getDefault_currency());
        b.setCard_custom_design(brand.getCard_custom_design());
        b.setDefault_deny_overdue_payment(brand.isDefault_deny_overdue_payment());
        b.setDefault_invoice_language(brand.getDefault_invoice_language());
        b.setDefault_request_client_info(brand.getDefault_request_client_info());
        b.setDefault_required_client_info(brand.getDefault_required_client_info());
        b.setDefault_skip_capture(brand.isDefault_skip_capture());
        b.setDefault_terminal(brand.getDefault_terminal());
        b.setDefault_timezone(brand.getDefault_timezone());
        b.setLogo(brand.getLogo());
        b.setLogo_text(brand.getLogo_text());
        b.setMax_payment_attempts(brand.getMax_payment_attempts());
        b.setMerchant_url(brand.getMerchant_url());
        b.setOriginal_product_generation(brand.isOriginal_product_generation());
        b.setReverse_downgraded_payments(brand.isReverse_downgraded_payments());
        b.setSms_sender_name(brand.getSms_sender_name());
        b.setSupport_email(brand.getSupport_email());
        b.setSupport_phone(brand.getSupport_phone());
        b.setSupport_phone_code(brand.getSupport_phone_code());
        b.setType(brand.getType());
        b.setUse_dies(brand.isUse_dies());
        b.setWebsites(brand.getWebsites());
        b.setWebsites_count(brand.getWebsites_count());
        brandRepository.save(b);
        return ResponseEntity.ok().body(b);

    }
    catch(Exception e){
        e.printStackTrace();
        return ResponseEntity.internalServerError().build();

    }

}

@PatchMapping("/{brand_id}/")
public ResponseEntity<Brand>updateFewOnly(@PathVariable("brand_id") UUID id,@RequestBody Brand brand){
    try {
        System.out.println("I am inside patch API");
        Brand b=brandRepository.findById(id).get();
        if(brand.getBadge_code()!=null){
            b.setBadge_code(brand.getBadge_code());
    }
    if(brand.getBrand_name()!=null){
            b.setBrand_name(brand.getBrand_name());
    }
    if(brand.getBranded_card_brand_name()!=null){
            b.setBranded_card_brand_name(brand.getBranded_card_brand_name());
    }
    if(brand.getBranded_card_currencies()!=null){
    
            b.setBranded_card_currencies(brand.getBranded_card_currencies());
    }
    if(brand.getBranded_card_decline_reason()!=null){
    
            b.setBranded_card_decline_reason(brand.getBranded_card_decline_reason());
    }
    if(brand.getBranded_card_design()!=null){
            b.setBranded_card_design(brand.getBranded_card_design());
    }
    if(brand.getBranded_card_status()!=null){
    
            b.setBranded_card_status(brand.getBranded_card_status());
    }
    
    if(brand.getDefault_currency()!=null){
    
            b.setDefault_currency(brand.getDefault_currency());
    }
    if(brand.getCard_custom_design()!=null){
    
            b.setCard_custom_design(brand.getCard_custom_design());
    }
    
    if(brand.isDefault_deny_overdue_payment()!=false){
            b.setDefault_deny_overdue_payment(brand.isDefault_deny_overdue_payment());
    }
    
    if(brand.getDefault_invoice_language()!=null){
    
            b.setDefault_invoice_language(brand.getDefault_invoice_language());
    }
    
    if(brand.getDefault_request_client_info()!=null){
    
            b.setDefault_request_client_info(brand.getDefault_request_client_info());
    }
    if(brand.getDefault_required_client_info()!=null){
    
            b.setDefault_required_client_info(brand.getDefault_required_client_info());
    }
    
    if(brand.isDefault_skip_capture()!=false){
            b.setDefault_skip_capture(brand.isDefault_skip_capture());
    }
    
    if(brand.getDefault_terminal()!=null){
            b.setDefault_terminal(brand.getDefault_terminal());
    }
    
    if(brand.getDefault_timezone()!=null){
            b.setDefault_timezone(brand.getDefault_timezone());
    }
    if(brand.getLogo()!=null){
    
            b.setLogo(brand.getLogo());
    }
    
    if(brand.getLogo_text()!=null){
            b.setLogo_text(brand.getLogo_text());
    }
    if(brand.getMax_payment_attempts()!=b.getMax_payment_attempts()){
            b.setMax_payment_attempts(brand.getMax_payment_attempts());
    }
    
    if(brand.getMerchant_url()!=b.getMerchant_url()){
            b.setMerchant_url(brand.getMerchant_url());
    }
    
    if(brand.isOriginal_product_generation()!=b.isOriginal_product_generation()){
            b.setOriginal_product_generation(brand.isOriginal_product_generation());
    }
    if(brand.isReverse_downgraded_payments()!=b.isReverse_downgraded_payments()){
    
            b.setReverse_downgraded_payments(brand.isReverse_downgraded_payments());
    }
    
    if(brand.getSms_sender_name()!=null){
    
            b.setSms_sender_name(brand.getSms_sender_name());
    }
    
    if(brand.getSupport_email()!=null){
            b.setSupport_email(brand.getSupport_email());
    }
    
    if(brand.getSupport_phone()!=null){
            b.setSupport_phone(brand.getSupport_phone());
    }
    
    if(brand.getSupport_phone_code()!=null){
            b.setSupport_phone_code(brand.getSupport_phone_code());
    }
    
    if(brand.getType()!=null){
            b.setType(brand.getType());
    }
    
    if(brand.isUse_dies()!=b.isUse_dies()){
            b.setUse_dies(brand.isUse_dies());
    }
    
    if(brand.getWebsites()!=null){
            b.setWebsites(brand.getWebsites());
    }
    
    if(brand.getWebsites_count()!=b.getWebsites_count()){
            b.setWebsites_count(brand.getWebsites_count());
    }


    return ResponseEntity.ok().body(b);
    } catch (Exception e) {
        return ResponseEntity.internalServerError().build();
        
    }
}






    
}
