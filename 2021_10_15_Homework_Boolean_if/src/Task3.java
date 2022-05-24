public class Task3 {
    public static void main(String[] args) {
        int number = -4;
        method(number);
    }

    public static void method(int a) {
        if (a == 0) {
            System.out.println("number = 0");
        } else if (a > 0) {
            System.out.println("number > 0");
        } else System.out.println("number < 0");
    }
}
