public class Main {

    public static void main(String[] args) {
        int sum = 47;
        System.out.println(numberOfBanknotes(sum));
    }

    public static int numberOfBanknotes(int n) {
        int tens = n / 10;
        int fives = n % 10 / 5;
        int ones = n % 10 % 5;
        return  tens + fives + ones;
    }
}
