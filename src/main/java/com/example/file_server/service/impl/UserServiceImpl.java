package com.example.file_server.service.impl;

import com.example.file_server.dictionary.UserType;
import com.example.file_server.entity.Client;
import com.example.file_server.entity.User;
import com.example.file_server.entity.UserExample;
import com.example.file_server.form.AnchorForm;
import com.example.file_server.form.UserLoginForm;
import com.example.file_server.form.UserRegisterForm;
import com.example.file_server.form.UserUpdateForm;
import com.example.file_server.mapper.ClientMapper;
import com.example.file_server.mapper.UserMapper;
import com.example.file_server.utils.UUIDUtil;
import com.example.file_server.utils.UserUtil;
import org.apache.commons.lang3.StringUtils;
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
        client.setClientLeavel(1);
        client.setCreateAt(date);
        client.setClientMoney(1000.0);
        client.setClientMoneySended(0.0);
        client.setClientMoneyRecharged(1000.0);
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

    public User createAnchorUser(AnchorForm form) throws Exception {
        User user = new User();
        user.setUserUuid(UUIDUtil.generateUUID());
        if (StringUtils.isNotBlank(form.getUserDisplayName())) {
            user.setUserDisplayName(form.getUserDisplayName());
        } else {
            user.setUserDisplayName(UserUtil.generateUsername());
        }
        user.setUserType(UserType.Anchor.getValue());
        user.setCreateAt(new Date());
        user.setUserName(form.getUserName());
        user.setUserPassword(form.getUserPassword());
        user.setUserCountry(form.getUserCountry());
        user.setUserPhone(form.getUserPhone());
        user.setUserEmail(form.getUserEmail());
        user.setUserAvatar(form.getUserAvatar());
        int i = userMapper.insertSelective(user);
        if (i > 0) {
            return user;
        }
        throw new Exception("fail");
    }

    public void deleteByUUID(String uuid) throws Exception {
        UserExample example = new UserExample();
        example.createCriteria().andUserUuidEqualTo(uuid);
        int i = userMapper.deleteByExample(example);
        if (i <= 0) {
            throw new Exception("fail");
        }
    }

}
