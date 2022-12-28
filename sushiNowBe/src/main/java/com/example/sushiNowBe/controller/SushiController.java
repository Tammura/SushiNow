package com.example.sushiNowBe.controller;

import com.example.sushiNowBe.api.SushiNowApi;
import com.example.sushiNowBe.mapper.OrderMapper;
import com.example.sushiNowBe.mapper.TableMapper;
import com.example.sushiNowBe.mapper.UserMapper;
import com.example.sushiNowBe.model.InsertNewSushiOrderRequestDto;
import com.example.sushiNowBe.model.InsertNewSushiTableRequestDto;
import com.example.sushiNowBe.model.InsertNewSushiUserRequestDto;
import com.example.sushiNowBe.model.SushiTableDto;
import com.example.sushiNowBe.model.entity.OrderEntity;
import com.example.sushiNowBe.model.entity.TableEntity;
import com.example.sushiNowBe.model.entity.UserEntity;
import com.example.sushiNowBe.service.SushiNowService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Slf4j
@RestController
@RequiredArgsConstructor
public class SushiController implements SushiNowApi{


    private final SushiNowService service;


    @Override
    public ResponseEntity<Boolean> deleteSushiOrder(String id) {
        return ResponseEntity.ok(service.deleteOrder(id));
    }

    @Override
    public ResponseEntity<String> incrementSushiOrder(Integer number, Integer qta) {
        return ResponseEntity.ok(service.incrementOrder(number, qta));
    }

    @Override
    public ResponseEntity<Void> insertNewSushiOrder(InsertNewSushiOrderRequestDto insertNewSushiOrderRequestDto) {

        OrderEntity entitySaved = service.insertNewOrder(OrderMapper.INSTANCE.map(insertNewSushiOrderRequestDto));

        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(entitySaved.getId())
                .toUri()).build();

    }

    @Override
    public ResponseEntity<Void> insertNewSushiTable(InsertNewSushiTableRequestDto insertNewSushiTableRequestDto) {
    TableEntity entity = service.insertNewTable(TableMapper.INSTANCE.map(insertNewSushiTableRequestDto));

        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(entity.getId())
                .toUri()).build();
    }

    @Override
    public ResponseEntity<Void> insertNewSushiUser(InsertNewSushiUserRequestDto insertNewSushiUserRequestDto) {
        UserEntity entity = service.insertNewUser(UserMapper.INSTANCE.map(insertNewSushiUserRequestDto));

        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(entity.getId())
                .toUri()).build();
    }

    @Override
    public ResponseEntity<SushiTableDto> readsSushiTable(String id) {
        return ResponseEntity.ok(service.readsTable(id));
    }

    @Override
    public ResponseEntity<Boolean> updateSushiOrder(InsertNewSushiOrderRequestDto insertNewSushiOrderRequestDto) {
    return ResponseEntity.ok(service.updateOrder(OrderMapper.INSTANCE.map(insertNewSushiOrderRequestDto)));
    }

}
