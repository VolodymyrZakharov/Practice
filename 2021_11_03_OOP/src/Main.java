public class Main {

    public static void main(String[] args) {
        // create an instance of the class Human
        Human vasya = new Human("Vasya", "Vasin", 50);
        /* vasya.name = "Vasya";
        vasya.surname = "Vasin";
        vasya.age = 20;
        vasya.introduce(); */

        Human petya = new Human("Petya", "Petin", 25);
        /*petya.name = "Petya";
        petya.surname = "Petin";
        petya.age = 25;
        petya.introduce(); */

        Human vova = new Human("Vova", "Zakharov", 25);


        vasya.introduce();
        petya.introduce();

        System.out.println(vasya.getName());
        System.out.println(vasya.getSurname());
        System.out.println(vasya.getAge());

        System.out.println(Human.getHumanNumber());
        System.out.println(Human.getMidAge());

        //petya.die();
        //System.out.println(Human.getHumanNumber());
    }

}
