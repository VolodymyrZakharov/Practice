import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final String DEFAULT_PROPS_FILE = "src/application.props";

    private static final String BALANCER_HOST_KEY = "balancer.host";
    private static final String BALANCER_UDP_PORT_KEY = "balancer.udp.port";
    private static final String SELF_TCP_PORT = "server.tcp.inbound.port";
    private static final String LOAD_UPDATE_PERIOD_KEY = "load.update.period";
    private static final String TCP_CONNECTION_NUMBER_KEY = "tcp.connections.number";

    public static void main(String[] args) throws IOException {
        String propsFilename = args.length > 0 ? args[0] : DEFAULT_PROPS_FILE;
        Properties props = new Properties();
        props.load(new FileReader(propsFilename));

        String balancerHost = props.getProperty(BALANCER_HOST_KEY);
        int balancerUdpPort = Integer.parseInt(props.getProperty(BALANCER_UDP_PORT_KEY));
        int selfTcpPort = Integer.parseInt(props.getProperty(SELF_TCP_PORT));
        int updatePeriod = Integer.parseInt(props.getProperty(LOAD_UPDATE_PERIOD_KEY));
        int connectionsNumber = Integer.parseInt(props.getProperty(TCP_CONNECTION_NUMBER_KEY));

        AtomicInteger socketCounter = new AtomicInteger(0);

        Thread serverReporter = new Thread(new ServerReporter(selfTcpPort, updatePeriod, socketCounter, balancerHost, balancerUdpPort));
        serverReporter.setDaemon(true);
        serverReporter.start();

        TcpServer tcpServer = new TcpServer(socketCounter, selfTcpPort, connectionsNumber);
        new Thread(tcpServer).start();

    }
}
