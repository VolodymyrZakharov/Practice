package telran;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import telran.thread.Cleaner;
import telran.thread.UDP_receiver;
import telran.thread.UDP_transmitter;

@Component
public class Balancer implements CommandLineRunner {

    private final Cleaner cleaner;
    private final UDP_transmitter udp_transmitter;
    private final UDP_receiver udp_receiver;

    public Balancer(Cleaner cleaner, UDP_transmitter udp_transmitter, UDP_receiver udp_receiver) {
        this.cleaner = cleaner;
        this.udp_transmitter = udp_transmitter;
        this.udp_receiver = udp_receiver;
    }

    @Override
    public void run(String... args) throws Exception {
        cleaner.run();
        udp_transmitter.run();
        udp_receiver.run();
    }
}
