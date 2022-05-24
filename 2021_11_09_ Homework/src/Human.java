import java.awt.event.HierarchyBoundsAdapter;

public class Human {

    private static int humanNumber = 0;
    private static double averageAge = 0;

    private String name;
    private String surname;
    private int age;
    private boolean isAlive = true;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        isAlive = true;
        averageAge = (averageAge * humanNumber + age) / (++humanNumber);
    }


    public void die() {
        if (isAlive) {
            isAlive = false;
            averageAge = (averageAge * humanNumber - age) / (--humanNumber);
        }
    }

    public static double getAverageAge() {
        return averageAge;
    }

    public static int getHumanNumber() {
        return humanNumber;
    }

    public void introduce() {
        if (!isAlive) System.out.println("R.I.P.");
        else
            System.out.println("Hi, my name is " + name + " " + surname + ". I am " + age + " years old and i am alive.");
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setNames(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
