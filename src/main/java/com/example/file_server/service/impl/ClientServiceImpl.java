package com.example.file_server.service.impl;

import com.example.file_server.config.CommonTransactional;
import com.example.file_server.entity.Client;
import com.example.file_server.entity.User;
import com.example.file_server.exception.DbActionExcetion;
import com.example.file_server.mapper.ClientMapper;
import com.example.file_server.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        client.setClientMoney(1000.0);
        client.setClientMoneySended(0.0);
        client.setClientMoneyRecharged(1000.0);
        int i1 = clientMapper.insertSelective(client);
        if (i1 <= 0) {
            throw new DbActionExcetion("fail");
        }
        return client;
    }
}
