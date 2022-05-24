public class Human {

    private static int humanNumber = 0;
    private static double midAge = 0;

    private String name;
    String surname;
    int age;
    String email;

    public Human(String specifiedName, String specifiedSurname, int specifiedAge) {
        // this();
        name = specifiedName;
        surname = specifiedSurname;
        age = specifiedAge;
        midAge = (midAge * humanNumber + age) / (humanNumber + 1);
        // midAge = (midAge * humanNumber + age) / (++humanNumber);
        humanNumber ++;
    }

    public Human(String specifiedName, String specifiedSurname, int specifiedAge, String email) {
        this(specifiedName, specifiedSurname, specifiedAge);
        this.email = email;
    }

    public Human() {
        humanNumber++;
    }


    public static int getMidAge() {
        return (int) midAge;
    }

    public static int getHumanNumber() {
        return humanNumber;
    }

    //public void die()


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        if (age < 50)
            System.out.println("Hi, my name is " + name + " " + surname + ". I am " + age + " years old.");
        else System.out.println("Hello, my name is " + name + " " + surname + ". I am " + age + " years old.");
    }
}
