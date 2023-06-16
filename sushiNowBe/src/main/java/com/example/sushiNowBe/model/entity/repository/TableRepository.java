package com.example.sushiNowBe.model.entity.repository;

import com.example.sushiNowBe.model.entity.TableEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TableRepository extends MongoRepository<TableEntity, String> {

    Optional<TableEntity> findById(String id);

}
