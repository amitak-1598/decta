package com.TestingAPI.TestingAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Dao.WebhookRepository;
import com.TestingAPI.TestingAPI.Entities.Webhook;

import java.util.List;
import java.util.UUID;

@Service
public class WebhookService {
    @Autowired
    private WebhookRepository webhookRepository;

    public List<Webhook> getAllWebhooks() {
        return webhookRepository.findAll();
    }

    public Webhook getWebhookById(UUID id) {
        return webhookRepository.findById(id).orElse(null);
    }

    public Webhook createWebhook(Webhook webhook) {
        return webhookRepository.save(webhook);
    }

    public Webhook updateWebhook(UUID id, Webhook webhook) {
        if (webhookRepository.existsById(id)) {
            webhook.setId(id);
            return webhookRepository.save(webhook);
        }
        return null;
    }

    public boolean deleteWebhook(UUID id) {
        try{

            webhookRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
