package com.TestingAPI.TestingAPI.Entities;


import java.time.Instant;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Webhook {
    @Id
    @GeneratedValue
    private UUID id;
    private String type;
    private Instant created;
    private String title;
    private String version = "v0.6";
    private String url;
    private boolean isTest;
    private boolean allEvents;
    private List<String> events;
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
    public Instant getCreated() {
        return created;
    }
    public void setCreated(Instant created) {
        this.created = created;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public boolean isTest() {
        return isTest;
    }
    public void setTest(boolean isTest) {
        this.isTest = isTest;
    }
    public boolean isAllEvents() {
        return allEvents;
    }
    public void setAllEvents(boolean allEvents) {
        this.allEvents = allEvents;
    }
    public List<String> getEvents() {
        return events;
    }
    public void setEvents(List<String> events) {
        this.events = events;
    }
    public Webhook(UUID id, String type, Instant created, String title, String version, String url, boolean isTest,
            boolean allEvents, List<String> events) {
        this.id = id;
        this.type = type;
        this.created = created;
        this.title = title;
        this.version = version;
        this.url = url;
        this.isTest = isTest;
        this.allEvents = allEvents;
        this.events = events;
    }
    public Webhook() {
    }


}
