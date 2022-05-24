public class Task4 {
    public static void main(String[] args) {
        int a = 4;
        int b = 69;
        int c = 45;
        method(a, b, c);
    }

    public static void method(int a, int b, int c) {
         if (a == b & b == c) {
            System.out.println("все числа равны");
        } else if (a == b || a == c || b == c) {
            System.out.println("некоторые элементы равны");
        } else System.out.println("Все числа не равны");
    }
}
