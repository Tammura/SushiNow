package com.example.sushiNowBe.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
public class UserEntity {

    @Id
    private String id;

    private String username;

}
