package com.example.democleansimple.service;

import com.example.democleansimple.entity.GameUser;
import com.example.democleansimple.model.GameUserDTO;
import com.example.democleansimple.repository.UserRepository;
import com.example.democleansimple.service.mapper.CommonMapper;
import com.example.democleansimple.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends CommonService<Long, GameUser, GameUserDTO> {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserMapper userMapper;

    @Override
    JpaRepository<GameUser, Long> repository() {
        return userRepository;
    }

    @Override
    CommonMapper<GameUser, GameUserDTO> mapper() {
        return userMapper;
    }
}
