package com.example.spring_server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

@Configuration
@EnableAsync
public class Config {

    @Bean
    public AtomicInteger socketCounter() {
        return new AtomicInteger();
    }

    @Bean
    public Executor executor(){
        return new SimpleAsyncTaskExecutor();
    }

    @Bean
    public Executor serverTaskExecutor(
            @Value("${de.telran.spring_load_balancer_server.tcp_connections_number}") int tcpConnectionsNumber) {
        return Executors.newFixedThreadPool(tcpConnectionsNumber);
    }
}
