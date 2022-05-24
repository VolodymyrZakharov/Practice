import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private final static int SERVER_PORT = 3000;

    // Хотим сделать сервер, который открывает поток для каждого входящего соединения и обрабытывает его.
    public static void main(String... args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // задача этого бесконечного цикла - принять соединение, открыть отдельный поток для его обработки и немеленно
        // продолжить слушать следующее входящее соединение.
        while (true) {
            Socket socket = serverSocket.accept();
            Runnable serverTask = new ServerTask(socket);
            executorService.execute(serverTask);
        }
    }
}
