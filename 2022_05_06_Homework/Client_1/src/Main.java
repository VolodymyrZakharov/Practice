import java.io.*;
import java.net.Socket;

public class Main {

    private final static int TCP_PORT = 2001;
    private final static String HOST = "localHost";

    public static void main(String[] args) throws IOException {
        //1.implement a server that returns the current date time for every new client

        Socket socket = new Socket(HOST, TCP_PORT);

        PrintStream dataOut = new PrintStream(socket.getOutputStream());
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        BufferedReader dataFromConsole = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = dataFromConsole.readLine()) != null && !line.equals("exit")) {
            dataOut.println(line);
            String response = dataIn.readLine();
            System.out.println(response);
        }
        socket.close();
    }
}
