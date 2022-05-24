package loadBalancer;
// loadBalancer.LoadBalancer
// 1. Лоад балансер слушает 3000 порт на прием UDP сообщений от серверов (каждый сервер знает, где находится лоад балансер)
// 2. Лоад балансер принимает информацию с серверов о их загрузке в следующем виде: "<server tcp port>:<load>",
// где <server tcp port> это порт, который открыт на сервере для обработки данных с gateWay.Gateway.
// 3. Лоад балансер вытаскивает из датаграммы с сервера инормацию о сервере, а именно ip адрес, порт для tcp соединений с
// gateway и текущую нагрузку на сервер. Далее Лоад балансер сохраняет эту инцормацию внутри себя в определенную структуру данных,
// добавляя к информации о сервере timestamp (время получения информации о сервере).
// 4. Каждую секунду Лоад балансер производит самоочищение. Удалаяет из структуры данных информацию о тех серверах,
// которые не давали о себе знать одну секунду.
// 5. Каждые 100 милисекунд Лоад балансер отправляет информацию о наименее загруженном сервере на gateWay.Gateway на порт 2001 в формате
// "<server host(ip)>:<server tcp port>"

// По архитектуре.
// 0. Необходима структура данных, хранящая информацию об актуальных серверах
// 1. На лоад балансере есть один поток для приема сообщений с серверов
// 2. Еще один поток необходим для очищения струкуры данных с серверами от отвалившихся серверов каждую секунду
// 3. Еще один поток необходим для отправки каждые 100 милисекунд информации об оптимальном сервере на gateWay.Gateway через
// UDP датаграмму.


// gateWay.Gateway
// 1. gateWay.Gateway слушает 2000 порт для приема tcp соединений от клиентов (иными словами, открытый в интернете порт)
// 2. гейтвэй слушает 2001 порт для приема upd датаграм от лоад балансера
// 3. хранит информацию об оптимальном сервере, полученную от лоад балансера, и перенаправляет tcp соединения на
// оптимальный сервер.

// По архитектуре
// 0. Класса, содержаций информацию об оптимальном сервере
// 1. Необходим поток для приема датаграм с лоад балансера и обновления информации об оптимальном сервере
// 2. необходим поток, который принимает соединения с клиентов и добавляет таски в
// ThreadPool, обрабатывающие эти соединения. Каждый такой таск делает следующее: берет информацию об оптимальном
// сервере и устанавливает tcp соединение с этим сервером, далее перенаправляя данные с клиента к серверу, а затем
// ответы c сервера к клиенту.


// server.Server
// 1. Слушает кастомный tcp port (40xx) на прием и обработку данных от gateWay.Gateway
// 2. Каждые 100 милисекунд отправляет UDP датаграмму на лоад балансер на порт 3000 о состоянии собственной загрузки
// в формате "<servetr tcp port>:<load>".

// По арзитектуре
// 0. объект, хранящий текущую нагрузку, доступный для потока отпраки датаграмм на лоад балансер
// 1. поток на отправку загрузки
// 2. поток на прием и обработку данных с гейтвея


public class LoadBalancer {

    private final static int LOAD_BALANCER_UDP_PORT = 3000;
    private final static int GATE_WAY_UDP_PORT = 2001;
    private final static String GATE_WAY_HOST = "local_host";

    public static void main(String... args) {
        ServerStorage serverStorage = new ServerStorage();

        Thread incoming = new Thread(new UDP_receiver(serverStorage, LOAD_BALANCER_UDP_PORT));
        incoming.start();

        Thread cleaner = new Thread(new Cleaner(serverStorage, 1000));
        cleaner.start();

        Thread outComing = new Thread(new UDP_transmitter(serverStorage, GATE_WAY_UDP_PORT, GATE_WAY_HOST, 100));
        outComing.start();
    }
}