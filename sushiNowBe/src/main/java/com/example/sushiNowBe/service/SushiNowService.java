package com.example.sushiNowBe.service;

import com.example.sushiNowBe.model.SushiTableDto;
import com.example.sushiNowBe.model.domain.Order;
import com.example.sushiNowBe.model.domain.Table;
import com.example.sushiNowBe.model.domain.User;
import com.example.sushiNowBe.model.entity.OrderEntity;
import com.example.sushiNowBe.model.entity.TableEntity;
import com.example.sushiNowBe.model.entity.UserEntity;

public interface SushiNowService {

    Boolean deleteOrder(String id);

    String incrementOrder(Integer orderNumber, Integer increment);

    OrderEntity insertNewOrder(Order order);

    TableEntity insertNewTable(Table table);

    UserEntity insertNewUser(User user);

    SushiTableDto readsTable(String id);

    Boolean updateOrder(Order order);
}
