package com.example.spring_server;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class TcpServer {
    AtomicInteger socketCounter;
    int selfTcpPort;
    ServerTask serverTask;

    public TcpServer(AtomicInteger socketCounter,
                     @Value("${de.telran.spring_load_balancer_server.self_tcp_port}") int selfTcpPort,
                     ServerTask serverTask) {
        this.socketCounter = socketCounter;
        this.selfTcpPort = selfTcpPort;
        this.serverTask = serverTask;
    }

    @Async
    public void run() throws IOException {
        ServerSocket serverSocket = new ServerSocket(selfTcpPort);

        while (true) {
            Socket socket = serverSocket.accept();
            socketCounter.incrementAndGet();
            serverTask.run(socket);
        }
    }
}

