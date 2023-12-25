package com.example.file_server.service.impl;

import com.example.file_server.config.CommonTransactional;
import com.example.file_server.dictionary.UserType;
import com.example.file_server.entity.Client;
import com.example.file_server.entity.ClientExample;
import com.example.file_server.entity.User;
import com.example.file_server.entity.UserExample;
import com.example.file_server.exception.DbActionExcetion;
import com.example.file_server.form.ClientListForm;
import com.example.file_server.form.ClientUpdateForm;
import com.example.file_server.mapper.ClientMapper;
import com.example.file_server.mapper.UserMapper;
import com.example.file_server.utils.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl {
    @Autowired
    private ClientMapper clientMapper;
    @Autowired
    private UserMapper userMapper;

    @CommonTransactional
    public Client createClient(User user) {
        Client client = new Client();
        client.setUserUuid(user.getUserUuid());
        client.setClientUuid(UUIDUtil.generateUUID());
        client.setClientLeavel(1);
        client.setCreateAt(user.getCreateAt());
        client.setClientMoney(1000);
        client.setClientMoneySended(0);
        client.setClientMoneyRecharged(1000);
        int i1 = clientMapper.insertSelective(client);
        if (i1 <= 0) {
            throw new DbActionExcetion("fail");
        }
        return client;
    }

    @CommonTransactional
    public synchronized void sendMoney(String userUuid, Integer value) {
        ClientExample example = new ClientExample();
        ClientExample.Criteria criteria = example.createCriteria().andUserUuidEqualTo(userUuid);
        Client client = clientMapper.selectByExample(example).get(0);
        if (client.getClientMoney() < value) {
            throw new DbActionExcetion("money not enough");
        }
        client.setClientMoney(client.getClientMoney() - value);
        client.setClientMoneySended(client.getClientMoneySended() + value);
        int i = clientMapper.updateByExampleSelective(client, example);
        if (i < 0) {
            throw new DbActionExcetion("fail");
        }
    }

    @CommonTransactional
    public synchronized void rechargeMoney(String userUuid, Integer value) {
        ClientExample example = new ClientExample();
        ClientExample.Criteria criteria = example.createCriteria().andUserUuidEqualTo(userUuid);
        Client client = clientMapper.selectByExample(example).get(0);
        client.setClientMoney(client.getClientMoney() + value);
        client.setClientMoneyRecharged(client.getClientMoneyRecharged() + value);
        int i = clientMapper.updateByExampleSelective(client, example);
        if (i < 0) {
            throw new DbActionExcetion("fail");
        }
    }

    public Client getClientByUserUuid(String uuid) {
        ClientExample example = new ClientExample();
        example.createCriteria().andUserUuidEqualTo(uuid);
        List<Client> clients = clientMapper.selectByExample(example);
        return clients.get(0);
    }

    public List<Client> getClients(List<String> userUuids) {
        ClientExample example = new ClientExample();
        example.createCriteria().andUserUuidIn(userUuids);
        return clientMapper.selectByExample(example);
    }

    public HashMap<String, Object> list_clients_with_user(ClientListForm form) {
        UserExample example = new UserExample();
        example.setOrderByClause("create_at");
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserTypeEqualTo(UserType.Client.getValue());
        if (StringUtils.isNotBlank(form.getUserDisplayName())) {
            criteria.andUserDisplayNameEqualTo(form.getUserDisplayName());
        }
        if (StringUtils.isNotBlank(form.getUserCountry())) {
            criteria.andUserCountryEqualTo(form.getUserCountry());
        }
        if (StringUtils.isNotBlank(form.getUserPhone())) {
            criteria.andUserPhoneEqualTo(form.getUserPhone());
        }
        HashMap<String, Object> map = CommonServiceUtil.listPage(userMapper, example, form.getPageNum(), form.getPageSize());
        List<User> users = (List<User>) map.get("list");
        if (!users.isEmpty()) {
            List<Client> clients = getClients(users.stream().map(User::getUserUuid).toList());

            HashMap<String, Object> userMap = new HashMap<>();
            HashMap<String, Object> clientMap = new HashMap<>();
            users.forEach(u -> userMap.put(u.getUserUuid(), u));
            clients.forEach(client -> clientMap.put(client.getUserUuid(), client));

            List<HashMap<String, Object>> list = users.stream().map(user -> {
                String userUuid = user.getUserUuid();
                HashMap<String, Object> map1 = new HashMap<>();
                map1.put("user", userMap.get(userUuid));
                map1.put("client", clientMap.get(userUuid));
                return map1;
            }).toList();
            map.put("list", list);
        }

        return map;
    }

    @CommonTransactional
    public boolean deleteClient(String userUuid) {
        ClientExample clientExample = new ClientExample();
        UserExample userExample = new UserExample();
        clientExample.createCriteria().andUserUuidEqualTo(userUuid);
        userExample.createCriteria().andUserUuidEqualTo(userUuid);
        int i = clientMapper.deleteByExample(clientExample);
        int i1 = userMapper.deleteByExample(userExample);
        if (i > 0 && i1 > 0) {
            return true;
        }
        throw new DbActionExcetion("fail");
    }

    @CommonTransactional
    public boolean update(String userUuid, ClientUpdateForm form) {
        UserExample userExample = new UserExample();
        ClientExample clientExample = new ClientExample();
        userExample.createCriteria().andUserUuidEqualTo(userUuid);
        clientExample.createCriteria().andUserUuidEqualTo(userUuid);

        User user = new User();
        Client client = new Client();
        user.setUserDisplayName(form.getUserDisplayName());
        user.setUserEmail(form.getUserEmail());
        user.setUserPhone(form.getUserPhone());
        user.setUserCountry(form.getUserCountry());
        user.setUserAvatar(form.getUserAvatar());
        client.setClientLeavel(form.getClientLeavel());
        client.setClientMoney(form.getClientMoney());
        client.setClientMoneySended(form.getClientMoneySended());
        client.setClientMoneyRecharged(form.getClientMoneyRecharged());

        int i = userMapper.updateByExampleSelective(user, userExample);
        int i1 = clientMapper.updateByExampleSelective(client, clientExample);
        if (i > 0 && i1 > 0) {
            return true;
        }
        throw new DbActionExcetion("fail");
    }
}
