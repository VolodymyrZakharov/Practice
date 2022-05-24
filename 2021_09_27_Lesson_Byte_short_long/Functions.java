package Lesson_4_Int_Long_Short;

public class Functions {
    public static void main(String[] args) {
        functionOne();
        functionThree();
    }

    public static void functionOne() {
        System.out.println("First function");
        functionTwo();
    }

    public static void functionTwo() {
        System.out.println("Second Function");
    }

    public static void functionThree() {
        System.out.println("Vova Krasavchik");
        functionTwo();
    }
}
