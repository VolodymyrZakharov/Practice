package gateWay;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class GateWay_UDP_Receiver implements Runnable {

    private final static int PORT = 2001;
    private final static int DATAGRAM_SIZE = 1024;
    private static ServerData serverData;

    public GateWay_UDP_Receiver(ServerData serverData) {
        this.serverData = serverData;
    }

    @Override
    public void run() {

        try {
            DatagramSocket datagramSocket = new DatagramSocket(PORT);
            byte[] input = new byte[DATAGRAM_SIZE];
            DatagramPacket inputPacket = new DatagramPacket(input, DATAGRAM_SIZE);

            while (true) {
                datagramSocket.receive(inputPacket);
                String incomingString = new String(input, 0, inputPacket.getLength());
                String[] res = incomingString.split(":");

                synchronized (serverData) {
                    serverData.setPort(Integer.parseInt(res[0]));
                    serverData.setHost(res[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
