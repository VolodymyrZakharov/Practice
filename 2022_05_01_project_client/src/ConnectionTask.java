import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ConnectionTask implements Runnable {
    private static int tcp_port;
    private static String host;
    private static String message;
    private static int messages_per_connection;

    public ConnectionTask(int tcp_port, String host, String message, int messages_per_connection) {
        this.tcp_port = tcp_port;
        this.host = host;
        this.message = message;
        this.messages_per_connection = messages_per_connection;
    }

    @Override
    public void run() {

        Socket socket = null;
        try {
            socket = new Socket(host, tcp_port);

            PrintStream dataOut = new PrintStream(socket.getOutputStream());
            BufferedReader dataIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while (message != null && !message.equals("exit")) {
                dataOut.println(message);
                String response = dataIn.readLine();
                System.out.println(response);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
