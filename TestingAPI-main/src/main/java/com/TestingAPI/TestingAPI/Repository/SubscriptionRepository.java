package com.TestingAPI.TestingAPI.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TestingAPI.TestingAPI.Entities.Subscription;

public interface SubscriptionRepository  extends JpaRepository<Subscription,UUID> {

}
