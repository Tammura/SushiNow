package com.example.sushiNowBe.model.entity.repository;

import com.example.sushiNowBe.model.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface OrderRepository extends MongoRepository<OrderEntity, String> {

    Optional<OrderEntity> findById(String id);
}
