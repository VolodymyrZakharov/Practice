package gateWay;
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

            String line;
            while ((line = dataIn.readLine()) != null) {


                Socket socket2 = new Socket(serverData.getHost(), serverData.getPort());

                PrintStream dataOutToServer = new PrintStream(socket2.getOutputStream());
                BufferedReader dataInFromServer = new BufferedReader(new InputStreamReader(socket2.getInputStream()));

                dataOutToServer.println(dataIn.readLine());
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
