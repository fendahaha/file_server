package com.example.file_server.service.impl;

import com.example.file_server.entity.Client;
import com.example.file_server.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl {
    @Autowired
    private ClientMapper clientMapper;

    public Object create(Client client){

        return null;
    }
}
