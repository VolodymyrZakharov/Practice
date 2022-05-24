public class Task2 {

    public static void main(String[] args) {
        double number = 13;
        System.out.println(calculation(number));
    }

    public static boolean calculation(double a) {
        boolean result = a % 5 == 0 | a % 7 == 0;
        return result;
    }
}
