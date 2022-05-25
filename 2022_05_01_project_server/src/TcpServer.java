import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class TcpServer implements Runnable {
    AtomicInteger socketCounter;
    int selfTcpPort;
    int connectionsNumber;

    public TcpServer(AtomicInteger socketCounter, int selfTcpPort, int connectionsNumber) {
        this.socketCounter = socketCounter;
        this.selfTcpPort = selfTcpPort;
        this.connectionsNumber = connectionsNumber;
    }

    @Override
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(selfTcpPort)) {
            ExecutorService executorService = Executors.newFixedThreadPool(connectionsNumber);

            while (true) {
                Socket socket = serverSocket.accept();
                socketCounter.incrementAndGet();
                executorService.execute(new ServerTask(socket, socketCounter, selfTcpPort));
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
