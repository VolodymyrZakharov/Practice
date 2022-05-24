import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static final int TCP_PORT = 2002;

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(TCP_PORT);
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        while (true){
            Socket socket = serverSocket.accept();
            executorService.execute(new ServerTask(socket));
        }
    }
}
