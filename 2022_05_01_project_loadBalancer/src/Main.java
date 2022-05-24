import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
    private static final String DEFAULT_PROPS_PATH = "src/application.props";

    private static final String UDP_FROM_SERVER_PORT_KEY = "udp.balancer.port";
    private static final String UDP_TO_GATEWAY_PORT_KEY = "udp.gateway.port";
    private static final String GATEWAY_HOST_KEY = "gateway.host";
    private static final String TRANSMIT_TIME = "transmit.time";
    private static final String CLEANER_TIME = "cleaner.time";

    public static void main(String... args) throws IOException {
        String propsPath = args.length > 0 ? args[0] : DEFAULT_PROPS_PATH;
        Properties props = new Properties();
        props.load(new FileReader(propsPath));

        int udpFromServerPort = Integer.parseInt(props.getProperty(UDP_FROM_SERVER_PORT_KEY));
        int udpGateWayPort = Integer.parseInt(props.getProperty(UDP_TO_GATEWAY_PORT_KEY));
        String gateWayHost = props.getProperty(GATEWAY_HOST_KEY);
        int transmitTime = Integer.parseInt(props.getProperty(TRANSMIT_TIME));
        int cleanerTime = Integer.parseInt(props.getProperty(CLEANER_TIME));

        ServerStorage serverStorage = new ServerStorage();

        Thread incoming = new Thread(new UDP_receiver(serverStorage, udpFromServerPort));
        incoming.start();

        Thread cleaner = new Thread(new Cleaner(serverStorage, cleanerTime));
        cleaner.start();

        Thread outComing = new Thread(new UDP_transmitter(serverStorage, udpGateWayPort, gateWayHost, transmitTime));
        outComing.start();
    }
}
