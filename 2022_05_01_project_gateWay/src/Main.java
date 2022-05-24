import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Main {
    private static final String DEFAULT_PROPS_PATH = "src/application.props";
    private static final String TCP_OUTER_PORT_KEY = "tcp.outer.port";
    private static final String UDP_FROM_BALANCER_PORT_KEY = "udp.balancer.port";


    public static void main(String... args) throws IOException, InterruptedException {
        String propsPath = args.length > 0 ? args[0] : DEFAULT_PROPS_PATH;
        Properties props = new Properties();
        props.load(new FileReader(propsPath));

        int tcpOuterPort = Integer.parseInt(props.getProperty(TCP_OUTER_PORT_KEY));
        int udpFromBalancerPort = Integer.parseInt(props.getProperty(UDP_FROM_BALANCER_PORT_KEY));

        ServerData serverData = new ServerData();

        Thread gateWay_UDP_Receiver = new Thread(new GateWay_UDP_Receiver(udpFromBalancerPort, serverData));
        gateWay_UDP_Receiver.start();

        Thread gateWay_TCP_connection = new Thread(new TCP_connection(tcpOuterPort, serverData));
        gateWay_TCP_connection.start();
    }
}
