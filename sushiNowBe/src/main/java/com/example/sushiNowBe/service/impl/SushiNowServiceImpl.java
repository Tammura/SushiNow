package com.example.sushiNowBe.service.impl;

import com.example.sushiNowBe.model.SushiTableDto;
import com.example.sushiNowBe.model.domain.Order;
import com.example.sushiNowBe.model.domain.Table;
import com.example.sushiNowBe.model.domain.User;
import com.example.sushiNowBe.model.entity.OrderEntity;
import com.example.sushiNowBe.model.entity.TableEntity;
import com.example.sushiNowBe.model.entity.UserEntity;
import com.example.sushiNowBe.model.entity.repository.OrderRepository;
import com.example.sushiNowBe.model.entity.repository.TableRepository;
import com.example.sushiNowBe.service.SushiNowService;
import exception.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class SushiNowServiceImpl implements SushiNowService {

    @Autowired
    private TableRepository tableRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void deleteOrder(String id) {

        Optional<OrderEntity> entity = orderRepository.findById(id);

        if (entity.isEmpty()){
            throw new ResourceNotFoundException("entity not found for id ", id);
        }

        orderRepository.deleteById(id);

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
