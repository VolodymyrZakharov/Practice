package com.example.spring_server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.*;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class ServerReporter {
    private int tcp_server_port;
    private int reporting_period;
    private AtomicInteger socketCounter;
    private String load_balancer_host;
    private int load_balancer_port;

    public ServerReporter(@Value("${de.telran.spring_load_balancer_server.self_tcp_port}") int TCP_SERVER_PORT,
                          @Value("${de.telran.spring_load_balancer_server.update_period}") int REPORTING_PERIOD,
                          AtomicInteger socketCounter,
                          @Value("${de.telran.spring_load_balancer_server.balancer_host}") String LOAD_BALANCER_HOST,
                          @Value("${de.telran.spring_load_balancer_server.balancer_udp_port}") int LOAD_BALANCER_PORT) {
        this.tcp_server_port = TCP_SERVER_PORT;
        this.reporting_period = REPORTING_PERIOD;
        this.socketCounter = socketCounter;
        this.load_balancer_host = LOAD_BALANCER_HOST;
        this.load_balancer_port = LOAD_BALANCER_PORT;
    }


    @Async
    public void run() throws IOException, InterruptedException {

        InetAddress balancerAddress = InetAddress.getByName(load_balancer_host);
        DatagramSocket datagramSocket = new DatagramSocket();

        while (true) {
            Thread.sleep(reporting_period);

            String res = tcp_server_port + ":" + socketCounter.get();
            byte[] outputBytes = res.getBytes();
            DatagramPacket outputPacket = new DatagramPacket(
                    outputBytes,
                    outputBytes.length,
                    balancerAddress,
                    load_balancer_port
            );
            datagramSocket.send(outputPacket);
        }
    }
}
