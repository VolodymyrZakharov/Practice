import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_transmitter implements Runnable {

    private static IServerStorage serverStorage;
    private static String gate_way_host;
    private static int gate_way_udp_port;
    private static int milliseconds;

    public UDP_transmitter(IServerStorage serverStorage, int gate_way_port, String gate_way_host, int milliseconds) {
        this.serverStorage = serverStorage;
        this.gate_way_udp_port = gate_way_port;
        this.gate_way_host = gate_way_host;
        this.milliseconds = milliseconds;
    }

    @Override
    public void run() {
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName(gate_way_host);

            OuterFore:
            while (true) {
                Thread.sleep(milliseconds);
                ServerInfo res = serverStorage.getOptimal();
                if (res == null)
                    continue OuterFore;

                System.out.println("Optimal server is " + res.getPort() + " : " + res.getHost() + " : Load is  " + res.getLoad());

                String response = res.getPort() + ":" + res.getHost();
                byte[] responseBytes = response.getBytes();
                DatagramPacket outputPacket = new DatagramPacket(responseBytes,
                        responseBytes.length,
                        serverAddress,
                        gate_way_udp_port);
                datagramSocket.send(outputPacket);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
