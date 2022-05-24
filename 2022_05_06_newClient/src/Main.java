import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

   public static int tcpPort=2000;
   public static String  host= "localhost";

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(host, tcpPort);

        try {
            PrintStream dataOut = new PrintStream(socket.getOutputStream());
            BufferedReader dataIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader fromConsole = new BufferedReader(new InputStreamReader(System.in));

            String message = fromConsole.readLine();
            while (message != null && !message.equals("exit")) {
                Thread.sleep(3000);
                dataOut.println(message);
                String response = dataIn.readLine();
                System.out.println(response);
            }
            socket.close();
        } catch (IOException | InterruptedException ioException) {
            ioException.printStackTrace();
        }
    }
}
