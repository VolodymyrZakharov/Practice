public class Task1 {

    public static void main(String[] Args) {
        double number = 6;
        System.out.println(calculation(number));
    }

    public static boolean calculation(double a) {
        boolean result = a % 3 == 0 & a > 0;
        return result;
    }
}
