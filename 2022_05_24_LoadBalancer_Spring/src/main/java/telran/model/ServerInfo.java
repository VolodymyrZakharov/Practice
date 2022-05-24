package telran.model;

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

    public synchronized String getHost() {
        return host;
    }

    public synchronized int getPort() {
        return port;
    }

    public synchronized int getLoad() {
        return load;
    }

    public synchronized long getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
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
        return Objects.hash(port, host);
    }
}

