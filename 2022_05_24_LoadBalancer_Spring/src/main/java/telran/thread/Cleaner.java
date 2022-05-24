package telran.thread;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import telran.repo.IServerStorage;

@Component
public class Cleaner {
    private final IServerStorage serverStorage;
    private final int milliseconds;

    public Cleaner(IServerStorage serverStorage, @Value("${balancer.server.map.cleaner.period}") int milliseconds) {
        this.serverStorage = serverStorage;
        this.milliseconds = milliseconds;
    }

    @Async("threadExecutor")
    public void run() {
        while (true) {
            try {
                Thread.sleep(milliseconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            serverStorage.clear(milliseconds);
        }
    }
}
