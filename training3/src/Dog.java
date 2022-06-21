public class Dog {
    String name;
    Owner owner;

    public Dog(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }
}
