package com.example.file_server.service.impl;

import com.example.file_server.config.CommonTransactional;
import com.example.file_server.dictionary.Role;
import com.example.file_server.dictionary.UserType;
import com.example.file_server.entity.Client;
import com.example.file_server.entity.User;
import com.example.file_server.entity.UserExample;
import com.example.file_server.exception.DbActionExcetion;
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
    private ClientServiceImpl clientService;

    public boolean userExist(String userName) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userName);
        List<User> users = userMapper.selectByExample(example);
        return !users.isEmpty();
    }

    @CommonTransactional
    public User registerClient(UserRegisterForm userRegisterForm) {
        Date date = new Date();
        String uuid = UUIDUtil.generateUUID();
        User user = new User();
        user.setUserRole(Role.Client.getValue());
        user.setUserName(userRegisterForm.getUserName());
        user.setUserPassword(userRegisterForm.getUserPassword());
        user.setUserEmail(userRegisterForm.getUserEmail());
        user.setUserPhone(userRegisterForm.getUserPhone());
        user.setUserUuid(uuid);
        user.setUserDisplayName(UserUtil.generateUsername());
        user.setUserType(UserType.Client.getValue());
        user.setCreateAt(date);
        int i = userMapper.insertSelective(user);
        if (i <= 0) {
            throw new DbActionExcetion("fail");
        }
        clientService.create(user);
        return user;
    }

    public User getUser(UserLoginForm userLoginForm) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userLoginForm.getUserName())
                .andUserPasswordEqualTo(userLoginForm.getUserPassword());
        List<User> users = userMapper.selectByExample(example);
        return users.isEmpty() ? null : users.get(0);
    }

    @CommonTransactional
    public void updateUser(UserUpdateForm userUpdateForm) {
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
        if (i <= 0) {
            throw new DbActionExcetion("fail");
        }
    }

    public User getUserByUUID(String uuid) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserUuidEqualTo(uuid);
        List<User> users = userMapper.selectByExample(example);
        return users.get(0);
    }

    @CommonTransactional
    public User createAnchorUser(AnchorForm form) throws Exception {
        User user = new User();
        user.setUserUuid(UUIDUtil.generateUUID());
        if (StringUtils.isNotBlank(form.getUserDisplayName())) {
            user.setUserDisplayName(form.getUserDisplayName());
        } else {
            user.setUserDisplayName(UserUtil.generateUsername());
        }
        user.setUserType(UserType.Anchor.getValue());
        user.setUserRole(Role.Anchor.getValue());
        user.setCreateAt(new Date());
        user.setUserName(form.getUserName());
        user.setUserPassword(form.getUserPassword());
        user.setUserCountry(form.getUserCountry());
        user.setUserPhone(form.getUserPhone());
        user.setUserEmail(form.getUserEmail());
        user.setUserAvatar(form.getUserAvatar());
        int i = userMapper.insertSelective(user);
        if (i <= 0) {
            throw new DbActionExcetion("fail");
        }
        return user;
    }

    @CommonTransactional
    public void deleteByUUID(String uuid) {
        UserExample example = new UserExample();
        example.createCriteria().andUserUuidEqualTo(uuid);
        int i = userMapper.deleteByExample(example);
        if (i <= 0) {
            throw new DbActionExcetion("fail");
        }
    }

    public List<User> getUsersByUUIDs(List<String> uuids) {
        UserExample example = new UserExample();
        example.createCriteria().andUserUuidIn(uuids);
        List<User> users = userMapper.selectByExample(example);
        return users;
    }

}
