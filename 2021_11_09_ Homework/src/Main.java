import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Human vasya = new Human("Vasya", "Vasin", 10);
        Human petya = new Human("Petya", "Petin", 20);
        Human vova = new Human("Vova", "Zakharov", 40);


        vasya.die();
        System.out.println(vasya.getName());


        System.out.println(Human.getHumanNumber());
        System.out.println(Human.getAverageAge());

        vasya.introduce();
        petya.introduce();
        vova.introduce();

        vasya.setNames("Petya", "Petin");
        System.out.println(vasya.getName());
        System.out.println(vasya.getSurname());

        System.out.println("_________________________");

        Car car = new Car("Car", 220, 2019);
        Truck truck = new Truck("Truck", 100, 2020, 1000);
        PassangerCar bus = new PassangerCar("Bus", 150, 2021, 500, 25);

        System.out.println(bus.getMaxSpeed());

        Car[] cars = new Car[]{car, truck, bus};

    }
}
