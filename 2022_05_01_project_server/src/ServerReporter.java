import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicInteger;

public class ServerReporter implements Runnable {
    private int tcp_server_port;
    private int reporting_period;
    private AtomicInteger socketCounter;
    private String load_balancer_host;
    private int load_balancer_port;

    public ServerReporter(int TCP_SERVER_PORT, int REPORTING_PERIOD, AtomicInteger socketCounter, String LOAD_BALANCER_HOST, int LOAD_BALANCER_PORT) {
        this.tcp_server_port = TCP_SERVER_PORT;
        this.reporting_period = REPORTING_PERIOD;
        this.socketCounter = socketCounter;
        this.load_balancer_host = LOAD_BALANCER_HOST;
        this.load_balancer_port = LOAD_BALANCER_PORT;
    }


    @Override
    public void run() {

        try {
            InetAddress balancerAddress = InetAddress.getByName(load_balancer_host);
            DatagramSocket datagramSocket = new DatagramSocket();

            while (true) {
                Thread.sleep(reporting_period);

                String res = tcp_server_port + ":" + socketCounter.get();
                byte[] outputBytes = res.getBytes();
                DatagramPacket outputPacket = new DatagramPacket(
                        outputBytes,
                        outputBytes.length,
                        balancerAddress,
                        load_balancer_port
                );
                datagramSocket.send(outputPacket);
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}