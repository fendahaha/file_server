package com.example.file_server.service.impl;

import com.example.file_server.config.CommonTransactional;
import com.example.file_server.dictionary.Role;
import com.example.file_server.dictionary.UserType;
import com.example.file_server.entity.*;
import com.example.file_server.exception.DbActionExcetion;
import com.example.file_server.form.AnchorForm;
import com.example.file_server.form.UserLoginForm;
import com.example.file_server.form.UserRegisterForm;
import com.example.file_server.form.UserUpdateForm;
import com.example.file_server.mapper.AnchorMapper;
import com.example.file_server.mapper.UserMapper;
import com.example.file_server.utils.UUIDUtil;
import com.example.file_server.utils.UserUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ClientServiceImpl clientService;
    @Autowired
    private AnchorMapper anchorMapper;

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

    public HashMap<String, Object> queryUserInfoByExample(UserExample example) {
        List<User> users = userMapper.selectByExample(example);
        if (!users.isEmpty()) {
            HashMap<String, Object> map = new HashMap<>();
            User user = users.get(0);
            map.put("user", user);
            if (user.getUserType().equals(UserType.Client.getValue())) {
                Client client = clientService.getByUserUuid(user.getUserUuid());
                map.put("client", client);
            }
            if (user.getUserType().equals(UserType.Anchor.getValue())) {
                AnchorExample anchorExample = new AnchorExample();
                anchorExample.createCriteria().andUserUuidEqualTo(user.getUserUuid());
                List<Anchor> anchors = anchorMapper.selectByExample(anchorExample);
                Anchor anchor = anchors.get(0);
                map.put("anchor", anchor);
            }
            if (user.getUserType().equals(UserType.Administrator.getValue())) {

            }
            return map;
        }
        return null;
    }

    public HashMap<String, Object> getUser(UserLoginForm userLoginForm) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userLoginForm.getUserName())
                .andUserPasswordEqualTo(userLoginForm.getUserPassword());
        return queryUserInfoByExample(example);
    }

    public HashMap<String, Object> getUserByUUID(String uuid) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserUuidEqualTo(uuid);
        return queryUserInfoByExample(example);
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


    public HashMap<String, Object> get_client_with_user(String uuid) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserUuidEqualTo(uuid);
        List<User> users = userMapper.selectByExample(userExample);
        if (!users.isEmpty()) {
            Client client = clientService.getByUserUuid(users.get(0).getUserUuid());
            HashMap<String, Object> map = new HashMap<>();
            map.put("user", users.get(0));
            map.put("client", client);
            return map;
        }
        return null;
    }
}
