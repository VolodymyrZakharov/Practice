public class People {
    String name;
    String familyName;
    String equipment;
    int price;

    public People(String name, String familyName, String equipment, int price) {
        this.name = name;
        this.familyName = familyName;
        this.equipment = equipment;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + familyName + " " + equipment + " " + price;
    }
}
