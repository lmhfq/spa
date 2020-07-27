package com.lmh.spa.provider.service.impl;

import com.lmh.spa.api.dto.UserAddDTO;
import com.lmh.spa.api.dto.UserDTO;
import com.lmh.spa.provider.service.UserService;

@org.apache.dubbo.config.annotation.Service(protocol = "dubbo", version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO get(Integer id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setName("没有昵称：" + id);
        userDTO.setGender(id % 2 + 1); // 1 - 男；2 - 女
        return userDTO;
    }

    @Override
    public Integer add(UserAddDTO addDTO) {
        return (int) (System.currentTimeMillis() / 1000); // 嘿嘿，随便返回一个 id
    }

}