package server;

import java.io.IOException;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Server {

    private final static int TCP_SERVER_PORT = 4001;
    private static final int REPORTING_PERIOD = 100;

    public static void main(String[] args) throws IOException {

        AtomicInteger socketCounter = new AtomicInteger(0);
        ServerSocket serverSocket = new ServerSocket(TCP_SERVER_PORT);

        Thread serverReporter = new Thread(new ServerReporter(TCP_SERVER_PORT, REPORTING_PERIOD, socketCounter));
        serverReporter.start();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        while (true) {
            Socket socket = serverSocket.accept();
            socketCounter.incrementAndGet();
            executorService.execute(new ServerTask(socket, socketCounter));
        }
    }
}
