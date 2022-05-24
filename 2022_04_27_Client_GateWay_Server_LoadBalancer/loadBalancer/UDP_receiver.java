package loadBalancer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_receiver implements Runnable {
    private static IServerStorage serverStorage;
    private static int UDP_PORT;

    private final static int DATAGRAM_SIZE = 1024;

    public UDP_receiver(IServerStorage serverStorage, int PORT) {
        this.serverStorage = serverStorage;
        this.UDP_PORT = PORT;
    }

    @Override
    public void run() {

        try {
            DatagramSocket datagramSocket = new DatagramSocket(UDP_PORT);
            byte[] input = new byte[DATAGRAM_SIZE];
            DatagramPacket inputPacket = new DatagramPacket(input, DATAGRAM_SIZE);

            while (true) {
                datagramSocket.receive(inputPacket);
                String incomingString = new String(input, 0, inputPacket.getLength());
                String[] res = incomingString.split(":");

                serverStorage.update(new ServerInfo(inputPacket.getAddress().getHostAddress(), Integer.parseInt(res[1]), Integer.parseInt(res[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
