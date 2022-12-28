package com.example.sushiNowBe.model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Order {

    private String id;

    private List<Integer> totFoodNumber = null;

    private List<Integer> totFoodQta = null;

}
