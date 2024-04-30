package com.TestingAPI.TestingAPI.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.TestingAPI.TestingAPI.Entities.Webhook;
import com.TestingAPI.TestingAPI.Service.WebhookService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/webhooks/")
public class WebhookController {
    @Autowired
    private WebhookService webhookService;

    @GetMapping
    public List<Webhook> getAllWebhooks() {
        List<Webhook> webhooks=webhookService.getAllWebhooks();
        try{
            if(webhooks!=null){
                HttpStatus.valueOf(200);
                return webhooks;
            }
           else{
            HttpStatus.valueOf(200);
            return webhooks;
           }
        }
        catch(Exception e){
            HttpStatus.valueOf(400);
            e.printStackTrace();
            return webhooks;

        }
        
    }

    @GetMapping("/{id}/")
    public Webhook getWebhookById(@PathVariable UUID id) {
        try{
        Webhook webhook=webhookService.getWebhookById(id);
        if(webhook!=null){
            HttpStatus.valueOf(200);
            return webhook;

        }
        else{
            HttpStatus.valueOf(404);
            return webhook;
        }
    }
    catch(Exception e){
        HttpStatus.valueOf(500);
        e.printStackTrace();
        return null;
    }
    }

    @PostMapping
    public Webhook createWebhook(@RequestBody Webhook webhook) {
        try{
        if(webhookService.createWebhook(webhook)!=null){
            HttpStatus.valueOf(201);
            return webhook;

        }
        else{
            HttpStatus.valueOf(400);
            return webhook;
        }
    }
    catch(Exception e){
        HttpStatus.valueOf(500);
        e.printStackTrace();
        return null;
    }
    }

    @PutMapping("/{id}/")
    public Webhook updateWebhook(@PathVariable UUID id, @RequestBody Webhook webhook) {
        try{
            Webhook updated=webhookService.updateWebhook(id, webhook);
            if(updated!=null){
                HttpStatus.valueOf(200);
                return updated;
            }
            else{
                HttpStatus.valueOf(404);
                return updated;
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
            HttpStatus.valueOf(500);
            return null;
        }
  
    }

    @DeleteMapping("/{id}/")
    public void deleteWebhook(@PathVariable UUID id) {
      try{

          boolean res=webhookService.deleteWebhook(id);
          if(res){
            HttpStatus.valueOf(204);
          }
          else{
            HttpStatus.valueOf(404);
          }
      }
        catch(Exception e){
            e.printStackTrace();
            HttpStatus.valueOf(500);

        }
    }
    @PatchMapping("/{id}/")
    public Webhook patchBook(@PathVariable UUID id, @RequestBody Webhook webhook){
        try{
            Webhook updated=webhookService.updateWebhook(id, webhook);
            if(updated!=null){
                HttpStatus.valueOf(200);
                return updated;
            }
            else{
                HttpStatus.valueOf(404);
                return updated;
            }
            
        }
        catch(Exception e){
            e.printStackTrace(); 
            HttpStatus.valueOf(500);
            return null;
        }

    }
}
