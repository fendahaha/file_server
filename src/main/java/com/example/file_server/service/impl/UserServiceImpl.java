package com.example.file_server.service.impl;

import com.example.file_server.dictionary.UserType;
import com.example.file_server.entity.User;
import com.example.file_server.entity.UserExample;
import com.example.file_server.form.UserLoginForm;
import com.example.file_server.form.UserRegisterForm;
import com.example.file_server.mapper.UserMapper;
import com.example.file_server.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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
        return userMapper.insertSelective(user);
    }

    public User getUser(UserLoginForm userLoginForm) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userLoginForm.getUserName())
                .andUserPasswordEqualTo(userLoginForm.getUserPassword());
        List<User> users = userMapper.selectByExample(example);
        return users.isEmpty() ? null : users.get(0);
    }
}
