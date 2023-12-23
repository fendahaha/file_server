package com.example.file_server.service.impl;

import com.example.file_server.config.CommonTransactional;
import com.example.file_server.entity.Client;
import com.example.file_server.entity.ClientExample;
import com.example.file_server.entity.User;
import com.example.file_server.entity.UserExample;
import com.example.file_server.exception.DbActionExcetion;
import com.example.file_server.mapper.ClientMapper;
import com.example.file_server.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl {
    @Autowired
    private ClientMapper clientMapper;

    @CommonTransactional
    public Client create(User user) {
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

    public Client getByUserUuid(String uuid){
        ClientExample example = new ClientExample();
        example.createCriteria().andUserUuidEqualTo(uuid);
        List<Client> clients = clientMapper.selectByExample(example);
        return clients.get(0);
    }
}
