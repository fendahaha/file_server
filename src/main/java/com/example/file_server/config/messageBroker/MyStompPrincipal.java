package com.example.file_server.config.messageBroker;

import java.security.Principal;

public class MyStompPrincipal implements Principal {
    private String name;

    public MyStompPrincipal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
