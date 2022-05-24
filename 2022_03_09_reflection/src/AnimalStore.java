import java.lang.reflect.InvocationTargetException;

// Violates the 2nd SOLID principle.
// S - single responsibility - принцип единой ответственности. Метод должен решать одну задачу. Класс должен описывать
// только что-то одно.
// O - open close. Код откыт к расширению, но закрыт к изменению
public class AnimalStore {

    /**
     * The method accepts the type of the wanted animal as a name of the class.
     *
     * @param type the name of the class
     * @return an instance of the class
     */
    public Animal sale(String type) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        return (Animal) Class.forName(type).getConstructor().newInstance();
    }
}
