import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private final static int TCP_PORT = 2001;

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(TCP_PORT);
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        while (true){
            Socket socket = serverSocket.accept();
            executorService.execute(new ServerTask(socket));
        }

    }
}
