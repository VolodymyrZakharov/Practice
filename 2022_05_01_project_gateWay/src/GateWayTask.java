import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class GateWayTask implements Runnable {

    private final Socket socket;
    private static ServerData serverData;

    public GateWayTask(Socket socket, ServerData serverData) {
        this.socket = socket;
        this.serverData = serverData;
    }

    @Override
    public void run() {
        try {
            PrintStream dataOut = new PrintStream(socket.getOutputStream());
            BufferedReader dataIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Socket socketToServer = new Socket(serverData.getHost(), serverData.getPort());

            String line;
            while ((line = dataIn.readLine()) != null) {

                PrintStream dataOutToServer = new PrintStream(socketToServer.getOutputStream());
                BufferedReader dataInFromServer = new BufferedReader(new InputStreamReader(socketToServer.getInputStream()));

                dataOutToServer.println(line);
                String response = dataInFromServer.readLine();
                dataOut.println(response);
            }
            socket.close();
            System.out.println("Socket closed");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

