package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

public class ServerTask implements Runnable {

    Socket socket;
    AtomicInteger socketCounter;

    public ServerTask(Socket socket, AtomicInteger socketCounter) {
        this.socket = socket;
        this.socketCounter = socketCounter;
    }

    @Override
    public void run() {
        try {
            PrintStream dataOut = new PrintStream(socket.getOutputStream());
            BufferedReader dataIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line;
            while ((line = dataIn.readLine()) != null) {
                String response = dataIn.readLine() + " handled by server " + socket.getPort();
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