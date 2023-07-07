package com.example.sushiNowBe.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Builder
@Getter
@Setter
public class OrderEntity {

    @Id
    private String id;

    private List<Integer> totFoodNumber;

    private List<Integer> totFoodQta;

}
