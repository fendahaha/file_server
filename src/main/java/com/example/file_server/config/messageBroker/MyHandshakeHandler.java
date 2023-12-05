package com.example.file_server.config.messageBroker;

import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

public class MyHandshakeHandler extends DefaultHandshakeHandler {
//    @Override
//    protected Principal determineUser(ServerHttpRequest request,
//                                      WebSocketHandler wsHandler,
//                                      Map<String, Object> attributes) {
//
//        // 实现您的用户身份认证逻辑
//        // 返回一个实现了 Principal 接口的对象
//        URI uri = request.getURI();
//        String query = uri.getQuery();
//        String[] split = query.split("&");
//        HashMap<String, String> hashMap = new HashMap<>();
//        Arrays.stream(split).forEach((k) -> {
//            String[] split1 = k.split("=");
//            hashMap.put(split1[0], split1[1]);
//        });
//        Principal principal = new Principal() {
//            @Override
//            public String getName() {
//                return hashMap.get("username") + "_1";
//            }
//        };
//        return principal;
//    }
}
