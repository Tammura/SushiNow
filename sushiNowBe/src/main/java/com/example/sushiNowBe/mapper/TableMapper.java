package com.example.sushiNowBe.mapper;

import com.example.sushiNowBe.model.InsertNewSushiTableRequestDto;
import com.example.sushiNowBe.model.domain.Table;
import com.example.sushiNowBe.model.entity.TableEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TableMapper {

    TableMapper INSTANCE = Mappers.getMapper(TableMapper.class);

    Table map(InsertNewSushiTableRequestDto dto);

    TableEntity map(Table table);
}
