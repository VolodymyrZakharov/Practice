import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

public class ServerTask implements Runnable {

    Socket socket;
    AtomicInteger socketCounter;
    int selfTcpPort;

    public ServerTask(Socket socket, AtomicInteger socketCounter, int selfTcpPort) {
        this.socket = socket;
        this.socketCounter = socketCounter;
        this.selfTcpPort = selfTcpPort;
    }

    @Override
    public void run() {
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