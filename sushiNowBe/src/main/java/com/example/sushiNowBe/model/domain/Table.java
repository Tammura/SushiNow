package com.example.sushiNowBe.model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//@AllArgsConstructor
@Getter
@Setter
public class Table {

    private String id;

    private Integer number;

    private List<Integer> totFoodNumber = null;

    private List<Integer> totFoodQta = null;

}
