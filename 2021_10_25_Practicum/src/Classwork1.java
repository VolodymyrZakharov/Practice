public class Classwork1 {
    // написать метод который считает факториал число
    public static void main(String[] args) {
        int a = 5;
        System.out.println(factorial(a));
    }

    static int factorial(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i ++) {
             factorial = factorial * i;
        }
        return factorial;
    }
}
