import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ServerStorage implements IServerStorage {
    Set<ServerInfo> serverInfoHashSet;

    public ServerStorage() {
        serverInfoHashSet = new HashSet<>();
    }

    @Override
    public synchronized void update(ServerInfo serverInfo) {
        serverInfoHashSet.remove(serverInfo);
        serverInfoHashSet.add(serverInfo);
    }

    @Override
    public synchronized void clear(int milliseconds) {
        serverInfoHashSet.stream()
                .filter(a -> (System.currentTimeMillis() - a.getLastUpdateTimestamp()) < milliseconds);
    }

    @Override
    public synchronized ServerInfo getOptimal() {
        return serverInfoHashSet.stream()
                .min(Comparator.comparingInt(ServerInfo::getLoad))
                .orElse(null);
    }
}
