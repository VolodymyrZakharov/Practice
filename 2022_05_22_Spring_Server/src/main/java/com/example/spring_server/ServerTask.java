package com.example.spring_server;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class ServerTask {

    AtomicInteger socketCounter;
    int selfTcpPort;

    public ServerTask(AtomicInteger socketCounter,
                      @Value("${de.telran.spring_load_balancer_server.self_tcp_port}") int selfTcpPort) {
        this.socketCounter = socketCounter;
        this.selfTcpPort = selfTcpPort;
    }

    @Async("serverTaskExecutor")
    public void run(Socket socket) {
        try {
            PrintStream dataOut = new PrintStream(socket.getOutputStream());
            BufferedReader dataIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line;
            while ((line = dataIn.readLine()) != null) {
                System.out.println("Received from server: " + line);
                String response = line + " handled by server " + selfTcpPort;
                dataOut.println(response);
            }
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            socketCounter.decrementAndGet();
        }
    }
}
