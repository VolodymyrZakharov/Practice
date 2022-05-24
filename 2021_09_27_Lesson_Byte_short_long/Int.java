package Lesson_4_Int_Long_Short;

public class Int {
    public static void main(String[] args) {
        int a = 34;
        int b = 67;
        int c = a + b;
        System.out.println("a + b =" + c);
        fanction();
        addition(5, 8);
        fn();
    }

    public static void fanction() {
        int d = 43;
        int e = 67;
        int f = d * e;
        System.out.println("d*e=" + f); // comment text
    }
    public static void addition(int x, int y) {
        System.out.println("x + y = " + (x + y));
    }
    public static void  fn() {
        System.out.println("Hello World");
    }
}
