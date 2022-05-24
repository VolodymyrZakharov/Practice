public class Main {

    public static void main(String[] args) {
        boolean bool1 = false;
        boolean bool2 = true;

        // & - or

        bool1 = true;
        bool2 = true;
        System.out.println(bool1 & bool2);

        bool1 = true;
        bool2 = false;
        System.out.println(bool1 & bool2);

        bool1 = false;
        bool2 = true;
        System.out.println(bool1 & bool2);

        bool1 = false;
        bool2 = false;
        System.out.println(bool1 & bool2);

        // | - or

        bool1 = true;
        bool2 = true;
        System.out.println(bool1 | bool2);

        bool1 = true;
        bool2 = false;
        System.out.println(bool1 | bool2);

        bool1 = false;
        bool2 = true;
        System.out.println(bool1 | bool2);

        bool1 = false;
        bool2 = false;
        System.out.println(bool1 | bool2);

        // Comparison Operators

        int a = -6;
        boolean isAPositive = a > 0;
        System.out.println(isAPositive);

        System.out.println(isDividedBy15(36));
        System.out.println(isDividedby15second(30));
    }

    static boolean isDividedBy15(int number) {
        boolean result = number % 15 == 0;
        return result;
    }

    static boolean isDividedby15second(int number) {
        boolean res = (number % 3 == 0) & (number % 5 == 0);
        return res;
    }
}
