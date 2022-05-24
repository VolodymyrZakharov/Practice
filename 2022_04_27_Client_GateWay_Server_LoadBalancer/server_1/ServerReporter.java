package server;
import java.io.IOException;
import java.net.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ServerReporter implements Runnable {
    private int TCP_SERVER_PORT;
    private int REPORTING_PERIOD;
    private AtomicInteger socketCounter;

    public ServerReporter(int TCP_SERVER_PORT, int REPORTING_PERIOD, AtomicInteger socketCounter) {
        this.TCP_SERVER_PORT = TCP_SERVER_PORT;
        this.REPORTING_PERIOD = REPORTING_PERIOD;
        this.socketCounter = socketCounter;
    }

    private final static String LOAD_BALANCER_HOST = "localhost";
    private final static int LOAD_BALANCER_PORT = 3000;

    @Override
    public void run() {

        try {
            InetAddress balancerAddress = InetAddress.getByName(LOAD_BALANCER_HOST);
            DatagramSocket datagramSocket = new DatagramSocket();

            while (true) {
                Thread.sleep(REPORTING_PERIOD);

                String res = TCP_SERVER_PORT  + ":" + socketCounter.get();
                byte[] outputBytes = res.getBytes();
                DatagramPacket outputPacket = new DatagramPacket(
                        outputBytes,
                        outputBytes.length,
                        balancerAddress,
                        LOAD_BALANCER_PORT
                );
                datagramSocket.send(outputPacket);
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}