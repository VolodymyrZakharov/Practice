public class Task3 {

    public static void main(String[] args) {
        double number = 444;
        System.out.println(calculation(number));
    }

    public static boolean calculation(double a) {
        boolean result = (a >= 100) & (a <= 200) & (a % 2 == 0);
        return result;
    }
}
