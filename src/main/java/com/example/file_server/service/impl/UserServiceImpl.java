package com.example.file_server.service.impl;

import com.example.file_server.dictionary.UserType;
import com.example.file_server.entity.User;
import com.example.file_server.form.UserRegisterForm;
import com.example.file_server.mapper.UserMapper;
import com.example.file_server.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;

    public int register(UserRegisterForm userRegisterForm) {
        User user = new User();
        user.setUserName(userRegisterForm.getUserName());
        user.setUserPassword(userRegisterForm.getUserPassword());
        user.setUserEmail(userRegisterForm.getUserEmail());
        user.setUserPhone(user.getUserPhone());
        user.setUserUuid(UUIDUtil.generateUUID());
        user.setUserDisplayName("user");
        user.setUserType(UserType.Client.getValue());
        user.setCreateAt(new Date());
        int i = userMapper.insertSelective(user);
        return i;
    }
}
