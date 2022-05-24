package gateWay;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Gateway {

    private final static int TCP_PORT = 2000;

    public static void main(String... args) throws IOException, InterruptedException {

        ServerSocket serverSocket = new ServerSocket(TCP_PORT);
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        ServerData serverData = new ServerData();

        Thread gateWay_UDP_Receiver = new Thread(new GateWay_UDP_Receiver(serverData));
        gateWay_UDP_Receiver.start();

        while (true) {
            Socket socket = serverSocket.accept();
            Runnable gateWayTask = new GateWayTask(socket, serverData);
            executorService.execute(gateWayTask);
        }
    }
}
