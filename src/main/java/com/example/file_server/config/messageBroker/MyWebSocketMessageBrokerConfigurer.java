package com.example.file_server.config.messageBroker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class MyWebSocketMessageBrokerConfigurer implements WebSocketMessageBrokerConfigurer {
    private MyChannelInterceptor myChannelInterceptor;
    private TaskScheduler messageBrokerTaskScheduler;

    @Autowired
    public MyWebSocketMessageBrokerConfigurer(MyChannelInterceptor myChannelInterceptor, @Lazy TaskScheduler messageBrokerTaskScheduler) {
        this.myChannelInterceptor = myChannelInterceptor;
        this.messageBrokerTaskScheduler = messageBrokerTaskScheduler;
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat")
                .addInterceptors(new MyHandshakeInterceptor())
                .setHandshakeHandler(new MyHandshakeHandler())
                .setAllowedOriginPatterns("http://localhost:[*]");
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.setApplicationDestinationPrefixes("/app");
        config.enableSimpleBroker("/topic", "/queue")
                .setHeartbeatValue(new long[]{5 * 1000, 10 * 1000})
                .setTaskScheduler(this.messageBrokerTaskScheduler);
    }

    @Override
    public void configureClientInboundChannel(ChannelRegistration registration) {
        registration.taskExecutor()
                .corePoolSize(10)       // 核心线程数
                .maxPoolSize(200)       // 最大线程数
                .queueCapacity(1000)    // 队列容量
                .keepAliveSeconds(60);  // 线程空闲时间
        registration.interceptors(myChannelInterceptor);
    }

}
