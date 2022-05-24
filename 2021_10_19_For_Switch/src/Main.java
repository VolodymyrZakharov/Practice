public class Main {

    public static void main(String[] args) {
        // print out the first least number which is greater than A and divided by 5 and 7 and 11.
    }

    public static void printFirstNumber(int a) {
        int number = a;
        while (number % 5 != 0 || number % 7 != 0 || number % 11 != 0) {
            number++;
        }
        System.out.println(number);
    }

    public static void printFirstNumberBreak(int a) {
        int number = a;
        while (true) {
            if (number % 5 == 0 && number % 7 == 0 && number % 11 == 0) {
                System.out.println(number);
                break;
            }
            number++;
        }
        System.out.println(number);
    }
}
