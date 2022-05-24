public class PassangerCar extends Truck {

    private int numberOfSeats;

    public PassangerCar(String model, int maxSpeed, int productionYear, int power, int numberOfSeats) {
        super(model, maxSpeed, productionYear, power);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
