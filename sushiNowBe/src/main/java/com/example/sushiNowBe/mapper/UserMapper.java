package com.example.sushiNowBe.mapper;

import com.example.sushiNowBe.model.InsertNewSushiUserRequestDto;
import com.example.sushiNowBe.model.domain.User;
import com.example.sushiNowBe.model.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User map(InsertNewSushiUserRequestDto dto);

    UserEntity map(User user);


}
