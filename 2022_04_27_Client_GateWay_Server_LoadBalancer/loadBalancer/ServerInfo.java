package loadBalancer;
import java.util.Objects;

public class ServerInfo {
    String host;
    int port;
    int load;
    long lastUpdateTimestamp;

    public ServerInfo(String host, int port, int load) {
        this.host = host;
        this.port = port;
        this.load = load;
        this.lastUpdateTimestamp = System.currentTimeMillis();
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public int getLoad() {
        return load;
    }

    public long getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public synchronized void setHost(String host) {
        this.host = host;
    }

    public synchronized void setPort(int port) {
        this.port = port;
    }


    @Override
    public String toString() {
        return host + ":" + port;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServerInfo that = (ServerInfo) o;
        return port == that.port && Objects.equals(host, that.host);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, port);
    }
}

