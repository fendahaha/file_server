package com.example.file_server.service.impl;

import com.example.file_server.dictionary.UserType;
import com.example.file_server.entity.Client;
import com.example.file_server.entity.User;
import com.example.file_server.entity.UserExample;
import com.example.file_server.form.UserLoginForm;
import com.example.file_server.form.UserRegisterForm;
import com.example.file_server.form.UserUpdateForm;
import com.example.file_server.mapper.ClientMapper;
import com.example.file_server.mapper.UserMapper;
import com.example.file_server.utils.UUIDUtil;
import com.example.file_server.utils.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ClientMapper clientMapper;

    public boolean userExist(String userName) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userName);
        List<User> users = userMapper.selectByExample(example);
        return !users.isEmpty();
    }


    public User registerUser(UserRegisterForm userRegisterForm) {
        Date date = new Date();
        String uuid = UUIDUtil.generateUUID();
        User user = new User();
        user.setUserName(userRegisterForm.getUserName());
        user.setUserPassword(userRegisterForm.getUserPassword());
        user.setUserEmail(userRegisterForm.getUserEmail());
        user.setUserPhone(userRegisterForm.getUserPhone());
        user.setUserUuid(uuid);
        user.setUserDisplayName(UserUtil.generateUsername());
        user.setUserType(UserType.Client.getValue());
        user.setCreateAt(date);
        int i = userMapper.insertSelective(user);
        Client client = new Client();
        client.setUserUuid(uuid);
        client.setClientUuid(UUIDUtil.generateUUID());
        client.setCreateAt(date);
        client.setClientMoney(1000.0);
        int i1 = clientMapper.insertSelective(client);
        return (i > 0) && (i1 > 0) ? user : null;
    }

    public User getUser(UserLoginForm userLoginForm) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userLoginForm.getUserName())
                .andUserPasswordEqualTo(userLoginForm.getUserPassword());
        List<User> users = userMapper.selectByExample(example);
        return users.isEmpty() ? null : users.get(0);
    }

    public boolean updateUser(UserUpdateForm userUpdateForm) {
        User user = new User();
        user.setUserAvatar(userUpdateForm.getUserAvatar());
        user.setUserDisplayName(userUpdateForm.getUserDisplayName());
        user.setUserEmail(userUpdateForm.getUserEmail());
        user.setUserPhone(userUpdateForm.getUserPhone());
        user.setUserCountry(userUpdateForm.getUserCountry());
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserUuidEqualTo(userUpdateForm.getUserUuid());
        int i = userMapper.updateByExampleSelective(user, example);
        return i > 0;
    }

    public User getUserByUUID(String uuid) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserUuidEqualTo(uuid);
        List<User> users = userMapper.selectByExample(example);
        return users.get(0);
    }
}
