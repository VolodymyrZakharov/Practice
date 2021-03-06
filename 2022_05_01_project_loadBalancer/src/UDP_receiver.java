import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_receiver implements Runnable {
    private static IServerStorage serverStorage;
    private static int udp_port;

    private final static int datagram_size = 1024;

    public UDP_receiver(IServerStorage serverStorage, int PORT) {
        this.serverStorage = serverStorage;
        this.udp_port = PORT;
    }

    @Override
    public void run() {

        try {
            DatagramSocket datagramSocket = new DatagramSocket(udp_port);
            byte[] input = new byte[datagram_size];
            DatagramPacket inputPacket = new DatagramPacket(input, datagram_size);

            while (true) {
                datagramSocket.receive(inputPacket);
                String incomingString = new String(input, 0, inputPacket.getLength());
                String[] res = incomingString.split(":");

                serverStorage.update(new ServerInfo(inputPacket.getAddress().getHostAddress(), Integer.parseInt(res[0]), Integer.parseInt(res[1])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
