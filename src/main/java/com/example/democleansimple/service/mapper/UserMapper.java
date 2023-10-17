package com.example.democleansimple.service.mapper;

import com.example.democleansimple.entity.GameUser;
import com.example.democleansimple.model.GameUserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper extends CommonMapper<GameUser, GameUserDTO> {
}
