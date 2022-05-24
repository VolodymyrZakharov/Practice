public class ServerData {

    int port;
    String host;

    public ServerData(int port, String host) {
        this.port = port;
        this.host = host;
    }

    public ServerData() {
    }

    public synchronized String getHost() {
        return host;
    }

    public synchronized void setHost(String host) {
        this.host = host;
    }

    public synchronized int getPort() {
        return port;
    }

    public synchronized void setPort(int port) {
        this.port = port;
    }
}