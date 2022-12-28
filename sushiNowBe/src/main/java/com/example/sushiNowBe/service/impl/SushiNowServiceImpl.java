package com.example.sushiNowBe.service.impl;

import com.example.sushiNowBe.model.SushiTableDto;
import com.example.sushiNowBe.model.domain.Order;
import com.example.sushiNowBe.model.domain.Table;
import com.example.sushiNowBe.model.domain.User;
import com.example.sushiNowBe.model.entity.OrderEntity;
import com.example.sushiNowBe.model.entity.TableEntity;
import com.example.sushiNowBe.model.entity.UserEntity;
import com.example.sushiNowBe.service.SushiNowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SushiNowServiceImpl implements SushiNowService {
    @Override
    public Boolean deleteOrder(String id) {
        return null;
    }

    @Override
    public String incrementOrder(Integer orderNumber, Integer increment) {
        return null;
    }

    @Override
    public OrderEntity insertNewOrder(Order order) {
        return null;
    }

    @Override
    public TableEntity insertNewTable(Table table) {
        return null;
    }

    @Override
    public UserEntity insertNewUser(User user) {
        return null;
    }

    @Override
    public SushiTableDto readsTable(String id) {
        return null;
    }

    @Override
    public Boolean updateOrder(Order order) {
        return null;
    }
}
