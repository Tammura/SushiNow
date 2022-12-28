package com.example.sushiNowBe.mapper;

import com.example.sushiNowBe.model.InsertNewSushiOrderRequestDto;
import com.example.sushiNowBe.model.domain.Order;
import com.example.sushiNowBe.model.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

     Order map(InsertNewSushiOrderRequestDto dto);

     OrderEntity map(Order order);

}
