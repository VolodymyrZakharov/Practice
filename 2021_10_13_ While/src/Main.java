public class Main {

    public static void main(String[] args) {
        int number = 104;
        boolean someBoolean = isDividedBy3AndPositive(number) & isDividedBy5Or7(number);
    }

    static boolean isDividedBy3AndPositive(int number) {
        System.out.println("insideIsDividedBy3AndPositive");
        return number % 3 == 0 && number > 0;
    }

    static boolean isDividedBy5Or7(int number) {
        System.out.println("insidIisDividedBy5Or7");
        return number % 5 == 0 || number % 7 == 0;
    }
}