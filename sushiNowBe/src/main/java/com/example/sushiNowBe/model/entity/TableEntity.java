package com.example.sushiNowBe.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
//@AllArgsConstructor
public class TableEntity {
    @Id
    private String id;

    private Integer number;

    private List<Integer> totFoodNumber = null;

    private List<Integer> totFoodQta = null;
}
