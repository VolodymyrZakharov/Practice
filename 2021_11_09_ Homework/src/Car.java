public class Car {

    private String model;
    private int maxSpeed;
    private int productionYear;

    public Car(String model, int maxSpeed, int productionYear) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.productionYear = productionYear;
    }

    public void run() {
        System.out.println("I am a car and i am running");
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getProductionYear() {
        return productionYear;
    }

}
