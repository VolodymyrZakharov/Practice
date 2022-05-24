package loadBalancer;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_transmitter implements Runnable {

    private static IServerStorage serverStorage;
    private static String GATE_WAY_HOST;
    private static int GATE_WAY_PORT;
    private static int milliseconds;

    public UDP_transmitter(IServerStorage serverStorage, int GATE_WAY_PORT, String GATE_WAY_HOST, int milliseconds) {
        this.serverStorage = serverStorage;
        this.GATE_WAY_PORT = GATE_WAY_PORT;
        this.GATE_WAY_HOST = GATE_WAY_HOST;
        this.milliseconds = milliseconds;
    }

    @Override
    public void run() {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(GATE_WAY_PORT);
            InetAddress serverAddress = InetAddress.getByName(GATE_WAY_HOST);

            while (true) {
                Thread.sleep(milliseconds);
                ServerInfo res = serverStorage.getOptimal();
                System.out.println("Optimal server is " + res.getPort() + " : " + res.getHost() + " : Load is  " + res.getLoad() );

                String response = res.getPort() + ":" + res.getHost();
                byte[] responseBytes = response.getBytes();
                DatagramPacket outputPacket = new DatagramPacket(responseBytes,
                        responseBytes.length,
                        serverAddress,
                        GATE_WAY_PORT);
                datagramSocket.send(outputPacket);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
