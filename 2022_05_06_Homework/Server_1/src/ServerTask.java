import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ServerTask implements Runnable {
    Socket socket;

    public ServerTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            PrintStream dataOut = new PrintStream(socket.getOutputStream());
            BufferedReader dataIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            while ((line = dataIn.readLine()) != null) {
                String response = LocalDateTime.now().toString();
                dataOut.println(response);
            }
            System.out.println("socket closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
