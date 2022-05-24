import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TCP_connection implements Runnable {

    int tcpOuterPort;
    ServerData serverData;

    public TCP_connection(int tcp_outer_port, ServerData serverData) {
        this.tcpOuterPort = tcp_outer_port;
        this.serverData = serverData;
    }

    @Override
    public void run() {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(tcpOuterPort);

            while (true) {
                Socket socket = null;
                try {
                    socket = serverSocket.accept();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("connected from client");

                ExecutorService executorService = Executors.newFixedThreadPool(100);
                Runnable gateWayTask = new GateWayTask(socket, serverData);
                executorService.execute(gateWayTask);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
