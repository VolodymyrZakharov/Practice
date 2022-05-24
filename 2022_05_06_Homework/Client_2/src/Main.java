import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Main {

    private final static int TCP_PORT = 2002;
    private final static String HOST = "localHost";

    public static void main(String[] args) throws IOException {
        // 2.implement server that echoes anything sent from the client in reversed form hello->olleH
        Socket socket = new Socket(HOST, TCP_PORT);

        PrintStream dataOut = new PrintStream(socket.getOutputStream());
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader dataFromConsole = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = dataFromConsole.readLine()) != null && !line.equals("exit")) {
            dataOut.println(line);
            System.out.println(dataIn.readLine());
        }
        socket.close();
    }
}
