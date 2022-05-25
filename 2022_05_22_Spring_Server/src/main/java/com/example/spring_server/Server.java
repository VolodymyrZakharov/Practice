package com.example.spring_server;

import org.springframework.boot.CommandLineRunner;

public class Server implements CommandLineRunner {

    private final ServerReporter serverReporter;
    private final TcpServer tcpServer;

    public Server(ServerReporter serverReporter, TcpServer tcpServer) {
        this.serverReporter = serverReporter;
        this.tcpServer = tcpServer;
    }

    @Override
    public void run(String... args) throws Exception {
        serverReporter.run();
        tcpServer.run();
        System.out.println("Threads started");
    }
}
