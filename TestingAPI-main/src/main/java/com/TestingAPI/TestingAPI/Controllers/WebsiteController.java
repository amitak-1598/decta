package com.TestingAPI.TestingAPI.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TestingAPI.TestingAPI.Dao.WebsiteRepository;
import com.TestingAPI.TestingAPI.Entities.Website;


@RestController
@RequestMapping("/websites/")
public class WebsiteController {
    
   @Autowired
   private WebsiteRepository websiteRepository;
   
   @PostMapping
   public Website postWebsite(@RequestBody Website website){
    System.out.println("I am here");
    Website website2=new Website();
    website2.setWeb_page(website.getWeb_page());
    website2.setAccounts_count(website.getAccounts_count());
    website2.setCurrencies(website.getCurrencies());
    website2.setDefault_account(website.getDefault_account());
    website2.setDefault_currency(website.getDefault_currency());
    website2.setDefault_language(website.getDefault_language());
    website2.setDefault_terminal(website.getDefault_terminal());
    website2.setId(website.getId());
    website2.setLogo(website.getLogo());
    website2.setMax_payment_attempts(website.getMax_payment_attempts());
    website2.setRequire_terms_on_payment(website.isRequire_terms_on_payment());
    website2.setSms_sender_name(website.getSms_sender_name());
    website2.setSupport_email(website.getSupport_email());
    website2.setSupport_phone(website.getSupport_phone());
    website2.setSupport_phone_code(website.getSupport_phone_code());
    website2.setTimezone(website.getTimezone());
    website2.setType(website.getType());
    website2.setWeb_page(website.getWeb_page());
    websiteRepository.save(website2);
    return website2;

    
   }

   @GetMapping
   public List<Website> getAll() {
       return websiteRepository.findAll();
   }
   @GetMapping("/{website_id}")
   public Website getByWebId(@PathVariable("website_id") UUID websiteId) {
    Website website=websiteRepository.findById(websiteId).get();
    return website;  
   }

   @PutMapping("/{website_id}")
   public Website updateById(@PathVariable("website_id") UUID websiteId,@RequestBody Website website) {
    website.setUid(websiteId);
   Website updatedWeb= websiteRepository.save(website);
    return updatedWeb;
   }

   @PatchMapping("/{website_id}")
   public Website updatePartialById(@PathVariable("website_id") UUID websiteId,@RequestBody Website website) {
    website.setUid(websiteId);
    Website updatedWeb= websiteRepository.save(website);
    return updatedWeb;
   }




}
