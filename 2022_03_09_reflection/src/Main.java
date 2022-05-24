import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, InvocationTargetException {
        // create an instance of a class by its name
        String type = "Cat";

        // method forName("animal.animal.Fish") returns the object animal.Fish.class
        Class classFromString = Class.forName(type);
        Animal animal = (Animal) classFromString.getConstructor().newInstance();
        System.out.println(animal.sound());

        AnimalStore animals = new AnimalStore();
        System.out.println(animals.sale("Cat").sound());

        
    }
}