import java.io.*;
import java.net.Socket;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static final String DEFAULT_PROPS_PATH = "src/application.props";
    private static final String TCP_TO_GATEWAY_PORT_KEY = "tcp.gateway.port";
    private static final String GATEWAY_HOST_KEY = "gateway.host";
    private static final String SIMULTANEOUS_CONNECTION_NUMBER = "simultaneous.connection.number";
    private static final String CONNECTIONS_NUMBER = "connection.number";
    private static final String MESSAGES_PER_CONNECTION = "messages.per.connection";
    private static final String MESSAGE = "message";

    public static void main(String... args) throws IOException, InterruptedException {
        String propsPath = args.length > 0 ? args[0] : DEFAULT_PROPS_PATH;
        Properties props = new Properties();
        props.load(new FileReader(propsPath));

        int tcp_port = Integer.parseInt(props.getProperty(TCP_TO_GATEWAY_PORT_KEY));
        String host = props.getProperty(GATEWAY_HOST_KEY);
        int simultaneous_connection_number = Integer.parseInt(props.getProperty(SIMULTANEOUS_CONNECTION_NUMBER));
        int connections_number = Integer.parseInt(props.getProperty(CONNECTIONS_NUMBER));
        int messages_per_connection = Integer.parseInt(props.getProperty(MESSAGES_PER_CONNECTION));
        String message = props.getProperty(MESSAGE);

        ExecutorService executorService = Executors.newFixedThreadPool(simultaneous_connection_number);
        for (int i = 0; i < connections_number; i++) {
            Thread.sleep(10);
            executorService.execute(new ConnectionTask(tcp_port, host, message, messages_per_connection));
        }
    }
}
